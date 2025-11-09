package homework_java_nine.task_2.figures;

public class Rectangle extends Figures{
    public double length;
    public double width;

    public Rectangle(double lenght, double width){
        this.length = lenght;
        this.width = width;
    }

    @Override
    public void getSquare() {
        double square = length*width;
        System.out.println("Площаь прямоугольника равна (см) : " + square);
    }

    @Override
    public void getPerimeter() {
        double perimeter = (2*length) + (2*width);
        System.out.println("Периметр прямоугольника равен (см) : " + perimeter);
    }

    @Override
    public double getSumPerimeters() {
        return (2*length) + (2*width);
    }
}
