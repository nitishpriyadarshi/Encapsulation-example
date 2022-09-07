package bridgelabz;

public class EncapsulationExamples {
    public static void main(String[] args) {
        person person = new person();
        person.setName("Amit");
        person.setAge(23);
        person.PersonDetails();

        System.out.println(person.getAge());
        System.out.println(person.getNAme());
    }
}
