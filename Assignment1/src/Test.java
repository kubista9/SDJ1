import model.Model;
import model.ModelManager;
import model.Simulator;

public class Test {
  public static void main(String[] args) throws Exception {
    Model model = new ModelManager();
    Simulator simulator = new Simulator(model);
  }
}
