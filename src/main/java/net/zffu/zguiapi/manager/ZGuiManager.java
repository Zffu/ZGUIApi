package net.zffu.zguiapi.manager;

import net.zffu.zguiapi.api.gui.ZGui;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;


public class ZGuiManager implements Listener {

    private Plugin plugin;

    private ArrayList<ZGui> guis;

    public ZGuiManager(Plugin plugin) {
        this.plugin = plugin;
        this.guis = new ArrayList<>();
    }

    public void addZGUI(ZGui gui) {
        this.guis.add(gui);
    }

    public boolean onGUIOpen(Player p, Inventory inventory) {
        for(ZGui gui : this.guis) {
            if(gui.buildInventory().equals(inventory)) {
                return gui.onGUIOpen(p);
            }
        }
        return false;
    }

    public void onGUIClose(Player p, Inventory inventory) {
        for(ZGui gui : this.guis) {
            if(gui.buildInventory().equals(inventory)) {
                gui.onGUIClose(p);
            }
        }

    }

    public boolean onItemDrag(Player p, ItemStack itemStack, Inventory inventory) {
        for(ZGui gui : this.guis) {
            if(gui.buildInventory().equals(inventory)) {
                return gui.onItemDrag(p, itemStack);
            }
        }
        return false;
    }

    public boolean onItemClick(Player p,ItemStack itemStack, Inventory inventory) {
        for(ZGui gui : this.guis) {
            if(gui.buildInventory().equals(inventory)) {
                return gui.onItemClick(p,itemStack);
            }
        }
        return false;
    }

}
