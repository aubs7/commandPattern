package commandPattern;

public class Device {
    private String device;
    public Device(String device){
        this.device = device;
    }

    public void turnOn() {
        System.out.println("Your " + device + " is on.");
        if(device == "light"){
            System.out.println("~Changing the brightness to your liking.~");
        } else if (device == "thermostat"){
            System.out.println("~Regulating your room temperature.~");
        } else if (device == "music player") {
            System.out.println("~Playing your recent playlist~");
        } else {
            System.out.println("~Hope you're having fun!~");
        }
    }

    public void turnOff() {
        System.out.println("Your " + device + " is off.");
    }

    public void IncreaseTemp() {
        System.out.println("Your " + device + " is increasing temperature.");
    }

    public void DecreaseTemp() {
        System.out.println("Your " + device + " is decreasing temperature.");
    }

    public void IncreaseVol() {
        System.out.println("Your " + device + " is increasing volume.");
    }

    public void DecreaseVol() {
        System.out.println("Your " + device + " is decreasing volume.");
    }
}
