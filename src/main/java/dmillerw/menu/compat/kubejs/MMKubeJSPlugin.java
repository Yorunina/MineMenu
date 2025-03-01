package dmillerw.menu.compat.kubejs;

import dev.latvian.mods.kubejs.KubeJSPlugin;
import dev.latvian.mods.kubejs.event.EventGroup;
import dev.latvian.mods.kubejs.event.EventHandler;


public class MMKubeJSPlugin extends KubeJSPlugin {

    public static EventGroup MMGROUP = EventGroup.of("MineMenuEvents");
    public static EventHandler CLICK_ACTION_USE_ITEM_EVENT = MMGROUP
            .client("clickActionUseItem", () -> ClickActionUseItemJS.class);

    @Override
    public void registerEvents() {
        MMGROUP.register();
    }

}