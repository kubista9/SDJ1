package view;

import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Region;
import viewmodel.ListVinylViewModel;
import viewmodel.SimpleVinylViewModel;

public class ListVinylViewController
{

  @FXML private TableView<SimpleVinylViewModel> vinylTable;

  @FXML private TableColumn<SimpleVinylViewModel,String> numberColumn; // Title

  @FXML private TableColumn<SimpleVinylViewModel,String> numberColumn1; // Author

  @FXML private TableColumn<SimpleVinylViewModel,Number> topicColumn; // year
  @FXML private TableColumn<SimpleVinylViewModel,String> completedColumn; // status
  @FXML private Label errorLabel;
  private Region root;
  private viewmodel.ListVinylViewModel listVinylViewModel;
  private ViewHandler viewHandler;

  public void init(ViewHandler viewHandler, ListVinylViewModel listVinylViewModel, Region root)
  {
    this.root = root;
    this.viewHandler = viewHandler;
    this.listVinylViewModel = listVinylViewModel;
    errorLabel.textProperty().bind(listVinylViewModel.errorPropertyProperty());
    numberColumn.setCellValueFactory(cellData-> cellData.getValue().titleProperty());
    numberColumn1.setCellValueFactory(cellData-> cellData.getValue().artistPropertyProperty());
    topicColumn.setCellValueFactory(cellData-> cellData.getValue().yearPropertyProperty());
    completedColumn.setCellValueFactory(cellData-> cellData.getValue().statePropertyProperty());
    vinylTable.setItems(listVinylViewModel.getList());
    vinylTable.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> listVinylViewModel.setSelected(newVal));
  }
  public void reset()
  {
    listVinylViewModel.loadFromModel();
  }
  public Region getRoot()
  {
    return this.root;
  }
  @FXML private void removeButton()
  {
    try
    {
      listVinylViewModel.remove();
      viewHandler.openView("vinyl");
    }
    catch (Exception e)
    {
      errorLabel.setText(e.getMessage());
    }

  }
  @FXML private void borrowButton()
  {
    try
    {
      listVinylViewModel.borrow();
      viewHandler.openView("vinyl");
    }
    catch (Exception e)
    {
      errorLabel.setText(e.getMessage());
    }

  }
  @FXML private void returnButton()
  {
    try
    {
      listVinylViewModel.returnVinyl();
      viewHandler.openView("vinyl");
    }
    catch (Exception e)
    {
      errorLabel.setText(e.getMessage());
    }
  }
  @FXML private void reserveButton()
  {
    try
    {
      listVinylViewModel.reserve();
      viewHandler.openView("vinyl");
    }
    catch (Exception e)
    {
      errorLabel.setText(e.getMessage());
    }

  }
}
