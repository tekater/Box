public class Box {
double height;
double width;
double length;
double Volume;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getVolume() {
        Volume = height * width * length;
        return Volume;
    }

    /*public void setVolume(double volume) {
        Volume = volume;
    }*/

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