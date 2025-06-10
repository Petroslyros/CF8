package gr.aueb.cf.ch19.mobile_contacts;

import gr.aueb.cf.ch19.mobile_contacts.model.MobileContact;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MobileContactDaoImpl dao = new MobileContactDaoImpl();

        // Insert contacts
        dao.insert(new MobileContact(1, "John", "Doe", "1234567890"));
        dao.insert(new MobileContact(2, "Jane", "Smith", "0987654321"));
        dao.insert(new MobileContact(3, "Alice", "Brown", "1122334455"));

        // Get all contacts
        System.out.println("All Contacts:");
        dao.getALl().forEach(System.out::println);

        // Get a contact by ID
        System.out.println("\nGet Contact with ID 2:");
        System.out.println(dao.getByID(2));

        // Update a contact
        MobileContact updated = new MobileContact(2, "Janet", "Smith", "0987654321");
        dao.update(2, updated);

        // Confirm update
        System.out.println("\nUpdated Contact with ID 2:");
        System.out.println(dao.getByID(2));

        // Delete a contact by phone number
        dao.deleteByPhoneNumber("1122334455");
        System.out.println("\nAfter deleting phone 1122334455:");
        dao.getALl().forEach(System.out::println);

        // Check if ID exists
        System.out.println("\nDoes ID 1 exist? " + dao.contactIdExists(1));
        System.out.println("Does ID 4 exist? " + dao.contactIdExists(4));


        List<MobileContact> allContacts = dao.getALl();

// 1. Filter by first name starting with 'J'
        System.out.println("\nContacts with first name starting with 'J':");
        allContacts.stream()
                .filter(c -> c.getFirstname().startsWith("J"))
                .forEach(System.out::println);

// 2. Count how many have last name "Smith"
        long smithCount = allContacts.stream()
                .filter(c -> c.getLastname().equals("Smith"))
                .count();
        System.out.println("\nNumber of contacts with last name 'Smith': " + smithCount);

// 3. Get all phone numbers into a List
        List<String> phoneNumbers = allContacts.stream()
                .map(MobileContact::getPhoneNumber)
                .toList(); // or collect(Collectors.toList()) in older Java versions
        System.out.println("\nAll phone numbers:");
        phoneNumbers.forEach(System.out::println);
    }
}
