package com.company;

public class Dunno extends Objects implements Behavior, Watchable, Hurryable{
    private String name;
    public Dunno(String name){
        super(name);
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    @Override
    public void sleep() {
        System.out.println(name + " заснул");
    }
    @Override
    public void notNoticed(){
        System.out.print(name + " не заметил, что ");
    }
    @Override
    public void watch(){
        System.out.println(name + " увидел, что" );
    }
    @Override
    public void startWatch(){
        System.out.println(name + " принялся смотреть в иллюминатор");
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
    public void imagine(){
        System.out.println( name + " вообразил, что");
    }
    @Override
    public void wantToKnow(Objects some){
        System.out.println(name+ " не терпелось узнать, что произошло с " + some.toString());
    }
    @Override
    public void crawl(){
        System.out.println(name + " Дотащившись на четвереньках до стенки кабины и с трудом поднявшись на ноги,");
    }@Override
    public String toString(){
        return name;
    }
    @Override
    public boolean equels(Objects rocket){
        if (this == rocket) return true;
        return false;
    }
    @Override
    public int hashCode(){
        return name.hashCode();
    }

}
