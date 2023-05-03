package poishiispp.poishiispp;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import poishiispp.poishiispp.commands.ohkoToggle;
import poishiispp.poishiispp.handlers.oneHitKO;

public final class PoishiisPP extends JavaPlugin {
    private oneHitKO ohko;

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("hello World");
        ohko = new oneHitKO(this);
       // Bukkit.getPluginManager().registerEvents(ohko, this);
       // getCommand("toggleohko").setExecutor(new ohkoToggle(ohko));

    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("bye World");

    }
}
