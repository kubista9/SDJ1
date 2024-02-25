package view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.stage.Stage;
import viewmodel.ViewModelFactory;

public class ViewHandler
{
  private Scene currentScene;
  private Stage primaryStage;
  private ViewModelFactory viewModelFactory;
  private ListVinylViewController listVinylViewController;
  private ManageVinylViewController manageVinylViewController;

  public ViewHandler(ViewModelFactory viewModelFactory)
  {
    this.viewModelFactory = viewModelFactory;
    currentScene = new Scene(new Region());
  }

  public void start(Stage primaryStage)
  {
    this.primaryStage = primaryStage;
    openView("list");
  }

  public void openView(String id)
  {
    Region root = null;
    switch (id)
    {
      case "vinyl":
        root = loadManageVinylView("ManageVinylView.fxml");
        break;
      case "list":
        root = loadListVinylView("ListVinylView.fxml");
    }
    currentScene.setRoot(root);
    String title = "";
    if (root.getUserData() != null)
    {
      title += root.getUserData();
    }
    primaryStage.setTitle(title);
    primaryStage.setScene(currentScene);
    primaryStage.setWidth(root.getPrefWidth());
    primaryStage.setHeight(root.getPrefHeight());
    primaryStage.show();
  }

  public void closeView()
  {
    primaryStage.close();
  }

  private Region loadListVinylView(String fxmlFile)
  {
    if (listVinylViewController == null)
    {
      try
      {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(fxmlFile));
        Region root = loader.load();
        listVinylViewController = loader.getController();
        listVinylViewController.init(this, viewModelFactory.getListVinylViewModel(), root);
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    }
    else
    {
      listVinylViewController.reset();
    }
    return listVinylViewController.getRoot();
  }

  private Region loadManageVinylView(String fxmlFile)
  {
    if (manageVinylViewController == null)
    {
      try
      {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(fxmlFile));
        Region root = loader.load();
        manageVinylViewController = loader.getController();
        manageVinylViewController.init(this, viewModelFactory.getManageVinylViewModel(), root);
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    }
    else
    {
      manageVinylViewController.reset();
    }
    return manageVinylViewController.getRoot();
  }
}
