package demoOOPs;

import ModifierDemo1.ModifierDemoProg;

//import
//normal class
// a java class file should have only one public class
// Encapsulation 
interface idemo
{
	//variables are by default final
	int t=8;
	public int ttData();
	
}

class test implements idemo
{
	int  i;
	private int j;
	protected int k;
	public int m;
	
	public test(int p,int q)
	{
		i=p;
		k=q;
		m=7;
	}
	
	int getI()
	{
		return i/i;
	}

	@Override
	public int ttData() {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class EncapsulationDemo extends ModifierDemoProg  {

	public int ttesting()
	{
		c=3;
		return c;
	}
	
	public static void main(String[] args) {
		test te = new test(2,3);
		
		System.out.println(te.i +":"+ te.k +":"+ te.m);
	}

}

