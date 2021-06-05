import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ManagementStudent {
    private static final String ID_REGEX = "^[C]\\d{4}[G|H|I|K]\\d{2}";
    private static final String EMAIL_REGEX = "^[a-zA-Z]\\.[a-zA-Z]+[@]+[a-z]\\.[v]+[n]";
    private static final String DATA_REGEX = "^[1,2][-|/][1,2][4]";

    public List<Student> studentList;

    public ManagementStudent() {
        this.studentList = new ArrayList<>();
    }

    public void add(Student student) {
        this.studentList.add(student);
    }

    public List<Student> searchName(String name) {
        return this.studentList.stream().filter(o -> o.getName().contains(name)).collect(Collectors.toList());
    }

    public void show() {
        this.studentList.forEach(o -> System.out.println(o.toString()));
    }

    public void edit(String name, Student student) {
        int index = -1;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getName().equals(name)) {
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("Không tồn tại");
        } else {
            studentList.set(index, student);
        }
    }
    public void detele(int i){
this.studentList.remove(i);
    }

    public void sortMediumCcore() {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int) (o1.getMediumCcore() - o2.getMediumCcore());
            }
        });
    }
    public int findByIndex(String name){
        int indexDetele = -1;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getName().equals(name)) {
                indexDetele = i;
            }
        }
     return indexDetele;
    }

    public void checkId(String id) {
        System.out.println(id + ": " + Pattern.matches(ID_REGEX, id));
    }

    public void checkEmail(String email) {
        System.out.println(email + ": " + Pattern.matches(EMAIL_REGEX, email));
    }

    public void checkDate(String date) {
        System.out.println(date + ": " + Pattern.matches(DATA_REGEX, date));
    }


}