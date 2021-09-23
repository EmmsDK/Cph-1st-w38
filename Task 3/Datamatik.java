public class Datamatik{

  public static void main(String[] args) {
    Teacher t = new Teacher("Tess",23,true);
    Student s1 = new Student("Emilio",21,false,"a");
    Student s2 = new Student("Emil",22,false,"a");
    System.out.println(t.name);
    System.out.println(s1.name + " " + s1.team);
    System.out.println(s2.name + " " + s2.team);
  }
}
