package com.company;

public class Moon extends Objects implements IsntHere, Brokenable{
    private String name;
    public Moon(String name){
        super(name);
        this.name=name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void notHere(){
        System.out.println("на небе никакой "+ name +" уже не было.");
    }
    @Override
    public void broke(Objects some){
        System.out.println(name+" раскололась на кусочки, которые разлетелись в стороны и превратились в " + some.toString()+".");
    }
    @Override
    public String toString(){
        return name;
    }
    @Override
    public boolean equels(Objects moon){
        if (this == moon) return true;
        return false;
    }
    @Override
    public int hashCode(){
        return name.hashCode();
    }
    public static class LunarSurface extends Moon {
        private String name;

        public LunarSurface(String name) {
            super(name);
            this.name = name;
        }

        public void swayed() {
            System.out.println(name + " покачнулась, будто её толкнул кто-то");
        }

        public void overturned() {
            System.out.println(name + " запрокинулась куда-то назад");
        }

        public void rollOver() {
            System.out.println(name + " всей своей громадой начала перевертываться в пространстве.");
        }

        public void flashed() {
            System.out.println("промелькнула " + Description.светящаяся + " " + name);
        }

        public void toSwing() {
            System.out.println(name + " качнувшись, ухнула куда-то вниз");
        }

        public void span(Objects some1){
            System.out.println("во все стороны на многие километры, до самого горизонта тянулась " + name + "со всеми " + some1.toString());
        }

        public void stayNormal() {
            System.out.println(name + " была не перевернута, а стояла нормально, как полагается");
        }

        public void closer() {
            System.out.println(name + " вовсе не удалялась, а приближалась");
        }

        public void didntSeem() {
            System.out.println(name + "не казалась " + Description.пепельно + "-" + Description.серой + " а была " + Description.серебристо + "-" + Description.белой);

        }


        public static class MountainRanges extends LunarSurface {
            private String name;

            public MountainRanges(String name) {
                super(name);
                this.name = name;
            }

            @Override
            public void toSwing() {
                System.out.println(name + " качнувшись, ухнули куда-то вниз");
            }

            @Override
            public void span(Objects some) {
                System.out.println("В разные стороны тянулись " + name + " и "+ some.toString());
            }
        }

        public static class Craters extends LunarSurface {
            private String name;

            public Craters(String name) {
                super(name);
                this.name = name;
            }

            public void toSwing() {
                System.out.println(name + " качнувшись, ухнули куда-то вниз");
            }
        }
    }
}
