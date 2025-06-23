package Lab03;

public class Tree {
    public String name;
    public int age;
    public boolean isAlive;


    public Tree(){
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public Tree(String name, int age, boolean isAlive){
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
    }

    public Tree(String name, int age){
        this(name, age, true);
    }
}
