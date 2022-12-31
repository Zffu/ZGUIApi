package net.zffu.zguiapi.test;

import net.zffu.zguiapi.api.gui.ZGui;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class TestGUI extends ZGui {
    public TestGUI() {
        super("My Test GUI", 6);
        this.fillWithItem(itemStack);
    }

    @Override
    public boolean onItemDrag(Player p, ItemStack itemStack) {
        return super.onItemDrag(p, itemStack);
    }
}
