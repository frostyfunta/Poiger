package poishiispp.poishiispp.handlers;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import poishiispp.poishiispp.PoishiisPP;

public class EverythingKills implements Listener {
    private PoishiisPP plugin;
    private boolean enabled;

    public EverythingKills(PoishiisPP plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
        this.plugin = plugin;
        this.enabled = false;
    }

    @EventHandler
    public void onHit(EntityDamageEvent event) {
        if (!enabled) {
            return;
        }

        if (event.getEntity() instanceof Player) {
            Player player = (Player) event.getEntity();
            plugin.getLogger().info(player.getName() + " was hit!");
            player.setHealth(0);
        }
    }

    public void disable() {
        this.enabled = false;
    }

    public void enable() {
        this.enabled = true;
    }

    public boolean isEnabled() {
        return enabled;
    }
}
