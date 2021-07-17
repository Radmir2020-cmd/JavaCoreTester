package HWJFT1;

/*
Я изначально понавтыкал много методов и классов... потом в итоге запутался
С интерфейсами попроще...
но все рано выложу решение как ты сделал
 */

public class Main {
    public static void main(String[] args) {
        Competitable[] competitors = {new Cat(1,2), new Human(4,5),
                new Robot(4,5)};

        Overcomable[] overcomables = {new Wall(1), new Treadmill(2)};

        for (Competitable competitable : competitors) {
            for (Overcomable overcomable : overcomables) {
                overcomable.overcome(competitable);
            }

        }

    }
}
