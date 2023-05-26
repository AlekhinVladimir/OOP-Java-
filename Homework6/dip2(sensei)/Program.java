// И вот теперь, универсальным образом, мы указываем наш принтер в рамках интерфейса,
//  передаем его в конструктор самого отчета и печатаем отчет:
public class Program {
    public static void main(String[] args) {
        Report report = new Report(new PrintReport());
        report.calculate();
        report.output();
    }
}
