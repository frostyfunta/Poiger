package poishiispp.poishiispp;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitScheduler;
import poishiispp.poishiispp.commands.EverythingKillsToggle;
import poishiispp.poishiispp.commands.OhkoToggle;
import poishiispp.poishiispp.handlers.EverythingKills;
import poishiispp.poishiispp.handlers.OneHitKO;

public final class PoishiisPP extends JavaPlugin {
    private OneHitKO ohko;
    private EverythingKills everythingKills;
    private BukkitScheduler scheduler;

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("hello World");
        ohko = new OneHitKO(this);
        everythingKills = new EverythingKills(this);


        getCommand("toggleohko").setExecutor(new OhkoToggle(ohko));
        getCommand("everythingKills").setExecutor(new EverythingKillsToggle(everythingKills));




    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("bye World");

    }
}
