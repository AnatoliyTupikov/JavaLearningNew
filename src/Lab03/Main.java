package Lab03;


public class Main {
    public static void main(String[] ars) {
        var st = new Study("Изучение Java - это просто!");
        System.out.println(st.printCourse());

        var car1 = new Car();

        car1.name = "Lada";
        car1.color = "Blue";
        car1.weight = 1.04;

        var car2 = new Car("Yellow", 1.78);

        car2.name = "BMW";

        car1.print();
        car2.print();

        var house1 = new House();
        house1.initialize("Stalinka", 5, 1980);
        house1.Show();
        System.out.println(String.format("%d years old\n", house1.yeersOld()));

        var house2 = new House();
        house1.initialize("Town-House", 3, 2019);
        house1.Show();
        System.out.println(String.format("%d years old\n", house1.yeersOld()));

        var tree1 = new Tree();
        var tree2 = new Tree("Oak", 101, false);
        var tree3 = new Tree("Pine", 7);


    }
}
