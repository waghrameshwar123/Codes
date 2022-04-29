package com;

abstract class Instrumen{

	public abstract void Play();
}

class Piano extends Instrumen{

	@Override 
	public void Play(){
		System.out.println("Piano is playing tan tan tan tan");
	}
	}
class Flute extends Instrumen{

	@Override 
	public void Play(){
		System.out.println("Flute is playing toot toot toot toot ");
		}
	}
class Guitar extends Instrumen{
	@Override 
	public void Play(){
		System.out.println("Guitar is playing tin tin tin");
		}
	}
public class Instrument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instrumen A[] = new Instrumen[10];
		for (int iLoop=0; iLoop<10; iLoop++)

		{
			switch (iLoop%3){
			case 0: { A[iLoop] = new Piano(); break; }

			case 1: { A[iLoop] = new Flute(); break; }

			case 2: { A[iLoop] = new Guitar(); break; }
			}
			}



for (int iLoop=0; iLoop<10; iLoop++){


	System.out.println("------------------------------------");
	System.out.println(" object  " + (iLoop+1));

	A[iLoop].Play();

	if (A[iLoop] instanceof Piano) { System.out.println("Piano"); }

	if (A[iLoop] instanceof Flute) { System.out.println("Flute"); }

	if (A[iLoop] instanceof Guitar) { System.out.println("Guitar"); }
	}
}

	}

