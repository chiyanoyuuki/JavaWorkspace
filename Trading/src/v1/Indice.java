package v1;

import java.util.ArrayList;

public class Indice 
{
	private String nom;
	private ArrayList<Double> vals;
	
	public Indice(double val, String nom)
	{
		this.nom = nom;
		this.vals = new ArrayList<Double>();
		this.vals.add(val);
	}
	
	public void addVal(double d) 
	{
		if(vals.get(vals.size()-1)!=d)
			this.vals.add(d);}
	
	public void show()
	{
		System.out.print(String.format("%-60s", nom));
		for(Double d:vals) 
		{
			System.out.print(String.format("%-10s", ""+d));
		}
		System.out.println();
	}
}
