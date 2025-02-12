package mrthomas20121.gravitation.item.tools;

import com.aetherteam.aether.item.combat.AetherItemTiers;
import com.aetherteam.aether.item.tools.abilities.ZaniteTool;
import com.aetherteam.aether.item.tools.zanite.ZaniteAxeItem;
import mrthomas20121.gravitation.item.BattleAxeItem;
import net.minecraft.world.item.Item;

public class ZaniteBattleAxeItem extends BattleAxeItem implements ZaniteTool {

    public ZaniteBattleAxeItem() {
        super(AetherItemTiers.ZANITE, 6.0F, -3.1F, new Item.Properties());
    }
}
