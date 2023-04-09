


import org.asteriskjava.fastagi.AgiChannel;
import org.asteriskjava.fastagi.AgiException;
import org.asteriskjava.fastagi.AgiRequest;
import org.asteriskjava.fastagi.BaseAgiScript;

public class Conferencia extends BaseAgiScript {

	public void service(AgiRequest request, AgiChannel channel) throws AgiException {
		System.out.println("ACCOUNT CODE:"+request.getAccountCode());
		System.out.println("CALLERID:"+request.getCallerId());
		System.out.println("UNIQUEID: "+channel.getUniqueId());
		System.out.println("--------------------------------");
		
		answer();
		
		confbridge("conferencia-cnu","");
		
		exec("Playback", "tt-monkeys");

	}
	
}