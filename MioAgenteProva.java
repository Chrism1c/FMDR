import jade.core.Agent;

public class MioAgenteProva extends Agent{
	protected void setup(){		//behaviors = azione � cond di terminazione
		System.out.println("L�agente "+ getAID().getName()+" � stato lanciato");
		Object[] args=getArguments();
		if (args != null) {
			System.out.println("con" + args.length + "argomenti");
		}
		doDelete();	//girera finche non lo uccido
	}
	protected void takeDown() {
		System.out.println("L�agente" + getAID().getName() + "� stato eliminato");
	}
}
