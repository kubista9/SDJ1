package viewmodel;

import javafx.beans.property.*;
import javafx.fxml.FXML;
import model.Model;
import model.Simulator;

import java.util.regex.Pattern;

public class ManageVinylViewModel
{
  private StringProperty headerProperty;
  private StringProperty nameProperty;
  private StringProperty titleProperty;
  private StringProperty errorProperty;
  private ObjectProperty<Boolean> editableProperty;
  private ViewState state;
  private Model model;
  public ManageVinylViewModel(Model model, ViewState state)
  {
    this.model = model;
    this.state=state;
    headerProperty= new SimpleStringProperty("");
    nameProperty= new SimpleStringProperty("");
    titleProperty = new SimpleStringProperty("");
    editableProperty = new SimpleObjectProperty<>(false);
    errorProperty = new SimpleStringProperty("");
  }
  public void update() {
    if (state.getTitle() != null) {
      if (state.isRemove()) {
        headerProperty.set("Remove Vinyl");
        nameProperty.set("");
        titleProperty.set(state.getTitle());
        editableProperty.set(false);
      }
      if (state.isBorrow()) {
        headerProperty.set("Borrow Vinyl");
        nameProperty.set("");
        titleProperty.set(state.getTitle());
        editableProperty.set(true);
      }
      if (state.isReserve()) {
        headerProperty.set("Reserve Vinyl");
        nameProperty.set("");
        titleProperty.set(state.getTitle());
        editableProperty.set(true);

      }
      if (state.isReturn()) {
        headerProperty.set("Return Vinyl");
        nameProperty.set("");
        titleProperty.set(state.getTitle());
        editableProperty.set(false);

      }
      errorProperty.set("");
    }
  }
  public void reset(){
    update();
  }

  public StringProperty getHeaderProperty() {
    return headerProperty;
  }

  public StringProperty getNameProperty() {
    return nameProperty;
  }
  public StringProperty getTitleProperty() {
    return titleProperty;
  }

  public StringProperty getErrorProperty() {
    return errorProperty;
  }
  public ObjectProperty<Boolean> getEditableProperty() {
    return editableProperty;
  }
  public void accept(){
    try {
      SimpleVinylViewModel selected = new SimpleVinylViewModel(this.model.getByTitle(this.state.getTitle()));
      if(state.isBorrow()){
        model.borrow(nameProperty.get(),selected.titleProperty().get());
      }
      if(state.isReturn()){
        model.returnVinyl(selected.titleProperty().get());
      }
      if(state.isReserve()){
        model.reserve(selected.titleProperty().get(),nameProperty.get());
      }
      if(state.isRemove()){
        model.remove(selected.titleProperty().get());
      }
    }catch (Exception e){
      errorProperty.set(e.getMessage());
    }
  }
}
