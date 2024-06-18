package challenge83;

import java.awt.*;

public class Square extends shape {

    private final double sideInCms;

    public Square(double sideInCms) {
        this.sideInCms = sideInCms;
    }

    public double getSideInCms() {
        return sideInCms;
    }

    @Override
    public double calculateArea() {
        return sideInCms * sideInCms;
    }
}
