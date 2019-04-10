package ie.tudublin;

import processing.core.PApplet;
import processing.data.TableRow;

public class Resistor extends PApplet
{
    public int value;
    public int ones;
    public int tens;
    public int hundreds;
    PApplet ui;

    public Resistor(PApplet ui)
    {

    }

    public Resistor(TableRow row) 
    {
        //value = row.getInt();
	} 

	public void separate(int value)
	{
        hundreds = (value / 100);
        tens = (value - (hundreds * 100)) / 10;
        ones = value - ((hundreds * 100)  + (tens * 10));
        
        //System.out.println("hello");
        // print(hundreds + ",");
        // print(tens + ",");
        // println(ones);


    }

    public void render()
    {
       ui.ellipse(50,50,100,100);
    }


    
    
    




}