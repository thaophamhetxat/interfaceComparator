package rectangle;


public class Rectangle {
    double width;
    double length;

    public Rectangle() {

    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    //getter cho thuoc tinh

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    //setter cho thuoc tinh
    public void setLength(){

        this.length = length;
    }
    public void setWidth(){

        this.width =width;
    }

    //dien tich
    public double getArea(){

        return width*this.length;
    }
    //chu vi
    public double getPerimeter(){

        return 2*(width+this.length);
    }


    // cài đè toString trả về theo mẫu
    public String toString(){
        return "a rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                +" , which is a subclass of"
                + super.toString();
    }


}
