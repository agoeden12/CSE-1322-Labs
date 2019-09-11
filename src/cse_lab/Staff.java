package cse_lab;

public class Staff extends Employee {

    private String title;

    public Staff(String name, String address, long phone, String email, String office, int salary, MyDate dateHired, String title) {
        super(name, address, email, phone, office, salary, dateHired);

        this.title = title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return super.toString() + " | TITLE: " + title;
    }

}