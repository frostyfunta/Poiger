package poishiispp.poishiispp;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import poishiispp.poishiispp.handlers.oneHitKO;

public final class PoishiisPP extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("hello World");

    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("bye World");
    }
}
