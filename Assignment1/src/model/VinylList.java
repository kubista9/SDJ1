package model;

import java.util.ArrayList;

public class VinylList
{
  public ArrayList<Vinyl> vinyls;

  public VinylList()
  {
    vinyls = new ArrayList<Vinyl>();
  }
  public void addVinyl(String title, String artist, int year) throws Exception
  {
    for (Vinyl vin: vinyls)
    {
      if(vin.getTitle().equals(title)){throw new Exception("Vinyl witch such title already exits");}
    }
    vinyls.add(new Vinyl(title,artist,year));
  }
  public void deleteVinyl(String title) throws Exception {
    boolean flag = false;
    for (Vinyl vin: vinyls)
    {
      if(vin.getTitle().equals(title))
      {
        vinyls.remove(vin);
        flag=true;
        break;
      }
    }
    if(flag==false) throw new Exception("No such vinyl witch given title exits");
  }
  public ArrayList<Vinyl> getALLVinyls()
  {
    ArrayList<Vinyl> tempVinylList = new ArrayList<Vinyl>(vinyls);
    return tempVinylList;
  }

  public void borrowVinyl(String borrower, String title)
  {
    for (Vinyl vin: vinyls)
    {
      if(vin.getTitle().equals(title)){vin.borrow(borrower);break;}
    }
  }
  public void returnVinyl(String title)
  {
    for (Vinyl vin: vinyls)
    {
      if(vin.getTitle().equals(title)){vin.returnVinyl();break;}
    }
  }
  public void reserveVinyl(String title ,String reservee)
  {
    for (Vinyl vin: vinyls)
    {
      if(vin.getTitle().equals(title))
      {
        vin.reserve(reservee);
        break;
      }
    }
  }
  public Vinyl getVinylByTitle(String title)
  {
    for (Vinyl vin: vinyls)
    {
      if(vin.getTitle().equals(title)){return vin;}
    }
    throw new IllegalArgumentException("No such vinyl with given title exists (VinylList.getVinylByTitle())");
  }

}
