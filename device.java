abstract class Device{
    protected String DeviceName;
    protected String DeviceId;
    protected boolean status;
    public Device(String Devicename,String DeviceId){
        this.DeviceName = Devicename;
        this.DeviceId = DeviceId;
        this.status = false; // devices are off by default
    }
    abstract public void turnon();
    abstract public void turnoff();
    abstract public void getStatus();

}