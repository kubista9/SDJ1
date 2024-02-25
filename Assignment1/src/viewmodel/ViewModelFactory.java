package viewmodel;

import model.Model;

public class ViewModelFactory
{
  private ListVinylViewModel listVinylViewModel;
  private ManageVinylViewModel manageVinylViewModel;
  private ViewState state;

  public ViewModelFactory (Model model)
  {
    state = new ViewState();
    listVinylViewModel = new ListVinylViewModel(model, state);
    manageVinylViewModel = new ManageVinylViewModel(model, state);
  }

  public ListVinylViewModel getListVinylViewModel()
  {
    return listVinylViewModel;
  }

  public ManageVinylViewModel getManageVinylViewModel()
  {
    return manageVinylViewModel;
  }
}
