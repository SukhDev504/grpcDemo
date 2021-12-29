package com.cybage.ecommerce.server;

import com.cybage.ecommerce.service.AmazonOnlineService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class AmazonServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        //Build GRPC server
        Server server= ServerBuilder.forPort(9098).addService(new AmazonOnlineService()).build();
         // Start Server
        server.start();
        System.out.println("Server Started At Port :"+server.getPort());
        // shutdown hook
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Amazon server is shutting down!");
            server.shutdown();
        }));

        server.awaitTermination();
    }
}
