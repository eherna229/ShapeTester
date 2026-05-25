package shapes;

class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(double theLength, double theWidth) {
        this.length = theLength;
        this.width = theWidth;
    }

    public double getArea() {
        return length * width;
    }

    public String getName() {
        return "Rectangle";
    }
}