package com.company;

public class Forces extends Objects {
    private String name;
    public Forces(String name){
        super(name);
        this.name=name;
    }
    public static class CentrifugalForce extends Forces {
        private String name;
        public CentrifugalForce(String name) {
            super(name);
            this.name = name;
        }

        public void emerged() {
            System.out.print(name + ", возникшая в результате вращения ракеты,");
        }

        public void threwAway(Objects some1, Objects some2) {
            System.out.println(" отбросила в сторону " + some1.toString() + " " + some2.toString());
        }
    }
    public static class Gravity extends Forces{
        private String name;
        public Gravity(String name) {
            super(name);
            this.name = name;
        }
        public void pressed(Objects some1, Objects some2){
            System.out.println(name + " прижала " + some1.toString() + " и " + some2.toString() + " к полу кабины.");
        }
        public void increase(){
            System.out.println(name + " все возрастает.");
        }
    }
}
