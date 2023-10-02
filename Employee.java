public class Employee {
    private String employeeID;
    private String name;
    private String designation = "Lab attendant";

    public Employee(String employeeID, String name, String designation) {
        this.employeeID = employeeID;
        this.name = name;
        this.designation = designation;
    }

    public String getEmployeeID() {
        return this.employeeID;
    }
}

