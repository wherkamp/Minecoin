package me.kingtux.minecoin.placeholders;

import me.kingtux.minecoin.MineCoinMain;

public class PlaceholderLoader {
    private MineCoinMain plugin;

    public PlaceholderLoader(MineCoinMain plugin) {
        this.plugin = plugin;
    }

    public void loadMVdwPlaceHolders() {
        be.maximvdw.placeholderapi.PlaceholderAPI.registerPlaceholder(plugin, "balance", new MVdWPlaceholder(plugin));
    }

    public void loadPlaceHolderAPI() {
        new PlaceHolderAPIPlaceHolder(plugin).register();
    }
}
