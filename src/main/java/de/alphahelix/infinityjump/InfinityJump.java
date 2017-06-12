package de.alphahelix.infinityjump;

import org.bukkit.plugin.java.JavaPlugin;

public class InfinityJump extends JavaPlugin {

    private static InfinityJump instance;

    @Override
    public void onEnable() {
        instance = this;
    }

    public static InfinityJump getInstance() {
        return instance;
    }
}
