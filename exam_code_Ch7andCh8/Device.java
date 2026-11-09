public class Device {
    String name;

    Device(String name) {
        this.name = name;
    }

    void turnOn() {
        System.out.println(name + " menyala");
    }
}

class Battery {
    int level;

    Battery(int level) {
        this.level = level;
    }
}

class Smartphone extends Device {
    Battery battery;

    Smartphone(String name, Battery battery) {
        super(name);
        this.battery = battery;
    }

    void call(String number) {
        System.out.println(name + " menelepon " + number);
    }

    void turnOn() {
        super.turnOn();
        System.out.println("Baterai: " + battery.level + "%");
    }
}

class Laptop extends Device {
    Battery battery;

    Laptop(String name, Battery battery) {
        super(name);
        this.battery = battery;
    }

    void turnOn() {
        super.turnOn();
        System.out.println("Baterai: " + battery.level + "%");
        System.out.println("Keyboard siap dipakai");
    }
}

class Tablet extends Device {
    Battery battery;

    Tablet(String name, Battery battery) {
        super(name);
        this.battery = battery;
    }

    void turnOn() {
        super.turnOn();
        System.out.println("Baterai: " + battery.level + "%");
        System.out.println("Layar sentuh aktif");
    }
}