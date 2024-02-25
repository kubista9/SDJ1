package model;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

public class ModelManager implements Model, PropertyChangeListener{
  private PropertyChangeSupport property;
  private Simulator simulator;
  private VinylList vinylList;
  public ModelManager() throws Exception {
    vinylList = new VinylList();
    this.property = new PropertyChangeSupport(this);
    this.addListener("deletion",this);
    createDummyData();
    this.simulator = new Simulator(this);

  }
  private void createDummyData() throws Exception {
    vinylList.addVinyl("Vinyl 1","Artist 1", 2003);
    vinylList.addVinyl("Vinyl 2","Artist 1", 2003);
    vinylList.addVinyl("Vinyl 3","Artist 3", 2003);
    vinylList.addVinyl("Vinyl 4","Artist 2", 2003);
    System.out.println(vinylList);
  }
  @Override public void addListener(String propertyName,
      PropertyChangeListener listener) {
    if(propertyName==null){ property.addPropertyChangeListener(listener);}
    else {
    property.addPropertyChangeListener(propertyName,listener);}
  }

  @Override public void removeListener(String propertyName,
      PropertyChangeListener listener) {
    property.removePropertyChangeListener(propertyName,listener);
  }

  @Override public ArrayList<Vinyl> getAllVinyls() {
   return vinylList.getALLVinyls();
  }

  @Override public void borrow(String borrower,String title) {
    vinylList.borrowVinyl(borrower,title);
    property.firePropertyChange("borrow","",title);
  }

  @Override public void returnVinyl(String title)
  {
    vinylList.returnVinyl(title);
    if (vinylList.getVinylByTitle(title).getState().status().equals("Free") && this.vinylList.getVinylByTitle(title).getState().getDeleteFlag()==true)
    {property.firePropertyChange("deletion","",title);property.firePropertyChange("return","",title);}
    else if (vinylList.getVinylByTitle(title).getState().status().equals("Free") && this.vinylList.getVinylByTitle(title).getState().getDeleteFlag()==false)
    {
      property.firePropertyChange("return","",title);
    }
    else if (vinylList.getVinylByTitle(title).getState().status().equals("Taken_Unreserved"))
    {
      property.firePropertyChange("return","",title);
    }
    else if (vinylList.getVinylByTitle(title).getState().status().equals("Taken_Reserved"))
    {
      property.firePropertyChange("return","",title);
    }
    else {
      //
    }
    property.firePropertyChange("update","",title);
  }

  @Override public void reserve(String title, String reservee) {
    vinylList.reserveVinyl(title,reservee);
    property.firePropertyChange("reserve","",title);
  }


  @Override public void remove(String title) throws Exception {
    Vinyl vinyl = vinylList.getVinylByTitle(title);
    if(vinyl.getState().status().equals("Free")) vinylList.deleteVinyl(title);
    else {
      vinyl.getState().setDeleteFlag(true);
      System.out.println("Set for deletion");
    }
    property.firePropertyChange("remove","",title);
  }

  @Override public void propertyChange(PropertyChangeEvent evt) {
    if(evt.getPropertyName().equals("deletion")) {
      try {
        vinylList.deleteVinyl(evt.getNewValue().toString());
      }
      catch (Exception e) {
        throw new IllegalArgumentException("No such vinyl witch given title exits");
      }
      System.out.println("Deleted");
    }
  }

  public Vinyl getByTitle(String title){
    return vinylList.getVinylByTitle(title);
  }
}
