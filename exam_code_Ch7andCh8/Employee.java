public abstract class Employee implements Report {
    String name;

    Employee(String name) {
        this.name = name;
    }

    abstract double calculateSalary();

    void info() {
        System.out.println(name + " menerima gaji Rp" + (long) calculateSalary());
    }
}

interface Report {
    String report();
}

interface Notifiable {
    void notifyUser(String message);
}

class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class PermanentEmployee extends Employee implements Notifiable {
    double baseSalary;
    Address address;

    PermanentEmployee(String name, double baseSalary, Address address) {
        super(name);
        this.baseSalary = baseSalary;
        this.address = address;
    }

    double calculateSalary() {
        return baseSalary;
    }

    public String report() {
        return "Laporan pegawai tetap: " + name;
    }

    public void notifyUser(String message) {
        System.out.println("[Email ke " + name + " di " + address.city + "] " + message);
    }
}

class HonoraryEmployee extends Employee {
    int hours;
    double rate;

    HonoraryEmployee(String name, int hours, double rate) {
        super(name);
        this.hours = hours;
        this.rate = rate;
    }

    double calculateSalary() {
        return hours * rate;
    }

    public String report() {
        return "Laporan pegawai honorer: " + name + " (" + hours + " jam)";
    }
}

class Project implements Report {
    String name;
    int progress;

    Project(String name, int progress) {
        this.name = name;
        this.progress = progress;
    }

    public String report() {
        return "Laporan proyek " + name + ": " + progress + "%";
    }
}