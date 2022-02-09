package ChurchSystem;

public class Pastor {
    private String name;
    private int age;
    private int salary;

    public Pastor(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Name of the Pastor: " + name + "The age of the Pastor:" + age
                + " Total salary earned so far $"
                + salary;

    }

}

