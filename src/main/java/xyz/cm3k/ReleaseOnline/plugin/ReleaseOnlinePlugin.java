package xyz.cm3k.ReleaseOnline.plugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class ReleaseOnlinePlugin extends JavaPlugin {
    public static String version = "0.1";

    public static void LogInfo(Object message) {
        Bukkit.getLogger().info(String.valueOf(message));
    }

    @Override
    public void onEnable() {
        LogInfo("Enabling ReleaseOnline");

        this.getCommand("rohelp").setExecutor(new HelpCommand());
        this.getCommand("rules").setExecutor(new RulesCommand());

        NotificationTimer timer1 = new NotificationTimer();
        timer1.start();
        SaveTimer timer2 = new SaveTimer();
        timer2.start();
    }

    @Override
    public void onDisable() {
        LogInfo("Disabling ReleaseOnline");
    }
}