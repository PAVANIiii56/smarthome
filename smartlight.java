class smartlight extends Device implements control{
    int Brightness;
    String mode;
    public smartlight(String DeviceName,String DeviceId){
        super(DeviceName, DeviceId);
        this.Brightness = 50;
        this.mode = "bright";
    }
    public void turnon(){
        status = true;
        System.out.println(DeviceName+ "is now turned ON");
    }
    public void turnoff(){
        status = false;
        System.out.println(DeviceName+ "is now turned OFF");
    }
    public void getStatus(){
        System.out.println(DeviceName+ "is Currently "+(status?"ON":"OFF"));
    }
    public void adjustBrightness(int level){
        this.Brightness = level;
        System.out.println(DeviceName+" brightness set to "+Brightness);
    }
    public void changeColor(String color) {
        this.mode = color;
        System.out.println(DeviceName + " color changed to " + color + ".");
    }
    public void Scheduleon(String time){
        System.out.println(DeviceName + " will turn ON at " + time);
    }
    public void Scheduleoff(String time){
        System.out.println(DeviceName + " will turn OFF at " + time);
    }
}
