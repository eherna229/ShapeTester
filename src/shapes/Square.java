package shapes;

class Square extends Shape {
    private double length;

    Square(double length) {
        this.length = length;
    }

    public double getArea() {
        return length * length;
    }

    public String getName() {
        return "Square";
    }
}