package com.company;

public class SwingMotor extends Objects implements TurnOffable, TurnOnable{
    private String name;
    public SwingMotor(String name){
        super(name);
        this.name=name;
    }
    public void setName(String name){
        this.name=name;
    }
    @Override
    public void turnOff(){
        System.out.println(name+" выключился.");
    }
    @Override
    public String toString(){
        return name;
    }
    @Override
    public boolean equels(Objects swingmotor){
        if (this == swingmotor) return true;
        return false;
    }
    @Override
    public int hashCode(){
        return name.hashCode();
    }
    @Override
    public void turnOn(){
        System.out.println("Чаф-чаф-чаф! " + name + " включился.");
    }
}
