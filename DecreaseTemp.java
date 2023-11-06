package commandPattern;

public class DecreaseTemp implements Command{

    private Device device;
    private String deviceName;

    public DecreaseTemp(Device device){
        this.device = device;
    }

    @Override
    public void execute() {
        device.DecreaseTemp();
    }

}
