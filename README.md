### 2 Microservice Supplier, Buyer.
Buyer makes a call to supplier to get data. Buyer does not call directly to supplier, the call is made through Eureka(service discovery). If by any chance supplier microservice wents down then Hystrix takes into action and reply a default message.
http://localhost:8181/my-supplier ---> buyer calls supplier
http://localhost:7777/ ---> Eureka runs
http://supplier-service/get ---> buyer calls supplier microservice like this. If this call fails Hystrix plays his roles


###Eureka
multiple service instance is called via load balancer.
All services is registered to eureka server.
Eureka server should start first and then the clild services

###Hysterix
working as circuit breaker

##docker
-container mysql replication
