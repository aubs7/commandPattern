package commandPattern;

public class DecreaseVol implements Command {

    private Device device;
    private String deviceName;

    public DecreaseVol(Device device){
        this.device = device;
    }

    @Override
    public void execute() {
        device.DecreaseVol();
    }

}
