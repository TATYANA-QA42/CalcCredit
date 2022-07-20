public class CreditPaymentService {
    public double calculate(double x,double y, double z) {
        double g = y*12;
        double b = 1+z/12/100;
        double a = Math.pow(b,g);
        double Annuity=z/12/100*a/(a-1);//x - сумма кредита, у - срок , z - процент
        double result = x*Annuity;
        return result;
    }
}
