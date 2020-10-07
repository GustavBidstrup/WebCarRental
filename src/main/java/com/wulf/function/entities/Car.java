package com.wulf.function.entities;
public class Car {
    private String make;
    private String model;
    private int cyl;
    private int id;
    private int HK;
    private int MPG_City;
    private int MPG_Heighway;
    private int weight;
    private int length;
    private int year;
    private int milage;

    public Car(int id, String make, String model, int cyl, int HK, int MPG_City, int MPG_Heighway, int wheelbase, int year, int milage) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.cyl = cyl;
        this.HK = HK;
        this.MPG_City = MPG_City;
        this.MPG_Heighway = MPG_Heighway;
        this.weight = weight;
        this.length = wheelbase;
        this.year = year;
        this.milage = milage;
    }
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getCyl() {
        return cyl;
    }

    public int getHK() {
        return HK;
    }

    public int getWeight() {
        return weight;
    }

    public int getLength() {
        return length;
    }

    public int getYear() {
        return year;
    }

    public int getId() {
        return id;
    }

    public int getMPG_City() {
        return MPG_City;
    }

    public int getMPG_Heighway() {
        return MPG_Heighway;
    }

    public int getMilage() {
        return milage;
    }
    public String toStringAll() {
        String retVal = "";
        retVal+="MAKE:" + make;
        retVal+="\nMODEL:" + model;
        retVal+="\nCYL:" + cyl;
        retVal+="\nHK:" + HK;
        retVal+="\nMilesPerGallon:" + MPG_City;
        retVal+="\nWEIGHT:" + weight;
        retVal+="\nLENGTH:" + length;
        retVal+="\nYEAR:" + year;
        retVal+="\nMILAGE:" + milage;
        return retVal;
    }
    public String toStringBasic() {
        String retVal = "";
        retVal+="MAKE:" + make;
        retVal+="\nMODEL:" + model;
        retVal+="\nMilesPerGallon:" + MPG_City;
        retVal+="\nYEAR:" + year;
        retVal+="\nMILAGE:" + milage + "\n\n";
        return retVal;
    }

}

