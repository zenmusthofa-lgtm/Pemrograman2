public class Main {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone("Galaxy", new Battery(80));
        phone.call("08123456789");
        System.out.println();

        Device[] devices = {
                phone,
                new Laptop("ThinkPad", new Battery(50)),
                new Tablet("iPad", new Battery(65))
        };

        for (Device d : devices) {
            test(d);
        }
    }

    static void test(Device d) {
        d.turnOn();
        System.out.println();
    }
}