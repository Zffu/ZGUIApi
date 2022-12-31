package net.zffu.zguiapi.events;

import net.zffu.zguiapi.ZGuiAPIPlugin;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;

public class GUICloseEvent implements Listener {

    @EventHandler
    public void onGUIClose(InventoryCloseEvent e) {
        ZGuiAPIPlugin.getInstance().getGUIManager().onGUIClose((Player) e.getPlayer(), e.getInventory());
    }

}
