package toffydungeons.toffydungeons.DungeonDesign;

import toffydungeons.toffydungeons.GUIs.extendable.AbstractFileMenu;

public class TrapRoomChooser extends AbstractFileMenu {

    private DungeonRoomDesign design;

    public TrapRoomChooser(DungeonRoomDesign design) {
        super("Trap Selector", "traps");
        this.design = design;
    }

    public DungeonRoomDesign getDesign() {
        return design;
    }

}