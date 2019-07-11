# cloud-native-demo
Open the root folder in IntelliJ and it will create submodules automatically.

## Open Tracing

Let's talk a little bit about OpenTracing/OpenCensus concept.
* Trace
* Span

>––|–––––––|–––––––|–––––––|–––––––|–––––––|–––––––|–––––––|–––––––> time\
> [Trace 1......................................................]\
> [Span A···················································]\
>   [Span B··············································]\
>      [Span D··········································]\
>    [Span C········································]\
>         [Span E·······]        [Span F··] [Span G··] [Span H··]

## Let's review what demo application is doing.
* Basic rest application with Spring data JPA
* Demo the basic functiona. 

### Add Slueth (OpenTracing/OpenCensus library)
* Automatically instruments Rest Endpoint, AMQP.
* Add logging, and it will maintain Spans
* Programmatically add additional Spans (Or Traces)
* Can be used across threads (and even across services in different container, more about that later)

### Add Zipkin
* This is more about sending the data to visualization tool endpoint
* default is capture certain %, but we will override to capture everything.

## Visualization tools
I have used Zipkin & ES APM, but heard about Jaeger too. As per documentation, Splunk is also supported.

### Zipkin
* Zipkin install and start: To start a zipkin in docker
> docker run -d -p 9411:9411 openzipkin/zipkin
* Zipkin URL: http://localhost:9411

### Jaeger
* Jaeger install and : 
> docker run -d --name jaeger -e COLLECTOR_ZIPKIN_HTTP_PORT=9411 -p 5775:5775/udp -p 6831:6831/udp -p 6832:6832/udp -p 5778:5778 -p 16686:16686 -p 14268:14268 -p 9411:9411 jaegertracing/all-in-one:1.8
* Jaeger URL: http://localhost:16686 

**NOTE:** Run either Zipkin or Jaeger as i am configuring same port. It is not needed, just less config while doing the demo.

### Tracing across services and containers

## Gateway (Spring Cloud Gateway)
* routing, authentication, authorization, load balancing (client side)
* Zuul can also be used (from Netflix)

## Service Registry (Eureka)
* Register service by name
* Remove services which are not working by status

## Config Server
* Manage configuration outside of the code
* backend can be file system, git, Vault
* Profile based configuration lookup
* Auto Refresh, if we want

