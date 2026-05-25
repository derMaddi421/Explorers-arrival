package com.example;

import net.fabricmc.api.ModInitializer;
import com.example.item.ModItems;

public class ExplorersArrivalMod implements ModInitializer {

    @Override
    public void onInitialize() {
        ModItems.register();
    }
}