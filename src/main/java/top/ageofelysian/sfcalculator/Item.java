package top.ageofelysian.sfcalculator;

import java.util.HashMap;

public enum Item {

    ///////////////////////////////// Vanilla Items ///////////////////////////////////
    Coal(null),
    Flint(null),
    Oak_Wood(null),
    Leather(null),
    Emerald(null),
    Blaze_Rod(null),
    Nether_Wart(null),
    Wither_Skeleton_Skull(null),
    Iron_Ingot(null),
    Book(null),
    Diamond(null),
    Eye_of_Ender(null),
    Stone(null),
    Dirt(null),
    Sand(null),
    Gravel(null),
    Fish(null),
    Obsidian(null),
    Feather(null),
    Ghast_Tear(null),
    Gunpowder(null),
    String(null),
    Water(null),
    Milk(null),
    Netherrack(null),
    Ice(null),
    Packed_Ice(null),
    Lily_Pad(null),
    Red_Mushroom(null),
    Apple(null),
    Carrot(null),
    Pumpkin(null),
    Melon(null),
    Golden_Apple(null),
    Wheat(null),
    Steak(null),
    Rotten_Flesh(null),
    Cocoa_Beans(null),
    Sugar_Canes(null),
    Nether_Quartz(null),
    Redstone_Dust(null),
    Lapis_Lazuli(null),
    Emerald_Ore(null),
    Nether_Star(null),
    Glowstone_Dust(null),

    Bucket(ItemUtils.createHashMap(new Item[]{Iron_Ingot}, new Double[]{3.0})),
    Water_Bucket(ItemUtils.createHashMap(new Item[]{Bucket, Water}, new Double[]{1.0, 1.0})),
    Milk_Bucket(ItemUtils.createHashMap(new Item[]{Bucket, Milk}, new Double[]{1.0, 1.0})),
    Blaze_Powder(ItemUtils.createHashMap(new Item[]{Blaze_Rod}, new Double[]{0.5})),
    Fire_Charge(ItemUtils.createHashMap(new Item[]{Coal, Blaze_Powder, Gunpowder}, new Double[]{0.3, 0.3, 0.3})),
    TnT(ItemUtils.createHashMap(new Item[]{Gunpowder, Sand}, new Double[]{5.0, 4.0})),
    Flint_and_Steel(ItemUtils.createHashMap(new Item[]{Flint, Iron_Ingot}, new Double[]{1.0, 1.0})),
    Block_of_Quartz(ItemUtils.createHashMap(new Item[]{Nether_Quartz}, new Double[]{4.0})),
    Oak_Wood_Planks(ItemUtils.createHashMap(new Item[]{Oak_Wood}, new Double[]{0.25})),
    Crafting_Table(ItemUtils.createHashMap(new Item[]{Oak_Wood_Planks}, new Double[]{4.0})),
    Chest(ItemUtils.createHashMap(new Item[]{Oak_Wood_Planks}, new Double[]{8.0})),
    Bowl(ItemUtils.createHashMap(new Item[]{Oak_Wood_Planks}, new Double[]{0.75})),
    Wool(ItemUtils.createHashMap(new Item[]{String}, new Double[]{4.0})),
    Stick(ItemUtils.createHashMap(new Item[]{Oak_Wood_Planks}, new Double[]{0.5})),
    Sugar(ItemUtils.createHashMap(new Item[]{Sugar_Canes}, new Double[]{1.0})),
    Glass(ItemUtils.createHashMap(new Item[]{Sand}, new Double[]{1.0})),
    Glass_Bottle(ItemUtils.createHashMap(new Item[]{Glass}, new Double[]{1.0})),
    Glass_Pane(ItemUtils.createHashMap(new Item[]{Glass}, new Double[]{2.6})),
    Compass(ItemUtils.createHashMap(new Item[]{Redstone_Dust, Iron_Ingot}, new Double[]{1.0, 4.0})),
    Block_of_Redstone(ItemUtils.createHashMap(new Item[]{Redstone_Dust}, new Double[]{9.0})),
    Cookie(ItemUtils.createHashMap(new Item[]{Wheat, Cocoa_Beans}, new Double[]{0.25, 0.125})),
    Paper(ItemUtils.createHashMap(new Item[]{Sugar_Canes}, new Double[]{1.0})),

    Diamond_Sword(ItemUtils.createHashMap(new Item[]{Diamond, Stick}, new Double[]{2.0, 1.0})),
    Diamond_Pickaxe(ItemUtils.createHashMap(new Item[]{Diamond, Stick}, new Double[]{3.0, 2.0})),
    Diamond_Axe(ItemUtils.createHashMap(new Item[]{Diamond, Stick}, new Double[]{3.0, 2.0})),
    Diamond_Shovel(ItemUtils.createHashMap(new Item[]{Diamond, Stick}, new Double[]{1.0, 2.0})),
    Diamond_Hoe(ItemUtils.createHashMap(new Item[]{Diamond, Stick}, new Double[]{2.0, 2.0})),
    Bow(ItemUtils.createHashMap(new Item[]{String, Stick}, new Double[]{3.0, 3.0})),

    ///////////////////////////////// SlimeFun Items //////////////////////////////////

    Oil(null),
    Nether_Ice(null),

    // ------------- Dusts and Ingots
    Sulfate(ItemUtils.createHashMap(new Item[]{Netherrack}, new Double[]{16.0})),
    Copper_Dust(null),
    Tin_Dust(null),
    Aluminum_Dust(null),
    Iron_Dust(null),
    Gold_Dust(null),
    Silver_Dust(null),
    Lead_Dust(null),
    Zinc_Dust(null),
    Magnesium_Dust(null),

    Copper_Ingot(ItemUtils.createHashMap(new Item[]{Copper_Dust}, new Double[]{1.0})),
    Tin_Ingot(ItemUtils.createHashMap(new Item[]{Tin_Dust}, new Double[]{1.0})),
    Aluminum_Ingot(ItemUtils.createHashMap(new Item[]{Aluminum_Dust}, new Double[]{1.0})),
    Silver_Ingot(ItemUtils.createHashMap(new Item[]{Silver_Dust}, new Double[]{1.0})),
    Lead_Ingot(ItemUtils.createHashMap(new Item[]{Lead_Dust}, new Double[]{1.0})),
    Zinc_Ingot(ItemUtils.createHashMap(new Item[]{Zinc_Dust}, new Double[]{1.0})),
    Magnesium_Ingot(ItemUtils.createHashMap(new Item[]{Magnesium_Dust}, new Double[]{1.0})),


    // ------------- Gold Carats
    Gold_Ingot_4(ItemUtils.createHashMap(new Item[]{Gold_Dust}, new Double[]{1.0})),
    Gold_Ingot_6(ItemUtils.createHashMap(new Item[]{Gold_Dust, Gold_Ingot_4}, new Double[]{1.0, 1.0})),
    Gold_Ingot_8(ItemUtils.createHashMap(new Item[]{Gold_Dust, Gold_Ingot_6}, new Double[]{1.0, 1.0})),
    Gold_Ingot_10(ItemUtils.createHashMap(new Item[]{Gold_Dust, Gold_Ingot_8}, new Double[]{1.0, 1.0})),
    Gold_Ingot_12(ItemUtils.createHashMap(new Item[]{Gold_Dust, Gold_Ingot_10}, new Double[]{1.0, 1.0})),
    Gold_Ingot_14(ItemUtils.createHashMap(new Item[]{Gold_Dust, Gold_Ingot_12}, new Double[]{1.0, 1.0})),
    Gold_Ingot_16(ItemUtils.createHashMap(new Item[]{Gold_Dust, Gold_Ingot_14}, new Double[]{1.0, 1.0})),
    Gold_Ingot_18(ItemUtils.createHashMap(new Item[]{Gold_Dust, Gold_Ingot_16}, new Double[]{1.0, 1.0})),
    Gold_Ingot_20(ItemUtils.createHashMap(new Item[]{Gold_Dust, Gold_Ingot_18}, new Double[]{1.0, 1.0})),
    Gold_Ingot_22(ItemUtils.createHashMap(new Item[]{Gold_Dust, Gold_Ingot_20}, new Double[]{1.0, 1.0})),
    Gold_Ingot_24(ItemUtils.createHashMap(new Item[]{Gold_Dust, Gold_Ingot_22}, new Double[]{1.0, 1.0})),


    // ------------- Carbon stuff
    Carbon(ItemUtils.createHashMap(new Item[]{Coal}, new Double[]{8.0})),
    Compressed_Carbon(ItemUtils.createHashMap(new Item[]{Carbon}, new Double[]{4.0})),
    Carbon_Chunk(ItemUtils.createHashMap(new Item[]{Compressed_Carbon, Flint}, new Double[]{8.0, 1.0})),
    Synthetic_Diamond(ItemUtils.createHashMap(new Item[]{Carbon_Chunk}, new Double[]{1.0})),
    Raw_Carbonado(ItemUtils.createHashMap(new Item[]{Synthetic_Diamond, Carbon_Chunk, Glass_Pane}, new Double[]{1.0, 1.0, 1.0})),
    Carbonado(ItemUtils.createHashMap(new Item[]{Raw_Carbonado}, new Double[]{1.0})),


    // ------------- Alloys
    Billon_Ingot(ItemUtils.createHashMap(new Item[]{Silver_Dust, Copper_Dust, Silver_Ingot}, new Double[]{1.0, 1.0, 1.0})),
    Duralumin_Ingot(ItemUtils.createHashMap(new Item[]{Aluminum_Dust, Copper_Dust, Aluminum_Ingot}, new Double[]{1.0, 1.0, 1.0})),
    Solder_Ingot(ItemUtils.createHashMap(new Item[]{Lead_Dust, Tin_Dust, Lead_Ingot}, new Double[]{1.0, 1.0, 1.0})),
    Gilded_Iron_Ingot(ItemUtils.createHashMap(new Item[]{Gold_Ingot_24, Iron_Dust}, new Double[]{1.0, 1.0})),

    Nickel_Ingot(ItemUtils.createHashMap(new Item[]{Iron_Dust, Iron_Ingot, Copper_Dust}, new Double[]{1.0, 1.0, 1.0})),
    Cobalt_Ingot(ItemUtils.createHashMap(new Item[]{Iron_Dust, Copper_Dust, Nickel_Ingot}, new Double[]{1.0, 1.0, 1.0})),

    Silicon(ItemUtils.createHashMap(new Item[]{Block_of_Quartz}, new Double[]{1.0})),
    Ferrosilicon(ItemUtils.createHashMap(new Item[]{Iron_Ingot, Iron_Dust, Silicon}, new Double[]{1.0, 1.0, 1.0})),

    Bronze_Ingot(ItemUtils.createHashMap(new Item[]{Copper_Dust, Copper_Ingot, Tin_Dust}, new Double[]{1.0, 1.0, 1.0})),
    Aluminum_Bronze_Ingot(ItemUtils.createHashMap(new Item[]{Aluminum_Ingot, Bronze_Ingot, Aluminum_Dust}, new Double[]{1.0, 1.0, 1.0})),
    Corinthian_Bronze_Ingot(ItemUtils.createHashMap(new Item[]{Silver_Dust, Gold_Dust, Copper_Dust, Bronze_Ingot}, new Double[]{1.0, 1.0, 1.0, 1.0})),

    Steel_Ingot(ItemUtils.createHashMap(new Item[]{Iron_Dust, Carbon, Iron_Ingot}, new Double[]{1.0, 1.0, 1.0})),
    Damascus_Steel_Ingot(ItemUtils.createHashMap(new Item[]{Iron_Ingot, Iron_Dust, Carbon, Steel_Ingot}, new Double[]{1.0, 1.0, 1.0, 1.0})),

    Brass_Ingot(ItemUtils.createHashMap(new Item[]{Copper_Dust, Zinc_Dust, Copper_Ingot} , new Double[]{1.0, 1.0, 1.0})),
    Aluminum_Brass_Ingot(ItemUtils.createHashMap(new Item[]{Aluminum_Dust, Brass_Ingot, Aluminum_Ingot}, new Double[]{1.0, 1.0, 1.0})),

    Hardened_Metal(ItemUtils.createHashMap(new Item[]{Damascus_Steel_Ingot, Duralumin_Ingot, Compressed_Carbon, Aluminum_Bronze_Ingot}, new Double[]{1.0 ,1.0, 1.0, 1.0})),
    Reinforced_Alloy_Ingot(ItemUtils.createHashMap(new Item[]{Damascus_Steel_Ingot, Hardened_Metal, Corinthian_Bronze_Ingot, Solder_Ingot, Billon_Ingot, Gold_Ingot_24}, new Double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0})),
    Redstone_Alloy_Ingot(ItemUtils.createHashMap(new Item[]{Hardened_Metal, Ferrosilicon, Redstone_Dust, Block_of_Redstone}, new Double[]{1.0, 1.0, 1.0, 1.0})),

    Synthetic_Sapphire(ItemUtils.createHashMap(new Item[]{Aluminum_Ingot, Aluminum_Dust, Glass, Glass_Pane, Lapis_Lazuli}, new Double[]{1.0, 1.0, 1.0, 1.0, 1.0})),
    Synthetic_Emerald(ItemUtils.createHashMap(new Item[]{Synthetic_Sapphire, Aluminum_Dust, Aluminum_Ingot, Glass_Pane}, new Double[]{1.0, 1.0, 1.0, 1.0})),


    // ------------- Materials
    Cloth(ItemUtils.createHashMap(new Item[]{Wool}, new Double[]{0.125})),
    Tin_Can(ItemUtils.createHashMap(new Item[]{Tin_Ingot}, new Double[]{2.0})),
    Heavy_Cream(ItemUtils.createHashMap(new Item[]{Milk_Bucket}, new Double[]{0.5})),
    Hook(ItemUtils.createHashMap(new Item[]{Steel_Ingot}, new Double[]{3.0})),
    Chain(ItemUtils.createHashMap(new Item[]{Steel_Ingot}, new Double[]{0.375})),
    Salt(ItemUtils.createHashMap(new Item[]{Sand}, new Double[]{4.0})),

    Bucket_of_Oil(ItemUtils.createHashMap(new Item[]{Bucket, Oil}, new Double[]{1.0, 1.0})),
    Bucket_of_Fuel(ItemUtils.createHashMap(new Item[]{Bucket_of_Oil}, new Double[]{1.0})),


    // ------------- Radioactive Materials
    Tiny_Pile_of_Uranium(ItemUtils.createHashMap(new Item[]{Gravel}, new Double[]{1.0})),
    Small_Chunk_of_Uranium(ItemUtils.createHashMap(new Item[]{Tiny_Pile_of_Uranium}, new Double[]{9.0})),
    Uranium(ItemUtils.createHashMap(new Item[]{Small_Chunk_of_Uranium}, new Double[]{4.0})),

    Blistering_Ingot_33(ItemUtils.createHashMap(new Item[]{Uranium, Gold_Ingot_24}, new Double[]{1.0, 1.0})),
    Blistering_Ingot_66(ItemUtils.createHashMap(new Item[]{Blistering_Ingot_33, Carbonado}, new Double[]{1.0 ,1.0})),
    Blistering_Ingot_100(ItemUtils.createHashMap(new Item[]{Blistering_Ingot_66, Nether_Star}, new Double[]{1.0, 1.0})),

    Neptunium(ItemUtils.createHashMap(new Item[]{Uranium}, new Double[]{1.0})),
    Plutonium(ItemUtils.createHashMap(new Item[]{Neptunium}, new Double[]{1.0})),
    Boosted_Uranium(ItemUtils.createHashMap(new Item[]{Uranium, Plutonium}, new Double[]{1.0, 1.0})),
    Enriched_Nether_Ice(ItemUtils.createHashMap(new Item[]{Nether_Ice, Plutonium}, new Double[]{1.0, 1.0})),


    // ------------- Technical Materials
    Battery(ItemUtils.createHashMap(new Item[]{Redstone_Dust, Zinc_Ingot, Sulfate, Copper_Ingot}, new Double[]{1.0, 2.0, 2.0, 2.0})),
    Magnet(ItemUtils.createHashMap(new Item[]{Nickel_Ingot, Aluminum_Dust, Iron_Dust, Cobalt_Ingot}, new Double[]{1.0, 1.0, 1.0, 1.0})),
    Electromagnet(ItemUtils.createHashMap(new Item[]{Nickel_Ingot, Magnet, Cobalt_Ingot, Battery}, new Double[]{1.0, 1.0, 1.0, 1.0})),

    Electric_Motor(ItemUtils.createHashMap(new Item[]{Electromagnet, Copper_Ingot}, new Double[]{1.0, 6.0})),
    Cooling_Unit(ItemUtils.createHashMap(new Item[]{Ice, Aluminum_Ingot, Electric_Motor}, new Double[]{6.0, 2.0, 1.0})),


    // ------------- Lumps
    Magical_Lump_1(ItemUtils.createHashMap(new Item[]{Nether_Wart}, new Double[]{0.5})),
    Magical_Lump_2(ItemUtils.createHashMap(new Item[]{Magical_Lump_1}, new Double[]{4.0})),
    Magical_Lump_3(ItemUtils.createHashMap(new Item[]{Magical_Lump_2}, new Double[]{4.0})),

    Ender_Lump_1(ItemUtils.createHashMap(new Item[]{Eye_of_Ender}, new Double[]{0.5})),
    Ender_Lump_2(ItemUtils.createHashMap(new Item[]{Ender_Lump_1}, new Double[]{4.0})),
    Ender_Lump_3(ItemUtils.createHashMap(new Item[]{Ender_Lump_2}, new Double[]{4.0})),


    // ------------- Runes
    Blank_Rune(ItemUtils.createHashMap(new Item[]{Stone, Obsidian, Magical_Lump_1}, new Double[]{4.0, 1.0, 4.0})),
    Ancient_Rune_Air(ItemUtils.createHashMap(new Item[]{Feather, Blank_Rune, Magical_Lump_1, Ghast_Tear}, new Double[]{1.0, 0.25, 0.5, 0.5})),
    Ancient_Rune_Water(ItemUtils.createHashMap(new Item[]{Blank_Rune, Water_Bucket, Sand, Fish, Magical_Lump_2}, new Double[]{0.25, 0.5, 0.5, 0.5, 0.5})),
    Ancient_Rune_Earth(ItemUtils.createHashMap(new Item[]{Obsidian, Magical_Lump_1, Stone, Dirt, Blank_Rune}, new Double[]{0.5, 0.5, 0.5, 0.5, 0.25})),
    Ancient_Rune_Fire(ItemUtils.createHashMap(new Item[]{Magical_Lump_2, Blaze_Powder, Flint_and_Steel, Fire_Charge, Ancient_Rune_Earth}, new Double[]{0.5, 0.25, 0.25, 1.0, 0.25})),


    // ------------- Magical Materials
    Magical_Book_Cover(ItemUtils.createHashMap(new Item[]{Magical_Lump_2, Book}, new Double[]{4.0, 1.0})),
    Lava_Crystal(ItemUtils.createHashMap(new Item[]{Blaze_Powder, Magical_Lump_1, Ancient_Rune_Fire}, new Double[]{4.0, 4.0, 1.0})),
    Necrotic_Skull(ItemUtils.createHashMap(new Item[]{Magical_Lump_3, Wither_Skeleton_Skull}, new Double[]{4.0, 1.0})),
    Essence_of_Afterlife(ItemUtils.createHashMap(new Item[]{Ender_Lump_3, Ancient_Rune_Earth, Ancient_Rune_Air, Ancient_Rune_Fire, Ancient_Rune_Water, Necrotic_Skull}, new Double[]{4.0, 1.0, 1.0, 1.0, 1.0, 1.0})),


    // ------------- Elemental Staffs
    Elemental_Staff(ItemUtils.createHashMap(new Item[]{Magical_Lump_3, Magical_Book_Cover, Stick}, new Double[]{2.0, 2.0, 1.0})),
    Elemental_Staff_Fire(ItemUtils.createHashMap(new Item[]{Elemental_Staff, Lava_Crystal}, new Double[]{2.0, 1.0})),
    Elemental_Staff_Water(ItemUtils.createHashMap(new Item[]{Elemental_Staff, Lily_Pad, Magical_Lump_2}, new Double[]{2.0, 2.0, 1.0})),


    // ------------- Weapons
    Grandmas_Walking_Stick(ItemUtils.createHashMap(new Item[]{Oak_Wood}, new Double[]{3.0})),
    Grandpas_Walking_Stick(ItemUtils.createHashMap(new Item[]{Oak_Wood, Leather}, new Double[]{3.0, 2.0})),
    Sword_of_Beheading(ItemUtils.createHashMap(new Item[]{Emerald, Blaze_Rod, Magical_Lump_2}, new Double[]{2.0, 1.0, 2.0})),
    Sword_of_Beheading_2(ItemUtils.createHashMap(new Item[]{Synthetic_Diamond, Carbonado, Ender_Lump_3, Sword_of_Beheading}, new Double[]{2.0, 2.0, 2.0, 1.0})),
    Blade_of_Vampires(ItemUtils.createHashMap(new Item[]{Wither_Skeleton_Skull, Blaze_Rod}, new Double[]{2.0, 1.0})),
    Seismic_Axe(ItemUtils.createHashMap(new Item[]{Elemental_Staff, Hardened_Metal}, new Double[]{2.0, 3.0})),
    Soulbound_Sword(ItemUtils.createHashMap(new Item[]{Diamond_Sword, Essence_of_Afterlife}, new Double[]{1.0, 2.0})),
    Soulbound_Bow(ItemUtils.createHashMap(new Item[]{Bow, Essence_of_Afterlife}, new Double[]{1.0, 2.0})),
    Explosive_Bow(ItemUtils.createHashMap(new Item[]{Stick, Gunpowder, Sulfate, Elemental_Staff_Fire}, new Double[]{2.0, 2.0, 1.0, 1.0})),
    Icy_Bow(ItemUtils.createHashMap(new Item[]{Ice, Packed_Ice, Stick, Elemental_Staff_Water}, new Double[]{2.0, 1.0, 2.0, 1.0})),

    Copper_Sword(ItemUtils.createHashMap(new Item[]{Copper_Ingot, Stick}, new Double[]{2.0, 1.0})),
    Tin_Sword(ItemUtils.createHashMap(new Item[]{Tin_Ingot, Stick}, new Double[]{2.0, 1.0})),
    Silver_Sword(ItemUtils.createHashMap(new Item[]{Silver_Ingot, Stick}, new Double[]{2.0, 1.0})),
    Aluminum_Sword(ItemUtils.createHashMap(new Item[]{Aluminum_Ingot, Stick}, new Double[]{2.0, 1.0})),
    Lead_Sword(ItemUtils.createHashMap(new Item[]{Lead_Ingot, Stick}, new Double[]{2.0, 1.0})),
    Zinc_Sword(ItemUtils.createHashMap(new Item[]{Zinc_Ingot, Stick}, new Double[]{2.0, 1.0})),
    Magnesium_Sword(ItemUtils.createHashMap(new Item[]{Magnesium_Ingot, Stick}, new Double[]{2.0, 1.0})),

    Steel_Sword(ItemUtils.createHashMap(new Item[]{Steel_Ingot, Stick}, new Double[]{2.0, 1.0})),
    Bronze_Sword(ItemUtils.createHashMap(new Item[]{Bronze_Ingot, Stick}, new Double[]{2.0, 1.0})),
    Duralumin_Sword(ItemUtils.createHashMap(new Item[]{Duralumin_Ingot, Stick}, new Double[]{2.0, 1.0})),
    Billon_Sword(ItemUtils.createHashMap(new Item[]{Billon_Ingot, Stick}, new Double[]{2.0, 1.0})),
    Brass_Sword(ItemUtils.createHashMap(new Item[]{Brass_Ingot, Stick}, new Double[]{2.0, 1.0})),
    Aluminum_Brass_Sword(ItemUtils.createHashMap(new Item[]{Aluminum_Brass_Ingot, Stick}, new Double[]{2.0, 1.0})),
    Aluminum_Bronze_Sword(ItemUtils.createHashMap(new Item[]{Aluminum_Bronze_Ingot, Stick}, new Double[]{2.0, 1.0})),
    Corinthian_Bronze_Sword(ItemUtils.createHashMap(new Item[]{Corinthian_Bronze_Ingot, Stick}, new Double[]{2.0, 1.0})),
    Solder_Sword(ItemUtils.createHashMap(new Item[]{Solder_Ingot, Stick}, new Double[]{2.0, 1.0})),
    Damascus_Steel_Sword(ItemUtils.createHashMap(new Item[]{Damascus_Steel_Ingot, Stick}, new Double[]{2.0, 1.0})),
    Hardened_Sword(ItemUtils.createHashMap(new Item[]{Hardened_Metal, Stick}, new Double[]{2.0, 1.0})),
    Reinforced_Sword(ItemUtils.createHashMap(new Item[]{Reinforced_Alloy_Ingot, Stick}, new Double[]{2.0, 1.0})),
    Ferrosilicon_Sword(ItemUtils.createHashMap(new Item[]{Ferrosilicon, Stick}, new Double[]{2.0, 1.0})),
    Gilded_Iron_Sword(ItemUtils.createHashMap(new Item[]{Gilded_Iron_Ingot, Stick}, new Double[]{2.0, 1.0})),
    Nickel_Sword(ItemUtils.createHashMap(new Item[]{Nickel_Ingot, Stick}, new Double[]{2.0, 1.0})),
    Cobalt_Sword(ItemUtils.createHashMap(new Item[]{Cobalt_Ingot, Stick}, new Double[]{2.0, 1.0})),
    Synthetic_Diamond_Sword(ItemUtils.createHashMap(new Item[]{Synthetic_Diamond, Stick}, new Double[]{2.0, 1.0})),
    Carbonado_Sword(ItemUtils.createHashMap(new Item[]{Carbonado, Stick}, new Double[]{2.0, 1.0})),

    Steel_Axe(ItemUtils.createHashMap(new Item[]{Steel_Ingot, Stick}, new Double[]{3.0, 1.0})),
    Bronze_Axe(ItemUtils.createHashMap(new Item[]{Bronze_Ingot, Stick}, new Double[]{3.0, 1.0})),
    Duralumin_Axe(ItemUtils.createHashMap(new Item[]{Duralumin_Ingot, Stick}, new Double[]{3.0, 1.0})),
    Billon_Axe(ItemUtils.createHashMap(new Item[]{Billon_Ingot, Stick}, new Double[]{3.0, 1.0})),
    Brass_Axe(ItemUtils.createHashMap(new Item[]{Brass_Ingot, Stick}, new Double[]{3.0, 1.0})),
    Aluminum_Brass_Axe(ItemUtils.createHashMap(new Item[]{Aluminum_Brass_Ingot, Stick}, new Double[]{3.0, 1.0})),
    Aluminum_Bronze_Axe(ItemUtils.createHashMap(new Item[]{Aluminum_Bronze_Ingot, Stick}, new Double[]{3.0, 1.0})),
    Corinthian_Bronze_Axe(ItemUtils.createHashMap(new Item[]{Corinthian_Bronze_Ingot, Stick}, new Double[]{3.0, 1.0})),
    Solder_Axe(ItemUtils.createHashMap(new Item[]{Solder_Ingot, Stick}, new Double[]{3.0, 1.0})),
    Damascus_Steel_Axe(ItemUtils.createHashMap(new Item[]{Damascus_Steel_Ingot, Stick}, new Double[]{3.0, 1.0})),
    Hardened_Axe(ItemUtils.createHashMap(new Item[]{Hardened_Metal, Stick}, new Double[]{3.0, 1.0})),
    Reinforced_Axe(ItemUtils.createHashMap(new Item[]{Reinforced_Alloy_Ingot, Stick}, new Double[]{3.0, 1.0})),
    Ferrosilicon_Axe(ItemUtils.createHashMap(new Item[]{Ferrosilicon, Stick}, new Double[]{3.0, 1.0})),
    Gilded_Iron_Axe(ItemUtils.createHashMap(new Item[]{Gilded_Iron_Ingot, Stick}, new Double[]{3.0, 1.0})),
    Nickel_Axe(ItemUtils.createHashMap(new Item[]{Nickel_Ingot, Stick}, new Double[]{3.0, 1.0})),
    Cobalt_Axe(ItemUtils.createHashMap(new Item[]{Cobalt_Ingot, Stick}, new Double[]{3.0, 1.0})),
    Synthetic_Diamond_Axe(ItemUtils.createHashMap(new Item[]{Synthetic_Diamond, Stick}, new Double[]{3.0, 1.0})),
    Carbonado_Axe(ItemUtils.createHashMap(new Item[]{Carbonado, Stick}, new Double[]{3.0, 1.0})),


    // ------------- Items
    Portable_Crafter(ItemUtils.createHashMap(new Item[]{Book, Crafting_Table}, new Double[]{1.0, 1.0})),
    Portable_Dustbin(ItemUtils.createHashMap(new Item[]{Iron_Ingot}, new Double[]{8.0})),

    Ender_Backpack(ItemUtils.createHashMap(new Item[]{Leather, Ender_Lump_2, Chest}, new Double[]{4.0, 4.0, 1.0})),
    Small_Backpack(ItemUtils.createHashMap(new Item[]{Leather, Gold_Ingot_6, Chest}, new Double[]{5.0, 2.0, 1.0})),
    Backpack(ItemUtils.createHashMap(new Item[]{Leather, Gold_Ingot_10, Small_Backpack}, new Double[]{5.0, 2.0, 1.0})),
    Large_Backpack(ItemUtils.createHashMap(new Item[]{Leather, Gold_Ingot_14, Backpack}, new Double[]{5.0, 2.0, 1.0})),
    Woven_Backpack(ItemUtils.createHashMap(new Item[]{Cloth, Gold_Ingot_16, Large_Backpack}, new Double[]{5.0, 2.0, 1.0})),
    Gilded_Backpack(ItemUtils.createHashMap(new Item[]{Gold_Ingot_22, Leather, Woven_Backpack}, new Double[]{4.0, 2.0, 1.0})),
    Soulbound_Backpack(ItemUtils.createHashMap(new Item[]{Ender_Lump_2, Essence_of_Afterlife, Gilded_Backpack}, new Double[]{4.0, 2.0, 1.0})),
    Cooler(ItemUtils.createHashMap(new Item[]{Cloth, Aluminum_Ingot, Cooling_Unit}, new Double[]{3.0, 5.0, 1.0})),

    Rag(ItemUtils.createHashMap(new Item[]{Cloth, String}, new Double[]{6.0, 2.0})),
    Bandage(ItemUtils.createHashMap(new Item[]{Rag, String}, new Double[]{0.5 ,0.25})),
    Splint(ItemUtils.createHashMap(new Item[]{Iron_Ingot, Stick}, new Double[]{0.5, 0.75})),
    Vitamins(ItemUtils.createHashMap(new Item[]{Tin_Can, Apple, Red_Mushroom, Sugar_Canes}, new Double[]{1.0, 1.0, 1.0, 1.0})),
    Medicine(ItemUtils.createHashMap(new Item[]{Vitamins, Glass_Bottle, Heavy_Cream}, new Double[]{1.0, 1.0, 1.0})),


    // ------------- Tools
    Gold_Pan(ItemUtils.createHashMap(new Item[]{Stone, Bowl}, new Double[]{5.0, 1.0})),
    Grappling_Hook(ItemUtils.createHashMap(new Item[]{Hook, Chain}, new Double[]{3.0, 2.0})),
    Crook(ItemUtils.createHashMap(new Item[]{Stick}, new Double[]{4.0})),
    Lumber_Axe(ItemUtils.createHashMap(new Item[]{Synthetic_Diamond, Synthetic_Emerald, Gilded_Iron_Ingot}, new Double[]{2.0, 1.0, 2.0})),

    Smelters_Pickaxe(ItemUtils.createHashMap(new Item[]{Lava_Crystal, Ferrosilicon}, new Double[]{3.0, 2.0})),
    Pickaxe_of_Containment(ItemUtils.createHashMap(new Item[]{Ferrosilicon, Gilded_Iron_Ingot}, new Double[]{3.0, 2.0})),
    Hercules_Pickaxe(ItemUtils.createHashMap(new Item[]{Hardened_Metal, Ferrosilicon}, new Double[]{3.0, 2.0})),
    Explosive_Pickaxe(ItemUtils.createHashMap(new Item[]{TnT, Synthetic_Diamond, Ferrosilicon}, new Double[]{2.0, 1.0, 2.0})),
    Pickaxe_of_the_Seeker(ItemUtils.createHashMap(new Item[]{Compass, Synthetic_Diamond, Ferrosilicon}, new Double[]{2.0, 1.0, 2.0})),
    Cobalt_Pickaxe(ItemUtils.createHashMap(new Item[]{Cobalt_Ingot, Nickel_Ingot}, new Double[]{3.0, 2.0})),
    Pickaxe_of_Vein_Mining(ItemUtils.createHashMap(new Item[]{Synthetic_Diamond, Gilded_Iron_Ingot, Emerald_Ore}, new Double[]{1.0, 2.0, 2.0})),

    Soulbound_Pickaxe(ItemUtils.createHashMap(new Item[]{Diamond_Pickaxe, Essence_of_Afterlife}, new Double[]{1.0, 2.0})),
    Soulbound_Axe(ItemUtils.createHashMap(new Item[]{Diamond_Axe, Essence_of_Afterlife}, new Double[]{1.0, 2.0})),
    Soulbound_Shovel(ItemUtils.createHashMap(new Item[]{Diamond_Shovel, Essence_of_Afterlife}, new Double[]{1.0, 2.0})),
    Soulbound_Hoe(ItemUtils.createHashMap(new Item[]{Diamond_Hoe, Essence_of_Afterlife}, new Double[]{1.0, 2.0})),


    // ------------- Foods
    Fortune_Cookie(ItemUtils.createHashMap(new Item[]{Cookie, Paper}, new Double[]{1.0, 1.0})),
    Magic_Sugar(ItemUtils.createHashMap(new Item[]{Redstone_Dust, Glowstone_Dust, Sugar}, new Double[]{1.0, 1.0, 1.0})),

    Beef_Jerky(ItemUtils.createHashMap(new Item[]{Salt, Steak}, new Double[]{1.0, 1.0})),
    Monster_Jerky(ItemUtils.createHashMap(new Item[]{Salt, Rotten_Flesh}, new Double[]{1.0, 1.0})),

    Apple_Juice(ItemUtils.createHashMap(new Item[]{Apple}, new Double[]{1.0})),
    Carrot_Juice(ItemUtils.createHashMap(new Item[]{Carrot}, new Double[]{1.0})),
    Melon_Juice(ItemUtils.createHashMap(new Item[]{Melon}, new Double[]{1.0})),
    Pumpkin_Juice(ItemUtils.createHashMap(new Item[]{Pumpkin}, new Double[]{1.0})),
    Golden_Apple_Juice(ItemUtils.createHashMap(new Item[]{Golden_Apple}, new Double[]{1.0})),
    ;



    HashMap<Item, Double> ingredients;

    Item(HashMap<Item, Double> ingredients) {
        this.ingredients = ingredients;
    }

    public HashMap<Item, Double> getIngredients() { return ingredients; }

    private static class ItemUtils {

        static HashMap<Item, Double> createHashMap(Item[] items, Double[] amounts) {

            HashMap<Item, Double> ingredients = new HashMap<>();
            for (int i = 0; i < items.length; i++) {

                ingredients.put(items[i], amounts[i]);

            }

            return ingredients;
        }
    }
}
