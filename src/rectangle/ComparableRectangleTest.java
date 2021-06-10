package rectangle;
import java.util.Arrays;
import java.util.Comparator;

public class ComparableRectangleTest {
    public static void main(String[] args) {
        Rectangle[] rectangle = new Rectangle[3];
        rectangle[0] =new Rectangle(3.4,5);
        rectangle[1]=new Rectangle(3.6,5);
        rectangle[2]=new Rectangle(7,5);
        System.out.println("pre-sorted: ");
        for(Rectangle rectangles: rectangle){
            System.out.println(rectangles);
        }
        Comparator comparableRetangle = new ComparableRetangle();
        Arrays.sort(rectangle,comparableRetangle);
        System.out.println("after-sorted: ");
        for(Rectangle rectangles: rectangle){
            System.out.println(rectangles);
        }

    }


}
