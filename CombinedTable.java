public class CombinedTable {
    private SingleTable one;
    private SingleTable two;
    public CombinedTable (SingleTable o, SingleTable t) {
        one = o ; 
        two= t;
    }
    public boolean canSeat (int seat) {
        int a = one.getNumSeats();
        int b = two.getNumSeats();
        if (a+b-2>=seat ) {
            return true;
        } else {
            return false;
        }

    }
    public double getDesirability () {
        double g = one.getViewQuality();
        double h = two.getViewQuality();
        double average = (g+h)/2;
        if (one.getHeight()==two.getHeight()) {
            return average;
        }
        return average-10;
    }
}