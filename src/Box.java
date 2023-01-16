public class Box {
double height;
double width;
double length;
double Volume;
    public void setHeight(double height) {
        this.height = height;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getVolume() {
        Volume = height * width * length;
        return Volume;
    }
    @Override
public String toString () {
    return "Box{" +
            "height=" + height +
            ", width=" + width +
            ", length=" + length +
            ", Volume=" + Volume +
            '}';
}
}
