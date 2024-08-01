public class Hufflepuff extends Student {
    private int hardworking;
    private int loyalty;
    private int honesty;
    public Hufflepuff(String name, String surname, int magical, int transgression, int diligence, int loyalty, int honesty) {
        super(name, surname, magical, transgression);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }
    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public void printStudent() {
        super.printStudent();
        System.out.println("Hufflepuff properties: ");
        System.out.println("Hardworking: " + hardworking);
        System.out.println("Loyalty: " + loyalty);
        System.out.println("Honesty: " + honesty);
    }

    public void compareWith(Hufflepuff student1, Hufflepuff student2) {
        int sum1 = student1.hardworking + student1.loyalty + student1.honesty;
        int sum2 = student2.hardworking + student2.loyalty + student2.honesty;
        if (sum1 > sum2) {
            System.out.println(student1.name + " is the best student in Hufflepuff.");
        } else if (sum1 < sum2) {
            System.out.println(student2.getName() + " is the best student in Hufflepuff.");
        } else {
            System.out.println("Among " + student1.getName() + " and " + student2.getName() + " the same amount of Hufflepuff properties.");
        }
    }
}

