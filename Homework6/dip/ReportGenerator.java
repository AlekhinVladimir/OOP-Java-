import java.util.List;

public class ReportGenerator {
    private ReportCalculator reportCalculator;
    private ReportOutput reportOutput;

    public ReportGenerator(ReportCalculator reportCalculator, ReportOutput reportOutput) {
        this.reportCalculator = reportCalculator;
        this.reportOutput = reportOutput;
    }
    public void generateReport(){
        List<ReportItem> items = reportCalculator.calculate();
        reportOutput.output(items);
    }
}