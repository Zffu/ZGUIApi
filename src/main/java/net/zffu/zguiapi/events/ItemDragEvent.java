package net.zffu.zguiapi.events;

import net.zffu.zguiapi.ZGuiAPIPlugin;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryDragEvent;

public class ItemDragEvent implements Listener {

    @EventHandler
    public void onGuiOpen(InventoryDragEvent e) {
        e.setCancelled(ZGuiAPIPlugin.getInstance().getGUIManager().onItemDrag((Player) e.getWhoClicked(),e.getCursor(), e.getInventory()));
    }

}
