class Student {
    String studentName;
    String regdId;
    String branch;
    Student(String studentName,String regdId,String branch) {
        this.studentName=studentName;
        this.regdId=regdId;
        this.branch=branch;
    }
    void display() {
        System.out.println("studentname: " + studentName);
        System.out.println("Regdid: " + regdId);
        System.out.println("Branch: " + branch);
        }
    public static void main(String[] args) {
        Student objStudent=new Student("Sasi", "23PA1A0546","CSE");
        objStudent.display();
    }
}