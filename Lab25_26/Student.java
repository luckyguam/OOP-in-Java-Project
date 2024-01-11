package Lab25_26;


import java.util.Objects;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private double gpa;

    public Student(int id, String firstName, String lastName, double gpa) {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setGpa(gpa);
    }

    public int getId() {
        return id;
    }

    public Student setId(int id) {
        if (id < 1 || id > 99) {
            throw new IllegalArgumentException("Invalid student ID");
        }
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Student setFirstName(String firstName) {
        validateName(firstName);
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Student setLastName(String lastName) {
        validateName(lastName);
        this.lastName = lastName;
        return this;
    }

    public double getGpa() {
        return gpa;
    }

    public Student setGpa(double gpa) {
        if (gpa < 0.0 || gpa > 4.0) {
            throw new IllegalArgumentException("Invalid GPA");
        }
        this.gpa = gpa;
        return this;
    }

    private void validateName(String name) {
        if (name == null || name.length() < 2) {
            throw new IllegalArgumentException("Invalid name");
        }
    }

    @Override
    public String toString() {
        return String.format("%d,%s,%s,%.2f", id, firstName, lastName, gpa);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                Double.compare(student.gpa, gpa) == 0 &&
                firstName.equals(student.firstName) &&
                lastName.equals(student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, gpa);
    }
}
