package xyz.cm3k.ReleaseOnline.plugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.Arrays;

public class HelpCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (Arrays.toString(args).equalsIgnoreCase("[claims]")) {
            sender.sendMessage("=== " + ChatColor.RED + "Release" + ChatColor.BLUE + "Online" + ChatColor.WHITE + " Claims Help ===");
            sender.sendMessage("To create: Get a golden shovel and select the bounds of your claim.");
            sender.sendMessage("To trust a player: " + ChatColor.YELLOW + "/trust <username>" + ChatColor.WHITE + ".");
        }
        else {
            sender.sendMessage("=== " + ChatColor.RED + "Release" + ChatColor.BLUE + "Online" + ChatColor.WHITE + " Help ===");
            sender.sendMessage("For rules run /rules");
            sender.sendMessage("For help with claims run " + ChatColor.YELLOW + "/rohelp claims" + ChatColor.WHITE);
            sender.sendMessage("For help with");
        }
        return false;
    }
}