package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet
{
	public class Nematodes
	{
		private String name;
		private Integer length;
		private boolean limbs;
		private boolean gender;
		private boolean eyes;
		
		//constructor for the nematodes
		public Nematodes(String name, Integer length, boolean limbs, boolean gender, boolean eyes) {
			this.name = name;
			this.length = length;
			this.limbs = limbs;
			this.gender = gender;
			this.eyes = eyes;
		}

		//getters and setters for the mematodes
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Integer getLength() {
			return length;
		}
		public void setLength(Integer length) {
			this.length = length;
		}
		public boolean isLimbs() {
			return limbs;
		}
		public void setLimbs(boolean limbs) {
			this.limbs = limbs;
		}
		public boolean isGender() {
			return gender;
		}
		public void setGender(boolean gender) {
			this.gender = gender;
		}
		public boolean isEyes() {
			return eyes;
		}
		public void setEyes(boolean eyes) {
			this.eyes = eyes;
		}
	}

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
		background(0);
		smooth();				
	}
	
	public void loadNematodes()
	{
	}

	public void draw()
	{	
	}
}
