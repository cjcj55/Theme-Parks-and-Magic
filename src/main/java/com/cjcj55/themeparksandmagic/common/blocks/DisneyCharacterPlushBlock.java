package com.cjcj55.themeparksandmagic.common.blocks;

import java.util.stream.Stream;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer.Builder;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

public class DisneyCharacterPlushBlock extends Block {
	
	public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
	
	//N
	private static final VoxelShape SHAPE_N = Stream.of(
			Block.makeCuboidShape(6, 0, 8, 10, 5, 10),
			Block.makeCuboidShape(5, 1, 8, 6, 4, 10),
			Block.makeCuboidShape(10, 1, 8, 11, 4, 10),
			Block.makeCuboidShape(5, 5, 8, 11, 11, 11)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
	//W
	private static final VoxelShape SHAPE_W = Stream.of(
			Block.makeCuboidShape(8, 0, 6, 10, 5, 10),
			Block.makeCuboidShape(8, 1, 10, 10, 4, 11),
			Block.makeCuboidShape(8, 1, 5, 10, 4, 6),
			Block.makeCuboidShape(8, 5, 5, 11, 11, 11)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
	//S
	private static final VoxelShape SHAPE_S = Stream.of(
			Block.makeCuboidShape(6, 0, 6, 10, 5, 8),
			Block.makeCuboidShape(10, 1, 6, 11, 4, 8),
			Block.makeCuboidShape(5, 1, 6, 6, 4, 8),
			Block.makeCuboidShape(5, 5, 5, 11, 11, 8)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
	//E
	private static final VoxelShape SHAPE_E = Stream.of(
			Block.makeCuboidShape(6, 0, 6, 8, 5, 10),
			Block.makeCuboidShape(6, 1, 5, 8, 4, 6),
			Block.makeCuboidShape(6, 1, 10, 8, 4, 11),
			Block.makeCuboidShape(5, 5, 5, 8, 11, 11)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
	
	public DisneyCharacterPlushBlock() {
		super(Block.Properties.create(Material.WOOL).hardnessAndResistance(2.0f, 4.0f).harvestLevel(0).sound(SoundType.CLOTH));
		this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
	}
	
	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		switch(state.get(FACING)) {
		case NORTH:
			return SHAPE_N;
		case SOUTH:
			return SHAPE_S;
		case EAST:
			return SHAPE_E;
		case WEST:
			return SHAPE_W;
		default: 
			return SHAPE_N;
		}
	}
	
	@Override
	public BlockState getStateForPlacement(BlockItemUseContext context) {
		return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
	}
	
	@Override
	public BlockState rotate(BlockState state, Rotation rot) {
		return state.with(FACING, rot.rotate(state.get(FACING)));
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.toRotation(state.get(FACING)));
	}
	
	@Override
	protected void fillStateContainer(Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}
}
