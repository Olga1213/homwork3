public class Main {
    public static void main(String[] args) {
        //1
        int a = 500;
        System.out.println(a);
        byte b = 5;
        System.out.println(b);
        short c = -10;
        System.out.println(c);
        long d = 5000;
        System.out.println(d);
        float e = -2.2f;
        System.out.println(e);
        double f = 2.2;
        System.out.println(f);

        //2
        float a2 = 27.12f;
        long b2 = 987678965549l;
        short c2 = 569;
        short d2 = -159;
        short t = 27897;
        byte r = 67;

        //3
        byte studentAP = 23;
        byte studentAC = 27;
        byte studentEA = 30;
        int totalP = 480;
        int student = totalP / (studentAP + studentAC + studentEA);
        System.out.println("На каждого ученика рассчитано" + student + "листов бумаги");

        //4
        float machinePerformance = 16 / 2;
        System.out.println("За 20 минут машина произвела" + machinePerformance * 20 + "штук бутылок");
        System.out.println("За сутки машина произвела" + machinePerformance * 60 + "штук бутылок");
        System.out.println("За 20 минут машина произвела" + machinePerformance * 24 * 60 * 3 + "штук бутылок");
        System.out.println("За 20 минут машина произвела" + machinePerformance * 24 * 60 * 30 + "штук бутылок");

        //5
        byte a3 = 120;
        byte b3 = 2;
        byte c3 = 4;
        int classes = a3 / (b3 + c3);
        System.out.println("В школе, где" + classes + "классов нужно" + classes * b3 + "банок белой краски и" + classes * c3
                + "банок коричневой краски");

//6
        double banana = 5 * 0.08;
        double milk = 100 * 0.105 * 2;
        double iceCreamSundae = 2 * 0.100;
        double rawEggs = 4 * 0.070;
        System.out.println((banana + milk + iceCreamSundae + rawEggs) * 1000);
//7

        double a7 = 7.0;
        double b7 = 0.250;
        double c7 = 0.500;
        System.out.println(a7 / b7 );
        System.out.println(a7 / c7);

//8
        double M = 67760;
        double D = 83690;
        double K = 76230;
        double sum=M+D+K;
        System.out.println("до увеличения: " + sum * 12);
        System.out.println("после увеличения: " + sum * 1.1 * 12);
        System.out.println("разница: " + sum * 0.1 * 12);
    }
}


