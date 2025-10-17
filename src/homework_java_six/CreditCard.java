package homework_java_six;

public class CreditCard {
    //Задача 1:
    //Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
    //метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
    //который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
    //выводит текущую информацию о карточке. Напишите программу, которая создает три
    //объекта класса CreditCard у которых заданы номер счета и начальная сумма.
    //Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с
    //третьей. Выведите на экран текущее состояние всех трех карточек.

    public int cardNumber;
    public double actualBalance;
    //Метод который позволяет добавить деньги на баланс
    public void addMoneyToBankAccount(double money){
        if(money>0){
            System.out.println("Вы начислили на свой счёт : " + money);
            actualBalance += money;
            System.out.println("Ваш баланс составляет :" + actualBalance);
        }else{
            System.out.println("Вы не можете начислить отрицательную сумму");
            System.out.println("Ваш баланс составляет :" + actualBalance);
        }

    }
    //Метод который позволяет снять деньги с баланса
    public void getMoneyFromBankAccount(double money){
        if(actualBalance >= money){
            actualBalance -= money;
            System.out.println("Вы сняли с баланса " + money);
            System.out.println("Ваш текущий баланс составляет :" + actualBalance);
        }else{
            System.out.println("У вас недостаточно средств, чтобы снять " + money);
            System.out.println("Ваш баланс составляет: " + actualBalance);
        }
    }
    //Метод который позволяет получить текущую информацию о карточке
    public void getBankInformation(){
        System.out.println("Информация о карточке : ");
        System.out.println("\tНомер счёта :" + cardNumber);
        System.out.println("\tТекущая сумма на счету :" + actualBalance);

    }
}

