public class Teacher {
    private String name;

    public Teacher() {
    }

    public void teach(Student student) {
        student.learn();
    }

    public void answer() {
        System.out.println(name + "answers the question.");
    }
}
