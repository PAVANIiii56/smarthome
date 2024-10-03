public class maain {
    public static void main(String[] args) {
        smarthub sm = new smarthub("pavani");
        //create smart devices;
        smartlight li = new smartlight("living room light", "001");
        smartlight ha = new smartlight("hall light", "002");
        // add devices to the hub
        sm.addDevice(li);
        sm.addDevice(ha);

        sm.listDevices();

        sm.controlDevice(li, "on");
        li.adjustBrightness(80);
        li.changeColor("dark");

        sm.controlDevice(ha, "on");
        li.adjustBrightness(70);
        li.changeColor("bright");

        li.Scheduleon("18:00");
        li.Scheduleoff("22:00");

    }
}
