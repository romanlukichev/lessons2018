public class Car {
    private  static int year;

    public int getYear(){ // we can have access to a static variable from non-static class
        return year;
    }

    public void  setYear( int year){  // we can have access to a static variable from non-static class
        this.year = year;
    }
}
