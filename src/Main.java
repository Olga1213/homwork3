public class Main {
    public static void main(String[] args) {
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

        float a2 = 27.12f;
        long b2 = 987678965549l;
        short c2 = 569;
        short d2 = -159;
        short t = 27897;
        byte r = 67;

        byte studentAP = 23;
        byte studentAC = 27;
        byte studentEA = 30;
        int totalP = 480;
        int student = totalP / (studentAP + studentAC + studentEA);
        System.out.println("На каждого ученика рассчитано" + student + "листов бумаги");

        float machinePerformance = 16 / 2;
        System.out.println("За 20 минут машина произвела" + machinePerformance * 20 + "штук бутылок");
        System.out.println("За сутки машина произвела" + machinePerformance * 60 + "штук бутылок");
        System.out.println("За 20 минут машина произвела" + machinePerformance * 24 * 60 * 3 + "штук бутылок");
        System.out.println("За 20 минут машина произвела" + machinePerformance * 24 * 60 * 30 + "штук бутылок");


    }
}


