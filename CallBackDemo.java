package Lab3;

import java.util.Scanner;

import javax.swing.plaf.nimbus.State;

interface StateTax {
    public float stateTax();
}

class Bihar implements StateTax {
    public float stateTax() {
        return 2.3f;
    }
}

class UP implements StateTax {
    public float stateTax() {
        return 1.3f;
    }
}

class Odisha implements StateTax {
    public float stateTax() {
        return 10f;
    }
}

public class CallBackDemo {
    public static void main(String[] args)
            throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        // Get state name form user:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the state name:");
        String state = sc.nextLine();

        CallBackDemo c = new CallBackDemo();
        Package p = c.getClass().getPackage();
        String pName = p.getName();
        // System.out.println(pName.state);
        Class obj = Class.forName(pName + "." + state);

        StateTax refer = (StateTax) obj.newInstance();

        System.out.println(totalTax(refer));

    }

    public static float totalTax(StateTax s) {
        return 5.2f + s.stateTax();
    }
}