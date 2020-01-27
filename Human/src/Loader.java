import java.util.ArrayList;
import static java.lang.System.out;

public class Loader {

    public static void main(String[] args){

        Human_Constructor.countHuman();
        Human_Constructor.callHuman();
        Human_Constructor.Human();
        ArrayList<Human> myHumanList = Human_Constructor.Human();


        out.println(myHumanList.get(0).getHumanName());
        out.println(myHumanList.get(1).getStatus());

    }
}
