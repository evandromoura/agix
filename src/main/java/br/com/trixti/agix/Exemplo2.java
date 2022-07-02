package br.com.trixti.agix;

import org.asteriskjava.fastagi.AgiChannel;
import org.asteriskjava.fastagi.AgiException;
import org.asteriskjava.fastagi.AgiRequest;
import org.asteriskjava.fastagi.BaseAgiScript;

public class Exemplo2 extends BaseAgiScript {

	public void service(AgiRequest request, AgiChannel channel) throws AgiException {
		System.out.println("Entrou no Exemplo 2");
		answer();
		exec("Playback", "tt-monkeys");
		hangup();
	}
}