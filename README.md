### Two Microservices: Supplier, Buyer.
Buyer makes a call to supplier to get data. Buyer does not call directly to supplier, the call is made through Eureka(service discovery). If by any chance supplier microservice wents down then Hystrix takes into action and reply a default message.
http://localhost:8181/my-supplier ---> buyer calls supplier <br/>
http://localhost:7777/ ---> Eureka runs <br/>
http://supplier-service/get ---> buyer calls supplier in microservice like this. If this call fails Hystrix plays his roles <br/>

##Zuul <br/>
with zuul connected now buyer service is called with this url: <br/>
http://localhost:8768/buyer/my-supplier <br/>
the same url is accessed from <br/>
http://localhost:8768/buyer-service/my-supplier <br/>


###Eureka <br/>
multiple service instance is called via load balancer. <br/>
All services is registered to eureka server. <br/>
Eureka server should start first and then the clild services <br/>

###Hysterix <br/>
working as circuit breaker <br/>

##docker <br/>
-container mysql replication
