package tr.com.anadolubank.esb;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import tr.com.anadolubank.grpc.proto.HelloRequest;
import tr.com.anadolubank.grpc.proto.HelloResponse;
import tr.com.anadolubank.grpc.proto.HelloServiceGrpc;

public class ASBGGLGRCRequestProcessor implements Processor {

	
	
	@Override
	public void process(Exchange exchange) throws Exception {
		
		
		
		 /*ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 1101)
		            .usePlaintext()
		            .build();

		        HelloServiceGrpc.HelloServiceBlockingStub stub 
		          = HelloServiceGrpc.newBlockingStub(channel);

		        HelloResponse helloResponse = stub.hello(HelloRequest.newBuilder()
		            .setFirstName("Baeldung")
		            .setLastName("gRPC")
		            .build());

		        System.out.println("Response received from server:\n" + helloResponse);

		        channel.shutdown();*/
		
		Message inMessage = exchange.getIn();
		HelloRequest helloReq = HelloRequest.newBuilder().setFirstName("SERKAN").setLastName("TAN").build();

		inMessage.setBody(helloReq);
		
		//org.apache.camel.component.grpc.GrpcProducer
		//org.apache.camel.component.grpc.GrpcProducer
		
	}

}
