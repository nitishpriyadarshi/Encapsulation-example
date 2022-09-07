package bridgelabz;

public class person {
    private String name;
    private int age;
    public String getNAme(){ return name; }
    public void setName(String name) {this.name = name; }

    public int getAge() {return age; }
    public void setAge(int age) { this.age =age; }
    void PersonDetails(){
        System.out.println(name);
        System.out.println(age);

    }
}
