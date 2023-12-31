package net.vexate.arcanearchaeology.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.vexate.arcanearchaeology.item.ModItems;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.AZURE_HELMET, ModItems.AZURE_CHESTPLATE, ModItems.AZURE_LEGGINGS, ModItems.AZURE_BOOTS);
        getOrCreateTagBuilder(ItemTags.TRIM_MATERIALS)
                .add(ModItems.AZURE_PRISM);
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.AZURE_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.AZURE_PICKAXE);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.AZURE_AXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.AZURE_SHOVEL);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.AZURE_HOE);
    }
}
