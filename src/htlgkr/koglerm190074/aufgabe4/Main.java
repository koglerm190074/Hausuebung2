package htlgkr.koglerm190074.aufgabe4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        AbstractCalculator rationalCalculator = new RationalCalculator((a, b) -> {
            Double a1 = a.getA();
            Double b1 = b.getA();
            Double a2 = a.getB();
            Double b2 = b.getB();

            Double result1 = a1*b2;
            Double result2 = b1*a2;
            Double result = result1+result2;
            Double nenner = a2*b2;

            for (int i = 0; i < nenner; i++) {
                for (int j = 0; j < nenner; j++) {
                    if(nenner%j == 0){
                        if(result%j == 0){
                            nenner = nenner / j;
                            result = result / j;
                        }
                    }
                }
            }

            System.out.println(result);
            System.out.println(" --- ");
            System.out.println(nenner);
            return a;
        }, (a, b) -> {
            Double a1 = a.getA();
            Double b1 = b.getA();
            Double a2 = a.getB();
            Double b2 = b.getB();

            Double result1 = a1*b2;
            Double result2 = b1*a2;
            Double result = result1-result2;
            Double nenner = a2*b2;

            for (int i = 0; i < nenner; i++) {
                for (int j = 0; j < nenner; j++) {
                    if(nenner%j == 0){
                        if(result%j == 0){
                            nenner = nenner / j;
                            result = result / j;
                        }
                    }
                }
            }

            System.out.println(result);
            System.out.println(" --- ");
            System.out.println(nenner);
            return a;
        }, (a, b) -> {
            Double a1 = a.getA();
            Double b1 = b.getA();
            Double a2 = a.getB();
            Double b2 = b.getB();

            Double result = a1*b1;
            Double nenner = a2*b2;

            for (int i = 0; i < nenner; i++) {
                for (int j = 0; j < nenner; j++) {
                    if(nenner%j == 0){
                        if(result%j == 0){
                            nenner = nenner / j;
                            result = result / j;
                        }
                    }
                }
            }

            System.out.println(result);
            System.out.println(" --- ");
            System.out.println(nenner);
            return a;
        }, (a, b) -> {
            Double a1 = a.getA();
            Double b1 = b.getA();
            Double a2 = a.getB();
            Double b2 = b.getB();

            Double result = a1*b2;
            Double nenner = a2*b1;

            for (int i = 0; i < nenner; i++) {
                for (int j = 0; j < nenner; j++) {
                    if(nenner%j == 0){
                        if(result%j == 0){
                            nenner = nenner / j;
                            result = result / j;
                        }
                    }
                }
            }

            System.out.println(result);
            System.out.println(" --- ");
            System.out.println(nenner);
            return a;
        });
        AbstractCalculator vectorCalculator = new VectorCalculator((a, b) -> {
            Double a1 = a.getA();
            Double b1 = b.getA();
            Double a2 = a.getB();
            Double b2 = b.getB();

            Double result1 = a1+b1;
            Double result2 = a2+b2;

            System.out.println(result1);
            System.out.println(" --- ");
            System.out.println(result2);
            return a;
        }, (a, b) -> {
            Double a1 = a.getA();
            Double b1 = b.getA();
            Double a2 = a.getB();
            Double b2 = b.getB();

            Double result1 = a1-b1;
            Double result2 = a2-b2;



            System.out.println(result1);
            System.out.println(" --- ");
            System.out.println(result2);
            return a;
        }, (a, b) -> {
            Double a1 = a.getA();
            Double b1 = b.getA();
            Double a2 = a.getB();
            Double b2 = b.getB();

            Double result = a1*b1;
            Double nenner = a2*b2;



            System.out.println(result);
            System.out.println(" --- ");
            System.out.println(nenner);
            return a;
        }, (a, b) -> {
            Double a1 = a.getA();
            Double a2 = a.getB();
            Double b1 = b.getA();
            Double b2 = b.getB();

            Double result = a1/b1;
            Double nenner = a2/b2;

            System.out.println(result);
            System.out.println(" --- ");
            System.out.println(nenner);
            return a;
        });
        AbstractCalculator complexCalculator = new ComplexCalculator((a, b) -> {
            Double a1 = a.getA();
            Double b1 = b.getA();
            Double a2 = a.getB();
            Double b2 = b.getB();

            Double result1 = a1+b1;
            Double result2 = a2+b2;

            System.out.print(result1);
            System.out.print(" + ");
            System.out.println(result2+"i");
            return a;
        }, (a, b) -> {
            Double a1 = a.getA();
            Double b1 = b.getA();
            Double a2 = a.getB();
            Double b2 = b.getB();

            Double result1 = a1-b1;
            Double result2 = a2-b2;

            System.out.print(result1);
            System.out.print(" - ");
            System.out.println(result2+"i");
            return a;
        }, (a, b) -> {
            Double a1 = a.getA();
            Double b1 = b.getA();
            Double a2 = a.getB();
            Double b2 = b.getB();

            Double result1 = a1*b1+a1*b2;
            Double result2 = a2*b1+a2*b2;

            System.out.print(result1);
            System.out.print(" - ");
            System.out.println(result2+"i");
            return a;
        }, (a, b) -> {
            Double a1 = a.getA();
            Double b1 = b.getA();
            Double a2 = a.getB();
            Double b2 = b.getB();

            Double result1 = a1+b1*a2+b2;
            Double result2 = a2+b2*a2+b2;

            System.out.print(result1);
            System.out.print(" - ");
            System.out.println(result2+"i");
            return a;
        });

        boolean running = true;

        while(running){
            chooseCalculator();
            int cC = Integer.parseInt(s.nextLine());
            if(cC == 4){
                System.exit(0);
            }

            System.out.println("a1    b1");
            System.out.println("---  ---");
            System.out.println("a2    b2");
            System.out.println();
            System.out.println("Enter Number a1");
            Double a1 = Double.parseDouble(s.nextLine());
            System.out.println("Enter Number a2");
            Double a2 = Double.parseDouble(s.nextLine());
            System.out.println("Enter Number b1");
            Double b1 = Double.parseDouble(s.nextLine());
            System.out.println("Enter Number b2");
            Double b2 = Double.parseDouble(s.nextLine());
            Number n1 = new Number();
            Number n2 = new Number();
            n1.setA(a1);
            n1.setB(a2);
            n2.setA(b1);
            n2.setB(b2);
            chooseOperation();
            int cO = Integer.parseInt(s.nextLine());
            switch (cC){
                case 1:
                    switch (cO){
                        case 1:
                            rationalCalculator.add(n1, n2);
                            break;
                        case 2:
                            rationalCalculator.subtract(n1, n2);
                            break;
                        case 3:
                            rationalCalculator.multiply(n1, n2);
                            break;
                        case 4:
                            rationalCalculator.divide(n1, n2);
                            break;
                        case 5:
                            break;
                    }
                    break;
                case 2:
                    switch (cO){
                        case 1:
                            vectorCalculator.add(n1, n2);
                            break;
                        case 2:
                            vectorCalculator.subtract(n1, n2);
                            break;
                        case 3:
                            vectorCalculator.multiply(n1, n2);
                            break;
                        case 4:
                            vectorCalculator.divide(n1, n2);
                            break;
                        case 5:
                            break;
                    }

                    break;
                case 3:
                    switch (cO){
                        case 1:
                             complexCalculator.add(n1, n2);
                            break;
                        case 2:
                            complexCalculator.subtract(n1, n2);
                            break;
                        case 3:
                            complexCalculator.multiply(n1, n2);
                            break;
                        case 4:
                            complexCalculator.divide(n1, n2);
                            break;
                        case 5:
                            break;
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }

    }

    public static void chooseCalculator(){
        System.out.println("1 - Relational calculator");
        System.out.println("2 - Vector calculator");
        System.out.println("3 - Complex calculator");
        System.out.println("4 - Exit program");
    }

    public static void chooseOperation(){
        System.out.println("1 - add");
        System.out.println("2 - substract");
        System.out.println("3 - multiply");
        System.out.println("4 - divide");
        System.out.println("5 - enter numbers again");
    }
}
