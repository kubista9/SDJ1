public class Person
{
    private Name name;
    private MyDate birthday;
    private char gender;

    public Person(Name name, MyDate birthday, char gender)
    {
        setName(name);
        if (birthday == null)
        {
            throw new IllegalArgumentException("Your birthday field cannot be empty. Try again.");
        }
        this.birthday = birthday.copy();
        setGender(gender);
    }

    public Person(Name name, char gender)
    {
        this(name,new MyDate(),gender);
    }

    public Person(String john, char gender)
    {
        this(null, new MyDate(), gender);
    }

    public Name getName()
    {
        return name;
    }

    public int getAge()
    {
        MyDate today = new MyDate();
        return birthday.yearsBetween(today);
    }

    public char getGender()
    {

        return gender;
    }

    public MyDate getBirthday()
    {
        return birthday.copy();
    }

    public String getAgeStatus()
    {
        if (getAge() < 0)
            return "Error";
        else if (0 < getAge() && getAge() <=12)
            return "Child";
        else if (12 < getAge() && getAge() <=19)
            return "Teenager";
        else if (19 < getAge() && getAge() <= 65)
            return "Adult";
        else
            return "Senior citizen";

    }

    public void setName(Name name)
    {
        if (name == null)
        {
            throw new IllegalArgumentException("Name field cannot be empty. Please type in your name.");
        }
        this.name = name;
    }


    public void setGender(char gender)
    {


        if (gender != 'M' && gender !='F')
        {
            if (gender == 'm')
            {
                gender = 'M';
            }
            else if (gender == 'f')
            {
                gender = 'F';
            }
            else
            {
                throw new IllegalArgumentException("You can only choose a gender between F and M. Try again.");
            }

        }

        this.gender = gender;
    }

    public String getStatus()
    {
        if (getAge()<0)
            return "Error";
        else if (getAge() >= 18 && (gender == 'M' || gender == 'm'))
            return "Man";
        else if (getAge() <= 18 && (gender == 'M' || gender == 'm'))
            return "Boy";
        else if (getAge() >= 18 && (gender == 'F' || gender == 'f'))
            return "Woman";
        else return "Girl";
    }

    public String toString()
    {
        String all = name.getFullName() + ", birthday=" + birthday.toString() + ", age=" + getAge() + ", gender=" + gender;
        return all;
    }

    public boolean equals (Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof Person))
        {
            return false;
        }

        Person other = (Person) obj;
        if (name == null)
        {
            return null == other.name && birthday.equals(other.birthday) && gender==other.gender;
        }

        return name.getFullName().equals(other.name.getFullName()) && birthday.equals(other.birthday) && gender==other.gender;

    }


}
