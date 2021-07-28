

https://spring.io/images/cloud-diagram-1a4cad7294b4452864b5ff57175dd983.svg


## 链路追踪功能
sleuth收集信息，发送到zipkin服务器， 服务器地址 默认为localhost:9411
本地首先需要先启动zipkin服务器，
`java -jar zipkin.jar`

每个应用作为客户端， 引入依赖：
```xml
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-sleuth-zipkin</artifactId>
        </dependency>
```

