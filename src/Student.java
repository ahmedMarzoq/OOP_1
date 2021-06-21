import com.sun.xml.internal.ws.util.StringUtils;

import java.time.LocalDate;

public class Student {

    private int stuId;
    private int age;
    private String name;
    private String address;
    private String gender;
    private String status;
    private String cno;
    private String date;

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        boolean valid = false;
        do {
            if (String.valueOf(stuId).length() != 4)
                System.out.printf("\t\t<< Student ID should not be Empty or It should \n\t\t only 4 digits >>\n");
            else{
                if (isNumeric(String.valueOf(stuId)))
                    this.stuId = stuId;
            }
        }while(valid && isDuplicate(stuId));
        this.stuId = stuId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        do{
            if(String.valueOf(age).length() > 2 || String.valueOf(age).isEmpty())
                System.out.printf("\t  <<Student age should not be Empty or \n\t\tIt should not more than 2 character>>\n");
        }while(age<3);
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        do {
            if (address.length()<10)
                System.out.printf("\t\t<< Address should not be Empty or \n\t\tIt should not less than 10 characters >>\n");
        }while(address.length()<10);
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        do {
            if (status.length()<10)
                System.out.printf("\t\t<<Marital Status should not be Empty or \n\t\tIt should not exceed 10 characters>>\n");
        }while (status.length()<10);
        this.status = status;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        LocalDate ld = LocalDate.parse(date) ;
        this.date = ld.toString();
    }

    private boolean isDuplicate(int id){
        for (Student s:Drive.students) {
            if (id == s.getStuId())
                return false;
        }
        return true;
    }

    private boolean isNumeric(String number){
        try {
            int newValue = Integer.parseInt(number);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Input String cannot be parsed to Integer.");
        }
        return false;
    }
}
