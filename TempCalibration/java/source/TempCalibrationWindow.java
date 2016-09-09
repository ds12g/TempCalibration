import javax.swing.*;
import java.awt.*;

public class TempCalibrationWindow extends JFrame{

  ExecuteCalibration cal = new ExecuteCalibration(this);


  JPanel row1 = new JPanel();
  JLabel initialTemp = new JLabel("Initial Temperature (K)", JLabel.CENTER);
  JLabel finalTemp = new JLabel("Final Temperature (K)",JLabel.CENTER);
  JLabel initialRes = new JLabel("Initial Resistance (Ohm)",JLabel.CENTER);
  JLabel finalRes = new JLabel("Final Resistance (Ohm)",JLabel.CENTER);

  JPanel row2 = new JPanel();
  JTextField initialTempInput = new JTextField("0");
  JTextField finalTempInput = new JTextField("0");
  JTextField initialResInput = new JTextField("0");
  JTextField finalResInput = new JTextField("0");

  JPanel row3 = new JPanel();
  ButtonGroup temp = new ButtonGroup();
  JLabel tempLabel = new JLabel("Desired Temperature Scale: ");
  JCheckBox celsius = new JCheckBox("Celsius",false);
  JCheckBox kelvin = new JCheckBox("Kelvin",false);
  //JCheckBox farenheit = new JCheckBox("Farenheit",false);

  JPanel row4 = new JPanel();
  JButton calibrate = new JButton("Calibrate");
  JButton reset = new JButton("Reset");
  JLabel equation = new JLabel("T(x) = \n");
  JPanel lastRow = new JPanel();


  public TempCalibrationWindow(){
    super("Temperature Calibration");
    setSize(750,300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

// Sets Overall Window Layout
    GridLayout layout = new GridLayout(5,2,10,10);
    setLayout(layout);
    celsius.addItemListener(cal);
    kelvin.addItemListener(cal);
  //  farenheit.addItemListener(cal);
    calibrate.addActionListener(cal);
    reset.addActionListener(cal);
    initialTempInput.addActionListener(cal);
    finalTempInput.addActionListener(cal);
    initialResInput.addActionListener(cal);
    finalResInput.addActionListener(cal);

    GridLayout grid1 = new GridLayout(1,4,10,10);
    row1.setLayout(grid1);
    row1.add(initialTemp);
    row1.add(finalTemp);
    row1.add(initialRes);
    row1.add(finalRes);
    add(row1);

    GridLayout grid2 = new GridLayout(1,4,5,5);
    row2.setLayout(grid2);
    row2.add(initialTempInput);
    row2.add(finalTempInput);
    row2.add(initialResInput);
    row2.add(finalResInput);
    add(row2);


    FlowLayout flo = new FlowLayout(FlowLayout.CENTER,10,10);
    // group checkboxes together
    temp.add(celsius);
    temp.add(kelvin);
  //  temp.add(farenheit);
    row3.add(tempLabel);
    row3.add(celsius);
    row3.add(kelvin);
//    row3.add(farenheit);
    add(row3);

    FlowLayout flo2 = new FlowLayout(FlowLayout.CENTER);
    row4.setLayout(flo2);
    row4.add(calibrate);
    row4.add(reset);
    add(row4);

    lastRow.setLayout(flo2);
    lastRow.add(equation);
    add(lastRow);


    setVisible(true);
  }

public static void main(String[] args){

  TempCalibrationWindow open = new TempCalibrationWindow();

  }

}
