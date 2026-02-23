class VolumeCalculator {

    double calculateVolume(double side) {
        return side * side * side;
    }

    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    double calculateVolume(int radius) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    public static void main(String[] args) {

        VolumeCalculator v = new VolumeCalculator();

        double cubeVolume = v.calculateVolume(4);
        double rectangularCubeVolume = v.calculateVolume(4, 5, 6);
        double sphereVolume = v.calculateVolume(3);

        System.out.println("Volume of Cube: " + cubeVolume);
        System.out.println("Volume of Rectangular Cube: " + rectangularCubeVolume);
        System.out.println("Volume of Sphere: " + sphereVolume);
    }
                }
