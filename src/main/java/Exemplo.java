

import org.asteriskjava.fastagi.AgiChannel;
import org.asteriskjava.fastagi.AgiException;
import org.asteriskjava.fastagi.AgiRequest;
import org.asteriskjava.fastagi.BaseAgiScript;

public class Exemplo extends BaseAgiScript {

	public void service(AgiRequest request, AgiChannel channel) throws AgiException {
		System.out.println("Entrou no Exemplo");
		answer();
		exec("Playback", "tt-weasels");
		confbridge("naldo", "profile");
	}
	
}