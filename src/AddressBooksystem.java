import java.util.*;
public class AddressBooksystem {
    static ArrayList<Contacts> contactsDetails = new ArrayList();
    //static HashMap<String, Object> AddressBook = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);
    static Contacts contacts = new Contacts();
    static int counter;

    public void addDetails() {
        Contacts contacts = new Contacts();
        System.out.println("Enter First Name");
        contacts.setFirstName(scanner.next());
        System.out.println("Enter last Name");
        contacts.setLastName(scanner.next());
        System.out.println("Enter Email");
        contacts.setEmail(scanner.next());
        System.out.println("Enter Address");
        contacts.setAddress(scanner.next());
        System.out.println("Enter Contact No");
        contacts.setContactNo(scanner.next());
        System.out.println("Enter City");
        contacts.setCity(scanner.next());
        System.out.println("Enter State");
        contacts.setState(scanner.next());
        System.out.println("Enter Zip Code");
        contacts.setZipCode(scanner.next());
        contactsDetails.add(contacts);
        System.out.println("Contact details added! In Address Book");
    }

    public void DisplayDetails() {
        for (Contacts contactsDetail : contactsDetails) {
            System.out.println("---------*********--------");
            System.out.print(contactsDetail + " ");
        }
    }

    public void editDetails() {
        System.out.println("Enter First Name ");
        String FirstNameSearch = scanner.next();
        /* String FirstNameSearch to
         search for first name */
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

    public void DeleteContact(){
        Iterator<Contacts> removeContact = contactsDetails.iterator();
        while (removeContact.hasNext()){
            Contacts nextElement = removeContact.next();
            removeContact.remove();
        }
        System.out.println("Contact is removed!");
        DisplayDetails();
    }

    public void Option(AddressBooksystem addressBookSystem) {
        System.out.println("Enter a number to perform action: ");
        int menu, ans;
        do {
            System.out.println(" \n1. Add details \n2. Edit details \n3. Delete details \n4. Display details \n5. Exit");
            System.out.println("Enter Option");
            menu = scanner.nextInt();
            switch (menu) {
                case 1 ->
                    /*
                    Adding Contacts in Address Book.
                     */
                        addressBookSystem.addDetails();
                case 2 ->
                     /*
                    Editing the Contacts from Address Book.
                     */
                        addressBookSystem.editDetails();
                case 3 ->
                     /*
                    Deleting Contacts from Address Book.
                     */
                        addressBookSystem.DeleteContact();
                case 4 ->
                     /*
                    Display Contacts From Address Book.
                     */
                        addressBookSystem.DisplayDetails();
                case 5 -> {
                    System.out.println("Exiting Code");
                    System.exit(0);
                }

                default -> System.out.println("Enter Valid Code");
            }
            System.out.println("Do Ypu Want To continue ......If Yes The Press '1' ");
            ans = scanner.nextInt();
        } while (ans == 1);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program!");

        AddressBooksystem addressbooksystem = new AddressBooksystem();
        System.out.println("-----------------------------*****-------------------------");
        addressbooksystem.Option(addressbooksystem);

    }
}
