package ChurchSystem;

public class Members {
    private String group;
    private String name;
    private int age;

    public Members(String group, String name, int age) {
        this.group = group;
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Member's name :" + name +
                " is " + age + " of age and belong to the " + group + " Group";
    }
}

