package Lab09;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Game {
    private Map<User, Integer> gameSession;

    public Game(User... users) {
        gameSession = new HashMap<User, Integer>();
        for (User user : users) {
            gameSession.put(user, ThreadLocalRandom.current().nextInt(0, 11));
        }
    }

    public void showPoints() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Specify user's name: ");
        String userName = scn.nextLine();
        var pair = gameSession.entrySet().stream().filter(p -> p.getKey().getName().equals(userName)).findFirst();
        if (pair.isEmpty()) {
            System.out.println("Error! User unknown.");
            return;
        }
        Integer result = pair.get().getValue();
        System.out.println(userName + " has the following number of points: " + result);

    }
}
