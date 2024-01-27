package src.oops21jan;


import java.util.Comparator;

class SortbyIdAsc implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}

class SortbyIdDesc implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getId(), o1.getId());
    }
}

class SortbynameAsc implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (o1.getName().compareTo(o2.getName()));
    }
}

class SortbynameDesc implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (o2.getName().compareTo(o1.getName()));
    }
}


public class Student implements Comparable<Student> {

    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.id, o.id);
    }
}
