package command.commands;

import command.receiver.Light;

public class LightOnCommand implements Command{
    Light light;

    public LightOnCommand (Light light) {
        this.light=light;
    }
    @Override
    public void execute() {
        light.on();
    }
}
