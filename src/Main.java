import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileStudent fileStudent=new FileStudent();
        Scanner scanner=new Scanner(System.in);
        ManagementStudent managementStudent=new ManagementStudent();

        while (true){
            System.out.println("======Menu=====");
            System.out.println("1: Thêm học sinh");
            System.out.println("2: Hiển thị");
            System.out.println("3: Tìm kiếm thông tin người");
            System.out.println("4: Xóa thông tin người theo id");
            System.out.println("5: Sửa thông tin người theo id");
            System.out.println("6: Sắp xếp học sinh");
            System.out.println("7: Ghi vào file");
            System.out.println("8: Đọc từ file");
            System.out.println("9: exit");
            int number= scanner.nextInt();
            switch (number){
                case 1:
                    System.out.println("Nhập id");
                    String id= scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Nhập name:");
                    String name=scanner.nextLine();
                    System.out.println("Nhập ngày sinh:");
                    String date=scanner.nextLine();
                    System.out.println("Nhập gender:");
                    String gender=scanner.nextLine();
                    System.out.println("Nhập address:");
                    String address=scanner.nextLine();
                    System.out.println("Nhập email:");
                    String email=scanner.nextLine();
                    System.out.println("Nhập điểm trung bình:");
                    Double mediumCcore= scanner.nextDouble();
                    Student student=new Student(id,name,date,gender,address,email,mediumCcore);
                    managementStudent.add(student);
                    break;
                case 2:
                    managementStudent.show();
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("Nhập tên muồn tìm:");
                    String nameSearch=scanner.nextLine();
                    System.out.println(managementStudent.searchName(nameSearch));
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.println("Nhập tên muốn xóa:");
                    String nameDatele=scanner.nextLine();
                    if( managementStudent.findByIndex(nameDatele)==-1){
                        System.out.println("Name không tồn tại");
                    }else {
                        managementStudent.detele(managementStudent.findByIndex(nameDatele));
                    }
                    break;
                case 5:
                    scanner.nextLine();
                    System.out.println("Nhập tên muốn sửa:");
                    String nameEdit=scanner.nextLine();
                    System.out.println("Nhập id");
                    String idEdit= scanner.nextLine();
                    System.out.println("Nhập name:");
                    String nameEditNew=scanner.nextLine();
                    System.out.println("Nhập ngày sinh:");
                    String dateEdit=scanner.nextLine();
                    System.out.println("Nhập gender:");
                    String genderEdit=scanner.nextLine();
                    System.out.println("Nhập address:");
                    String addressEdit=scanner.nextLine();
                    System.out.println("Nhập email:");
                    String emailEdit=scanner.nextLine();
                    System.out.println("Nhập điểm trung bình:");
                    Double mediumCcoreEdit= scanner.nextDouble();
                    Student studentEdit=new Student(idEdit,nameEditNew,dateEdit,genderEdit,addressEdit,emailEdit,mediumCcoreEdit);
                    managementStudent.edit(nameEdit,studentEdit);
                    break;
                case 6:
                    managementStudent.sortMediumCcore();
                    managementStudent.show();
                    break;
                case 7:
                    scanner.nextLine();
                    System.out.println("Nhập đường dẫn file");
                    String path=scanner.nextLine();
                    fileStudent.writeFile(managementStudent.studentList);
                    break;
                case 8:
                    fileStudent.readFile();
                    break;
                case 9:
                    System.out.println("Nhập id cần kiểm tra");
                    String idCheck=scanner.nextLine();
                    managementStudent.checkId(idCheck);
                    break;
                case 10:
                    System.out.println("Nhập email kiểm tra ");
                    String emailCheck=scanner.nextLine();
                    managementStudent.checkEmail(emailCheck);
                    break;
                case 11:
                    System.out.println("Nhập ngày để kiểm tra");
                    String dateCheck=scanner.nextLine();
                    managementStudent.checkDate(dateCheck);
                    break;
                default:
                    System.out.println("Nhập lỗi");
            }
        }
    }

}