package practice_java;

public class Tasks {
    public static void main(String[] args) {
        int b = 15;
        int c = 200;
        int a = 4*(b+c-1)/2;
        System.out.println("int a = " + a);

        task2();
    }

    public static void task2() {
        int n = 0;
        int f = 5;
        int k = 7;

        n = f + k;
        System.out.println("n = f + k = " + n);

        task3();
    }

    public static void task3(){
       int treepleN = 0;
       int firstA = 4;
       int firstB = 2;
       int firstC = 9;
       treepleN = firstA + firstB + firstC;
       System.out.println("N = A + B + C = " + treepleN);

       task4();
    }

    public static void task4(){
        double fourN = 387.7874389;
        int sumM = (int)fourN;
        System.out.println("This is a rounded number : " + sumM);

        task5();
    }

    public static void task5(){
        double natur1 = 21;
        double natur2 = 8;
        double remainder = natur1 / natur2;
        System.out.println("A(21) : B(8) with remainder = " + remainder);

        task6();
    }

    public static void task6(){
        int ab = 1;
        int ac = 2;
        ab = ab + ac;
        ac = ab - ac;
        ab = ab - ac;
        System.out.println("Swap place");
        System.out.println("AB = " + ab);
        System.out.println("AC = " + ac);
        System.out.println("Trying to commit to git");
    }
}
