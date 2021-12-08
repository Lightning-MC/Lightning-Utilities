package lightningutilities.lightningutilities;
import org.bukkit.plugin.java.JavaPlugin;

public final class LightningUtilities extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        basiccommands commands = new basiccommands();
        getServer().getConsoleSender().sendMessage("Loading Lightning-Utilities");
        getServer().getConsoleSender().sendMessage("Hello, World!");
        getCommand("discord").setExecutor(commands);
        getCommand("web").setExecutor(commands);
        getCommand("donate").setExecutor(commands);
        getCommand("helloworld").setExecutor(commands);
        getServer().getConsoleSender().sendMessage("Loaded Lightning-Utilities");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage("unloading Lightning Utilities");
        getServer().getConsoleSender().sendMessage("disabled Lightning-Utilities");
    }
}
