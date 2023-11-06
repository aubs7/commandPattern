package commandPattern;

public class ViewerApp {
    public static void main(String[] args){
        Device lights = new Device("light");
        Device thermostat = new Device("thermostat");
        Device musicPlayer = new Device("music player");

        TurnOn turnOnLights = new TurnOn(lights);
        TurnOff turnOffLights = new TurnOff(lights);
        TurnOn turnOnThermostat = new TurnOn(thermostat);
        TurnOff turnOffThermostat = new TurnOff(thermostat);
        TurnOn turnOnMusicPlayer = new TurnOn(musicPlayer);
        TurnOff turnOffMusicPlayer = new TurnOff(musicPlayer);
        IncreaseTemp increaseTemp = new IncreaseTemp(thermostat);
        IncreaseTemp decreaseTemp = new IncreaseTemp(thermostat);
        IncreaseVol increaseVol = new IncreaseVol(musicPlayer);
        DecreaseVol decreaseVol = new DecreaseVol(musicPlayer);

        RemoteControl rc = new RemoteControl();

            //turning on lights
            rc.setCommand(turnOnLights);
            rc.clickButton();

            //turning off lights
            rc.setCommand(turnOffLights);
            rc.clickButton();

        System.out.println();

            //turning on thermostat
            rc.setCommand(turnOnThermostat);
            rc.clickButton();

            //increase thermostat temperature
            rc.setCommand(increaseTemp);
            rc.clickButton();

            //decrease thermostat temperature
            rc.setCommand(decreaseTemp);
            rc.clickButton();

            //turning off thermostat
            rc.setCommand(turnOffThermostat);
            rc.clickButton();

        System.out.println();

            //turning on music player
            rc.setCommand(turnOnMusicPlayer);
            rc.clickButton();

            //increase volume
            rc.setCommand(increaseVol);
            rc.clickButton();

            //dencrease volume
            rc.setCommand(decreaseVol);
            rc.clickButton();

            //turning off music player
            rc.setCommand(turnOffMusicPlayer);
            rc.clickButton();




    }
}
