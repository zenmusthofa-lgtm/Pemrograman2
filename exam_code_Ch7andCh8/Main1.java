public class Main1 {
    public static void main(String[] args) {
        PermanentEmployee samsul = new PermanentEmployee("Samsul", 5000000, new Address("Sampit"));

        Employee[] employees = {
                samsul,
                new HonoraryEmployee("Sari", 80, 35000)
        };

        for (Employee e : employees) {
            e.info();
            System.out.println(e.report());
            System.out.println();
        }

        Report project = new Project("Sistem Akademik", 75);
        System.out.println(project.report());
        System.out.println();

        samsul.notifyUser("Slip gaji sudah tersedia");
    }
}