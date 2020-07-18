/*package Events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.conversations.ConversationContext;
import org.bukkit.conversations.Prompt;
import org.bukkit.conversations.StringPrompt;
import org.bukkit.entity.Player;

import java.util.Collections;

public class compassLoreConv extends StringPrompt {

    private Object Player;

    @Override
    public String getPromptText(ConversationContext context) {
        return ChatColor.GREEN + "What lore do you wish to engrave on your compass?";
    }

    @Override
    public Prompt acceptInput(ConversationContext context, String answer) {

        Player player = (Player) Player;
        if (player.getInventory().getItemInMainHand().getType() == Material.COMPASS){

            player.getActiveItem().setLore(Collections.singletonList(answer));
            player.sendMessage(ChatColor.GREEN + "Set your compass's lore to &r" + ChatColor.GRAY + answer);

        } else{
            player.sendMessage(ChatColor.GREEN + "You can only assign lore to a compass!");
        }

        return END_OF_CONVERSATION;
    }
}*/


