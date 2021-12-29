package com.cybage.order.server;

import com.cybage.order.service.OrderService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GRPCOrderServer {


    public static void main(String[] args) throws IOException, InterruptedException {
        Server server= ServerBuilder.forPort(9098).addService(new OrderService()).
                build().start();
        System.out.println("Server Started at :"+server.getPort());
        server.awaitTermination();

    }
}
