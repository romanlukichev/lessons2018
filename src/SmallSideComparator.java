import java.util.Comparator;

public class SmallSideComparator implements Comparator<Box> {
    public int compare(Box box1 , Box box2){

        double minSideOfBox1 = Math.min(box1.getA(), Math.min(box1.getB(), box1.getC()));
        double minSideOfBox2 = Math.min(box2.getA(), Math.min(box2.getB(), box2.getC()));

        if(Math.abs(minSideOfBox1 - minSideOfBox2) < 0.001)
        {
            return 0;
        }
        else if(minSideOfBox1 < minSideOfBox2)
        {
            return -50;
        }
        return 50;
    }
}
