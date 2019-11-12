package Staff;

public abstract class Employee {
    private String name;
    private String nINumber;
    private double salary;


    public Employee(String name, String nINumber, double salary){
        this.name = name;
        this.nINumber = nINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public String getNINumber() {
        return nINumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double percentage){
        this.salary += this.salary * Math.abs(percentage);
    }

    public double payBonus(){
        return this.salary * 0.01;
    }
}
