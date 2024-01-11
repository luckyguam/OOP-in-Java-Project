package Lab25_26;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class StudentInformationSystem {
    private static final String FILE_PATH = "students.txt";
    private static final TreeMap<Integer, Student> studentMap = new TreeMap<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        loadStudentsFromFile();

        while (true) {
            printMenu();
            int choice = getUserChoice();

            switch (choice) {
                case 1:
                    printAllStudents();
                    break;
                case 2:
                    addNewStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    findStudent();
                    break;
                case 5:
                    saveStudentsToFile();
                    System.out.println("Exiting the application. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Illegal menu item selected. Please try again.");
                    break;
            }
        }
    }

    private static void loadStudentsFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(",");
                int id = Integer.parseInt(tokens[0].trim());
                String firstName = tokens[1].trim();
                String lastName = tokens[2].trim();
                double gpa = Double.parseDouble(tokens[3].trim());

                Student student = new Student(id, firstName, lastName, gpa);
                studentMap.put(id, student);
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    private static void printMenu() {
        System.out.println("Student Information System");
        System.out.println("1. Print All Students");
        System.out.println("2. Add a New Student");
        System.out.println("3. Delete an Existing Student");
        System.out.println("4. Find a Student");
        System.out.println("5. Exit");
    }

    private static int getUserChoice() {
        System.out.print("Enter your choice (1-5): ");
        while (!scanner.hasNextInt()) {
            scanner.next(); 
            System.out.print("Invalid input. Enter a number (1-5): ");
        }
        return scanner.nextInt();
    }

    private static void printAllStudents() {
        System.out.println("List of all students:");
        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            System.out.println(entry.getValue());
        }
        System.out.println("-------------------------------------");
    }

    private static void addNewStudent() {
        System.out.println("Adding a new student:");
        int id;
        do {
            System.out.print("Enter student ID (1-99): ");
            while (!scanner.hasNextInt()) {
                scanner.next(); 
                System.out.print("Invalid input. Enter a number (1-99): ");
            }
            id = scanner.nextInt();

            if (id < 1 || id > 99) {
                System.out.println("Invalid ID. Please enter a valid ID.");
            } else if (studentMap.containsKey(id)) {
                System.out.println("ID already exists. Please enter a unique ID.");
            }
        } while (id < 1 || id > 99 || studentMap.containsKey(id));

        System.out.print("Enter first name: ");
        String firstName = scanner.next();


        System.out.print("Enter last name: ");
        String lastName = scanner.next();

        double gpa;
        do {
            System.out.print("Enter GPA (0.0-4.0): ");
            while (!scanner.hasNextDouble()) {
                scanner.next(); 
                System.out.print("Invalid input. Enter a number (0.0-4.0): ");
            }
            gpa = scanner.nextDouble();

            if (gpa < 0.0 || gpa > 4.0) {
                System.out.println("Invalid GPA. Please enter a valid GPA.");
            }
        } while (gpa < 0.0 || gpa > 4.0);

        Student newStudent = new Student(id, firstName, lastName, gpa);
        studentMap.put(id, newStudent);

        System.out.println("New student added:");
        System.out.println(newStudent);
        System.out.println("-------------------------------------");
    }

    private static void deleteStudent() {
        System.out.print("Enter the ID of the student to delete: ");
        while (!scanner.hasNextInt()) {
            scanner.next(); // Consume invalid input
            System.out.print("Invalid input. Enter a number: ");
        }
        int idToDelete = scanner.nextInt();

        if (studentMap.containsKey(idToDelete)) {
            Student deletedStudent = studentMap.remove(idToDelete);
            System.out.println("Student deleted:");
            System.out.println(deletedStudent);
        } else {
            System.out.println("Student with ID " + idToDelete + " not found.");
        }

        System.out.println("-------------------------------------");
    }

    private static void findStudent() {
        System.out.print("Enter the ID of the student to find: ");
        while (!scanner.hasNextInt()) {
            scanner.next(); // Consume invalid input
            System.out.print("Invalid input. Enter a number: ");
        }
        int idToFind = scanner.nextInt();

        if (studentMap.containsKey(idToFind)) {
            Student foundStudent = studentMap.get(idToFind);
            System.out.println("Student found:");
            System.out.println(foundStudent);
        } else {
            System.out.println("Student with ID " + idToFind + " not found.");
        }

        System.out.println("-------------------------------------");
    }

    private static void saveStudentsToFile() {
        try (FileWriter writer = new FileWriter(FILE_PATH)) {
            for (Student student : studentMap.values()) {
                writer.write(student.toString() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

