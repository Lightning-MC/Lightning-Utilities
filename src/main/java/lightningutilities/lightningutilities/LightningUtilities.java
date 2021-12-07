package lightningutilities.lightningutilities;

import org.bukkit.plugin.java.JavaPlugin;

public final class LightningUtilities extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        basiccommands commands = new basiccommands();
        System.out.println("Loading Lightning Utilities");
        getCommand("discord").setExecutor(commands);
        getCommand("web").setExecutor(commands);
        System.out.println("Loaded Lightning-Utilities");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("unloading Lightning Utilities");
        System.out.println("disabled Lightning-Utilities");
    }
}
