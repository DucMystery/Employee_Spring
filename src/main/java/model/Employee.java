package model;

public class Employee {

    private String id;
    private String name;
    private String contactNumber;

    public Employee() {
    }

    public Employee(String id, String name, String contactNumber) {
        this.id = id;
        this.name = name;
        this.contactNumber = contactNumber;
    }

    public String getId() {
        return id;
    }

    public Employee setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public Employee setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
        return this;
    }
}
