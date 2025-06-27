package Lab06.Task5;

public class Name extends Age {


    @Override
    public void set() {
       String userName = super.consoleInput("Введите имя: ");
        System.out.println("Имя: " + userName);
    }

}
