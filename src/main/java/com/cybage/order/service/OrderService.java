package com.cybage.order.service;

import com.cybage.grpc.User;
import com.cybage.order.*;
import com.cybage.order.dao.OrderDAO;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class OrderService extends OrderServiceGrpc.OrderServiceImplBase {

    @Autowired
    OrderDAO orderDAO;

    /**
     * @param request
     * @param responseObserver
     */
    @Override
    public void placeOrder(OrderRequest request, StreamObserver<OrderResponse> responseObserver) {
        System.out.println("Order Placed :" + request.toString());
        // List<Item> items=request.getItemsList();
        // System.out.println(request.toString());
        orderDAO.saveOrder(request);
        //super.placeOrder(request, responseObserver);
    }

    /**
     * @param request
     * @param responseObserver
     */
    @Override
    public void getOrder(Empty request, StreamObserver<OrderResponse> responseObserver) {
        System.out.println("Get all order details");
        super.getOrder(request, responseObserver);

    }
}
