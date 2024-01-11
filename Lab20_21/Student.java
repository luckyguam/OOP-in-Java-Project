import java.util.Objects;
public class Student {
    private int id;
    private String name;
    private Department department;

    public Student(int id, String name, Department department) {
        if (id <= 0 || name == null || name.length() < 2) {
            throw new IllegalArgumentException();
        }
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId() {
        return this.id;
    }

    public Student setId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException();
        }
        this.id = id;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Student setName(String name) {
        if (name == null || name.length() < 2) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        return this;
    }

    public Department getDepartment() {
        return department;
    }

    public Student setDepartment(Department department) {
        this.department = department;
        return this;
    }

    public String toString(){
        return "Name-" + name + "|ID-" + id + "|Department-" + department + "|";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && name.equals(student.name) && department == student.department;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, department);
    }
}