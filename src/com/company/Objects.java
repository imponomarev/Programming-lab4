package com.company;

public abstract class Objects {
    private String name;
    public Objects(String name){
        this.name = name;
    }
    public void appear(){
        System.out.println(name + "появился");
    }
    public String toString(){
        return name;
    }
    public boolean equels(Objects object){
        if (this == object) return true;
        return false;
    }
    public int hashCode(){
        return name.hashCode();
    }
}
