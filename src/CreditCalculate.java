public class CreditCalculate {
    //creditAmount- СК первоначальная сумма кредита
    // creditTerm - КП количество периодов
    // interestRate -ПС процентная ставка
    public int annuityPayment(int creditAmount, int creditTerm, double interestRate)
    {

        double convertPercet=(interestRate/100); // перевод в число
        double monthlyPayment;
        monthlyPayment = creditAmount*((convertPercet/12)+((convertPercet/12)/(Math.pow(1+(convertPercet/12),creditTerm)-1)));
        int result=(int)monthlyPayment;
        return result;
    }
}
