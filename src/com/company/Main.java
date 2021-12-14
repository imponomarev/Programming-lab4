package com.company;

import java.security.cert.CertificateEncodingException;

public class Main {
    public static void main(String[] args) throws Exceptions.StoryException {
	Ponchick ponchick = new Ponchick("Пончик");
    Moon moon = new Moon("Луна");
    Stars stars = new Stars("звездочки");
    Rocket rocket = new Rocket("ракета");
    MainMotor mainmotor = new MainMotor("основной двигатель");
    SwingMotor swingmotor = new SwingMotor("двигатель поворота");
    Gases gases = new Gases("газы");
    Rocket.JetEngine jetEngine = new Rocket.JetEngine("Реактивный двигатель");
    Rocket.ElectronicControlMachine electroMachine = new Rocket.ElectronicControlMachine("Электронная управляющая машина");
    Dunno dunno = new Dunno("Незнайка");
    Moon.LunarSurface lunarsurface = new Moon.LunarSurface("Лунная поверхность");
    Forces.CentrifugalForce centrforce = new Forces.CentrifugalForce("Цетростробежная сила");
    Moon.LunarSurface.MountainRanges mountain = new Moon.LunarSurface.MountainRanges("Горные цепи");
    Moon.LunarSurface.Craters craters = new Moon.LunarSurface.Craters("Кратеры");
    Forces.Gravity gravity = new Forces.Gravity("Сила тяжести");
    try {

        ponchick.think();
        ponchick.noticed();
        ponchick.notHear();
        ponchick.listened();
        ponchick.rejoice();
        ponchick.understand();
        rocket.comeBack();
        jetEngine.turnOffOnTime();
        rocket.maxSpeed();
        electroMachine.stoppedWork(jetEngine);
        rocket.byInertia();
        dunno.sleep();
        ponchick.sleep();
        dunno.notNoticed();
        jetEngine.turnOff();
        ponchick.notNoticed();
        jetEngine.turnOff();
        ponchick.up();
        ponchick.startWatch();
        dunno.startWatch();
        swingmotor.turnOn();
        ponchick.watch();
        dunno.watch();
        lunarsurface.swayed();
        lunarsurface.overturned();
        lunarsurface.rollOver();
        ponchick.imagine();
        dunno.imagine();
        rocket.bump(moon);
        dunno.screech();
        ponchick.screech();
        centrforce.emerged();
        centrforce.threwAway(dunno, ponchick);
        ponchick.snuggle();
        dunno.snuggle();
        ponchick.watch();
        dunno.watch();
        lunarsurface.flashed();
        lunarsurface.toSwing();
        mountain.toSwing();
        ToSwingable moonSea = new ToSwingable() {
            @Override
            public void toSwing() {
                System.out.println("Лунные моря качнувшись, ухнули куда-то вниз");
            }
        };
        moonSea.toSwing();

        ponchick.shockedOfView();
        ponchick.watch();
        moon.notHere();
        stars.shine();
        ponchick.imagine();
        rocket.bump(moon);
        rocket.destroy(moon);
        moon.broke(stars);
        rocket.tailTwist(moon);
        swingmotor.turnOff();
        mainmotor.turnOn();
        gases.throwAwayForward();
        rocket.slowDown();
        rocket.approach(moon);

        rocket.slowDown();
        gravity.pressed(dunno, ponchick);
        dunno.wantToKnow(moon);
        dunno.crawl();
        dunno.startWatch();
        gravity.increase();
        ponchick.gotTo(gravity);
        ponchick.startWatch();
        ponchick.shockedOfView2();
        lunarsurface.span(mountain);
        lunarsurface.stayNormal();
        mountain.stayNormal();
        craters.stayNormal();
        ponchick.startWatch();
        ponchick.noticed();
        lunarsurface.closer();
        lunarsurface.didntSeem();
        mountain.span(craters);
    } catch(Exception e){
        System.err.println("Что-то пошло не так: " + e.getMessage() ) ;
        throw new Exceptions.StoryException();
    } finally{
        System.out.println("Конец");
    }
    }
}
