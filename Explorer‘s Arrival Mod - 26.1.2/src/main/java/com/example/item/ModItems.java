package com.example.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    // 🍒 Cherry Item
    public static final Item CHERRY = new Item(
        new Item.Settings().food(
            new FoodComponent.Builder()
                .nutrition(2)                 // 1 Hungerkeule
                .saturationModifier(0.3f)
                .statusEffect(
                    new StatusEffectInstance(StatusEffects.REGENERATION, 60), // 3 Sekunden
                    1.0f
                )
                .build()
        )
    );

    // ✅ Registrierung
    public static void register() {

        // Item registrieren
        Registry.register(
            Registries.ITEM,
            new Identifier("explorersarrival", "cherry"),
            CHERRY
        );

        // ✅ Zum Food & Drinks Creative Tab hinzufügen
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK)
            .register(entries -> entries.add(CHERRY));
    }
}
