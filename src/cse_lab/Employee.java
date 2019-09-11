package cse_lab;

/**
 * Andrew Goeden
 */
public class Employee extends Person {

    private String office;
    private int salary;
    private MyDate dateHired;

    public Employee(String name, String address, String email, long phone, String office, int salary, MyDate dateHired) {
        super(name, address, email, phone);

        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    /**
     * @param office the office to set
     */
    public void setOffice(String office) {
        this.office = office;
    }
    
    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * @param dateHired the dateHired to set
     */
    public void setDateHired(MyDate dateHired) {
        this.dateHired = dateHired;
    }

    /**
     * @return the office
     */
    public String getOffice() {
        return office;
    }

    /**
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @return the dateHired
     */
    public MyDate getDateHired() {
        return dateHired;
    }

    @Override
    public String toString() {
        return super.toString() + " | OFFICE: " + office + " | SALARY: $" + salary + " | DATE HIRED: " + dateHired.toString();
    }
}