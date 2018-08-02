# Spring microservice library catalog

* This service is part of the simple library microservices project and includes
  * [library configuration server](https://github.com/maurofokker/spring-microservices-library-config)
  * [library reservation](https://github.com/maurofokker/spring-microservices-library-reservation)
  * [library ui](https://github.com/maurofokker/spring-microservices-library-ui)
* Microservices reference can be found [here](https://github.com/maurofokker/microservices-demo)

* Integrate with config server
  * add `spring-cloud-starter-config` dependency
  * add uri of config server in `application.properties`
  * rename `application.properties` to `bootstrap.properties` so this file is going to be the first to been loaded when app starts 