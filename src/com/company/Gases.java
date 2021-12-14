package com.company;

public class Gases extends Objects implements ThrowAwayForwardable {
    private String name;
    public Gases(String name){
        super(name);
        this.name=name;
    }
    public void setName(String name){
        this.name=name;
    }
    @Override
    public void throwAwayForward(){
        System.out.println(Description.нагретые+" " + name + " выбрасывались из сопла в направлении, противоположном движению, ");
    }
    @Override
    public String toString(){
        return name;
    }
    @Override
    public boolean equels(Objects gases){
        if (this == gases) return true;
        return false;
    }
    @Override
    public int hashCode(){
        return name.hashCode();
    }
}
