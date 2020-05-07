public class Main {
    public static void main(String[] args) {
        CreditCalculate client1=new CreditCalculate();
        CreditCalculate client2=new CreditCalculate();
        CreditCalculate client3=new CreditCalculate();
        int monthlyPayment1=client1.annuityPayment(1_000_000,12,9.99);
        int monthlyPayment2=client2.annuityPayment(1_000_000,24,9.99);
        int monthlyPayment3=client3.annuityPayment(1_000_000,36,9.99);
        System.out.println("Ежемесячный платеж первого клиента: "+monthlyPayment1);
        System.out.println("Ежемесячный платеж второго клиента: "+monthlyPayment2);
        System.out.println("Ежемесячный платеж третьего клиента: "+monthlyPayment3);

    }
}
