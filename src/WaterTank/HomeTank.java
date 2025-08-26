package WaterTank;

import javax.swing.*;

public class HomeTank extends WaterTank {
    HomeTank() {
        super(200);
    }

    public void fillTank(int liters) {
    	currentWaterLevel += liters;
        if (currentWaterLevel > capacity) currentWaterLevel = capacity;
        JOptionPane.showMessageDialog(null, 
        		liters + " liters added. Current level: " + currentWaterLevel + "/" + capacity);
    }

    public void useWater(int liters) {
    	currentWaterLevel -= liters;
        if (currentWaterLevel < 0) currentWaterLevel = 0;
        JOptionPane.showMessageDialog(null, 
        		liters + " liters used. Current level: " + currentWaterLevel + "/" + capacity);
    }

    public void checkStatus() {
        if (currentWaterLevel == 0) {
        	JOptionPane.showMessageDialog(null, "Tank is Empty");
        }
        else if (currentWaterLevel == capacity) JOptionPane.showMessageDialog(null, "Tank is Full");
        else JOptionPane.showMessageDialog(null, "Tank is In Use");
    }
    
}


