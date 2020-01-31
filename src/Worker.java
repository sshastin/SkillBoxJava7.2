public class Worker {

    private Integer salary;
    private String name;
    private Integer age;

    public Worker(Integer salary, String name, Integer age) {
        this.salary = salary;
        this.name = name;
        this.age = age;
    }

    public Integer getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

}
