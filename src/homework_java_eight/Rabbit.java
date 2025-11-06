package homework_java_eight;

public class Rabbit extends Animal {
    @Override
    public void voice(){
        System.out.println("Кролик издаёт звук - урчание");
    }

    @Override
    public void eat(String food){
        if(food == "Meat"){
            System.out.println("Кролик не любит есть мясо. Он недоволен.");
        }else if(food == "Grass"){
            System.out.println("Кролик любит есть траву.Он доволен.");
        }else{
            System.out.println("Кролик не знает как реагировать на эту еду.");
        }
    }
}
