package dmillerw.menu.gui.menu.box;

import net.minecraft.SharedConstants;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.network.chat.Component;

public class TitleEditBox extends EditBox {

    public TitleEditBox(Font font, int p_94115_, int p_94116_, int p_94117_, int p_94118_, Component p_94119_) {
        super(font, p_94115_, p_94116_, p_94117_, p_94118_, p_94119_);
    }


    @Override
    public boolean mouseClicked(double p_93641_, double p_93642_, int p_93643_) {
        if (this.active && this.visible) {
            if (this.isValidClickButton(p_93643_)) {
                boolean flag = this.clicked(p_93641_, p_93642_);
                if (flag) {
                    this.playDownSound(Minecraft.getInstance().getSoundManager());
                    this.onClick(p_93641_, p_93642_);
                    return true;
                }
            }
            this.setFocused(false);
            return false;
        } else {
            return false;
        }
    }
    @Override
    public void onClick(double mx, double my) {
        super.onClick(mx, my);
        this.setFocused(!this.isFocused());
    }
}
