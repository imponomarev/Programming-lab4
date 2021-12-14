package com.company;

public class Rocket extends Objects implements Destroyable, Bumpable, Slowable, Twistable, Approachable {
    private String name;
    public Rocket(String name){
        super(name);
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void bump(Objects some){
        System.out.println(name+ " врезалась в " + some.toString());
    }
    @Override
    public void destroy(Objects some){
        System.out.println(name + " расколотила " + some.toString());
    }
    @Override
    public void tailTwist(Objects some){
        System.out.println(name + " повернулась "+Description.хвостовой+ " частью к " + some.toString());
    }
    @Override
    public void  slowDown(){
        System.out.println(name + " стала замедлять ход");
    }
    @Override
    public void approach(Objects some){
        System.out.println(name + " приблизилась к " + some.toString() + " с "+Description.небольшой + " скоростью и не разбилась.");
    }
    @Override
    public void comeBack(){
        System.out.println(name + " не сможет продолжать полет и должна будет вернуться обратно.");
    }
    @Override
    public void byInertia(){
        System.out.println(name + " летела по инерции.");
    }
    @Override
    public void maxSpeed(){
        System.out.println(name + " достигла максимальной скорости.");
    }
    @Override
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
    public static class JetEngine extends Rocket implements TurnOffable{
        private String name;
        public JetEngine(String name) {
            super(name);
            this.name = name;
        }
        public void turnOffOnTime(){
            System.out.println(name + " совсем не испортился, а только выключился на время.");
        }
        @Override
        public void turnOff(){
                System.out.println(name+" выключился.");
        }
    }
    public static class ElectronicControlMachine extends Rocket{
        private String name;
        public ElectronicControlMachine(String name){
            super (name);
            this.name = name;
        }
        public void stoppedWork(Objects some){
            System.out.println(name + " автоматически прекратила работу "+some.toString());
        }
    }
}
