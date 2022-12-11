package Autoracing;

import Drivers.Driver;
import Drivers.DriverB;
import Drivers.DriverC;
import Drivers.DriverD;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

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


        DriverB<Car> leontiev = new DriverB<>("Леонтьев Евгений Викторович", "B", 12);
        DriverB<Car> fedorov = new DriverB<>("Федоров Александр Петрович", "B", 10);
        leontiev.driverInfo(ferrari);
        fedorov.driverInfo(pagani);
        DriverC<Truck> semenov = new DriverC<>("Семенов Игорь Иванович", "C", 7);
        DriverC<Truck> antonov = new DriverC<>("Антонов Петр Петрович", "C", 25);
        semenov.driverInfo(kamaz);
        antonov.driverInfo(man);
        DriverD<Bus> ivanov = new DriverD<>("", "D", 16);
        DriverD<Bus> seleznev = new DriverD<>("Селезнев Вальдемар Сингузмундович", "D", 19);
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
        kia.setCapacity(Bus.Capacity.AVERAGE);
        liaz.setCapacity(Bus.Capacity.EXTRA_SMALL);
        kia.printType();
        liaz.printType();
        separator();
        scania.setLoadCapacity(Truck.LoadCapacity.N2);
        man.setLoadCapacity(Truck.LoadCapacity.N3);
        scania.printType();
        man.printType();
        separator();

        //Homework Exception
        ivanov.testLic();
        ferrari.setDiagnostic(true);
        porsche.setDiagnostic(true);
        lamborghini.setDiagnostic(true);
        lamborghini.passDiagnostics();
        man.setDiagnostic(true);
        checkDiagnostics(ferrari, porsche, lamborghini, pagani, kia, ikarus, hyundai, liaz, man, scania, volvo, kamaz);
        separator();

        //Homework collection1
        ArrayList <Transport> allAutomobileRace = new ArrayList<>();
        allAutomobileRace.add(ferrari);
        allAutomobileRace.add(porsche);
        allAutomobileRace.add(lamborghini);
        allAutomobileRace.add(pagani);
        allAutomobileRace.add(kia);
        allAutomobileRace.add(ikarus);
        allAutomobileRace.add(hyundai);
        allAutomobileRace.add(liaz);
        allAutomobileRace.add(man);
        allAutomobileRace.add(scania);
        allAutomobileRace.add(volvo);
        allAutomobileRace.add(kamaz);


        Sponsors cocaCola = new Sponsors("Coca-cola", 50_200_000);
        Sponsors smirnov = new Sponsors("IP Smirnov", 10_000_000);
        Sponsors truckCenter = new Sponsors("Truck center", 25_000_000);


        Mechanics mechanic1 = new Mechanics("Сергей", "Слепнев", "Автомоторс", "Bus");
        Mechanics mechanic2 = new Mechanics("Алексей", "Серафимов", "Транпорт-компани", "Car");
        Mechanics mechanic3 = new Mechanics("John", "Stivens", "General Motors", "Car, Truck");

        ferrari.getDrivers().add(leontiev);
        pagani.getDrivers().add(fedorov);
        kamaz.getDrivers().add(semenov);
        man.getDrivers().add(antonov);
        ikarus.getDrivers().add(ivanov);
        liaz.getDrivers().add(seleznev);

        ferrari.getSporsors().add(cocaCola);
        man.getSporsors().add(cocaCola);
        kia.getSporsors().add(smirnov);
        scania.getSporsors().add(truckCenter);
        kamaz.getSporsors().add(truckCenter);

        porsche.getMechanics().add(mechanic2);
        pagani.getMechanics().add(mechanic2);
        kia.getMechanics().add(mechanic1);
        ikarus.getMechanics().add(mechanic1);
        liaz.getMechanics().add(mechanic1);
        hyundai.getMechanics().add(mechanic1);
        scania.getMechanics().add(mechanic3);
        kamaz.getMechanics().add(mechanic3);
        ferrari.getMechanics().add(mechanic3);

        cocaCola.sponsoringRace(ferrari,man);
        mechanic1.doTechnicalInspection(liaz);
        mechanic3.repairTransport(kamaz);
        separator();

        infoAboutTransport(ferrari, porsche, lamborghini, pagani, kia, ikarus, hyundai, liaz, man, scania, volvo, kamaz);
        separator();

        DiagnosticStation<Transport> transportDiagnosticStation = new DiagnosticStation<>();
        transportDiagnosticStation.addTransport(ferrari);
        transportDiagnosticStation.addTransport(porsche);
        transportDiagnosticStation.addTransport(lamborghini);
        transportDiagnosticStation.addTransport(pagani);
        transportDiagnosticStation.addTransport(kia);
        transportDiagnosticStation.addTransport(ikarus);
        transportDiagnosticStation.addTransport(hyundai);
        transportDiagnosticStation.addTransport(liaz);
        transportDiagnosticStation.addTransport(man);
        transportDiagnosticStation.addTransport(scania);
        transportDiagnosticStation.addTransport(volvo);
        transportDiagnosticStation.addTransport(kamaz);

        transportDiagnosticStation.doTechnicalInspection();

        //hw Collections 2 Set
        Set<Driver> allDrivers = new HashSet<>();
        allDrivers.add(leontiev);
        allDrivers.add(fedorov);
        allDrivers.add(fedorov);
        allDrivers.add(seleznev);
        allDrivers.add(semenov);
        allDrivers.add(antonov);
        allDrivers.add(ivanov);

        Set<Mechanics> allMechanics = new HashSet<>();
        allMechanics.add(mechanic1);
        allMechanics.add(mechanic2);
        allMechanics.add(mechanic3);

        Set<Sponsors> allSponsors = new HashSet<>();
        allSponsors.add(cocaCola);
        allSponsors.add(smirnov);
        allSponsors.add(truckCenter);

        System.out.println("Водители: "+allDrivers);
        System.out.println("Механики: "+allMechanics);
        System.out.println("Спонсоры: "+allSponsors);

    }

    public static void infoAboutTransport(Transport ... transports){
        for (Transport transport: transports) {
            System.out.println(transport.getClass().getSimpleName() + ": " + transport.getBrand() + " " + transport.getModel() + ", спонсор: "
                    + transport.getSporsors() + ", механик: " + transport.getMechanics() + ", \nводитель: " + transport.getDrivers());
        }

    }

    public static void checkDiagnostics(Transport... transports) {
        for (Transport transport : transports) {
            try {
                if (!transport.passDiagnostics())
                    throw new RuntimeException();
            } catch (RuntimeException e) {
                System.out.println(transport.getClass().getSimpleName() + " " + transport.getBrand() + " " + transport.getModel() + " необходимо пройти диагностику.");
            }

        }
    }

    public static void separator() {
        System.out.println("\n------------------------------------\n");
    }

}
