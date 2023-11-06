package commandPattern;

public class IncreaseVol implements Command{

    private Device device;
    private String deviceName;

    public IncreaseVol(Device device){
        this.device = device;
    }

    @Override
    public void execute() {
        device.IncreaseVol();
    }

}
