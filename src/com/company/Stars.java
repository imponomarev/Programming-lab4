package com.company;

public class Stars extends Objects implements Shineable{
    private String name;
    public Stars(String name){
        super(name);
        this.name=name;
    }
    public void setName(String name){
        this.name = name;
    }
    @Override
    public void shine(){
        System.out.println(Description.яркие +" "+ name + " сверкали со всех сторон.");
    }
    @Override
    public String toString(){
        return name;
    }
    @Override
    public boolean equels(Objects stars){
        if (this == stars) return true;
        return false;
    }
    @Override
    public int hashCode(){
        return name.hashCode();
    }
}
