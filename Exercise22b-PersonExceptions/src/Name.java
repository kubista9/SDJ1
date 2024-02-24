public class Name
{
    private String firstName;
    private String lastName;
    private Person name;

    public Name (String firstName, String lastName)
    {
        if (firstName == null || firstName.length() <= 2)
        {
            throw new IllegalArgumentException("Your name is too short or the field was empty. Try again.");
        }
        if(firstName.contains("1") || firstName.contains("2")){
            throw new IllegalArgumentException("sthhh");
        }
        this.firstName = firstName;

        if (lastName == null || lastName.length() <= 2)
        {
            throw new IllegalArgumentException("Your last name is too short or the field was empty. Try again.");
        }
        this.lastName = lastName;
    }

    public Name (String fullName)
    {
        this.firstName = fullName;
        this.lastName = fullName;
    }

    public String getFirstName ()
    {
        return firstName;
    }

    public String getLastName ()
    {
        return lastName;
    }

    public String getFullName ()
    {
        return firstName + ", " + lastName;
    }

    public String getFormalName ()
    {
        return lastName + ", " + firstName;
    }

    public String toString ()
    {
        return firstName + ", " + lastName;
    }


}
