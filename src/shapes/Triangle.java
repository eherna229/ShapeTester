package shapes;

class Triangle extends Shape {
    private double base;
    private double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return height * base / 2;
    }

    public String getName() {
        return "Triangle";
    }
}