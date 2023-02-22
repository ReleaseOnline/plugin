package xyz.cm3k.ReleaseOnline;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class SaveTimer {
    // big ups stackoverflow for like all this code
    long delay = 60 * 1000; // delay in milliseconds
    LoopTask task = new LoopTask();
    Timer timer = new Timer("SaveTimer");

    public void start() {
        timer.cancel();
        timer = new Timer("SaveTimer");
        Date executionDate = new Date(); // no params = now
        timer.scheduleAtFixedRate(task, executionDate, delay);
    }

    private static class LoopTask extends TimerTask {
        public void run() {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {throw new RuntimeException(e);}
            // Sends two messages to ops chats, v annoying
            // Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "save-all");
            Command.broadcastCommandMessage(Bukkit.getConsoleSender(), "save-all");
        }
    }
}