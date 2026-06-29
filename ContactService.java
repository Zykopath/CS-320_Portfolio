import java.util.HashMap;
import java.util.Map;

/**
 * Contact service for adding, updating,
 * and deleting contacts.
 *
 * @author Zander Taylor
 */


public class ContactService {

    private final Map<String, Contact> contacts;

    public ContactService() {
        contacts = new HashMap<>();
    }

    public void addContact(Contact contact) {

        if (contact == null) {
            throw new IllegalArgumentException("Contact cannot be null.");
        }

        if (contacts.containsKey(contact.getContactId())) {
            throw new IllegalArgumentException("Contact ID already exists.");
        }

        contacts.put(contact.getContactId(), contact);
    }

    public void deleteContact(String contactId) {

        if (!contacts.containsKey(contactId)) {
            throw new IllegalArgumentException("Contact ID does not exist.");
        }

        contacts.remove(contactId);
    }

    public void updateFirstName(String contactId, String firstName) {

        Contact contact = getContact(contactId);
        contact.setFirstName(firstName);
    }

    public void updateLastName(String contactId, String lastName) {

        Contact contact = getContact(contactId);
        contact.setLastName(lastName);
    }

    public void updatePhone(String contactId, String phone) {

        Contact contact = getContact(contactId);
        contact.setPhone(phone);
    }

    public void updateAddress(String contactId, String address) {

        Contact contact = getContact(contactId);
        contact.setAddress(address);
    }

    public Contact getContact(String contactId) {

        if (!contacts.containsKey(contactId)) {
            throw new IllegalArgumentException("Contact ID does not exist.");
        }

        return contacts.get(contactId);
    }
}
