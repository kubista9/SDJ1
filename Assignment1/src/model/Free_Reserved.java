package model;

public class Free_Reserved extends VinylState
{
  public Free_Reserved(String reservee, boolean deleteFlag)
  {
    super(reservee, deleteFlag);
  }
  @Override
  public void borrow(String borrower, Vinyl vinyl)
  {
    if (borrower.equals(super.getReservee()))
      vinyl.setState(new Taken_Unreserved(super.getReservee(), super.getDeleteFlag()));
    System.out.println(borrower + " borrowed " + vinyl.getTitle());

  }
  public String status()
  {
    return "Free_Reserved";
  }

}
