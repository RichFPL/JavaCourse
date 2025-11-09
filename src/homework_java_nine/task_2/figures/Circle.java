package homework_java_nine.task_2.figures;

public class Circle extends Figures {
    public double radius;
    public final double numberP = 3.14;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public void getSquare(){
        double numberP = this.numberP;
        double square = numberP * Math.pow(this.radius, 2);
        System.out.println("Площадь круга равна (см) : " + square);
    }

    @Override
    public void getPerimeter() {
        double perimeter = 2*radius*numberP;
        System.out.println("Периметр круга равен (см) : " + perimeter);
    }

    @Override
    public double getSumPerimeters() {
        return 2*radius*numberP;
    }
}
