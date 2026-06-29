```java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the Contact class.
 *
 * @author Zander Taylor
 */

public class ContactTest {

    @Test
    public void testValidContactCreation() {

        Contact contact = new Contact(
                "95162",
                "Matt",
                "Smith",
                "9874563210",
                "261 Jolly Street");

        assertEquals("95162", contact.getContactId());
        assertEquals("Matt", contact.getFirstName());
        assertEquals("Smith", contact.getLastName());
        assertEquals("9874563210", contact.getPhone());
        assertEquals("261 Jolly Street", contact.getAddress());
    }

    @Test
    public void testContactIdTooLong() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "99966633311",
                    "Matt",
                    "Smith",
                    "9874563210",
                    "261 Jolly Street");
        });
    }

    @Test
    public void testNullContactId() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    null,
                    "Matt",
                    "Smith",
                    "9874563210",
                    "261 Jolly Street");
        });
    }

    @Test
    public void testFirstNameTooLong() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "95162",
                    "Supercalifragilisticexpialidocious",
                    "Smith",
                    "9874563210",
                    "261 Jolly Street");
        });
    }

    @Test
    public void testNullFirstName() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "95162",
                    null,
                    "Smith",
                    "9874563210",
                    "261 Jolly Street");
        });
    }

    @Test
    public void testLastNameTooLong() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "95162",
                    "Blaine",
                    "Wolfeschlegelsteinhausenbergerdorff",
                    "9874563210",
                    "921 Mulberry Street");
        });
    }

    @Test
    public void testNullLastName() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "12345",
                    "John",
                    null,
                    "1234567890",
                    "123 Main Street");
        });
    }

    @Test
    public void testPhoneInvalidLength() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "35768",
                    "Jacoby",
                    "Raddix",
                    "00000",
                    "924 Exile Street");
        });
    }

    @Test
    public void testPhoneContainsLetters() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "39715",
                    "Jesse",
                    "Fantasy",
                    "931FUN777",
                    "777 Stage Way");
        });
    }

    @Test
    public void testNullPhone() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "12345",
                    "John",
                    "Smith",
                    null,
                    "123 Main Street");
        });
    }

    @Test
    public void testAddressTooLong() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "15984",
                    "Ike",
                    "Turner",
                    "9874563210",
                    "Thelongestaddressnameinhistorybyfartoolong");
        });
    }

    @Test
    public void testNullAddress() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "12345",
                    "John",
                    "Smith",
                    "1234567890",
                    null);
        });
    }

    @Test
    public void testUpdateFirstName() {

        Contact contact = new Contact(
                "12345",
                "Zak",
                "Strife",
                "9874563210",
                "777 Seventh Avenue");

        contact.setFirstName("Cloud");

        assertEquals("Cloud", contact.getFirstName());
    }

    @Test
    public void testUpdateLastName() {

        Contact contact = new Contact(
                "12345",
                "John",
                "Smith",
                "1234567890",
                "123 Main Street");

        contact.setLastName("Jones");

        assertEquals("Jones", contact.getLastName());
    }

    @Test
    public void testUpdatePhone() {

        Contact contact = new Contact(
                "98765",
                "Johnathan",
                "Killroy",
                "9874563210",
                "123 Main Street");

        contact.setPhone("9316367777");

        assertEquals("9316367777", contact.getPhone());
    }

    @Test
    public void testUpdateAddress() {

        Contact contact = new Contact(
                "12345",
                "John",
                "Smith",
                "1234567890",
                "123 Main Street");

        contact.setAddress("456 Oak Avenue");

        assertEquals("456 Oak Avenue", contact.getAddress());
    }
}
```
