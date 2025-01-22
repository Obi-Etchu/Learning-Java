public class Person{
  private String name;
  private String gender;
  private int age;

  Person(String name, String gender, int age){
    this.age = age;
    this.gender = gender;
    this.name = name;
  }
  public int getAge() {
      return age;
  }
  public String getGender() {
      return gender;
  }
  public String getName() {
      return name;
  }
  public void setAge(int age) {
      this.age = age;
  }
  public void setGender(String gender) {
      this.gender = gender;
  }
  public void setName(String name) {
      this.name = name;
  }


  public static void main(String[] args) {
    Person Obi = new Person("Obi", "Male", 20);
    System.out.println(Obi.getName());
    System.out.println(Obi.getAge());
    System.out.println(Obi.getGender());
    //System.out.println(Obi.setName("Obi"));
    //System.out.println(Obi.setAge(20));
    //System.out.println(Obi.setGender("Male"));
    
  }
}