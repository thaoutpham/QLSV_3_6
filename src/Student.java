import javax.xml.crypto.Data;
import java.io.Serializable;

public class Student implements Serializable {
    String id;
    String name;
    String date;
    String gender;
    String address;
    String email;
    double mediumCcore;

    public Student(String id, String name, String date, String gender, String address, String email, double mediumCcore) {
        this.id = id;
        this.name= name;
        this.date =date;
        this.gender = gender;
        this.address = address;
        this.email = email;
        this.mediumCcore = mediumCcore;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getMediumCcore() {
        return mediumCcore;
    }

    public void setMediumCcore(int mediumCcore) {
        this.mediumCcore = mediumCcore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + date + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", mediumCcore=" + mediumCcore +
                '}';
    }
}
