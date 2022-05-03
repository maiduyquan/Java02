public class Student{
    private String rollNo,fullName,address,email;
    private String DBO;
    private int Status;

    public Student(String rollNo,String fullName,String address,String email,String DBO,int status){
        this.rollNo=rollNo;
        this.fullName=fullName;
        this.address=address;
        this.email=email;
        this.DBO=DBO;
        Status=status;
    }
    public String getRollNo(){
        return rollNo;
    }
    public String getFullName(){
        return fullName;
    }
    public String getAddress(){
        return address;
    }
    public  String getEmail(){
        return email;
    }
    public String getDOB(){
        return DBO;
    }
    public int getStatus(){
        return Status;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setDOB(String DBO){
        this.DBO=DBO;
    }
    public void setStatus(int status){
        Status=status;
    }
    @Override
    public String toString(){
        return "student{"+
                "rollNo='" + rollNo + '\'' +
                ", fullname='" + fullName +'\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", DOB='" + DBO + '\'' +
                ", Status='" + Status + '\'' +
                '}';
    }
}
