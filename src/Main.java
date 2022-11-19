public class Main {
    public static void main(String[] args) {
        int creditRub = 1_000_000; //сумма кредита в рублях
        int creditYears = 1;// срок кредита в годах
        CreditPaymentOptions myOptions = new CreditPaymentOptions();
        myOptions.rateYears = 9.99; //годовая процентная ставка
        CreditPaymentService service = new CreditPaymentService(); //создаем экземпляр класса
        myOptions = CreditPaymentService.calculate(creditRub, creditYears, myOptions); //вызываем метод класса
        System.out.println("Сумма кредита: " + creditRub + " ₽");
        System.out.println("Срок кредита: " + creditYears + " год");
        System.out.println("Ежемесячный платеж: " + myOptions.payMonth + " ₽");
        System.out.println("Процентная ставка: " + myOptions.rateYears + " %");
        System.out.println();
        creditRub = 1_000_000; //сумма кредита в рублях
        creditYears = 2;// срок кредита в годах
        myOptions = CreditPaymentService.calculate(creditRub, creditYears, myOptions); //вызываем метод класса
        System.out.println("Сумма кредита: " + creditRub + " ₽");
        System.out.println("Срок кредита: " + creditYears + " года");
        System.out.println("Ежемесячный платеж: " + myOptions.payMonth + " ₽");
        System.out.println("Процентная ставка: " + myOptions.rateYears + " %");
        System.out.println();
        creditRub = 1_000_000; //сумма кредита в рублях
        creditYears = 3;// срок кредита в годах
        myOptions = CreditPaymentService.calculate(creditRub, creditYears, myOptions); //вызываем метод класса
        System.out.println("Сумма кредита: " + creditRub + " ₽");
        System.out.println("Срок кредита: " + creditYears + " года");
        System.out.println("Ежемесячный платеж: " + myOptions.payMonth + " ₽");
        System.out.println("Процентная ставка: " + myOptions.rateYears + " %");
    }
}