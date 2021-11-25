## Agenda
### Write producer and consumer in spring boot and integrate with Kafka.

1. First download the [kafka](https://www.apache.org/dyn/closer.cgi?path=/kafka/3.0.0/kafka_2.13-3.0.0.tgz) and extract it.
    ```
    $ tar -xzf kafka_2.13-3.0.0.tgz
    $ cd kafka_2.13-3.0.0
    ```
2. START THE KAFKA ENVIRONMENT
    ```
   # Start the ZooKeeper service
   $ bin/zookeeper-server-start.sh config/zookeeper.properties
   ```
   Open another terminal session and run:
    ```
    # Start the Kafka broker service
    $ bin/kafka-server-start.sh config/server.properties
    ```
3. Now you have to create a "userkafka" topic in kafka using below command.
    ```
    # Open another terminal and run:
    $ bin/kafka-topics.sh --create --topic userkafka --bootstrap-server localhost:9092
    ```
4. Now clone this project and open in IDE.
    ```
   git clone <reoisitory link>
   ```
5. Run this spring boot application 
    ```
    Let’s send our messages to Kafka using cURL:
    http://localhost:8081/kafka/publish/Hello
    ```
   
6. You will see the consumed messages in the terminal where this application is running.
7. If you want to get all messages then go for this URL:
     ```
    http://localhost:8081/kafka/allMessages
    ```
