package me.maxwell.sf;

/*
This MC-Spigot Plugin called "ServerFucker" is one of my first codes i've ever written in java(back to 2015).
I decided to recode it and release it on my github so people like you can use it for free.
 */

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public String prefix = "§7<§cServerFucker§7> ";


    @Override
    public void onEnable() {
        System.out.print("on");
        new Commands(this);
        getServer().getPluginManager().registerEvents(new Events(), this);
    }



}
