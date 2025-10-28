package com.java.Main;
//IF NO DEPENCY AND NO CLASS DEPENDECY WITH ASSOCIATION & COMPOSITION LOOSE COUPLING
/*In concept of composition of Java one class object working depends upon the object of
second class of second class got deleted or some problem occur dependent object also got effected
*Class are tightly coupled in this scenario
*
*In second approach we have association concept in which a class extends or acquire property of
*another class In this case also its dependent on each other and no loose coupling achieved.
*
*/
//this is association


public class Beta extends Alpha{

	public static void main(String[] args) 
	{
		Alpha af= new Beta();
		//System.out.println(af);
		af.Display();
		
	}

}
