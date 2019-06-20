import java.util.ArrayList;

public class GetRandomItem {

    //Method that returns a random number from an array
    public static int rand(){
        ArrayList<Integer> array = new ArrayList<>();
        array.add(50);
        array.add(25);
        array.add(12);
        array.add(36);
        array.add(42);
        array.add(96);
        array.add(84);
        array.add(46);

        int random = array.get((int) (Math.random()* array.size()));

        System.out.println(random);

        return random;

    }

    public static void main(String[] arg){
        //Method call for rand()
        rand();
    }
}
