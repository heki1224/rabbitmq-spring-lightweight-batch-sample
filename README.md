rabbitmq-spring-lightweight-batch-sample
======================
Rabbitmq with Spring lightweight batch sample
  
使い方(usage)
------
Import Eclipse < 3.7.2 
  
解説(description)
------
RabbitMQのレシーバをバッチとして組み込む際の実装サンプルです。 
Runtime.getRuntime().addShutdownHook(new Thread() {public void run() {...}})を使って 
プロセス終了処理を実行しています。 
  
動作環境(environment)
------------
RabbitMQ 3.0.4 
Spring 3.2.2
  
依存ライブラリ(dependencies)
----------------
spring-core 3.2.2  
spring-amqp 1.1.4  
spring-rabbit 1.1.4  
amqp-client 3.0.4  
jackson-jaxrs  1.9.11  
slf4j  1.7.2  
logback 1.0.7  

参考(Link)
----------------
  
