package model;

public abstract class VinylState
{
private String reservee;
private boolean deleteFlag;

public VinylState()
{
  this.reservee = null;
  this.deleteFlag = false;
}
public VinylState(String reservee)
{
	this.reservee = reservee;
    this.deleteFlag = false;
}
  public VinylState(String reservee, boolean deleteFlag)
  {
    this.reservee = reservee;
    this.deleteFlag = deleteFlag;
  }

public void borrow(String borrower, Vinyl vinyl)
{
    //nothing
}

public void reserve(String reservee, Vinyl vinyl)
{
  //nothing
}

public void returnVinyl(Vinyl vinyl)
{
    //nothing
}

public String getReservee()
{
  return reservee;
}

public void setReservee(String reservee)
{
  this.reservee = reservee;
}

public boolean getDeleteFlag()
{
  return deleteFlag;
}

public void setDeleteFlag(boolean flag)
{
  this.deleteFlag = flag;
}

public abstract String status();
}
