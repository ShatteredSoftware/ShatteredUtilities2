package com.github.shatteredsuite.utilities;

import com.github.shatteredsuite.utilities.messages.Messageable;
import com.github.shatteredsuite.utilities.messages.Messenger;
import com.github.shatteredsuite.utilities.nms.NBTUtil;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import com.github.shatteredsuite.utilities.nms.MaterialUtil12;
import com.github.shatteredsuite.utilities.nms.MaterialUtil13;
import com.github.shatteredsuite.utilities.nms.MaterialUtil14;
import com.github.shatteredsuite.utilities.nms.MaterialUtil15;
import com.github.shatteredsuite.utilities.nms.NBTUtil12;
import com.github.shatteredsuite.utilities.nms.NBTUtil13;
import com.github.shatteredsuite.utilities.nms.NBTUtil14;
import com.github.shatteredsuite.utilities.nms.NBTUtil15;

/**
 * Allows this to be loaded as a plugin.
 */
public class ShatteredUtilities extends JavaPlugin implements Messageable {
    private Messenger messenger;
    private NBTUtil nbtUtil;
    private MaterialUtil materialUtil;

    @Override
    public void onEnable() {
        super.onEnable();
        loadVersionSpecific();
    }

    private void loadVersionSpecific() {
        if (Bukkit.getVersion().contains("1.12.2")) {
            getLogger().info("Loaded compatibility for 1.12.");
            nbtUtil = new NBTUtil12();
            materialUtil = new MaterialUtil12();
        } else if (Bukkit.getVersion().contains("1.13.1") || Bukkit.getVersion()
            .contains("1.13.2")) {
            getLogger().info("Loaded compatibility for 1.13.");
            nbtUtil = new NBTUtil13();
            materialUtil = new MaterialUtil13();
        } else if (Bukkit.getVersion().contains("1.14")) {
            getLogger().info("Loaded compatibility for 1.14.");
            nbtUtil = new NBTUtil14();
            materialUtil = new MaterialUtil14();
        } else if (Bukkit.getVersion().contains("1.15")) {
            getLogger().info("Loaded compatibility for 1.15.");
            nbtUtil = new NBTUtil15();
            materialUtil = new MaterialUtil15();
        } else {
            getLogger().severe("Could not load compatibility for this version. Disabling.");
            getServer().getPluginManager().disablePlugin(this);
        }
    }

    public NBTUtil getNbtUtil() {
        return nbtUtil;
    }

    public MaterialUtil getMaterialUtil() {
        return materialUtil;
    }

    public Messenger getMessenger() {
        return messenger;
    }
}
