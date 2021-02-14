package cowzowskin.zowmod.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

// This class just provides the instances of the items to then be later registered.
public class ModItems {
    public static final Item RYE_BREAD = new Item(new FabricItemSettings().group(ItemGroup.FOOD));
}
