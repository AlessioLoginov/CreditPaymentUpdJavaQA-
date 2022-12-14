public class CreditPaymentService {
    public static CreditPaymentOptions calculate(int creditRub, int creditYears, CreditPaymentOptions myOptions) {
        double rateMonth = myOptions.rateYears * 0.01 / 12; //считаем месячную ставку по кредиту
        double locDouble = Math.pow(1 + rateMonth, creditYears * 12);
        locDouble = (rateMonth * locDouble) / (locDouble - 1); //шаманство с формулой аннуитетного платежа
        int payMonth = (int) ((int) creditRub * locDouble); //вычисляем ежемесячный платеж
        myOptions.payMonth = payMonth;
        return (myOptions); //возвращаем экземпляр класса (структуры)
    }
}