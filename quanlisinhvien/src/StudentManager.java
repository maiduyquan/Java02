import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class StudentManager {
    private List<Student> studentList;
    private static Scanner in =new Scanner(System.in);

    public StudentManager(){
        this.studentList = new ArrayList<>();
    }

    public void getStudentList(){
        for (Student stu: studentList){
            System.out.println("rollno("+stu.getRollNo()+"): "+stu.getFullName());
        }
    }
    public void addStudent(Student student){
        studentList.add(student);
    }

    public void addStudent(){
        String RollNo;
        String FullName;
        String Address;
        String Email;
        String DOB;
        int Status;

        System.out.println("thêm sinh viên");
        System.out.println("nhập RollNo(dạng chuỗi):");
        RollNo=in.next();
        if(studentList.stream().allMatch(student -> !student.getRollNo().equals(RollNo))){
            System.out.println("nhap fullname sv dang chuoi");
            FullName=in.next();
            System.out.println("nhap address sv dang chuoi");
            Address=in.next();
            System.out.println("nhap email sv dang chuoi");
            Email=in.next();
            System.out.println("nhap date sv dang chuoi");
            DOB=in.next();
            System.out.println("nhap status sv dang chuoi");
            Status=in.nextInt();
            Student stu = new Student(RollNo,FullName,Address,Email,DOB,Status);
            studentList.add(stu);
            System.out.println("thêm sv thanh cong");
        }else{
            System.out.println("sinh viên đã tồn tại");
        }
    }
    public void removeStudent(){
        System.out.println("xoá hs:");
        System.out.println("nhập rollNo");
        String rollNo= in.next();
        if(studentList.stream().anyMatch(student -> student.getRollNo().equals(rollNo))){
            for (Student student:studentList){
                if(student.getRollNo().equals(rollNo)){
                    studentList.remove(student);
                    System.out.println("xoá sv thành công");
                    break;
                }
            }
        }else {
            System.out.println("sv ko tồn tại");
        }
    }
    public void sortStudent(){
        studentList.sort((stu1,stu2) ->stu1.getFullName().compareTo(stu2.getFullName()));
        getStudentList();
    }
    public void setStudent(){
        System.out.println("nhap id sv can chinh sua");
        String id =in.next();
        boolean check=false;
        Student stu=null;

        for (Student student:studentList){
            if (student.getRollNo().equals(id)){
                check = true;
                stu =student;
                break;
            }
        }

        if (check){
            System.out.println("moi ban chon");
            System.out.println("1: thay đổi email");
            System.out.println("2: thay đổi status");
            System.out.println("3: thay đổi address");
            int selection= in.nextInt();
            switch (selection){
                case 1:
                    System.out.println("mời bạn nhập thay đổi");
                    String email=in.next();
                    for(Student student:studentList){
                        if (student.equals(stu)){
                            student.setEmail(email);
                        }
                    }
                    break;
                case 2:
                    System.out.println("mời bạn nhập thay đổi");
                    int st=in.nextInt();
                    for(Student student:studentList){
                        if (student.equals(stu)){
                            student.setStatus(st);
                        }
                    }
                    break;
                case 3:
                    System.out.println("mời bạn nhập thay đổi");
                    String address=in.next();
                    for(Student student:studentList){
                        if (student.equals(stu)){
                            student.setAddress(address);
                        }
                    }
                    break;
                default:
                    System.out.println("chọn ko hợp lệ");
            }
        }else {
            System.out.println("id lựa chọn ko hợp lệ");
        }
    }

    public void searchStudent(){
        System.out.println("tìm kiếm hs theo:");
        System.out.println("1.rollNo");
        System.out.println("2.Name");
        int selection = in.nextInt();
        System.out.println("nhập nd cần tìm:");
        String key=in.next();
        switch (selection){
            case 1:
                for (Student student:studentList){
                    if(student.getRollNo().contains(key)){
                        System.out.println("rollNo("+student.getRollNo()+") "+ student.getFullName());
                    }
                }
            break;
            case 2:
                for (Student student:studentList){
                    if(student.getFullName().contains(key)){
                        System.out.println("rollNo("+student.getRollNo()+") "+ student.getFullName());
                    }
                }
                break;
            default:
                System.out.println("nhập sai");
        }
    }
}
