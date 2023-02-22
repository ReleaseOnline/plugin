package xyz.cm3k.ReleaseOnline;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class RulesCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage("=== " + ChatColor.RED + "Release" + ChatColor.BLUE + "Online" + ChatColor.WHITE + " Rules ===");
        sender.sendMessage("1 - Don't be a d**k (e.g. Threats, Sexism, Racism, Doxing)");
        sender.sendMessage("2 - No Hacks, Hacked Clients or X-Ray Texture Packs");
        sender.sendMessage("3 - No game breaking exploits");
        sender.sendMessage("4 - No unreasonable strings of profanity, one or two here and there is fine, just don't overdo it.");
        sender.sendMessage("5 - No inappropriate skins (e.g. Hitler, Nude Skins, Osama Bin Laden) and names)");
        sender.sendMessage("You'll first get a warning, then a short ban, then a longer ban, then a permanent ban (there is no warnings for hacking/exploiting)");
        sender.sendMessage("\n");
        return false;
    }
}