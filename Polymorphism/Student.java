class Student {
    String name;
    int age;

    // Default constructor
    Student() {
        System.out.println("Default Constructor");
    }

    // Constructor with name
    Student(String name) {
        this.name = name;
        System.out.println("Name: " + name);
    }

    // Constructor with name and age
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Nimisha");
        Student s3 = new Student("Nimisha", 20);
    }
}
