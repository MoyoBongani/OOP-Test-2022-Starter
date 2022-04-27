package ie.tudublin;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class Nematode extends PApplet
{
    private String name;
    private Integer length;
    private boolean limbs;
    private String gender;
    private boolean eyes;

    
    @Override
    public String toString() {
        return "Nematode [eyes=" + eyes + ", gender=" + gender + ", length=" + length + ", limbs=" + limbs + ", name="
                + name + "]";
    }

    //table row parameter
    public Nematode(TableRow tr)
    {
    this(
        tr.getString("name"),
        tr.getInt("length"),
        tr.getInt("limbs") == 1,
        tr.getString("gender"),
        tr.getInt("eyes") == 1);
    }

    //constructor for the nematodes
    public Nematode(String name, Integer length, boolean limbs, String gender, boolean eyes) 
    {
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
    public String isGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public boolean isEyes() {
        return eyes;
    }
    public void setEyes(boolean eyes) {
        this.eyes = eyes;
    }
}
