package lightningutilities.lightningutilities;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class basiccommands implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (!(sender instanceof Player)){
            return true;
        }
        Player player = (Player) sender;
        if (command.getName().equalsIgnoreCase("discord")){
            player.sendMessage("https://discord.gg/eQDF8PwjXM");
            return true;
        }
        if (command.getName().equalsIgnoreCase("web")){
            player.sendMessage("web.lightning-mc.xyz");
            return true;
        }
        if (command.getName().equalsIgnoreCase("donate")){
            player.sendMessage("https://www.patreon.com/Lightning_mc");
            return true;
        }

        return true;
    }
}
