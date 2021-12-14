package com.company;

public class Ponchick extends Objects implements Shock, Watchable, Imaginable, Noticing, Emotionable, Behavior, Hearing, Upable, Moveable{
    private String name;
    public Ponchick(String name){
        super(name);
        this.name=name;
    }
    public void setName(String name){
        this.name = name;
    }
    @Override
    public void shockedOfView(){
        System.out.println(name + " от увиденного "+Description.космического+" " + "катаклизма затряс головой и закрыл глаза руками.");
    }
    @Override
    public void watch(){
        System.out.println(name + " увидел, что" );
    }
    @Override
    public void imagine(){
        System.out.println( name + " вообразил, что");
    }
    @Override
    public void think(){
        System.out.print(name + " на минуту задумался и, ");
    }
    @Override
    public void understand(){
        System.out.print(" сообразив, что ");
    }
    @Override
    public void noticed(){
        System.out.print(name + " заметил, что ");
    }
    @Override
    public void notHear(){
        System.out.println("не слышит " + Description.привычного + " шума двигателя.");
    }
    @Override
    public void listened(){
        System.out.println(name + " прислушался. ");
    }
    @Override
    public void rejoice(){
        System.out.print(name + " обрадовался,");
    }
    @Override
    public void sleep(){
        System.out.println(name + " заснул");
    }
    @Override
    public void screech(){
        System.out.println(name + " взвизгнул");
    }
    @Override
    public void snuggle(){
        System.out.println(name + " прижался к стене кабины");
    }
    @Override
    public void notNoticed(){
        System.out.print(name + " не заметил, что ");
    }
    @Override
    public void up(){
        System.out.println(name + " поднялся");
    }
    @Override
    public void startWatch(){
        System.out.println(name + " принялся смотреть в иллюминатор");
    }
    @Override
    public void gotTo(Objects some){
        System.out.println(name + " превозмогая " + some.toString() + " добрался до иллюминатора");
    }
    @Override
    public void shockedOfView2(){
        System.out.println("То, что увидел "+name+" поразило его.");
    }
    @Override
    public String toString(){
        return name;
    }
    @Override
    public boolean equels(Objects ponchick){
        if (this == ponchick) return true;
        return false;
    }
    @Override
    public int hashCode(){
        return name.hashCode();
    }
}
