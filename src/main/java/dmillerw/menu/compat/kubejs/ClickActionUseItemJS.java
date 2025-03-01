package dmillerw.menu.compat.kubejs;

import dev.latvian.mods.kubejs.client.ClientEventJS;
import dev.latvian.mods.kubejs.level.LevelEventJS;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;


public class ClickActionUseItemJS extends ClientEventJS {
    private final ItemStack item;

    public ClickActionUseItemJS(ItemStack itemStack) {
        super();
        this.item = itemStack;
    }

    public ItemStack getItem() {
        return this.item;
    }

}
