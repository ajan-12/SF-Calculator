package top.ageofelysian.sfcalculator;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.*;

public class Commands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        final String pluginTag = ChatColor.DARK_AQUA + "[" + ChatColor.GREEN + "SF-Calculator" + ChatColor.DARK_AQUA + "]";
        if (args.length > 2 || args.length == 0) {
            return false;
        }

        if (args[0].equals("list")) {

            sender.sendMessage(pluginTag + ChatColor.AQUA + " The list of currently available recipes:");

            final List<Item> items = new ArrayList<>();
            for (final Item item : Item.values()) {

                if (item.getIngredients() != null) items.add(item);

            }

            final StringBuilder list = new StringBuilder();
            for (int i = 0; i < items.size(); i++) {

                list.append(items.get(i));
                if (i != (items.size() - 1)) {
                    list.append(", ");
                }

            }

            sender.sendMessage(ChatColor.GREEN + list.toString());
            return true;

        } else {

            try {
                final Item item = Item.valueOf(args[0]);
                final int itemAmount;

                if (args.length == 1) {
                    itemAmount = 1;
                } else {
                    try {

                        itemAmount = Integer.parseInt(args[1]);

                    } catch (NumberFormatException e) {

                        sender.sendMessage(pluginTag + ChatColor.DARK_RED + " Please enter a valid number!");
                        return true;
                    }
                }

                HashMap<Item, Double> items = new HashMap<>();
                items.put(item, (double) itemAmount);

                final HashMap<Item, Double> results = new HashMap<>();
                while (true) {

                    HashMap<Item, Double> newItems = new HashMap<>();
                    int nulls = 0;

                    for (Map.Entry<Item, Double> entry : items.entrySet()) {

                        if (entry.getKey().getIngredients() == null) {
                            if (results.containsKey(entry.getKey())) {

                                double amount = results.get(entry.getKey());
                                amount += entry.getValue();

                                results.replace(entry.getKey(), amount);

                            } else {
                                results.put(entry.getKey(), entry.getValue());
                            }
                            nulls++;

                        } else {
                            for (Map.Entry<Item, Double> ingredient : entry.getKey().getIngredients().entrySet()) {
                                if (newItems.containsKey(ingredient.getKey())) {

                                    double amount = newItems.get(ingredient.getKey());
                                    amount += (ingredient.getValue() * entry.getValue());

                                    newItems.replace(ingredient.getKey(), amount);

                                } else {
                                    newItems.put(ingredient.getKey(), (ingredient.getValue() * entry.getValue()));
                                }
                            }
                        }
                    }

                    if (items.size() == nulls) {
                        break;
                    }
                    items = newItems;
                }

                sender.sendMessage(pluginTag + ChatColor.AQUA + " The ingredients needed to craft " + ChatColor.GOLD + itemAmount + ChatColor.AQUA + " of " + ChatColor.RED + args[0] + ChatColor.AQUA + ":");

                for (Map.Entry<Item, Double> result : results.entrySet()) {
                    sender.sendMessage(ChatColor.GOLD + " - " + ChatColor.AQUA + result.getValue() + ChatColor.DARK_AQUA + "x " + ChatColor.GREEN + result.getKey().name().replaceAll("_", " "));
                }
                return true;

            } catch (IllegalArgumentException e) {

                sender.sendMessage(pluginTag + ChatColor.DARK_RED + " Please enter an available item!");
                return true;

            }
        }
    }
}
