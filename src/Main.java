public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        // double loanAmount = 1000000 ; //  сумма кредита х
        //double loanTerm = 3; //срок кредита y
        //double interestRate = 9.99; //процентная ставка z
        //double monthlyPayment=service.calculate(loanAmount,loanTerm,interestRate);
        System.out.println("Ежемесячный платеж при кредите на 1 год:");
        System.out.println(Math.round(service.calculate(1000000, 1, 9.99)));
        System.out.println();
        System.out.println("Ежемесячный платеж при кредите на 2 года:");
        System.out.println(Math.round(service.calculate(1000000, 2, 9.99)));
        System.out.println();
        System.out.println("Ежемесячный платеж при кредите на 3 года:");
        System.out.println(Math.round(service.calculate(1000000, 3, 9.99)));
        // System.out.println(monthlyPayment);
    }
}
