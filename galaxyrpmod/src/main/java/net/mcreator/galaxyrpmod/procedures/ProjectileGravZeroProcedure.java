package net.mcreator.galaxyrpmod.procedures;

import net.minecraft.world.entity.Entity;

public class ProjectileGravZeroProcedure {
	public static void execute(Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		immediatesourceentity.setNoGravity((true));
	}
}
