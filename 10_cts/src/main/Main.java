package main;

import command.ComandaPlecare;
import command.Operator;
import state.Autobuz;


public class Main {

	public static void main(String[] args) {
		// state
		Autobuz autobuz = new Autobuz(1);
		autobuz.pleacaInCursa();
		autobuz.ieseDinService();
		autobuz.intraInService();
		
		// command
		Operator operator = new Operator();
		command.Autobuz a1 = new command.Autobuz("Mercedes");
		command.Autobuz a2 = new command.Autobuz("Otokar");
		
		operator.invoca(new ComandaPlecare(a1,300));
		operator.invoca(new ComandaPlecare(a2,108));
		operator.invoca(new ComandaPlecare(a1,404));
		operator.invoca(new ComandaPlecare(a2,108));
		
		operator.executaComanda();
		operator.executaComanda();
		operator.executaComanda();
		operator.executaComanda();
	}

}
