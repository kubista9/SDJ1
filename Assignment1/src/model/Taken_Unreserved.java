package model;

public class Taken_Unreserved extends VinylState
{
  public Taken_Unreserved(String reservee, boolean deleteFlag)
  {
    super(reservee, deleteFlag);
  }
  @Override
  public void returnVinyl(Vinyl vinyl)
  {
    vinyl.setState(new Free(super.getReservee(), super.getDeleteFlag(), vinyl));
    System.out.println(" Returned " + vinyl.getTitle());

  }

  @Override
  public void reserve(String reservee, Vinyl vinyl)
  {
    if (!super.getDeleteFlag())
    {
      vinyl.setState(new Taken_Reserved(reservee, super.getDeleteFlag()));
      System.out.println(reservee + " reserved " + vinyl.getTitle());

    }
  }
  public String status()
  {
    return "Taken_Unreserved";
  }

}
