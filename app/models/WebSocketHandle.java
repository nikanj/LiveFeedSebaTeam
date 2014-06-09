package models;

import play.mvc.WebSocket;
import akka.actor.UntypedActor;

public class WebSocketHandle extends UntypedActor {
    
	public static WebSocket.Out<String> outStream;
	
    public static void setWebsocketOut(WebSocket.Out<String> out){
    	outStream = out;
    }
    
    public void onReceive(Object message) throws Exception {
    	
    	outStream.write((String)message);
    	
    }
}
