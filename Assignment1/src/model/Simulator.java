package model;

import java.util.ArrayList;

public class Simulator
{
  private Thread t;
  public Simulator(Model model){
    this.t = new Thread(() -> {
      String[] bidders = { "Bob", "Wendy" };
      for (int i = 0; i < 1; i++)
      {
        ArrayList<Vinyl> vinyls = model.getAllVinyls();
        for(int j=0;j<vinyls.size();j++)
        {
          model.borrow(bidders[j%2],vinyls.get(j).getTitle());
          try
          {
            Thread.sleep(3000);
          }
          catch (InterruptedException e)
          {
            break;
          }
        }
        for(int j=0;j<vinyls.size();j++)
        {
          model.reserve(vinyls.get(j).getTitle(),bidders[j%2]);
          try
          {
            Thread.sleep(3000);
          }
          catch (InterruptedException e)
          {
            break;
          }
        }
        for(int j=0;j<vinyls.size();j++)
        {
          model.returnVinyl(vinyls.get(j).getTitle());
          try
          {
            Thread.sleep(3000);
          }
          catch (InterruptedException e)
          {
            break;
          }
        }
        for(int j=0;j<vinyls.size();j++)
        {
          try {
            model.remove(vinyls.get(j).getTitle());
          }
          catch (Exception e) {
            System.out.println(e.getMessage());
          }
          try
          {
            Thread.sleep(3000);
          }
          catch (InterruptedException e)
          {
            break;
          }
        }
        for(int j=0;j<vinyls.size();j++)
        {
          model.borrow(bidders[j%2],vinyls.get(j).getTitle());
          try
          {
            Thread.sleep(3000);
          }
          catch (InterruptedException e)
          {
            break;
          }
        }
        for(int j=0;j<vinyls.size();j++)
        {
          model.returnVinyl(vinyls.get(j).getTitle());
          try
          {
            Thread.sleep(3000);
          }
          catch (InterruptedException e)
          {
            break;
          }
        }

        try
        {
          Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
          break;
        }
      }
    });
    t.start();
  }
  public void stop (){
    t.interrupt();
  }
}
