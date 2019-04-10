spring:
  application:
    name: @project.artifactId@

server:
  port: 8000

eureka:
  instance:
    hostname: localhost
  client:
    serviceUrl:
      defaultZone: http://localhost:8000/eureka/
    registerWithEureka: false
    fetchRegistry: false
  server:
    enableSelfPreservation: false