package com.cybage.calculator.server;

import com.cybage.calculator.service.CalculatorService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GRPCCalculatorServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server= ServerBuilder.forPort(9098).addService(new CalculatorService()).build();
        server.start();
        System.out.println("Server Started at Port :"+server.getPort());
        server.awaitTermination();
    }
}
