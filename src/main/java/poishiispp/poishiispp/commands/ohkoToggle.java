package poishiispp.poishiispp.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import poishiispp.poishiispp.PoishiisPP;


public class ohkoToggle implements CommandExecutor {
    private PoishiisPP plugin;

    public ohkoToggle(PoishiisPP plugin){
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if (args.length == 0){
            return false;
        }
        String action = args[0].toLowerCase();

        if(action.equals("on")){
            plugin.get
        }
    }
}
