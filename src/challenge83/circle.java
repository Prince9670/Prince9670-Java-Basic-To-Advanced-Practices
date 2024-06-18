package challenge83;

public class circle extends shape {

    private final double radiusInCms;

    public circle(double radiusInCms) {
        this.radiusInCms = radiusInCms;
    }

    public double getRadiusInCms() {
        return radiusInCms;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radiusInCms, 2);
    }
}
