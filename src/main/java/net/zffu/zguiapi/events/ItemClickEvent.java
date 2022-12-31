package net.zffu.zguiapi.events;

import net.zffu.zguiapi.ZGuiAPIPlugin;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;

public class ItemClickEvent implements Listener {

    @EventHandler
    public void onGuiOpen(InventoryClickEvent e) {
        e.setCancelled(ZGuiAPIPlugin.getInstance().getGUIManager().onItemClick((Player) e.getWhoClicked(),e.getCursor(), e.getInventory()));
    }

}
