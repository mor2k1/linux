package OOP;

import java.util.Locale;
public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;
    private String year;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("aaoris") || validModel.equals("corona")){
            this.model = model;
        }else {
            this.model = "Unknown";
        }
    }
    public String getModel(){
        return this.model;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
