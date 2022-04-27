package ie.tudublin;

import java.util.ArrayList;

import processing.data.Table;
import processing.data.TableRow;

import processing.core.PApplet;

public class NematodeVisualiser extends PApplet
{ 
	ArrayList<Nematode> nematodes = new ArrayList<Nematode>();

	public void keyPressed()
	{		
		if (keyCode == LEFT)
		{
		}		
	}

	public void settings()
	{
		size(800, 800);
	}

	public void setup() 
	{
		colorMode(HSB);
		background(255);
		smooth();
		loadNematodes();
		printNematodes();		
	}
	
	/*
	public void drawNematodes() 
	{
		for(Nematode n:nematodes)
		{
			n.render(this);
		}
    }
	*/
	
	public void printNematodes()
	{
		for (Nematode n:nematodes)
		{
			System.out.println(n);
		}
	}

	public void loadNematodes()
	{
		Table table = loadTable("nematodes.csv", "header");
		for (TableRow r:table.rows())
		{
			Nematode n = new Nematode(r);
			nematodes.add(n);
		}
	}

	float border;

	public void draw()
	{	
		background(0);
		stroke(255);
		//drawNematodes();
	
		int h = height / 10;
		int w = width / 10;
		
		fill(255);
		circle(400, h, w);

        fill(255);
        textSize(30);
        textAlign(LEFT, CENTER);
        text("Steve", 365, 10);
	}
}
