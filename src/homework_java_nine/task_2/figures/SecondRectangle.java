package homework_java_nine.task_2.figures;

public class SecondRectangle extends Figures{
    public double length;
    public double width;

    public SecondRectangle(double lenght, double width){
        this.length = lenght;
        this.width = width;
    }

    @Override
    public void getSquare() {
        double square = length*width;
        System.out.println("Площаь второго прямоугольника равна (см) : " + square);
    }

    @Override
    public void getPerimeter() {
        double perimeter = (2*length) + (2*width);
        System.out.println("Периметр второго прямоугольника равен (см) : " + perimeter);
    }

    @Override
    public double getSumPerimeters() {
        return (2*length) + (2*width);
    }
}
