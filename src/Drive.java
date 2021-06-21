import java.util.LinkedList;
import java.util.Scanner;

public class Drive {
    public static LinkedList<Student> students = new LinkedList<Student>();
    public static Scanner input = new Scanner(System.in);
    public static String storedPassword = "abcd";
    public static void main(String[] args) {
        checkPassword();
        menu();
    }

    public static void menu(){
        int choice;
        System.out.printf("\n\t\t**********************************************");
        System.out.printf("\n\t\t*          STUDENT REGISTRATION PROGRAM      *");
        System.out.printf("\n\t\t**********************************************");
        System.out.printf("\n");
        System.out.printf("\n\t\t\t[1]Add New Student Record  ");
        System.out.printf("\n\t\t\t[2]Delete Student Record   ");
        System.out.printf("\n\t\t\t[3]Display Student Record  ");
        System.out.printf("\n\t\t\t[4]Modify Student Record   ");
        System.out.printf("\n\t\t\t[5]Search Student Record      ");
        System.out.printf("\n\t\t\t[6]Exit The Program              ");
        System.out.printf("\n\n\t\t\tPlease Enter Your Choice: ");
        choice = input.nextInt();
        switch(choice){
            case 1:
                addRecord();
                System.out.println("\n Record Inserted!");
                break;
            case 2:
//                ID = getID();
//                DeletEntry(mylist,ID);
                break;
            case 3:
//                DisplayEntry(mylist->Node);
//                break;
            case 4:
//                ID = getID();
//                ModifyEntry(mylist, ID);
                break;
            case 5:
//                ID=getID();
//                SearchID(mylist,ID);
                break;
            case 6:
                System.out.println("\n\n\t\t\t*******T H A N K  Y O U !!******");
                System.out.println("\n\t\t\t******Done by : KAMRAN MEHDI****");
                System.out.println("\n\t\t\t*******PROGRAM  TERMINATED******");
                break;
            default:
                System.out.println("INVALID CHOICE!!! PLEASE ENTER AGAIN!");
        }
    }

    public static void checkPassword(){
        System.out.printf("\n\n\t\t\t  SCHOOL OF COMPUTING & TECHNOLOGY.");
        System.out.printf("\n\t\t\t  *********************************");
        System.out.printf("\n\t\t\t  *********************************");
        boolean valid = false;
        int retry=1;
        do {
            System.out.printf("Enter The Password: ");
            String password = input.next();
            if (!password.equals(storedPassword))
                retry++;
            else
                valid = true;
        }while(valid&&retry<=3);
        if(retry>3){
            System.out.printf("Maximum 3 try only! Bye!");
            return;
        }
        else
            System.out.printf("\"Access approved!\"");
    }

    public static void addRecord(){
        Student newStudnet = new Student();
        System.out.printf("\n\t\t******************************************");
        System.out.printf("\n\t\t*********ADD NEW STUDENT RECORD***********");
        System.out.printf("\n\t\t******************************************");
        System.out.printf("\n");

        System.out.print("Enter sutdent id : ");
        newStudnet.setStuId(input.nextInt());

        System.out.print("Enter student name : ");
        newStudnet.setName(input.next());

        System.out.print("Enter student address : ");
        newStudnet.setAddress(input.nextLine());

        System.out.print("Enter student gender : ");
        newStudnet.setGender(input.next());

        System.out.print("Enter student age : ");
        newStudnet.setAge(input.nextInt());

        System.out.print("Enter student Contact No :");
        newStudnet.setCno(input.next());

        System.out.print("Enter Marital Status : ");
        newStudnet.setStatus(input.next());

        System.out.println("Enter Student D.O.B [DD/MM/YYYY]");
        newStudnet.setDate(input.next());

        students.add(newStudnet);
    }

    public static void deleteRecord(){
        System.out.print("Enter student Id : ");
        int id = input.nextInt();
        students.removeIf(s -> s.getStuId() == id);
    }


}
