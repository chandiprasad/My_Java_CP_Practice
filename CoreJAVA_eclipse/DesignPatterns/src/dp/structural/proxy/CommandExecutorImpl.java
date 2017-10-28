package dp.structural.proxy;

import java.io.IOException;

public class CommandExecutorImpl implements CommandExecutor {
    @Override
    public void runCommand(String cmd) throws IOException {
        //“Provide a surrogate or placeholder for another
        //object to control access to it”

        //some heavy implementation
        Runtime.getRuntime().exec(cmd);
        System.out.println("'" + cmd + "' command executed.");
    }
}