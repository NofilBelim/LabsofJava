package Lab6;
class Point3D {

    int x, y, z;

    Point3D() {
        x = 0;
        y = 0;
        z = 0;
    }

    Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void display() {
        System.out.println("(" + x + "," + y + "," + z + ")");
    }

    double distance(Point3D p) {
        return Math.sqrt(
                Math.pow(x - p.x, 2) +
                        Math.pow(y - p.y, 2) +
                        Math.pow(z - p.z, 2));
    }
}

public class TestPoint {
    public static void main(String[] args) {

        Point3D p1 = new Point3D(1,2,3);
        Point3D p2 = new Point3D(4,5,6);

        p1.display();
        p2.display();

        System.out.println("Distance: " + p1.distance(p2));
    }
}