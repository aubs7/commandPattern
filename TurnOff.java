package commandPattern;

public class TurnOff implements Command {
    private Device device;
    private String deviceName;

    public TurnOff(Device device){
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOff();
    }
}
