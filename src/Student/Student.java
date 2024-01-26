package Student;

public class Student {
    String name;
    int age;
    String email;
    String proficient;
    String status;

    public Student(String name, int age, String email, String proficient) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.proficient = proficient;
    }

    public static void main(String[] args) {
        Student stud1 = new Student("Caroline", 18, "Caroline@gmail.com", "Front end");
        Student stud2 = new Student("John", 26, "John@gmail.com", "Back end");
        Student stud3 = new Student("Ovita",30,"Ovita@gmail.com","Full stack");
        System.out.println("Student 1:");
        System.out.println("Name: " + stud1.name);
        System.out.println("Age: " + stud1.age);
        System.out.println("Email: " + stud1.email);
        System.out.println("Proficient: " + stud1.proficient);

        System.out.println("\nStudent 2:");
        System.out.println("Name: " + stud2.name);
        System.out.println("Age: " + stud2.age);
        System.out.println("Email: " + stud2.email);
        System.out.println("Proficient: " + stud2.proficient);

        System.out.println("\nStudent 3: ");
        System.out.println("Name: "+ stud3.name);
        System.out.println("Age: "+stud3.age);
        System.out.println("Email: "+ stud3.email);
        System.out.println("Proficient: "+ stud3.status);
    }
}
