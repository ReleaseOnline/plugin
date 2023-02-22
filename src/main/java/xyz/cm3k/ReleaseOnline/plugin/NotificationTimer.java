package xyz.cm3k.ReleaseOnline.plugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class NotificationTimer {
    int notifID = 0;
    long delay = 1200 * 1000;
    LoopTask task = new LoopTask();
    Timer timer = new Timer("AlertTimer");

    public void start() {
        timer.cancel();
        timer = new Timer("AlertTimer");
        Date executionDate = new Date();
        timer.scheduleAtFixedRate(task, executionDate, delay);
    }

    private class LoopTask extends TimerTask {
        public void run() {
            if (notifID == 0) {
                Bukkit.broadcastMessage("Feel free to join the " + ChatColor.DARK_PURPLE + "discord server" + ChatColor.WHITE + "!");
                Bukkit.broadcastMessage("You can find the link at https://releaseonline.cm3k.xyz");
                notifID++;
                return;
            }
            if (notifID == 1) {
                Bukkit.broadcastMessage("ReleaseOnline has a " + ChatColor.AQUA + "Twitter" + ChatColor.WHITE + "!");
                Bukkit.broadcastMessage("https://www.twitter.com/ReleaseOnlineMC");
                notifID++;
                return;
            }
            if (notifID == 2) {
                Bukkit.broadcastMessage("ReleaseOnline has a " + ChatColor.BLUE + "website" + ChatColor.WHITE + "!");
                Bukkit.broadcastMessage("https://releaseonline.cm3k.xyz/");
                notifID = 0;
            }
        }
    }
}