package earth.terrarium.adastra.common.constants;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;

public class ConstantComponents {
    public static final Component ITEM_GROUP = Component.translatable("itemGroup.adastra.main");
    public static final Component DEATH_OXYGEN = Component.translatable("death.attack.oxygen");
    public static final Component DEATH_OXYGEN_PLAYER = Component.translatable("death.attack.oxygen.player");

    public static final Component TOGGLE_SUIT_FLIGHT_KEY = Component.translatable("key.adastra.toggle_suit_flight");
    public static final Component AD_ASTRA_CATEGORY = Component.translatable("key.categories.adastra");

    public static final Component SUIT_FLIGHT_ENABLED = Component.translatable("message.adastra.suit_flight_enabled").withStyle(ChatFormatting.GOLD);
    public static final Component SUIT_FLIGHT_DISABLED = Component.translatable("message.adastra.suit_flight_disabled").withStyle(ChatFormatting.GOLD);

    public static final Component OXYGEN_TRUE = Component.translatable("text.adastra.oxygen_true");
    public static final Component OXYGEN_FALSE = Component.translatable("text.adastra.oxygen_false");

    public static final Component TI_69_TOOLTIP_1 = Component.translatable("tooltip.adastra.ti_69_1");
    public static final Component TI_69_TOOLTIP_2 = Component.translatable("tooltip.adastra.ti_69_2");

    public static final Component SIDE_CONFIG = Component.translatable("tooltip.adastra.side_config");
    public static final Component REDSTONE_CONTROL = Component.translatable("tooltip.adastra.redstone_control");

    public static final Component REDSTONE_ALWAYS_ON = Component.translatable("tooltip.adastra.redstone.always_on");
    public static final Component REDSTONE_NEVER_ON = Component.translatable("tooltip.adastra.redstone.never_on");
    public static final Component REDSTONE_ON_WHEN_POWERED = Component.translatable("tooltip.adastra.redstone.on_when_powered");
    public static final Component REDSTONE_ON_WHEN_NOT_POWERED = Component.translatable("tooltip.adastra.redstone.on_when_not_powered");

    public static final Component ACTIVE = Component.translatable("tooltip.adastra.active");
    public static final Component INACTIVE = Component.translatable("tooltip.adastra.inactive");

    public static final Component SEQUENTIAL = Component.translatable("tooltip.adastra.distribution_mode.sequential");
    public static final Component ROUND_ROBIN = Component.translatable("tooltip.adastra.distribution_mode.round_robin");

    public static final Component CAPACITOR_ENABLED = Component.translatable("tooltip.adastra.capacitor.enabled");
    public static final Component CAPACITOR_DISABLED = Component.translatable("tooltip.adastra.capacitor.disabled");

    public static final Component CHANGE_MODE_SEQUENTIAL = Component.translatable("tooltip.adastra.change_mode.sequential");
    public static final Component CHANGE_MODE_ROUND_ROBIN = Component.translatable("tooltip.adastra.change_mode.round_robin");
}
