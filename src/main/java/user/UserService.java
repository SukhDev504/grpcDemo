package user;

import com.cybage.grpc.User;
import com.cybage.grpc.userGrpc.userImplBase;
import io.grpc.stub.StreamObserver;

import java.sql.SQLOutput;

public class UserService extends userImplBase {

    /**
     * @param request
     * @param responseObserver
     */
    @Override
    public void login(User.LoginRequest request, StreamObserver<User.APIResponse> responseObserver) {
       // super.login(request, responseObserver);

        System.out.println("Inside Login Method");
        System.out.println("******************");
        String username=request.getUsername();
        String password=request.getPassword();
        System.out.println("Username :"+username +"  Password :"+password);

        User.APIResponse.Builder response= User.APIResponse.newBuilder();
        if(username.equals(password)){
            //Valid
            response.setResponseCode(0).setResponseMessage("Success");

        }else{
            //Invalid
            response.setResponseCode(100).setResponseMessage("Invalid username or password");
        }

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();

    }

    /**
     * @param request
     * @param responseObserver
     */
    @Override
    public void logout(User.Empty request, StreamObserver<User.APIResponse> responseObserver) {
        //super.logout(request, responseObserver);
        System.out.println("Inside logout method..");
        User.APIResponse.Builder response= User.APIResponse.newBuilder();
        response.setResponseCode(0).setResponseMessage("Logout Successfully");
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}
