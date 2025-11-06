package homework_java_eight;

public class Tiger extends Animal{
    @Override
    public void voice(){
        System.out.println("Тигр издаёт звук - рычание.");
    }

    @Override
    public void eat(String food){
        if(food == "Meat"){
            System.out.println("Тигр любит есть мясо. Он доволен.");
        }else if(food == "Grass"){
            System.out.println("Тигру не нравится есть траву. Он недоволен.");
        }else{
            System.out.println("Тигр не знает как реагировать на эту еду.");
        }
    }
}
