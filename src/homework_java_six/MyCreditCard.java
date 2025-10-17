package homework_java_six;
// //Задача 1:
//    //Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
//    //метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
//    //который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
//    //выводит текущую информацию о карточке. Напишите программу, которая создает три
//    //объекта класса CreditCard у которых заданы номер счета и начальная сумма.
//    //Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с
//    //третьей. Выведите на экран текущее состояние всех трех карточек.
public class MyCreditCard {
    public static void main(String[] args){
        createCreditCard();
    }

    public static void createCreditCard(){
        CreditCard vlad = new CreditCard();
        vlad.cardNumber = 2798287;
        vlad.actualBalance = 2000;

        CreditCard liza = new CreditCard();
        liza.cardNumber = 2488291;
        liza.actualBalance = 15400;

        CreditCard vova = new CreditCard();
        vova.cardNumber = 1231152;
        vova.actualBalance = 1500;

        vlad.addMoneyToBankAccount(5000);

        System.out.println("-".repeat(100));

        liza.addMoneyToBankAccount(4300);

        System.out.println("-".repeat(100));

        vova.getMoneyFromBankAccount(400);

        System.out.println("-".repeat(100));


        vlad.getBankInformation();

        System.out.println("-".repeat(100));

        liza.getBankInformation();

        System.out.println("-".repeat(100));

        vova.getBankInformation();

    }
}
