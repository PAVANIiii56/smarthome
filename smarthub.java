import java.util.*;
public class smarthub {
    private String ownername;
    private ArrayList<Device> devicelist;
    public smarthub(String ownername){
        this.ownername  = ownername;
        this.devicelist = new ArrayList<>(); 
    }
    public void addDevice(Device device){
        devicelist.add(device);
        System.out.println(device.DeviceName + " has been added to the system.");
    }
    public void removeDevice(Device device) {
        devicelist.remove(device);
        System.out.println(device.DeviceName + " has been removed from the system.");
    }
    public void listDevices() {
        System.out.println("Listing all devices:");
        for (Device device : devicelist) {
            device.getStatus();
        }
    }
    public void controlDevice(Device device,String action){
        action = action.toLowerCase();
        if(action == "on") {
            device.turnon();
        }
        else if(action == "off"){
            device.turnoff();
        }
    }

}
