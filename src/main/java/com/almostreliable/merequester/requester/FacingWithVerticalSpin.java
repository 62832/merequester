package com.almostreliable.merequester.requester;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.state.BlockState;

import appeng.api.orientation.FacingWithSpinStrategy;

class FacingWithVerticalSpin extends FacingWithSpinStrategy {

    @Override
    public BlockState setOrientation(BlockState state, Direction facing, int spin) {
        BlockState facingState = setFacing(state, facing);
        return setSpin(facingState, facing != Direction.UP && facing != Direction.DOWN ? 0 : spin);
    }
}
