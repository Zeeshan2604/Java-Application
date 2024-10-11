
import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;
    private String companySuffix = "txscompany.com";

    // Constructor to receive the first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        // Call a method asking for department code - return the department
        this.department = setDepartment();

        // Call a method to return a random password
        this.password = randomPassword(8);
        System.out.println("Generated Password: " + this.password);

        // Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;

    }

    // Ask for department
    private String setDepartment() {
        System.out.println("New Employee: " + firstName + " - Department codes: 1 for IT | 2 for Sales | 3 for Accounting | 0 for none | Enter the dept. code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        return switch (depChoice) {
            case 1 ->
                "IT";
            case 2 ->
                "Sales";
            case 3 ->
                "Accounting";
            default ->
                "";
        };

    }

    // Generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);

        }
        return new String(password);
    }

    // Set the mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    // Set the alternate email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    // Change password
    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo() {
        return "DISPLAY NAME: " + firstName + " " + lastName
                + "\nCOMPANY EMAIL: " + email
                + "\nALT EMAIL: " + alternateEmail
                + "\nPASSWORD: " + password
                + "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
    }
}
