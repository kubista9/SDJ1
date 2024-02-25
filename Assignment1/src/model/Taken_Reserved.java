package model;

public class Taken_Reserved extends VinylState
{
  public Taken_Reserved(String reservee, boolean deleteFlag)
  {
    super(reservee, deleteFlag);
  }
  @Override
  public void returnVinyl(Vinyl vinyl)
  {
    vinyl.setState(new Free_Reserved(super.getReservee(), super.getDeleteFlag()));
    System.out.println(" Returned " + vinyl.getTitle());

  }
  public String status()
  {
    return "Taken_Reserved";
  }

}
