package br.com.kafka_producer;

import java.util.UUID;
import java.util.concurrent.ExecutionException;

import br.com.kafka_producer.services.KafkaService;
import br.com.kafka_producer.services.SESService;

public class App 
{
    public static void main( String[] args ) throws InterruptedException, ExecutionException
    {
        System.out.println("Enviando mensagem ...");
        // KafkaService.sendMessage("DANILO-" + UUID.randomUUID().toString(), "8");
        SESService.sendMessage("gabrielli");
        KafkaService.sendMessage("League of legends-" , "280", " gabrielli.meloo16@gmail.com"); // para quando for utilizar para mais de uma partição
    }
}

