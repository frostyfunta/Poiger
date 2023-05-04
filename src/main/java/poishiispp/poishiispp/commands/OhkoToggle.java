package poishiispp.poishiispp.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import poishiispp.poishiispp.handlers.OneHitKO;



public class OhkoToggle implements CommandExecutor {

    private final OneHitKO listener;

    public OhkoToggle(OneHitKO listener){
        this.listener = listener;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
            if(listener.isEnabled()){
                listener.disable();
                Bukkit.getLogger().info("OHKO has been disabled");
                return true;
            } else{

                listener.enable();
                Bukkit.getLogger().info("OHKO has been enabled");
                return true;
            }

    }
}
