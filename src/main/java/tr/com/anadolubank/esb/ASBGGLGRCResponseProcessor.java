package tr.com.anadolubank.esb;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;

import tr.com.anadolubank.grpc.proto.HelloResponse;

public class ASBGGLGRCResponseProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		
		Message inMessage = exchange.getIn();
		HelloResponse  helloResp = inMessage.getBody(HelloResponse.class);

		System.out.println("RESP:"+helloResp.getGreeting());
		
	}

}
