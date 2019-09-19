public class Employee implements Comparable<Employee>
{
    private String id;
    private String surName;
    private String firstName;
    private String secondName;
    private String fio;
    private String position;

    Employee(String id,String lastName, String firstName, String secondName, String profession) {
        this.surName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.position = profession;
        this.fio = this.toString();
        this.id = id;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String lastName) {
        this.surName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPosition() {
        return position;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getId() {
        return id;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    @Override
    public int compareTo(Employee o) {
        return this.toString().compareTo(o.toString());
    }
    @Override
    public String toString() {
        return String.format("%-11s%-11s%-11s", this.surName, this.firstName, this.secondName);
    }
    @Override
    public boolean equals(Object obj)
    {
        Employee employee = (Employee) obj;
        return employee.getId().equals(this.id);
    }

}
