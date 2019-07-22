package top.ageofelysian.sfcalculator;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class SFCalculator extends JavaPlugin {
    private static SFCalculator instance;

    @Override
    public void onEnable() {
        final String pluginTag = ChatColor.DARK_AQUA + "[" + ChatColor.GREEN + "SF-Calculator" + ChatColor.DARK_AQUA + "]";
        instance = this;

        boolean slimefun = false;
        boolean cscorelib = false;

        if (getServer().getPluginManager().getPlugin("Slimefun") == null) {
            slimefun = true;
        }
        if (getServer().getPluginManager().getPlugin("CS-CoreLib") == null) {
            cscorelib = true;
        }

        if (slimefun && cscorelib) {
            Bukkit.getConsoleSender().sendMessage(pluginTag + ChatColor.DARK_RED + " The plugins Slimefun and CS-CoreLib are needed for this plugin!");
        } else if (slimefun) {
            Bukkit.getConsoleSender().sendMessage(pluginTag + ChatColor.DARK_RED + " The plugin Slimefun is needed for this plugin!");
        } else if (cscorelib) {
            Bukkit.getConsoleSender().sendMessage(pluginTag + ChatColor.DARK_RED + " The plugin CS-CoreLib is needed for this plugin!");
        }

        getCommand("sfcalculator").setExecutor(new Commands());
    }

    @Override
    public void onDisable() {
        instance = null;
    }

    public static SFCalculator getInstance() { return instance; }
}
