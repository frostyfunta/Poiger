package poishiispp.poishiispp.handlers;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.scheduler.BukkitScheduler;
import poishiispp.poishiispp.PoishiisPP;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeepMoving implements Listener {
    private PoishiisPP plugin;
    private Map<Player, Boolean> enabledPlayers = new HashMap<>();
    BukkitScheduler scheduler = Bukkit.getServer().getScheduler();
    private int taskID, tickLength = 20, damage = 2;


    public KeepMoving(PoishiisPP plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
        this.plugin = plugin;
    }

    public void enable(Player player) {
        enabledPlayers.put(player, true);
        startTimer();
    }

    public void disable(Player player) {
        enabledPlayers.put(player, false);
    }

    public void setDamage(int damage){
        this.damage = damage;
    }

    public void setTickLength(int tickLength){
        this.tickLength = tickLength;
    }

    public boolean isEnabled(Player player) {
        return enabledPlayers.getOrDefault(player, false);
    }

    public void startTimer() {
        taskID = scheduler.scheduleSyncRepeatingTask(plugin, new Runnable() {
                    @Override
                    public void run() {
                        enabledPlayers.forEach((Player, Boolean) -> {
                            if(Boolean){
                                Player.damage(damage);
                            }
                        });
                    }
                }

                , tickLength, tickLength);
    }

    public void cancelTimer() {
        scheduler.cancelTask(taskID);
    }

    public void resetTimer() {
        cancelTimer();
        startTimer();
    }



}
