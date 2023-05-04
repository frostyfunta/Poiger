package poishiispp.poishiispp.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import poishiispp.poishiispp.handlers.EverythingKills;

public class EverythingKillsToggle implements CommandExecutor{
    private final EverythingKills listener;

    public EverythingKillsToggle(EverythingKills listener){
        this.listener = listener;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if(listener.isEnabled()){
            listener.disable();
            Bukkit.broadcastMessage("Damage should be normal now");
        } else {
            listener.enable();
            Bukkit.broadcastMessage("EVERYTHING kills now");
        }
        return true;
    }
}
