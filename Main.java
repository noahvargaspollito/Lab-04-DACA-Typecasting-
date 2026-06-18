// YOUR NAME: NOAH VARGAS POLO
// COLLABORATORS:  
// DATE: 6/18/26

public class Main
{
	public static void main(String[] args)
	{
		// DECLARATION SECTION
		double stateAvgCont;
		int statAvgCountRounded;
		String mostNumState;




		// INITIALIZATION SECTION
		char stateMostDaca1 = 'c';
		char stateMostDaca2 = 'a';
		String stateMostDaca;
		int numDacaRecipient = 700000;
		long dacaFederalTaxRev = 60000000000L;
		// INPUT SECTION


		// N/A (no input for this lab)
		

		// CALCULATION & PROCESSING SECTION
		stateAvgCont = ((double)dacaFederalTaxRev / numDacaRecipient);
		statAvgCountRounded = (int)(stateAvgCont);
		stateMostDaca1 = (char) (stateMostDaca1 - 32);
		stateMostDaca2 = (char) (stateMostDaca2 - 32);
		stateMostDaca = "" + stateMostDaca1 + stateMostDaca2;
		// OUTPUT SECTION
		System.out.println("Average DACA-recipient Tax Contribution: "+stateAvgCont);
		System.out.println("Rounded down to nearest whole dollar: "+statAvgCountRounded);
		System.out.println("State with most DACA recipients: "+stateMostDaca);



	}
}