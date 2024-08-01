public class Hogwarts {
    private String name;
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts (String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void printStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Magic Power: " + magicPower);
        System.out.println("Transgressin dist.: " + transgressionDistance);
    }

    public static void compareStudents(Hogwarts student1, Hogwarts student2) {
        System.out.println("Compare " + student1.getName() + " and " + student2.getName());
        if (student1.getMagicPower() > student2.getMagicPower()) {
            System.out.println(student1.getName() + " is stronger than other student.");
        } else if (student1.getMagicPower() < student2.getMagicPower()) {
            System.out.println(student2.getName() + " stronger in magic.");
        } else {
            System.out.println(" both are equal.");
        }

        if (student1.getTransgressionDistance() > student2.getTransgressionDistance()) {
            System.out.println(student1.getName() + " it can transgress further.");
        } else if (student1.getTransgressionDistance() < student2.getTransgressionDistance()) {
            System.out.println(student2.getName() + " it can transgress further.");
        } else {
            System.out.println("Both can transgress an equal distance.");
        }
    }
}
