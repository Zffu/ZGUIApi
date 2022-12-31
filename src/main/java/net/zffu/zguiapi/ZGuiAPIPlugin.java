package net.zffu.zguiapi;

import net.zffu.zguiapi.events.GUICloseEvent;
import net.zffu.zguiapi.events.GUIOpenEvent;
import net.zffu.zguiapi.events.ItemClickEvent;
import net.zffu.zguiapi.events.ItemDragEvent;
import net.zffu.zguiapi.manager.ZGuiManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class ZGuiAPIPlugin extends JavaPlugin {

    private ZGuiManager zGuiManager;
    private static ZGuiAPIPlugin INSTANCE;


    @Override
    public void onEnable() {
        INSTANCE = this;
        this.zGuiManager = new ZGuiManager(this);

        getServer().getPluginManager().registerEvents(new GUIOpenEvent(), this);
        getServer().getPluginManager().registerEvents(new ItemClickEvent(), this);
        getServer().getPluginManager().registerEvents(new ItemDragEvent(), this);
        getServer().getPluginManager().registerEvents(new GUICloseEvent(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static ZGuiAPIPlugin getInstance() {return INSTANCE;}
    public ZGuiManager getGUIManager() {return this.zGuiManager;}

}
