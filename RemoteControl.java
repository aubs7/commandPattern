package commandPattern;

public class RemoteControl {
    private Command command;
    private Device device;
    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void clickButton(){
        this.command.execute();
    }



}
