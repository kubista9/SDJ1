package model;

import external.NamedPropertySubject;

import java.util.ArrayList;

public interface Model extends NamedPropertySubject {
  public ArrayList<Vinyl> getAllVinyls();
  public void borrow(String borrower,String title);
  public void returnVinyl(String title);
  public void reserve(String title, String reservee);
  public void remove(String title) throws Exception;
  public Vinyl getByTitle(String title);
}
