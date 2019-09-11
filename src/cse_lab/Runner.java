package cse_lab;

public class Runner {

    public static void main(String[] args) {
        String name = "Ben Clabby", address = "535 Church St NE, Marietta, GA 30060", email = "benclabby@gmail.com";
        long phone = 4044287888L;

        Person person = new Person(name, address, email, phone);
        System.out.println(person);

        Student student = new Student(name, address, email, phone, "Freshman");
        System.out.println(student.toString());

        Employee employee = new Employee(name, address, email, phone, "College of Computer Science", 20000,
                new MyDate(2018, 8, 10));
        System.out.println(employee.toString());

        Faculty faculty = new Faculty(name, address, phone, email, "College of Computer Science", 20000,
                new MyDate(2018, 8, 10), "Professor", "Mon-Thu 10:30AM-11:30AM");
        System.out.println(faculty.toString());

        Staff staff = new Staff(name, address, phone, email, "College of Computer Science", 20000,
                new MyDate(2018, 8, 10), "Chairman");
        System.out.println(staff.toString());
    }
}