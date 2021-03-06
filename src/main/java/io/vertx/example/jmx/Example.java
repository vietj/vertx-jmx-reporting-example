package io.vertx.example.jmx;

import io.vertx.core.Vertx;
import io.vertx.core.VertxOptions;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerOptions;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
public class Example {

  public static void main(String[] args) {
    VertxOptions options = new VertxOptions()
      .setMetricsEnabled(true)
      .setJmxEnabled(true)
      .setJmxDomain("io.vertx");
    Vertx vertx = Vertx.vertx(options);
    HttpServer server = vertx.createHttpServer(new HttpServerOptions().setPort(8080));
    server.requestStream().handler(req -> {
      req.response().setChunked(true).write("HELLO WORLD").end();
    });
    server.listen(s -> {
      if (s.succeeded()) {
        System.out.println("Listening");
//        MBeanServer mbeanServer = ManagementFactory.getPlatformMBeanServer();
//        for (ObjectInstance mbean : mbeanServer.queryMBeans(null, null)) {
//          System.out.println("MBean Found " + mbean.getClassName() + " " + mbean.getObjectName().getCanonicalName());
//        }
      } else {
        System.out.println("Failed");
      }
    });
  }
}
