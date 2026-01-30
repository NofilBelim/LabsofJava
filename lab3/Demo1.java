package FigPackage;

abstract class Figure {
    double r, a, v;
    double pi = 3.1428;

    public abstract void calcArea();
    public abstract void calcVolume();
    public abstract void dispArea();
    public abstract void dispVolume();
}

class Cone extends Figure {
    double h, s;

    Cone(double r, double h) {
        this.r = r;
        this.h = h;
        this.s = Math.sqrt((r * r) + (h * h));
    }

    public void calcArea() {
        a = (pi * r * s) + (pi * r * r);
    }

    public void calcVolume() {
        v = (pi * r * r * h) / 3;
    }

    public void dispArea() {
        System.out.println("Cone Area = " + a);
    }

    public void dispVolume() {
        System.out.println("Cone Volume = " + v);
    }
}

class Sphere extends Figure {

    Sphere(double r) {
        this.r = r;
    }

    public void calcArea() {
        a = 4 * pi * r * r;
    }

    public void calcVolume() {
        v = (4 * pi * r * r * r) / 3;
    }

    public void dispArea() {
        System.out.println("Sphere Area = " + a);
    }

    public void dispVolume() {
        System.out.println("Sphere Volume = " + v);
    }
}

class Cylinder extends Figure {
    double h;

    Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public void calcArea() {
        a = (2 * pi * r * r) + (2 * pi * r * h);
    }

    public void calcVolume() {
        v = pi * r * r * h;
    }

    public void dispArea() {
        System.out.println("Cylinder Area = " + a);
    }

    public void dispVolume() {
        System.out.println("Cylinder Volume = " + v);
    }
}

public class Demo1 {
    public static void main(String[] args) {

        Cone c = new Cone(7, 10);
        c.calcArea();
        c.calcVolume();
        c.dispArea();
        c.dispVolume();

        Sphere s = new Sphere(5);
        s.calcArea();
        s.calcVolume();
        s.dispArea();
        s.dispVolume();

        Cylinder cy = new Cylinder(4, 8);
        cy.calcArea();
        cy.calcVolume();
        cy.dispArea();
        cy.dispVolume();
    }
}