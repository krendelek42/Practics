package GeomFigures;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] nameOfFigures = {"Круг", "Квадрат", "Прямоугольнк"};
        System.out.println("Выберите фигуру (напишите цифру):");
        for (int i = 0; i <= (nameOfFigures.length - 1); i++ ) {
            System.out.println((i + 1) + ". " + nameOfFigures[i]);
        }
        Scanner scanner = new Scanner(System.in);
        String figures = scanner.nextLine();

        switch (figures) {
            case "1" -> {
                System.out.println("Круг -----------------");
                System.out.println("Напишите радиус круга:");
                Scanner radiusCircle = new Scanner(System.in);
                int radius = radiusCircle.nextInt();
                Circle circle = new Circle(radius);
                circle.Information();
                System.out.println();
                System.out.println("Новый круг -----------------");
                System.out.println("Напишите новый радиус круга: ");
                Scanner radius2 = new Scanner(System.in);
                int newRadius = radius2.nextInt();
                circle.size(newRadius, 1);
                circle.Information();

                break;
            }
            case "2" -> {
                System.out.println("Квадрат -----------------");
                System.out.println("Напишите длину квадрата: ");
                Scanner radiusCircle = new Scanner(System.in);
                int line = radiusCircle.nextInt();
                Square square = new Square(line);
                square.Information();
                System.out.println();
                System.out.println("Новый квадрат -----------------");
                System.out.println("Напишите новую длину квадрата:");
                Scanner line2 = new Scanner(System.in);
                int newLine = line2.nextInt();
                square.size(newLine, 1);
                square.Information();
                break;
            }
            case "3" -> {
                System.out.println("Прямоугольник -----------------");
                System.out.println("Напишите длину прямоугольника X: ");
                Scanner lineXRectangle = new Scanner(System.in);
                int lineX = lineXRectangle.nextInt();
                System.out.println("Напишите длину прямоугольника Y: ");
                Scanner lineYRectangle = new Scanner(System.in);
                int lineY = lineYRectangle.nextInt();
                Rectangle rectangle = new Rectangle(lineX, lineY);
                rectangle.Information();
                System.out.println();
                System.out.println("Новый прямоугольник -----------------");
                System.out.println("Напишите новую длину прямоугольника X:");
                Scanner lineX2 = new Scanner(System.in);
                int newLineX = lineX2.nextInt();
                System.out.println("Напишите новую длину прямоугольника Y:");
                Scanner lineY2 = new Scanner(System.in);
                int newLineY = lineY2.nextInt();
                rectangle.size(newLineX, newLineY);
                rectangle.Information();
            }
        }

    }
}

interface MathGeomFigures {
    void Information();
    double getPerimeter();
    double getSquare();
    void size(int x, int y );

}

class Circle implements MathGeomFigures {
    int radius;
    Circle(int radius) {
        this.radius = radius;

    }
    public void Information () {
        System.out.println("Радиус круга: " + this.radius);
        System.out.println("Периметр круга: " + getPerimeter());
        System.out.println("Площадь круга: " + getSquare());
    }
    public double getPerimeter() {
        double perimeter = 2*3.14*this.radius;
        return perimeter;
    }
    public double getSquare() {
        double square = 2*3.14*this.radius*this.radius;
        return square;
    }
    public void size(int newRadius, int y) {
        this.radius = newRadius;
    }

}

class Square implements MathGeomFigures {
    int line;
    Square(int line) {
        this.line = line;
    }
    public void Information () {
        System.out.println("Длина стороны квадрата: " + this.line);
        System.out.println("Периметр квадрата: " + getPerimeter());
        System.out.println("Площадь квадрата: " + getSquare());
    }
    public double getPerimeter() {
        double perimeter = 4*this.line;
        return perimeter;
    }
    public double getSquare() {
        double square = this.line*this.line;
        return square;
    }
    public void size(int newLine, int y) {
        this.line = newLine;
    }
}

class Rectangle implements MathGeomFigures{
    int lineX;
    int lineY;

    Rectangle ( int lineX, int lineY) {
        this.lineX = lineX;
        this.lineY = lineY;
    }
    public void Information () {
        System.out.println("Длина стороны прямоугольника X: " + this.lineX);
        System.out.println("Длина стороны прямоугольника Y: " + this.lineY);
        System.out.println("Периметр прямоугольника: " + getPerimeter());
        System.out.println("Площадь прямоугольника: " + getSquare());
    }
    public double getPerimeter() {
        double perimeter = 2*this.lineX + 2*this.lineY;
        return perimeter;
    }
    public double getSquare() {
        double square = this.lineX*this.lineY;
        return square;
    }
    public void size(int newLineX, int newLineY) {
        this.lineX = newLineX;
        this.lineY = newLineY;
    }
}
