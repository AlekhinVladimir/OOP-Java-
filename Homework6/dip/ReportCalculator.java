import java.util.ArrayList;
import java.util.List;

public class ReportCalculator implements ReportCalculate {

    @Override
    public List<ReportItem> calculate() {
        ArrayList<ReportItem> items = new ArrayList<>();
        items.add(new ReportItem("First", (float) 5));
        items.add(new ReportItem("Second", (float) 6));
        return items;
    }
}