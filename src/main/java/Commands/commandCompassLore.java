package Commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.conversations.Conversation;
import org.bukkit.conversations.ConversationFactory;
import org.bukkit.conversations.Prompt;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import java.util.Arrays;
import java.util.Collections;

public class commandCompassLore implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        //Command = /cplore

        Player player = (Player) sender;

        if(sender instanceof Player){

            String lore = "";
            
            for (int i = 0; i < args.length; i++) {
                String arg = args[i] + " ";
                lore = lore + arg;
            }
            
            else if(args == null){
                player.sendMessage(ChatColor.RED + "Please enter your lore after /cplore");
            }
            else{
                if(player.getInventory().getItemInMainHand().getType() ==  Material.COMPASS){
                    player.getInventory().getItemInMainHand().setLore(Collections.singletonList(lore));
                    player.sendMessage(ChatColor.GREEN + "Your compass has been engraved with " + ChatColor.GRAY + lore);
                }
                else{
                    player.sendMessage(ChatColor.RED + "You can only engrave a compass!");
                }
            }
        }

        return true;
    }


}
