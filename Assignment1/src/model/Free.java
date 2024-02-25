package model;

import external.NamedPropertySubject;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.PriorityQueue;

public class Free extends VinylState implements NamedPropertySubject
{
  private PropertyChangeSupport property;
  public Free(String reservee, boolean deleteFlag, Vinyl vinyl)
  {
    super(reservee, deleteFlag);
    property = new PropertyChangeSupport(this);
    if(this.getDeleteFlag()==true) property.firePropertyChange("deletion","",vinyl.getTitle());
  }
  @Override
  public void borrow(String borrower, Vinyl vinyl)
  {
    if (!super.getDeleteFlag())
    {
      vinyl.setState(new Taken_Unreserved(super.getReservee(), super.getDeleteFlag()));
      System.out.println(borrower + " borrowed " + vinyl.getTitle());
    }
  }
  @Override
  public void reserve(String reservee, Vinyl vinyl)
  {
    if (!super.getDeleteFlag())
    {
      vinyl.setState(new Free_Reserved(reservee, super.getDeleteFlag()));
      System.out.println(reservee + " reserved " + vinyl.getTitle());

    }
  }

  @Override public void addListener(String propertyName,
      PropertyChangeListener listener) {
    property.addPropertyChangeListener(propertyName,listener);
  }

  @Override public void removeListener(String propertyName,
      PropertyChangeListener listener) {
    property.removePropertyChangeListener(propertyName,listener);
  }
  public String status()
  {
    return "Free";
  }

}
