package poishiispp.poishiispp.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import poishiispp.poishiispp.PoishiisPP;
import poishiispp.poishiispp.handlers.oneHitKO;



public class ohkoToggle implements CommandExecutor {

    private final oneHitKO listener;

    public ohkoToggle(oneHitKO listener){
        this.listener = listener;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
            if(listener.isEnabled()){
                listener.disable();
                sender.sendMessage("OHKO has been disabled");
                return true;
            } else{

                listener.enable();
                sender.sendMessage("OHKO has been enabled");
                return true;
            }

    }
}
