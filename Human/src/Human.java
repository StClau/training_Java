import java.util.Scanner;
import static java.lang.System.out;



public class Human {
    private double originWeight;
    private double weight;
    private double pee;
    private String humanName;

    private double MINWEIGHT;
    private double MAXWEIGHT;

    //задаем ввозможные статусы для человека
    private String dead;
    private String work;
    private String relax;
    private String happy;
    private String exploded;
    private String play;
    private String lowHealth;

    //Параметры для генерации мешка с костями
    public Human() throws RuntimeException {
        weight = 100.00 + 300.00 * Math.random();
        originWeight = weight;
        MINWEIGHT = 40.00;
        MAXWEIGHT = 250.00;

        if (weight > MAXWEIGHT){
            throw new RuntimeException("При генарации человека, наступила смерть");
        }
    }

    //Присвоение имени мешку с костями
    public String getHumanName(){
        return humanName;
    }

    public void setHumanName(String humanName) {
        this.humanName = humanName;
    }

    public void shout(){
        weight = weight - 00.10;
        out.println("Ааааааааа!!!!");
    }

    public void feed(Double amount){
        weight = weight + amount;
    }
    public void drink(Double amount) {
        weight = weight + amount;
    }

    public String pee(){
        pee = 5.0 + 10.0 * Math.random();
        weight = weight - pee;
        if (pee >= 5)
            return ("Человек умер от диареи");
        else
            return ("Вес уменьшился на: " + pee);
    }

    public String getStatus(){
        if(weight < MINWEIGHT) {
            return dead;
            } else if (weight > MAXWEIGHT){
            return exploded;
        } else if (weight > originWeight){
            return "Sleeping";
        } else {
            return "Working";
        }
    }

}
