import javax.print.PrintService;
import java.util.Arrays;

public class Main {
    private static final Gryffindor[] gryffindors = {
            new Gryffindor("Гарри Поттер", 50, 45, 67,
                    89, 98),
            new Gryffindor("Гермиона Грейнджер", 46, 98, 87,
                    34, 78),
            new Gryffindor("Рон Уизли", 23, 45, 78,
                    45, 67)
    };

    private static final Slytherin[] slytherins = {
            new Slytherin("Драко Малфой", 50, 45, 67,
                    89, 98, 56, 89),
            new Slytherin("Грэхэм Монтегю", 45, 87, 71,
                    34, 44, 53, 76),
            new Slytherin("Грегори Гойл", 51, 34, 34,
                    56, 45, 56, 39)
    };

    private static final Hufflepuff[] hufflepuffs = {
            new Hufflepuff("Захария Смит", 51, 67, 89,
                    34, 89),
            new Hufflepuff("Седрик Диггори", 46, 90, 34,
                    56, 53),
            new Hufflepuff("Джастин Финч-Флетчли", 45, 98, 34,
                    89, 39)
    };

    private static final Ravenclaw[] ravenclaws = {
            new Ravenclaw("Чжоу Чанг", 53, 61, 76,
                    33, 89, 54),
            new Ravenclaw("Падма Патил", 82, 56, 45,
                    89, 45, 56),
            new Ravenclaw("Маркус Белби", 34, 45, 56,
                    67, 23, 34)
    };


    public static void main(String[] args) {
        System.out.println("Список гриффиндорцев:");
        for (Gryffindor students : gryffindors) {
            System.out.println(students);
        }
        System.out.println();

        System.out.println("Список слизеринцев:");
        for (Slytherin students : slytherins) {
            System.out.println(students);
        }

        System.out.println();

        System.out.println("Список когтевранцев:");
        for (Hufflepuff students : hufflepuffs) {
            System.out.println(students);
        }
        System.out.println();

        System.out.println("Список пуффендуйцев:");
        for (Ravenclaw students : ravenclaws) {
            System.out.println(students);
        }
        System.out.println();

        Gryffindor.max(gryffindors[2], gryffindors[1]);

        System.out.println();

        Slytherin.max(slytherins[0], slytherins[1]);

        System.out.println();

        Hufflepuff.max(hufflepuffs[0], hufflepuffs[1]);

        System.out.println();

        Ravenclaw.max(ravenclaws[0], ravenclaws[1]);

        System.out.println();

        Hogwarts.beastStudent(gryffindors[0], slytherins[1]);
    }

}




