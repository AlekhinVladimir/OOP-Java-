
public class Main {
    public static void main(String[] args) {

        ReportCalculator reportCalculator = new ReportCalculator();
        ReportOutput reportOutput = new PrintReport();
        ReportGenerator reportGenerator = new ReportGenerator(reportCalculator, reportOutput);
        Report report = new Report(reportCalculator.calculate());
        reportGenerator.generateReport();
        System.out.println(report);

    }
}
