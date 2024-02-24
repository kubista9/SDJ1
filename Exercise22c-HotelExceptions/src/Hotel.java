import java.util.ArrayList;

public class Hotel
{
    private String name;
    private ArrayList<HotelRoom> roomList;

    public Hotel (String name, HotelRoom [] rooms)
    {
        if (name == null)
        {
            throw new IllegalArgumentException("Name field cannot be empty. Try again.");
        }
        this.name = name;

        if(roomList.size() < 1 || roomList.size() == 0)
        {
            throw new IllegalArgumentException("Hotel does not have any registered rooms.");
        }

        this.roomList = new ArrayList<>();

    }

    public String getName ()
    {
        return name;
    }

    public int getNumberOfRooms ()
    {
        return roomList.size();
    }

    public int getNumberOfAvailableRooms ()
    {
        int count = 0;
        for (int i=0; i<roomList.size(); i++)
        {
            if (!roomList.get(i).isOccupied())
            {
                count++;
            }
        }
        return count;
    }

    public int getNumberOfAvailableRooms (String roomType)
    {
        int count = 0;
        for (int i=0; i<roomList.size(); i++)
        {
            if (!roomList.get(i).isOccupied() && roomList.get(i).getType().equals(roomType))
            {
                count ++;
            }
        }
        return count;
    }

    public HotelRoom getFirstAvailableRoom ()
    {
        for (int i=0; i<roomList.size(); i++)
        {
            if (!roomList.get(i).isOccupied())
            {
                return roomList.get(i);
            }
        }
        return null;
    }

    public HotelRoom getFirstAvailableRoom (double maxPrice)
    {
        for (int i=0; i<roomList.size(); i++)
        {
            if (!roomList.get(i).isOccupied() && roomList.get(i).getPrice() <= maxPrice)
            {
                return roomList.get(i);
            }
        }
        return null;
    }

    public HotelRoom [] getAllAvailableRooms (String roomType)
    {
        HotelRoom [] allAvailableRooms = new HotelRoom[getNumberOfAvailableRooms(roomType)];

        int index = 0;
        for (int i=0; i<roomList.size(); i++)
        {
            if (roomList.get(i).getType().equals(roomType))
            {
                allAvailableRooms[index] = roomList.get(i);
                index++;
            }
        }
        return allAvailableRooms;
    }

    public boolean hasGuest (Guest guest)
    {
        for (int i=0; i<roomList.size(); i++)
        {
            if (roomList.get(i).isOccupied() && roomList.get(i).getGuest().equals(guest))
            {
                return true;
            }
        }
        return false;
    }

    public HotelRoom getRoom (Guest guest)
    {
        for (int i=0; i < roomList.size(); i++)
        {
            if (hasGuest(guest))
            {
                return roomList.get(i);
            }
        }
        return null;
    }


}
