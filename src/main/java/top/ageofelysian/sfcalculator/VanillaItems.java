package top.ageofelysian.sfcalculator;

public enum VanillaItems {

    Flint(Item.Flint),
    Glass_Pane(Item.Glass_Pane),
    Coal(Item.Coal);

    Item item;

    VanillaItems(Item item) {
        this.item = item;
    }
}
