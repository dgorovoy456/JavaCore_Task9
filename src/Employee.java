public class Employee {
    private String firstName;
    private String lastName;
    private String phone;

    public static int numberOfEmloyee =0;

    public Employee(String firstName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;

        numberOfEmloyee++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public static int getNumberOfEmloyee() {
        return numberOfEmloyee;
    }
}

