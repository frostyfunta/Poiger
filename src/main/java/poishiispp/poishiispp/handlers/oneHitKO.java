package poishiispp.poishiispp.handlers;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.plugin.java.JavaPlugin;
import poishiispp.poishiispp.PoishiisPP;

public class oneHitKO implements Listener {
    private PoishiisPP plugin;
    private boolean enabled;

    public oneHitKO(PoishiisPP plugin){
        Bukkit.getPluginManager().registerEvents(this, plugin);
        this.plugin = plugin;
        this.enabled = true;
    }

    @EventHandler
    public void onHit(EntityDamageByEntityEvent event){
        if (!enabled){
            return;
        }

        if(event.getEntity() instanceof Player){
            Player player = (Player) event.getEntity();
            plugin.getLogger().info(player.getName() + "was hit!");
            //player.damage(1000);
        }
    }

    public void disable(){
        this.enabled = false;
    }

    public void enable(){
        this.enabled = true;
    }

    public boolean isEnabled(){
        return enabled;
    }
}
