package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet
{	
	
	Resistor resistorclass;
	private ArrayList<Colour> colours = new ArrayList<Colour>();
	private ArrayList<Resistor> resistors = new ArrayList<Resistor>();
	
	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void settings()
	{
		size(500, 800);
		
		//separate(381);
		//separate(1);
		//separate(92);
	}

	public void setup() 
	{
		loadColours();
		printColours();
		loadResistors();
		printResistors();

		resistorclass = new Resistor(this);
	}	

	public void loadColours()
	{
		Table table = loadTable("colours.csv", "header");

		for(TableRow row : table.rows())
		{
			Colour colour = new Colour(row);
			colours.add(colour);
		}		
	}

	public void printColours()
	{
		for(Colour colour : colours)
		{
			System.out.println(colour);
		}

	}

	public void loadResistors()
	{
		Table table = loadTable("resistors.csv");

		for(TableRow row : table.rows())
		{
			Resistor resistor = new Resistor(row);
			resistors.add(resistor);
		}		
	}

	public void printResistors()
	{
		for(Resistor resistor : resistors)
		{
			System.out.println(resistor);
		}

	}

	// public Colour findColor(int value)
	// {
	// 	return colour + value;
	// }

	public void draw()
	{		
		//resistorclass.render();
		
		
		stroke(0);
		//1st resistor
		line(200,50,300,50); //top line
		line(200,150,300,150); // bottom line
		line(200,50,200,150);  // left side
		line(300,50,300,150);  //right side
		line(150,100,200,100); // left cable
		line(300,100,350,100); // right cable

		//2nd resistor
		line(200,200,300,200); //top line
		line(200,300,300,300); // bottom line
		line(200,200,200,300);  // left side
		line(300,200,300,300);  //right side
		line(150,250,200,250); // left cable
		line(300,250,350,250); // right cable

		//3rd resistor
		line(200,350,300,350); //top line
		line(200,450,300,450); // bottom line
		line(200,350,200,450);  // left side
		line(300,350,300,450);  //right side
		line(150,400,200,400); // left cable
		line(300,400,350,400); // right cable

		//4th resistor
		line(200,500,300,500); //top line
		line(200,600,300,600); // bottom line
		line(200,500,200,600);  // left side
		line(300,500,300,600);  //right side
		line(150,550,200,550); // left cable
		line(300,550,350,550); // right cable





	}
}
