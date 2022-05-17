import java.util.*;
import java.lang.*;
public class AddressBooksystem {
    static ArrayList<Contacts> contactsDetails = new ArrayList();
    //static HashMap<String, Object> AddressBook = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);
    static Contacts contacts = new Contacts();
    static int counter;


    static HashMap<String, ArrayList<Contacts>> hashmap = new HashMap<>();
    public static void AddressBook(AddressBooksystem addressBooksystem) {
        int ans;
        do {
            System.out.println("Enter Name For Address Book");
            String AddressBookName = scanner.next();

            // addressBookSystem.MenuOption(addressBookSystem,contactsDetails);
            if (hashmap.containsKey(AddressBookName)) {
                System.out.println("The AddressBook already contains");
                break;
            } else {
                ArrayList<Contacts> contactDetails = new ArrayList<>();
                addressBooksystem.MenuOption(addressBooksystem, contactDetails);
                hashmap.put(AddressBookName, contactDetails);
            }
            System.out.println("AddressBook Added" + hashmap + " ");
            System.out.println("Do You Want To Continue the Press 1");
            ans = scanner.nextInt();
        } while (ans == 1);

    }
    public static ArrayList<Contacts> addDetails(ArrayList<Contacts> contactDetails){
        Contacts info = new Contacts();
        System.out.println("Enter first name: ");
        info.setFirstName(scanner.next());
        System.out.println("Enter last name: ");
        info.setLastName(scanner.next());
        System.out.println("Enter address: ");
        info.setAddress(scanner.next());
        System.out.println("Enter city name: ");
        info.setCity(scanner.next());
        System.out.println("Enter state name: ");
        info.setState(scanner.next());
        System.out.println("Enter zip code: ");
        info.setZipCode(scanner.next());
        System.out.println("Enter contact no.: ");
        info.setContactNo(scanner.next());
        System.out.println("Enter email: ");
        info.setEmail(scanner.next());
        contactDetails.add(info);
        System.out.println("Contact details added!");
        return contactDetails;
    }
    public static void displayContacts(){
        System.out.println(Arrays.asList(hashmap));
    }

    public void editDetails(ArrayList<Contacts> contactDetails){
        System.out.println("Enter First Name for which you want to modify info: ");
        String searchFirstName = scanner.next();
        /*  Iterate to search for first name */
        for (Contacts contact : contactDetails) {
            /*  compare first name
             *   if matches display menu for edit
             *   else display no record found message
             */
            if (contact.getFirstName().equals(searchFirstName)){
                System.out.println("Enter the number to edit respective info: ");
                System.out.println("1. First Name \n2. Last Name \n3. Address \n4. City " +
                        "\n5. State \n6. Zip Code \n7. Contact No \n8. Email");
                int index = scanner.nextInt();
                System.out.println("Enter value to update: ");
                switch (index){
                    case 1:
                        String updatedFirstName = scanner.next();
                        contact.setFirstName(updatedFirstName);
                        break;
                    case 2:
                        String updatedLastName = scanner.next();
                        contact.setLastName(updatedLastName);
                        break;
                    case 3:
                        String updatedAddress = scanner.next();
                        contact.setAddress(updatedAddress);
                        break;
                    case 4:
                        String updatedCity = scanner.next();
                        contact.setCity(updatedCity);
                        break;
                    case 5:
                        String updatedState = scanner.next();
                        contact.setState(updatedState);
                        break;
                    case 6:
                        String updatedZipCode = scanner.next();
                        contact.setZipCode(updatedZipCode);
                        break;
                    case 7:
                        String updatedContact = scanner.next();
                        contact.setContactNo(updatedContact);
                        break;
                    case 8:
                        String updatedEmail = scanner.next();
                        contact.setEmail(updatedEmail);
                        break;
                    default:
                        System.out.println("Invalid number!");
                }
                /*  Display updated contact */
                System.out.println("Details updated");
            }
            else {
                System.out.println("No record found!");
            }
        }
    }
    public void deleteContact(ArrayList<Contacts> contactDetails){
        System.out.println("Enter email for which you want to delete contact: ");
        String searchEmail = scanner.next();
        Iterator<Contacts> removeContact = contactDetails.iterator();
        /*  Checking the next element where
         *   condition holds true till there is single element
         *   in the List using hasNext() method
         */
        while (removeContact.hasNext()){
            /*  Move cursor to next element */
            Contacts nextElement = removeContact.next();
            if (nextElement.getEmail().equals(searchEmail)) {
                removeContact.remove();
                System.out.println("Contact is removed!");
                break;
            }
            else {
                System.out.println("Contact not found.");
            }
        }
    }
    public void MenuOption(AddressBooksystem addressBooksystem,ArrayList<Contacts> contactDetails ) {
        System.out.println("Enter a number to perform action: ");
        int menu, ans;
        do {
            System.out.println(" \n1. Add details \n2. Edit details \n3. Delete details \n4. Display details \n5. Exit");
            System.out.println("Enter Option");
            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    /*  Add contact details in address book */
                    addressBooksystem.addDetails(contactDetails);
                    break;
                case 2:
                    /*  Edit contact details in address book */
                    addressBooksystem.editDetails(contactDetails);
                    break;
                case 3:
                    /*  Delete contact details */
                    addressBooksystem.deleteContact(contactDetails);
                    break;
                case 4:
                    /*  Display contact details */
                    addressBooksystem.displayContacts();
                    break;
                case 5:
                    System.out.println("Exit!");
                    break;
                default:
                    System.out.println("Invalid option selected.");
                    break;
            }
            System.out.println("Do Ypu Want To continue ......If Yes The Press '1' ");
            ans = scanner.nextInt();
        } while (ans == 1);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program!");

        AddressBooksystem addressbooksystem = new AddressBooksystem();
        System.out.println("-------------------------------");
        AddressBook(addressbooksystem);
    }
}