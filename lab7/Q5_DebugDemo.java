package Lab7;
class BaseClass {
    void debug() {
        System.out.println("Debugging from BaseClass");
    }
}

class ModuleA extends BaseClass {
    void workA() {
        System.out.println("Working in ModuleA");
    }
}

class ModuleB extends BaseClass {
    void workB() {
        System.out.println("Working in ModuleB");
    }
}

class ModuleC extends BaseClass {
    void workC() {
        System.out.println("Working in ModuleC");
    }
}

public class Q5_DebugDemo {
    public static void main(String[] args) {
        ModuleA a = new ModuleA();
        ModuleB b = new ModuleB();
        ModuleC c = new ModuleC();

        a.workA();
        a.debug();

        b.workB();
        b.debug();

        c.workC();
        c.debug();
    }
}
