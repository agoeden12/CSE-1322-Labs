package cse_lab;

/**
 * Andrew Goeden
 */
public class Person {
    
    private String name, address, email;
    private long phone;

    public Person(String name, String address, String email, long phone) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(long phone) {
        this.phone = phone;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the phone
     */
    public long getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "NAME: " + name + " | ADDRESS: " + address + " | PHONE NUMBER: " + phone + " | EMAIL: " + email;
    }

}