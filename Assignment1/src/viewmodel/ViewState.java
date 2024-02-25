package viewmodel;

public class ViewState
{
  private String title;
  private boolean borrow;
  private boolean isReturn;
  private boolean remove;
  private boolean reserve;

  public ViewState(){
    title = null;
    remove = false;
    borrow = false;
    isReturn = false;
    reserve = false;
  }

  public String getTitle() {
    return title;
  }

  public ViewState setTitle(String title) {
    this.title = title;
    return this;
  }

  public void borrow() {
    borrow=true;
    remove = false;
    isReturn = false;
    reserve = false;
  }

  public boolean isBorrow() {
    return borrow;
  }

  public boolean isReturn() {
    return isReturn;
  }

  public void setReturn() {
    borrow=false;
    remove = false;
    isReturn = true;
    reserve = false;
  }

  public boolean isRemove() {
    return remove;
  }

  public void remove() {
    borrow=false;
    remove = true;
    isReturn = false;
    reserve = false;
  }

  public boolean isReserve() {
    return reserve;
  }

  public void setReserve() {
    borrow=false;
    remove = false;
    isReturn = false;
    reserve = true;
  }
}
