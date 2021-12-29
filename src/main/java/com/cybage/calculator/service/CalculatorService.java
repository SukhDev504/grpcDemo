package com.cybage.calculator.service;

import com.cybage.calculator.CalculatorServiceGrpc;
import com.cybage.calculator.Input;
import com.cybage.calculator.Output;
import io.grpc.stub.StreamObserver;

public class CalculatorService extends CalculatorServiceGrpc.CalculatorServiceImplBase {
    /**
     * <pre>
     * unary
     * </pre>
     *
     * @param request
     * @param responseObserver
     */
    @Override
    public void findFactorial(Input request, StreamObserver<Output> responseObserver) {
       // super.findFactorial(request, responseObserver);
        int input = request.getNumber();
        long result = this.factorial(input);
        Output output = Output.newBuilder()
                .setResult(result)
                .build();
        responseObserver.onNext(output);
        responseObserver.onCompleted();
    }

    private long factorial(int number){
        if(number == 0)
            return 1;
        return number * factorial(number - 1);
    }


    /**
     * <pre>
     * server stream
     * </pre>
     *
     * @param request
     * @param responseObserver
     */
    @Override
    public void getAllFactors(Input request, StreamObserver<Output> responseObserver) {
int num=request.getNumber();
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
      //  super.getAllFactors(request, responseObserver);
        System.out.printf("Factorial of %d = %d", num, factorial);



    }

    /**
     * <pre>
     * client stream
     * </pre>
     *
     * @param responseObserver
     */
    @Override
    public StreamObserver<Input> sumAll(StreamObserver<Output> responseObserver) {

      //  return super.sumAll(responseObserver);
        return new StreamObserver<Input>() {
            // initial sum = 0
            private int sum;

            @Override
            public void onNext(Input input) {
                sum = sum + input.getNumber();
            }

            @Override
            public void onError(Throwable throwable) {
                responseObserver.onCompleted();
            }

            @Override
            public void onCompleted() {
                responseObserver.onNext(Output.newBuilder().setResult(sum).build());
                responseObserver.onCompleted();
            }
        };
    }

    /**
     * <pre>
     * bi-directional stream
     * </pre>
     *
     * @param responseObserver
     */
    @Override
    public StreamObserver<Input> findPrime(StreamObserver<Output> responseObserver) {

       return super.findPrime(responseObserver);
    }
}
