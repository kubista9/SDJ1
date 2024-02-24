public class Guest
{
    private String name;
    private long phone;

    public Guest (String name, long phone)
    {
        if (name == null)
        {
            throw new IllegalArgumentException("Name field cannot be empty. Try again.");
        }
        this.name = name;
        this.phone = phone;
    }

    public String getName ()
    {
        return name;
    }

    public long getPhone ()
    {
        return phone;
    }

    public boolean equals (Object obj)
    {
        if (this == obj)
        {
            return true;
        }

        if (!(obj instanceof Guest))
        {
            return false;
        }

        Guest other = (Guest) obj;
        return name.equals(other.name) && phone == other.phone;
    }

    public String toString ()
    {
        return "Guest name: " + name + ", Guest phone number: " + phone;
    }
}
