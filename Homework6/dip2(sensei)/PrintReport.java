// Имплементировать его на уровне нашего класса печати отчета,
//  который я откопировал на уроке:

public class PrintReport implements IPrint {
    public void output(List<ReportItem> items) {
        System.out.println("Output to printer");
        for (ReportItem item : items) {
            System.out.format("printer %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }

    @Override
    public void print(List<ReportItem> items) {
        output(items);
    }
}