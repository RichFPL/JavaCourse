package homework_java;

public class HomeworkFirstLesson {
    public static void main(String[] args) {
        getEquation();
        getSumDigits();
        getSumDigitsTwo();
        getRounding();
        getDivison();
        getReplacement();
    }

    public static void getEquation(){
        int b = 15;
        int c = 200;
        int a = 4*(b+c-1)/2;
        System.out.println("Task 1: Get a formula meaning: ");
        System.out.println("int a = " + a);
    }

    public static void getSumDigits() {
        int n = 0;
        int f = 5;
        int k = 7;

        n = f + k;
        System.out.println("Task 2 : Sum of digits");
        System.out.println("n = f + k = " + n);

    }

    public static void getSumDigitsTwo(){
        int treepleN = 0;
        int firstA = 4;
        int firstB = 2;
        int firstC = 9;
        treepleN = firstA + firstB + firstC;
        System.out.println("Task 3: Get sum digits ");
        System.out.println("N = A + B + C = " + treepleN);

    }

    public static void getRounding(){
        double fourN = 387.7874389;
        int sumM = (int)fourN;
        System.out.println("Task 4: Get rounding");
        System.out.println("This is a rounded number : " + sumM);

    }

    public static void getDivison(){
        double natur1 = 21;
        double natur2 = 8;
        double remainder = natur1 / natur2;
        System.out.println("Task 5: Get divison : ");
        System.out.println("A(21) : B(8) with remainder = " + remainder);

    }

    public static void getReplacement(){
        int ab = 1;
        int ac = 2;
        ab = ab + ac;
        ac = ab - ac;
        ab = ab - ac;
        System.out.println("Task 6: Get replacement : ");
        System.out.println("Swap place");
        System.out.println("AB = " + ab);
        System.out.println("AC = " + ac);
        System.out.println("Trying to commit to git");
    }
}
