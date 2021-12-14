package com.company;

public class MainMotor extends Objects implements TurnOnable{
    private String name;
    public MainMotor(String name){
        super(name);
        this.name=name;
    }
    public void setName(String name){
        this.name=name;
    }
    @Override
    public void turnOn(){
        System.out.println("Чаф-чаф-чаф! " + name + " включился.");
    }
    @Override
    public String toString(){
        return name;
    }
    @Override
    public boolean equels(Objects mainmotor){
        if (this == mainmotor) return true;
        return false;
    }
    @Override
    public int hashCode(){
        return name.hashCode();
    }
}
