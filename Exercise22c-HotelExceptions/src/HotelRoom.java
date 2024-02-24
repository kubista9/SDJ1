public class HotelRoom
{
    private int number;
    private String type;
    private double price;
    private Guest guest;
    private static final double SINGLE_PRICE = 59.50;
    private static final double DOUBLE_PRICE = 68.50;
    private static final double FAMILY_PRICE = 99.25;
    public static final String SINGLE = "Single";
    public static final String DOUBLE = "Double";
    public static final String FAMILY = "Family";

    public HotelRoom (int number, String type)
    {
        this.number = number;

        if (type != SINGLE && type != DOUBLE && type !=FAMILY)
        {
            throw new IllegalArgumentException("Pick a valid room type (single/double/family).");
        }
        this.type = type;
        this.guest = null;
        this.price = price;
    }

    public int getNumber ()
    {
        return number;
    }

    public String getType ()
    {
        return type;
    }

    public double getPrice ()
    {
        return price;
    }

    public Guest getGuest ()
    {
        return guest;
    }

    public int getFloor ()
    {
        int floor;

        if (number >100 && number <200)
        {
            return floor = 1;
        }
        if (number >200 && number <300)
        {
            return floor = 2;
        }
        if (number >300 && number <400)
        {
            return floor = 3;
        }
        if (number >400 && number <500)
        {
            return floor = 4;
        }

        return 0;
    }

    public boolean isOccupied ()
    {
        if (guest != null)
        {
            return true;
        }
        else
            return false;
    }

    public void registerGuest (Guest guest)
    {
        if (isOccupied())
        {
            throw new IllegalStateException("This room is already occupied by another guest.");
        }
        this.guest = guest;
    }

    public void vacate ()
    {
        if (isOccupied())
        {
            this.guest = null;
        }
    }

    public String toString ()
    {
        String s = " ";
        if (isOccupied())
        {
            s+= "Guest info: " + guest + ", Room number: " + number + ", Room type: " + type + "Price for room: " + price;
        }
        else
        {
            s += "Room is available";
        }

        return s;
    }

    public double getRoomPrice(String type)
    {
        switch (type)
        {
            case SINGLE:
                return SINGLE_PRICE;
            case DOUBLE:
                return DOUBLE_PRICE;
            case FAMILY:
                return FAMILY_PRICE;
            default:
                break;
        }

        return price;
    }

}
