import java.text.DecimalFormat;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Box b1 = new Box(9.0,6.0,3.0);
        Box b2 = new Box(9.0005,6.0007,3.0002);

        Box b3 = new Box(9.05,6.07,3.02);

        System.out.println(b1.equals(b2)); // true
        System.out.println(b1.equals(b3)); // false
        System.out.println(b1.toString());
        System.out.println(b1.hashCode());  // the same hashCode
        System.out.println(b2.hashCode());    // the same hashCode

        System.out.println("Sort bt volume of the box. ");
        System.out.println("Three similar boxes - will NOT sort well...");
        Box[] boxes = new Box[3];
        boxes[0] = b2;
        boxes[1] = b1;
        boxes[2] = b3;

        DecimalFormat df = new DecimalFormat("#.###");


        for(Box b : boxes){
            System.out.println(df.format(b.getVolume()) + " " + b.toString() + " ");
        }

        // static void	sort(Object[] a)
        Arrays.sort(boxes);

        System.out.println("==================================");

        for(Box b : boxes){
            System.out.println(df.format(b.getVolume()) + " " + b.toString() + " ");
        }


        Box theBiggestBox = new Box(9.0,6.0,3.0);
        Box mediumBox = new Box(4.5,3.2,1.4);

        Box smallBox = new Box(0.5,0.7,0.2);

        System.out.println();
        System.out.println("Three different boxes - will sort well...");
        Box[] boxes2 = new Box[3];
        boxes2[0] = mediumBox;
        boxes2[1] = theBiggestBox;
        boxes2[2] = smallBox;

        for(Box b : boxes2){
            System.out.println(df.format(b.getVolume()) + " " + b.toString() + " ");
        }

        // static void	sort(Object[] a)
        Arrays.sort(boxes2);

        System.out.println("==================================");

        for(Box b : boxes2){
            System.out.println(df.format(b.getVolume()) + " " + b.toString() + " ");
        }

        System.out.println("============================================================================");
        System.out.println("Example of using sort(T[] a, Comparator<? super T> c)");
        // Let's make an instance of SmallSideComparator
        SmallSideComparator comp = new SmallSideComparator();
        // Let's shuffle the array
        boxes2[0] = mediumBox;
        boxes2[1] = theBiggestBox;
        boxes2[2] = smallBox;

        for(Box b : boxes2){
            System.out.println(df.format(b.getVolume()) + " " + b.toString() + " ");
        }

        System.out.println("=== after sorting: ... ");
        // static <T> void	sort(T[] a, Comparator<? super T> c)
        Arrays.sort(boxes2, comp);

        for(Box b : boxes2){
            System.out.println(df.format(b.getVolume()) + " " + b.toString() + " ");
        }


    }
}
