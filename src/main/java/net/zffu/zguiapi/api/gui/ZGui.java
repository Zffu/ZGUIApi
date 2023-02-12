package net.zffu.zguiapi.api.gui;

import net.zffu.zguiapi.ZGuiAPIPlugin;
import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ZGui {

    private Inventory inventory;

    private String name;
    private int rows;

    private HashMap<Integer, ItemStack> items;

    public ZGui(String name, int rows) {
        this.name = name;
        this.rows = rows;

        this.items = new HashMap<>();



        
       

    }

    public boolean onGUIOpen(Player p) {
        return false;
    }

    public boolean onItemDrag(Player p, ItemStack itemStack) {
        return true;
    }

    public boolean onItemClick(Player p, ItemStack itemStack) {
        return true;
    }

    public void onGUIClose(Player p) {

    }



    public void clearItems() {this.items.clear();}

    public void setItemInSlots(ItemStack item, Integer[] slots) {
        for(int slot : slots) {
            this.items.put(slot, item);
        }
    }

    public void setItem(ItemStack item, int slot) {
        this.items.put(slot, item);
    }

    public void clearSlot(int slot) {
        this.items.remove(slot);
    }

    public ArrayList<ItemStack> getItemInSlots(Integer[] slots) {
        ArrayList<ItemStack> items = new ArrayList<>();
        for(int slot : slots) {
            items.add(this.items.get(slot));
        }
        return items;
    }

    public void setName(String name) {this.name = name;}

    public void setRows(int rows) {this.rows = rows;}

    public void fillBorder(ItemStack itemStack) {
        if(this.rows >= 3) {
            for (int i = 0; i <= 8; i++) {
                this.items.put(i, itemStack);
            }
            for(int s = 8; s < (this.getSlotsAmount() - 9); s += 9) {
                int lastSlot = s + 1;
                this.items.put(s, itemStack);
                this.items.put(lastSlot, itemStack);
            }

            for (int lr = (this.getSlotsAmount() - 9); lr < this.getSlotsAmount(); lr++) {
                this.items.put(lr, itemStack);
            }
        }
    }

    public void fillWithItem(ItemStack itemStack) {
        for(int i = 0; i <= this.getSlotsAmount(); i++) {
            if(this.items.get(i) == null) {
                this.items.put(i, itemStack);
            }
        }
    }

    public ItemStack getItemInSlot(int slot) {return this.items.get(slot);}

    public String getName() {return this.name;}

    public int getRowsAmount() {return this.rows;}

    public int getSlotsAmount() {return this.rows * 9 - 1;}

    public HashMap<Integer, ItemStack> getItems() {return this.items;}
    

    public Inventory buildInventory() {
        this.inventory = Bukkit.createInventory(null, this.rows * 9, this.name);
        for(Map.Entry<Integer, ItemStack> entry : this.items.entrySet()) {
            this.inventory.setItem(entry.getKey(), entry.getValue());
        }
        return this.inventory;
    }



}
