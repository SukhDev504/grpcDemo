package com.cybage.grpc.client;

import com.cybage.grpc.User;
import com.cybage.grpc.userGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GRPCClient  {
    public static void main(String[] args) {
        ManagedChannel channel=ManagedChannelBuilder.forAddress("localhost",9098).usePlaintext().build();

      userGrpc.userBlockingStub userStub=  userGrpc.newBlockingStub(channel);
        User.LoginRequest loginRequest= User.LoginRequest.newBuilder().setUsername("Admin").setPassword("Admin").build();
      User.APIResponse response=  userStub.login(loginRequest);
        System.out.println("Response Msg :"+response.getResponseMessage());
    }
}
