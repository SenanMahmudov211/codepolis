public class Problems {
    public static void main(String[] args) {
        //"Xalis Maaş Hesablayıcısı"
        double grossSalary =2000;
        double taxInterest =14;
        double taxAmount  = (grossSalary*taxInterest)/100;
        double netSalary = grossSalary-taxAmount;
        System.out.println("Gross maaşı: "+grossSalary+" AZN");
        System.out.println("Vergi: "+taxAmount+" AZN");
        System.out.println("Sizə çatan xalis maaş: "+netSalary+" AZN");
    }
}
