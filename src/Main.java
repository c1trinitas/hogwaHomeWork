public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Harry", "Potter", 22, 39, 66, 65, 76);
        Gryffindor hermioneGranger = new Gryffindor("Hermione", "Granger", 12, 89, 33, 78, 66);
        Gryffindor ronWeasley = new Gryffindor("Ron", "Weasley", 4, 55, 41, 31, 11);

        Slytherin dracoMalfoy = new Slytherin("Draco", "Malfoy", 12, 55, 47, 45, 97, 89, 99);
        Slytherin grahamMontague = new Slytherin("Graham", "Montague", 12, 19, 34, 35, 36, 36, 96);
        Slytherin gregoryGoyle = new Slytherin("Gregory", "Goyle", 13, 22, 34, 56, 75, 24, 96);

        Hufflepuff zachariasSmith = new Hufflepuff("Zacharias", "Smith", 6, 34, 64, 75, 21);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric", "Diggory", 5, 43, 43, 12, 56);
        Hufflepuff justinFinchFletchley = new Hufflepuff("JustinFinch", "Fletchley", 7, 22, 44, 55, 66);

        Ravenclaw choChang = new Ravenclaw("Cho", "Chang", 3, 33, 44, 23, 43, 42);
        Ravenclaw padmaPatil = new Ravenclaw("Padma", "Patil", 5, 11, 23, 53, 76, 21);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus", "Belby", 6, 23, 43, 56, 75, 66);

        harryPotter.printStudent();
        harryPotter.compareWith(hermioneGranger, ronWeasley);
        dracoMalfoy.printStudent();
        dracoMalfoy.compareWith(grahamMontague, gregoryGoyle);
        zachariasSmith.printStudent();
        zachariasSmith.compareWith(cedricDiggory, justinFinchFletchley);
        choChang.printStudent();
        choChang.compareWith(padmaPatil, marcusBelby);
    }
}