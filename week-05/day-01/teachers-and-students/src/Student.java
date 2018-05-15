public class Student {
    private String name;

    public Student() {
    }

    public void learn() {
        System.out.println(name + "is learning");
    }

    public void question(Teacher teacher) {
        teacher.answer();
    }
}
