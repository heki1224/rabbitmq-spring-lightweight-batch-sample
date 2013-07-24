rabbitmq-spring-lightweight-batch-sample
======================
Rabbitmq with Spring lightweight batch sample  
RabbitMQのレシーバを軽量バッチとして組み込む際の実装サンプルです。  
  
使い方(usage)
------
Import Eclipse < 3.7.2 
  
解説(description)
------
Runtime.getRuntime().addShutdownHook(new Thread() {public void run() {...}})を使って  
プロセス終了処理を実行しています。  
  
動作環境(environment)
------------
RabbitMQ 3.1.3  
Spring 3.2.3
  
依存ライブラリ(dependencies)
----------------
spring-core 3.2.3  
spring-amqp 1.2.0  
spring-rabbit 1.2.0  
amqp-client 3.1.3  
jackson 2.2.2  
slf4j 1.7.5  
logback 1.0.13  

参考(Link)
----------------
  
