# Example of Vert.x reporting via JMX to ...

```
% mvn test -Pmain
...
[WARNING] Warning: killAfter is now deprecated. Do you need it ? Please comment on MEXEC-6.
Listening
MBean Found io.vertx.ext.metrics.reporters.JmxReporter$JmxGauge vertx@6ef4a982:name=vertx.worker-pool-size
MBean Found io.vertx.ext.metrics.reporters.JmxReporter$JmxTimer vertx@6ef4a982:name="vertx.http.servers.0.0.0.0:8080.requests"
MBean Found sun.management.MemoryPoolImpl java.lang:name=Metaspace,type=MemoryPool
MBean Found io.vertx.ext.metrics.reporters.JmxReporter$JmxCounter vertx@6ef4a982:name=vertx.verticles
MBean Found sun.management.MemoryPoolImpl java.lang:name=PS Old Gen,type=MemoryPool
MBean Found io.vertx.ext.metrics.reporters.JmxReporter$JmxCounter vertx@6ef4a982:name="vertx.http.servers.0.0.0.0:8080.exceptions"
MBean Found sun.management.RuntimeImpl java.lang:type=Runtime
MBean Found io.vertx.ext.metrics.reporters.JmxReporter$JmxMeter vertx@6ef4a982:name=vertx.eventbus.messages.sent
MBean Found sun.management.GarbageCollectorImpl java.lang:name=PS Scavenge,type=GarbageCollector
MBean Found sun.management.ThreadImpl java.lang:type=Threading
MBean Found sun.management.MemoryPoolImpl java.lang:name=PS Eden Space,type=MemoryPool
MBean Found sun.management.ManagementFactoryHelper$1 java.nio:name=mapped,type=BufferPool
MBean Found io.vertx.ext.metrics.reporters.JmxReporter$JmxMeter vertx@6ef4a982:name=vertx.eventbus.messages.published
MBean Found sun.management.MemoryPoolImpl java.lang:name=Compressed Class Space,type=MemoryPool
MBean Found io.vertx.ext.metrics.reporters.JmxReporter$JmxHistogram vertx@6ef4a982:name="vertx.http.servers.0.0.0.0:8080.bytes-read"
MBean Found sun.management.MemoryPoolImpl java.lang:name=PS Survivor Space,type=MemoryPool
MBean Found sun.management.ManagementFactoryHelper$PlatformLoggingImpl java.util.logging:type=Logging
MBean Found io.vertx.ext.metrics.reporters.JmxReporter$JmxTimer vertx@6ef4a982:name="vertx.http.servers.0.0.0.0:8080.connections"
MBean Found io.vertx.ext.metrics.reporters.JmxReporter$JmxHistogram vertx@6ef4a982:name="vertx.http.servers.0.0.0.0:8080.bytes-written"
MBean Found sun.management.CompilationImpl java.lang:type=Compilation
MBean Found io.vertx.ext.metrics.reporters.JmxReporter$JmxMeter vertx@6ef4a982:name=vertx.eventbus.messages.received
MBean Found sun.management.OperatingSystemImpl java.lang:type=OperatingSystem
MBean Found sun.management.MemoryManagerImpl java.lang:name=Metaspace Manager,type=MemoryManager
MBean Found javax.management.MBeanServerDelegate JMImplementation:type=MBeanServerDelegate
MBean Found sun.management.ClassLoadingImpl java.lang:type=ClassLoading
MBean Found sun.management.HotSpotDiagnostic com.sun.management:type=HotSpotDiagnostic
MBean Found sun.management.MemoryManagerImpl java.lang:name=CodeCacheManager,type=MemoryManager
MBean Found io.vertx.ext.metrics.reporters.JmxReporter$JmxCounter vertx@6ef4a982:name=vertx.eventbus.handlers
MBean Found sun.management.MemoryPoolImpl java.lang:name=Code Cache,type=MemoryPool
MBean Found io.vertx.ext.metrics.reporters.JmxReporter$JmxMeter vertx@6ef4a982:name=vertx.eventbus.messages.reply-failures
MBean Found sun.management.ManagementFactoryHelper$1 java.nio:name=direct,type=BufferPool
MBean Found io.vertx.ext.metrics.reporters.JmxReporter$JmxCounter vertx@6ef4a982:name=vertx.timers
MBean Found sun.management.GarbageCollectorImpl java.lang:name=PS MarkSweep,type=GarbageCollector
MBean Found sun.management.DiagnosticCommandImpl com.sun.management:type=DiagnosticCommand
MBean Found io.vertx.ext.metrics.reporters.JmxReporter$JmxGauge vertx@6ef4a982:name=vertx.event-loop-size
MBean Found sun.management.MemoryImpl java.lang:type=Memory
MBean Found io.vertx.ext.metrics.reporters.JmxReporter$JmxCounter vertx@6ef4a982:name="vertx.http.servers.0.0.0.0:8080.open-connections"
```

