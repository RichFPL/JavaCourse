package homework_java_nine.task_2.figures;

public class SecondTriangle extends Figures{
    public double firstSide;
    public double secondSide;
    public double thirdSide;

    public SecondTriangle(double firstSide, double secondSide, double thirdSide){
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public void getSquare() {
        double semiperimeter = (firstSide + secondSide + thirdSide)/2;
        double square = Math.sqrt(semiperimeter*(semiperimeter - firstSide)*(semiperimeter - secondSide)*(semiperimeter - thirdSide));
        System.out.println("Площадь второго треугольника равна (см) : " + square);
    }

    @Override
    public void getPerimeter() {
        double perimeter = firstSide + secondSide + thirdSide;
        System.out.println("Периметр второго треугольника равен (см) : " + perimeter);
    }

    @Override
    public double getSumPerimeters() {
        return firstSide + secondSide + thirdSide;
    }
}
