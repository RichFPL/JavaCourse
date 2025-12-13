package Practice;

public class CreditCard {
    int numberCard;
    int actualBalance ;

    public CreditCard(int numberCard, int actualBalance){
        this.numberCard = numberCard;
        this.actualBalance = actualBalance;
    }

    void addMoney(int money ){
        if(money > 0){
            System.out.println("Added to balance" + money);
        }else{
            System.out.println("Need to have a money for add to balance");
        }
    }

    void getMoney(int money){
        if(actualBalance >= money){
            System.out.println("U can get your money " + money);
        }else{
            System.out.println("U dont have this money on your balance");
        }
    }

    void aboutCard(){
        System.out.println("Your actual balance" + actualBalance);
        System.out.println("Your number card " + numberCard);
    }
}

