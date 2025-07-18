class Employee {
    private int id;
    private String name;
    private double salary;
    private String month;
    private String department;

    public Employee(int id,String name, double salary, String month, String department) {
        this.id =id;
        this.name = name;
        this.salary = salary;
        this.month = month;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }
    public String getMonth() {
        return month;
    }
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", month=" + month + ", department=" + department + "]";
    }

}