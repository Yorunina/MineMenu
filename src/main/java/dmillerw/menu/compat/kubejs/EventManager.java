package dmillerw.menu.compat.kubejs;

import net.minecraft.world.item.ItemStack;

import static dmillerw.menu.MineMenu.KUBEJS_LOADED;
import static dmillerw.menu.compat.kubejs.MMKubeJSPlugin.CLICK_ACTION_USE_ITEM_EVENT;

public class EventManager {
    public static void postClickActionUseItemEvent(ItemStack item) {
        if (KUBEJS_LOADED) {
            CLICK_ACTION_USE_ITEM_EVENT.post(new ClickActionUseItemJS(item));
        }
    }
}

