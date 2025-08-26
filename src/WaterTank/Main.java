package WaterTank;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        WaterTank tank = null;

        String choice = JOptionPane.showInputDialog("Choose Tank:\n1. HomeTank\n2. BuildingTank");
        if (choice.equals("1")) {
        	tank = new HomeTank();
        	JOptionPane.showMessageDialog(null, "Home Tank selected. Capacity: 200L");
        }
        else if(choice.equals("2") ) {
        	tank = new BuildingTank();
        	JOptionPane.showMessageDialog(null, "Building Tank selected. Capacity: 1000L");
        }
        else {
        	JOptionPane.showMessageDialog(null, "Invalid Choice. Please try again.");
        	return;
       
        }

        while (true) {
            String action = JOptionPane.showInputDialog("1. Fill\n2. Use\n3. Status\n4. Exit");

            if (action.equals("1")) {
                int liters = Integer.parseInt(JOptionPane.showInputDialog("Liters to fill:"));
                tank.fillTank(liters);
            } else if (action.equals("2")) {
                int liters = Integer.parseInt(JOptionPane.showInputDialog("Liters to use:"));
                tank.useWater(liters);
            } else if (action.equals("3")) {
                tank.checkStatus();
            } else break;
            

            if (tank.currentWaterLevel == 0 || tank.currentWaterLevel == tank.capacity) {
                tank.checkStatus();
                break;
            }
        }

        JOptionPane.showMessageDialog(null, "Program ended.");
    }
}
