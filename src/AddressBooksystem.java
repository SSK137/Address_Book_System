public class AddressBooksystem {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Systems");

        Contacts contacts = new Contacts("Saurabh", "Kodam", "Savedi ", "Ahmednagar", "Maharashtra","414003", "8149355350","saurabhkodam@gmail.com");
        System.out.println(contacts.getFirstName());
        System.out.println(contacts.getLastName());
        System.out.println(contacts.getEmail());
        System.out.println(contacts.getAddress());
        System.out.println(contacts.getCity());
        System.out.println(contacts.getState());
        System.out.println(contacts.getContactNo());
        System.out.println(contacts.getZipCode());
    }
}
