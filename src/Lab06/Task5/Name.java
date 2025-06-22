package Lab06.Task5;

public class Name extends Age {
    public String userName;

    @Override
    public void set() {
        this.userName = super.consoleInput("Введите имя: ");
        System.out.println("Имя: " + userName);
    }

}
