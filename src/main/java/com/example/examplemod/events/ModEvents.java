package com.example.examplemod.events;

import com.example.examplemod.TutorialModding;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TutorialModding.MOD_ID)
public class ModEvents {

    @SubscribeEvent
    public static void setEntityOnFireWhenHitNetherBrick(LivingDamageEvent event){
        if(!event.getEntity().level.isClientSide){
            if(event.getSource().getDirectEntity() instanceof Player){
                Player player = ((Player) event.getSource().getDirectEntity());
                if(player.getMainHandItem().getItem() == Items.NETHER_BRICK){
                    player.getMainHandItem().shrink(1);
                    event.getEntityLiving().setSecondsOnFire(3);
                }
            }
        }

    }


}
