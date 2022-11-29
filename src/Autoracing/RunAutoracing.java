package Autoracing;

import Drivers.DriverB;
import Drivers.DriverC;
import Drivers.DriverD;

public class RunAutoracing {

    public static void main(String[] args) {
        Car ferrari = new Car("Ferrari", "F40", 510);
        Car porsche = new Car("Porsche", "Carrera GT", 470);
        Car lamborghini = new Car("Lamborghini", "Aventador", 700);
        Car pagani = new Car("Pagani", "Zonda HP Barchetta", 789);

        Bus kia = new Bus("KIA", "Granbird", 380);
        Bus ikarus = new Bus("Ikarus", "260", 192);
        Bus hyundai = new Bus("Hyundai", "County", 155);
        Bus liaz = new Bus("Лиаз", "6233", 310);

        Truck scania = new Truck("Scania", "S730", 240);
        Truck man = new Truck("Man", "TGS", 440);
        Truck volvo = new Truck("Volvo", "FH-3", 540);
        Truck kamaz = new Truck("КамАЗ", "65225-43", 400);


        System.out.println(ferrari);
        System.out.println(porsche);
        System.out.println(lamborghini);
        System.out.println(pagani);
        separator();
        System.out.println(kia);
        System.out.println(ikarus);
        System.out.println(hyundai);
        System.out.println(liaz);
        separator();
        System.out.println(scania);
        System.out.println(man);
        System.out.println(volvo);
        System.out.println(kamaz);
        separator();

        DriverB<Car> leontiev = new DriverB<>("Леонтьев Евгений Викторович", true, 12);
        DriverB<Car> fedorov = new DriverB<>("Федоров Александр Петрович", true, 10);
        leontiev.driverInfo(ferrari);
        fedorov.driverInfo(pagani);
        DriverC<Truck> semenov = new DriverC<>("Семенов Игорь Иванович", true, 7);
        DriverC<Truck> antonov = new DriverC<>("Антонов Петр Петрович", true, 25);
        semenov.driverInfo(kamaz);
        antonov.driverInfo(man);
        DriverD<Bus> ivanov = new DriverD<>("", true, 16);
        DriverD<Bus> seleznev = new DriverD<>("Селезнев Вальдемар Сингузмундович", true, 19);
        ivanov.driverInfo(ikarus);
        seleznev.driverInfo(liaz);
        separator();

        leontiev.startMove();
        fedorov.startMove();
        ferrari.startMove();
        pagani.startMove();
        pagani.pitStop();
        ferrari.pitStop();
        leontiev.stop();
        ferrari.stopMove();
        pagani.stopMove();
        fedorov.stop();
        ferrari.bestTimeLap();
        pagani.bestTimeLap();
        pagani.maxSpeed();
        ferrari.maxSpeed();
        separator();

        kia.maxSpeed();
        scania.maxSpeed();
        man.bestTimeLap();
        separator();

        //--Homework Enum
        ferrari.setBodyType(Car.BodyType.COUPE);
        porsche.setBodyType(Car.BodyType.SEDAN);
        ferrari.printType();
        porsche.printType();
        pagani.printType();
        separator();
        kia.setCapacity(Bus.SitCapacity.AVERAGE);
        liaz.setCapacity(Bus.SitCapacity.EXTRA_SMALL);
        kia.printType();
        liaz.printType();
        separator();
        scania.setLoadCapacity(Truck.LoadCapacity.N2);
        man.setLoadCapacity(Truck.LoadCapacity.N3);
        scania.printType();
        man.printType();
        separator();


    }

    public static void separator() {
        System.out.println("\n------------------------------------\n");
    }

}
