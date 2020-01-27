import java.util.ArrayList;
import java.util.Random;


public class Human_Constructor {
    //задаем переменные
    private static ArrayList<Human> humanList;

    //создаем масив из людей
    public static ArrayList<Human> countHuman(){
        int count = 10;
        humanList = new ArrayList<>();

        int errorCount =  0;
        for (int i = 0; i < count; i++) {
            try {
                Human human = new Human();
                humanList.add(human);
            } catch (RuntimeException ex) {
                errorCount ++;
            }
        }
        System.out.println("Словили ошибку " + errorCount + " раза");
        return humanList;
    }

    //возвращаем объекты которые получилось создать без ошибки
    public static ArrayList<Human> Human() {
        return humanList;
    }

    //ограничиваем допустимые символы для имени людей
    public static String getRandomName(){
        Random humanName = new Random();
        char[] simbol = new char[8];
        for (int i = 0; i < 8; i++){
            int randomLettet;
            if (0 == i) {
                randomLettet = 65 + (int)(Math.random() * 25);
            }else {
                randomLettet = 97 + (int)(Math.random() * 25);
            }
            simbol[i] = (char) randomLettet;
        }
        return new String(simbol);
    }
    //задаем людям имя
    public static void giveName(){
        for (int i = 0; i < humanList.size(); i++) {
            Human humanName = (Human) humanList.get(i);
            humanName.setHumanName(getRandomName());
        }
    }

    //присваиваем имя людям
    public static void callHuman(){
        for (int i = 0; i < humanList.size(); i++){
            Human humanNow = (Human) humanList.get(i);
            humanNow.setHumanName(getRandomName());
        }

    }

    //изменяем размер массива, в зависимости от статуса человека

}
