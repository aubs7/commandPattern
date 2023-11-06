package commandPattern;

public class TurnOn implements Command {

    private Device device;
    private String deviceName;

    public TurnOn(Device device){
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOn();
    }
}
