import java.util.*;
public class AddressBooksystem {

        ArrayList<Contacts> contactsDetails = new ArrayList();
        Scanner scanner =new Scanner(System.in);
        public void addDetails(){
            Contacts contacts = new Contacts();
            System.out.println("Enter First Name");
            contacts.setFirstName(scanner.nextLine());
            System.out.println("Enter last Name");
            contacts.setLastName(scanner.nextLine());
            System.out.println("Enter Email");
            contacts.setEmail(scanner.nextLine());
            System.out.println("Enter Address");
            contacts.setAddress(scanner.nextLine());
            System.out.println("Enter Contact No");
            contacts.setContactNo(scanner.nextLine());
            System.out.println("Enter City");
            contacts.setCity(scanner.nextLine());
            System.out.println("Enter State");
            contacts.setState(scanner.nextLine());
            System.out.println("Enter Zip Code");
            contacts.setZipCode(scanner.nextLine());
            contactsDetails.add(contacts);
        }
        public void DisplayDetails(){
            System.out.println(contactsDetails);
        }
        public static void main(String[] args) {
            System.out.println("Welcome to Address Book Program!");
            AddressBooksystem addressbooksystem = new AddressBooksystem();
            addressbooksystem.addDetails();
            addressbooksystem.DisplayDetails();
        }
    }
