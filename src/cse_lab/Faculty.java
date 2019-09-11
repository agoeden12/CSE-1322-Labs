package cse_lab;

public class Faculty extends Employee {

    private String rank, officeHours;

    public Faculty(String name, String address, long phone, String email, String office, int salary, MyDate dateHired, String rank, String officeHours) {
        super(name, address, email, phone, office, salary, dateHired);
        
        this.rank = rank;
        this.officeHours = officeHours;
    }

    /**
     * @param rank the rank to set
     */
    public void setRank(String rank) {
        this.rank = rank;
    }

    /**
     * @param officeHours the officeHours to set
     */
    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    /**
     * @return the rank
     */
    public String getRank() {
        return rank;
    }

    /**
     * @return the officeHours
     */
    public String getOfficeHours() {
        return officeHours;
    }

    @Override
    public String toString() {
        return super.toString() + " | RANK: " + rank + " | OFFICE HOURS: " + officeHours;
    }

}