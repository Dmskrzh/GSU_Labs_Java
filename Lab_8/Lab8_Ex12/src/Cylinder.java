public class Cylinder implements Comparable<Cylinder>{
    public float height;
    public float radius;

    public Cylinder(float height, float radius) {
        this.height = height;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Высота: " + height + ", Радиус основания: " + radius;
    }

    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public int compareTo(Cylinder other) {
        return Double.compare(this.getVolume(), other.getVolume());
    }
}