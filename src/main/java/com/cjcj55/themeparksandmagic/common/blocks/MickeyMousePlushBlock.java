package com.cjcj55.themeparksandmagic.common.blocks;

import java.util.stream.Stream;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
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

public class MickeyMousePlushBlock extends Block {
	
	public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
	
	//N
	private static final VoxelShape SHAPE_S = Stream.of(
			Block.makeCuboidShape(6, 0, 6, 10, 5, 8),
			Block.makeCuboidShape(5.881731227923378, -8.881784197001252e-16, 7.62026222357982, 7.881731227923378, 1.9999999999999991, 10.62026222357982),
			Block.makeCuboidShape(8.118268772076622, -8.881784197001252e-16, 7.62026222357982, 10.118268772076622, 1.9999999999999991, 10.62026222357982),
			Block.makeCuboidShape(5, 5, 5, 11, 11, 8),
			Block.makeCuboidShape(6, 5, 8, 10, 9, 9),
			Block.makeCuboidShape(5.881731227923378, -8.881784197001252e-16, 10.62026222357982, 7.881731227923378, 2.999999999999999, 11.62026222357982),
			Block.makeCuboidShape(8.118268772076622, -8.881784197001252e-16, 10.62026222357982, 10.118268772076622, 2.999999999999999, 11.62026222357982),
			Block.makeCuboidShape(5, 1, 6, 6, 4, 8),
			Block.makeCuboidShape(10, 1, 6, 11, 4, 8),
			Block.makeCuboidShape(5, 10, 6, 6, 13, 7),
			Block.makeCuboidShape(10, 10, 6, 11, 13, 7),
			Block.makeCuboidShape(6, 11, 6, 7, 12, 7),
			Block.makeCuboidShape(11, 11, 6, 12, 12, 7),
			Block.makeCuboidShape(4, 11, 6, 5, 12, 7),
			Block.makeCuboidShape(9, 11, 6, 10, 12, 7),
			Block.makeCuboidShape(7, 9, 8, 9, 10, 9)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
	//W
	private static final VoxelShape SHAPE_E = Stream.of(
			Block.makeCuboidShape(6.40625, 0, 5.59375, 8.40625, 5, 9.59375),
			Block.makeCuboidShape(8.02651222357982, -8.881784197001252e-16, 7.712018772076622, 11.02651222357982, 1.9999999999999991, 9.712018772076622),
			Block.makeCuboidShape(8.02651222357982, -8.881784197001252e-16, 5.475481227923378, 11.02651222357982, 1.9999999999999991, 7.475481227923378),
			Block.makeCuboidShape(5.40625, 5, 4.59375, 8.40625, 11, 10.59375),
			Block.makeCuboidShape(8.40625, 5, 5.59375, 9.40625, 9, 9.59375),
			Block.makeCuboidShape(11.02651222357982, -8.881784197001252e-16, 7.712018772076622, 12.02651222357982, 2.999999999999999, 9.712018772076622),
			Block.makeCuboidShape(11.02651222357982, -8.881784197001252e-16, 5.475481227923378, 12.02651222357982, 2.999999999999999, 7.475481227923378),
			Block.makeCuboidShape(6.40625, 1, 9.59375, 8.40625, 4, 10.59375),
			Block.makeCuboidShape(6.40625, 1, 4.59375, 8.40625, 4, 5.59375),
			Block.makeCuboidShape(6.40625, 10.339912511250787, 5.41437139468195, 7.40625, 13.339912511250787, 6.41437139468195),
			Block.makeCuboidShape(6.40625, 10.339912511250787, 8.77312860531805, 7.40625, 13.339912511250787, 9.77312860531805),
			Block.makeCuboidShape(6.40625, 11.339912511250787, 4.41437139468195, 7.40625, 12.339912511250787, 5.41437139468195),
			Block.makeCuboidShape(6.40625, 11.339912511250787, 7.77312860531805, 7.40625, 12.339912511250787, 8.77312860531805),
			Block.makeCuboidShape(6.40625, 11.339912511250787, 6.41437139468195, 7.40625, 12.339912511250787, 7.41437139468195),
			Block.makeCuboidShape(6.40625, 11.339912511250787, 9.77312860531805, 7.40625, 12.339912511250787, 10.77312860531805),
			Block.makeCuboidShape(8.40625, 9, 6.59375, 9.40625, 10, 8.59375)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
	//S
	private static final VoxelShape SHAPE_N = Stream.of(
			Block.makeCuboidShape(6, 0, 7.1875, 10, 5, 9.1875),
			Block.makeCuboidShape(8.118268772076622, -8.881784197001252e-16, 4.56723777642018, 10.118268772076622, 1.9999999999999991, 7.56723777642018),
			Block.makeCuboidShape(5.881731227923378, -8.881784197001252e-16, 4.56723777642018, 7.881731227923378, 1.9999999999999991, 7.56723777642018),
			Block.makeCuboidShape(5, 5, 7.1875, 11, 11, 10.1875),
			Block.makeCuboidShape(6, 5, 6.1875, 10, 9, 7.1875),
			Block.makeCuboidShape(8.118268772076622, -8.881784197001252e-16, 3.56723777642018, 10.118268772076622, 2.999999999999999, 4.56723777642018),
			Block.makeCuboidShape(5.881731227923378, -8.881784197001252e-16, 3.56723777642018, 7.881731227923378, 2.999999999999999, 4.56723777642018),
			Block.makeCuboidShape(10, 1, 7.1875, 11, 4, 9.1875),
			Block.makeCuboidShape(5, 1, 7.1875, 6, 4, 9.1875),
			Block.makeCuboidShape(5.82062139468195, 10.339912511250787, 8.1875, 6.82062139468195, 13.339912511250787, 9.1875),
			Block.makeCuboidShape(9.17937860531805, 10.339912511250787, 8.1875, 10.17937860531805, 13.339912511250787, 9.1875),
			Block.makeCuboidShape(4.82062139468195, 11.339912511250787, 8.1875, 5.82062139468195, 12.339912511250787, 9.1875),
			Block.makeCuboidShape(8.17937860531805, 11.339912511250787, 8.1875, 9.17937860531805, 12.339912511250787, 9.1875),
			Block.makeCuboidShape(6.82062139468195, 11.339912511250787, 8.1875, 7.82062139468195, 12.339912511250787, 9.1875),
			Block.makeCuboidShape(10.17937860531805, 11.339912511250787, 8.1875, 11.17937860531805, 12.339912511250787, 9.1875),
			Block.makeCuboidShape(7, 9, 6.1875, 9, 10, 7.1875)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
	//E
	private static final VoxelShape SHAPE_W = Stream.of(
			Block.makeCuboidShape(7.59375, 0, 5.59375, 9.59375, 5, 9.59375),
			Block.makeCuboidShape(4.97348777642018, -8.881784197001252e-16, 5.475481227923378, 7.97348777642018, 1.9999999999999991, 7.475481227923378),
			Block.makeCuboidShape(4.97348777642018, -8.881784197001252e-16, 7.712018772076622, 7.97348777642018, 1.9999999999999991, 9.712018772076622),
			Block.makeCuboidShape(7.59375, 5, 4.59375, 10.59375, 11, 10.59375),
			Block.makeCuboidShape(6.59375, 5, 5.59375, 7.59375, 9, 9.59375),
			Block.makeCuboidShape(3.97348777642018, -8.881784197001252e-16, 5.475481227923378, 4.97348777642018, 2.999999999999999, 7.475481227923378),
			Block.makeCuboidShape(3.97348777642018, -8.881784197001252e-16, 7.712018772076622, 4.97348777642018, 2.999999999999999, 9.712018772076622),
			Block.makeCuboidShape(7.59375, 1, 4.59375, 9.59375, 4, 5.59375),
			Block.makeCuboidShape(7.59375, 1, 9.59375, 9.59375, 4, 10.59375),
			Block.makeCuboidShape(8.59375, 10.339912511250787, 8.77312860531805, 9.59375, 13.339912511250787, 9.77312860531805),
			Block.makeCuboidShape(8.59375, 10.339912511250787, 5.41437139468195, 9.59375, 13.339912511250787, 6.41437139468195),
			Block.makeCuboidShape(8.59375, 11.339912511250787, 9.77312860531805, 9.59375, 12.339912511250787, 10.77312860531805),
			Block.makeCuboidShape(8.59375, 11.339912511250787, 6.41437139468195, 9.59375, 12.339912511250787, 7.41437139468195),
			Block.makeCuboidShape(8.59375, 11.339912511250787, 7.77312860531805, 9.59375, 12.339912511250787, 8.77312860531805),
			Block.makeCuboidShape(8.59375, 11.339912511250787, 4.41437139468195, 9.59375, 12.339912511250787, 5.41437139468195),
			Block.makeCuboidShape(6.59375, 9, 6.59375, 7.59375, 10, 8.59375)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
	
	public MickeyMousePlushBlock(Properties properties) {
		super(properties);
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
