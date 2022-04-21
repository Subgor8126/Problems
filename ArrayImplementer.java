package neuepacken;




import static neuepacken.Array.*;

public class ArrayImplementer {
    public static void main(String[] args) {
        Array numbers = new Array(1);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);
        numbers.insert(60);

        numbers.print();

        System.out.println();

        System.out.print("Your item is at index: "+numbers.indexOf(39875));




    }
}
