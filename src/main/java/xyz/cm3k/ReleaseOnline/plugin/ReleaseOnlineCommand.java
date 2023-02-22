package xyz.cm3k.ReleaseOnline.plugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ReleaseOnlineCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        commandSender.sendMessage("=== " + ChatColor.RED + "Release" + ChatColor.BLUE + "Online" + ChatColor.WHITE + " Plugin ===");
        commandSender.sendMessage("Version " + ChatColor.YELLOW + ReleaseOnlinePlugin.version + ChatColor.WHITE);
        commandSender.sendMessage("Licenced under MPL-2.0 (Excluding GPL-3.0 BukkitAPI JAR)");
        commandSender.sendMessage("https://github.com/ReleaseOnline/plugin");
        return false;
    }
}
