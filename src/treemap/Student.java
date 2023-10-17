package treemap;

public class Student implements Comparable<Student> {
    private  int id;

    public Student(){

    }
    public Student(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Student o) {
        return this.id-o.id;
    }
}
