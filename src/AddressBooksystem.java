import java.util.*;
public class AddressBooksystem {

    static ArrayList<Contacts> contactsDetails = new ArrayList();
    static Scanner scanner = new Scanner(System.in);
    static Contacts contacts = new Contacts();

    public void addDetails() {

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

    public void DisplayDetails() {
        for (Contacts contactsDetail : contactsDetails) {
            System.out.println(contactsDetail);
        }
    }

    public void editDetails() {
        System.out.println("Enter First Name to edit ");
        String FirstNameSearch = scanner.next();
       
        for (Contacts contacts : contactsDetails) {
            System.out.println("First Name " + contacts.getFirstName());
            if (contacts.getFirstName().equals(FirstNameSearch)) {
                System.out.println("Enter a No For Edit the Details");
                System.out.println("""
                         1 =  First Name\s
                         2 = Last Name\s
                         3 = Email\s
                         4 = Contact No\s
                         5 = Address\s
                         6 = City\s
                         7 = State\s
                         8 = Zip Code\s""");
                int edit = scanner.nextInt();
                System.out.println("Enter value For Update");
                switch (edit) {
                    case 1 -> {
                        String UpdateFirstname = scanner.next();
                        contacts.setFirstName(UpdateFirstname);
                    }
                    case 2 -> {
                        String UpdateLastName = scanner.next();
                        contacts.setLastName(UpdateLastName);
                    }
                    case 3 -> {
                        String UpdateEmail = scanner.next();
                        contacts.setEmail(UpdateEmail);
                    }
                    case 4 -> {
                        String UpdateContactNo = scanner.next();
                        contacts.setContactNo(UpdateContactNo);
                    }
                    case 5 -> {
                        String UpdateAddress = scanner.next();
                        contacts.setAddress(UpdateAddress);
                    }
                    case 6 -> {
                        String UpdateCity = scanner.next();
                        contacts.setCity(UpdateCity);
                    }
                    case 7 -> {
                        String UpdateState = scanner.next();
                        contacts.setState(UpdateState);
                    }
                    case 8 -> {
                        String UpdateZipCode = scanner.next();
                        contacts.setZipCode(UpdateZipCode);
                    }
                }
            } else {
                System.out.println("Enter Correct Name");
            }
            System.out.println("Updated Details: ");
            DisplayDetails();
        }
    }

    public void deleteContact(){
        Iterator<Contacts> removeContact = contactsDetails.iterator();

        while (removeContact.hasNext()){
            Contacts nextElement = removeContact.next();
            removeContact.remove();
        }
        System.out.println("Contact is removed!");
        DisplayDetails();
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program!");

        AddressBooksystem addressbooksystem = new AddressBooksystem();
        addressbooksystem.addDetails();
        addressbooksystem.DisplayDetails();
        addressbooksystem.editDetails();
        addressbooksystem.deleteContact();
    }
}
