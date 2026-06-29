```java id="8dr2n6"
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the ContactService class.
 *
 * @author Zander Taylor
 */

public class ContactServiceTest {

    @Test
    public void testAddContact() {

        ContactService service = new ContactService();

        Contact contact = new Contact(
                "10001",
                "Red",
                "Pallet",
                "9316361996",
                "001 Pallet Court");

        service.addContact(contact);

        assertEquals(contact, service.getContact("10001"));
    }

    @Test
    public void testAddNullContact() {

        ContactService service = new ContactService();

        assertThrows(IllegalArgumentException.class, () -> {
            service.addContact(null);
        });
    }

    @Test
    public void testAddDuplicateContactId() {

        ContactService service = new ContactService();

        Contact contact1 = new Contact(
                "10001",
                "John",
                "Smith",
                "1234567890",
                "123 Main Street");

        Contact contact2 = new Contact(
                "10001",
                "Jane",
                "Doe",
                "0987654321",
                "456 Oak Street");

        service.addContact(contact1);

        assertThrows(IllegalArgumentException.class, () -> {
            service.addContact(contact2);
        });
    }

    @Test
    public void testDeleteContact() {

        ContactService service = new ContactService();

        Contact contact = new Contact(
                "10001",
                "Green",
                "Oak",
                "9316547887",
                "002 Pallet Court");

        service.addContact(contact);

        service.deleteContact("10001");

        assertThrows(IllegalArgumentException.class, () -> {
            service.getContact("10001");
        });
    }

    @Test
    public void testUpdateFirstName() {

        ContactService service = new ContactService();

        Contact contact = new Contact(
                "10001",
                "John",
                "Langley",
                "1234567890",
                "300 Main Way");

        service.addContact(contact);

        service.updateFirstName("10001", "Jesse");

        assertEquals("Jesse",
                service.getContact("10001").getFirstName());
    }

    @Test
    public void testUpdateLastName() {

        ContactService service = new ContactService();

        Contact contact = new Contact(
                "10001",
                "Jotaro",
                "Kujo",
                "1234567890",
                "777 Star Street");

        service.addContact(contact);

        service.updateLastName("10001", "Joestar");

        assertEquals("Joestar",
                service.getContact("10001").getLastName());
    }

    @Test
    public void testUpdatePhone() {

        ContactService service = new ContactService();

        Contact contact = new Contact(
                "10001",
                "Mike",
                "William",
                "1234567890",
                "654 Micro Street");

        service.addContact(contact);

        service.updatePhone("10001", "0987654321");

        assertEquals("0987654321",
                service.getContact("10001").getPhone());
    }

    @Test
    public void testUpdateAddress() {

        ContactService service = new ContactService();

        Contact contact = new Contact(
                "10001",
                "Marshall",
                "Mathers",
                "1234567890",
                "123 Main Street");

        service.addContact(contact);

        service.updateAddress("10001", "986 M&M Avenue");

        assertEquals("986 M&M Avenue",
                service.getContact("10001").getAddress());
    }

    @Test
    public void testDeleteNonexistentContact() {

        ContactService service = new ContactService();

        assertThrows(IllegalArgumentException.class, () -> {
            service.deleteContact("99999");
        });
    }
}
```
