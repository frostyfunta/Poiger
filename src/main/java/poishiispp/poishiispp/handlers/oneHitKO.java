package poishiispp.poishiispp.handlers;

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
        this.plugin = plugin;
        this.enabled = true;
    }

    public void disable(){
        this.enabled = false;
    }

    @EventHandler
    public void onHit(EntityDamageByEntityEvent event){
        if (!enabled){
            return;
        }

        if(event.getEntity() instanceof Player){
            Player player = (Player) event.getEntity();
            plugin.getLogger().info(player.getName() + "was hit!");
        }
    }
}
