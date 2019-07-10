# cloud-native-demo
Open the root folder in IntelliJ and it should create submodules automatically.

### Zipkin
* Zipkin install and start: To start a zipkin in docker
> docker run -d -p 9411:9411 openzipkin/zipkin
* Zipkin URL: http://localhost:9411

### Jaeger
* Jaeger install and : 
> docker run -d --name jaeger -e COLLECTOR_ZIPKIN_HTTP_PORT=9411 -p 5775:5775/udp -p 6831:6831/udp -p 6832:6832/udp -p 5778:5778 -p 16686:16686 -p 14268:14268 -p 9411:9411 jaegertracing/all-in-one:1.8
* Jaeger URL: http://localhost:16686 

**NOTE:** Run either Zipkin or Jaeger as i am configuring same port. It is not needed, just less config while doing the demo.
