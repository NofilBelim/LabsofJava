package Lab7;
class Course {
    int id;
    String description;
    int duration;
    double fees;

    Course(int id, String description, int duration, double fees) {
        this.id = id;
        this.description = description;
        this.duration = duration;
        this.fees = fees;
    }

    void GetData() {
        System.out.println("ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fees: " + fees);
        System.out.println("---------------------------");
    }
}

public class Q6_CourseDemo {
    public static void main(String[] args) {
        Course[] c = new Course[5];

        c[0] = new Course(1, "Java", 6, 12000);
        c[1] = new Course(2, "Python", 4, 10000);
        c[2] = new Course(3, "C++", 5, 11000);
        c[3] = new Course(4, "Web Development", 3, 9000);
        c[4] = new Course(5, "Data Science", 8, 18000);

        for (int i = 0; i < c.length; i++) {
            c[i].GetData();
        }
    }
}
