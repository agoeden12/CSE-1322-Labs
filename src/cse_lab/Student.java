package cse_lab;

/**
 * Andrew Goeden
 */
public class Student extends Person{
    
    private String classStatus;

    public Student(String name, String address, String email, long phone, String classStatus) {
        super(name, address, email, phone);

        this.classStatus = classStatus;
    }

    /**
     * @param classStatus the classStatus to set
     */
    public void setClassStatus(String classStatus) {
        this.classStatus = classStatus;
    }

    /**
     * @return the classStatus
     */
    public String getClassStatus() {
        return classStatus;
    }

    @Override
    public String toString() {
        return super.toString() + " | CLASS STATUS: " + classStatus;
    }

}