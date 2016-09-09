import javax.swing.*;
import java.awt.event.*;

public class ExecuteCalibration implements ItemListener, ActionListener{

  TempCalibrationWindow window;
   private double initialTemp;
   private double finalTemp;
   private double initialRes;
   private double finalRes;
   private String command = "";
   private boolean kelvin;
   private boolean celsius;

  public ExecuteCalibration(TempCalibrationWindow gui){
    window = gui;
  }

  public void actionPerformed(ActionEvent event){

    command = event.getActionCommand();
    initialTemp = Double.valueOf(window.initialTempInput.getText());
    finalTemp = Double.valueOf(window.finalTempInput.getText());
    initialRes = Double.valueOf(window.initialResInput.getText());
    finalRes = Double.valueOf(window.finalResInput.getText());

    if (command == "Calibrate"){
      command = "Calibrate";
      if(kelvin){
      calibrate();
        }
      if(celsius){
        calibrateWithCelsius();
      }
    }
    if (command == "Reset"){
      command = "Reset";
      clearAllFields();
    }
  }

  void calibrate(){

    double slope = (finalTemp - initialTemp)/(finalRes - initialRes);
    window.equation.setText("T(x) = "+slope+"(x - "+finalRes+") + "+ finalTemp);

  }


void clearAllFields(){

  window.initialTempInput.setText("0");
  window.finalTempInput.setText("0");
  window.initialResInput.setText("0");
  window.finalResInput.setText("0");
  window.equation.setText("T(x) = ");

  }

  public void itemStateChanged(ItemEvent event){

    Object item = event.getItem();
    if(item == window.kelvin ){
      kelvin = true;
      celsius = false;
    }else if(item == window.celsius ){
      celsius = true;
      kelvin = false;
    }else{
    }
  }

  void calibrateWithCelsius(){
    double slope = (finalTemp - initialTemp)/(finalRes - initialRes);
    window.equation.setText("T(x) = " + slope + "(x - "+ finalRes +") + " + (finalTemp - 273.15));
  }
}
