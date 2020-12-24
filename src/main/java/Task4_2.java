import Task4_2.Candy;
import Task4_2.Gingerbread;
import Task4_2.JellyBean;
import Task4_2.Sweets;

/**
 * @author Ekaterina M.
 */

public class Task4_2 {
    public static void main(String[] args){
        Candy Candy1 = new Candy ("Choco Candy", 10.1, 20.1, "chocolate brown");
        JellyBean JellyBean1 = new JellyBean("Fini", 3.0, 1.7,"banana");
        JellyBean JellyBean2 = new JellyBean("Beans", 2.9, 2,"cherry");
        Gingerbread Gingerbread1 = new Gingerbread ("Favorite", 18, 25.2, "man");
        Gingerbread Gingerbread2 = new Gingerbread ("Sugar", 18, 25.2, "snowflake");
        Gingerbread Gingerbread3 = new Gingerbread ("Classic", 18, 25.2, "house");
        Sweets[] gift = {Candy1, JellyBean1, JellyBean2, Gingerbread1, Gingerbread2, Gingerbread3};

        double totalWeight = 0;
        double totalPrice = 0;

        System.out.println("В подарке:");

        for (Sweets someSweets : gift)
        {
            totalWeight = totalWeight + someSweets.getWeight();
            totalPrice = totalPrice + someSweets.getPrice();
            System.out.println(someSweets);
        }

        System.out.println("Общий вес подарка: " + totalWeight);
        System.out.println("Общая стоимость подарка: " + totalPrice);
    }
}
