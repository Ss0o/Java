package JAVA.Chapter05;

public class Circle {
    public int radius;
    public String name;

    public Circle() {
    }
    public double getArea()
    {
        return 3.14*radius*radius;
    }

    public static void main(String[] args) {
        Circle pizza;
        pizza = new Circle();

        pizza.radius = 10;
        pizza.name = "하와이안 피자";
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);
    }
}


