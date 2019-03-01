package me.maxwell.sf;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Egg;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class Events implements Listener {

    public String prefix = "§7<§cServerFucker§7> ";

    @EventHandler
    public void onHit(ProjectileHitEvent e) {
        Entity entity = e.getEntity();


        if (entity instanceof Egg) {
            Egg snowball = (Egg) entity;

            if (snowball.getShooter() instanceof Player) {
                snowball.getWorld().createExplosion(snowball.getLocation(), 5F);

            }
        }
    }

    @EventHandler
    public void spammer(PlayerInteractEvent e) {
        Player p = e.getPlayer();


        if (!(p.getItemInHand().getType() == Material.PAPER)) {
            return;
        }
        if (e.getAction() == Action.RIGHT_CLICK_AIR) {
            Bukkit.broadcastMessage(prefix + "§cFUCKED BY §e" + p.getName() + " §cYOU CUNTS!");
        }


    }
}
