class Rectangle {

    double width;
    double height;

    Rectangle() {
        width = 1;
        height = 1;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {

        Rectangle r = new Rectangle();

        System.out.println("Width = " + r.width);
        System.out.println("Height = " + r.height);
        System.out.println("Area = " + r.getArea());
        System.out.println("Perimeter = " + r.getPerimeter());
    }
}
