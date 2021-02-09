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

public class DonaldDuckPlushBlock extends Block {
	
	public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
	
	//N
	private static final VoxelShape SHAPE_N = Stream.of(
			Block.makeCuboidShape(6, 0, 7, 10, 5, 9),
			Block.makeCuboidShape(5, 1, 7, 6, 4, 9),
			Block.makeCuboidShape(10, 1, 7, 11, 4, 9),
			Block.makeCuboidShape(5, 0, 5, 7, 2, 8),
			Block.makeCuboidShape(9, 0, 5, 11, 2, 8),
			Block.makeCuboidShape(5, 0, 4, 7, 3, 5),
			Block.makeCuboidShape(9, 0, 4, 11, 3, 5),
			Block.makeCuboidShape(5, 5, 7, 11, 11, 10),
			Block.makeCuboidShape(4, 11, 6, 8, 13, 10),
			Block.makeCuboidShape(8, 11, 8, 9, 12, 9),
			Block.makeCuboidShape(7, 7, 3, 9, 8, 6),
			Block.makeCuboidShape(7, 6, 4, 9, 7, 6),
			Block.makeCuboidShape(6, 5, 6, 10, 10, 7),
			Block.makeCuboidShape(7, 3, 6, 9, 4, 7)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
	//W
	private static final VoxelShape SHAPE_W = Stream.of(
			Block.makeCuboidShape(8.214285714285715, 0, 5.571428571428573, 10.214285714285715, 5, 9.571428571428573),
			Block.makeCuboidShape(8.214285714285715, 1, 9.571428571428573, 10.214285714285715, 4, 10.571428571428573),
			Block.makeCuboidShape(8.214285714285715, 1, 4.571428571428573, 10.214285714285715, 4, 5.571428571428573),
			Block.makeCuboidShape(5.5796340539920655, 0, 7.9763236412517955, 8.579634053992063, 2, 9.976323641251795),
			Block.makeCuboidShape(5.4976304613424025, 0, 5.182845030352929, 8.497630461342402, 2, 7.182845030352929),
			Block.makeCuboidShape(4.5796340539920655, 0, 7.9763236412517955, 5.5796340539920655, 3, 9.976323641251795),
			Block.makeCuboidShape(4.4976304613424025, 0, 5.182845030352929, 5.4976304613424025, 3, 7.182845030352929),
			Block.makeCuboidShape(8.214285714285715, 5, 4.571428571428573, 11.214285714285715, 11, 10.571428571428573),
			Block.makeCuboidShape(7.2142857142857135, 10.726760446150978, 7.912046285838251, 11.214285714285715, 12.726760446150978, 11.912046285838251),
			Block.makeCuboidShape(9.214285714285715, 10.726760446150978, 6.912046285838251, 10.214285714285715, 11.726760446150978, 7.912046285838251),
			Block.makeCuboidShape(4.214285714285714, 7, 6.571428571428572, 7.2142857142857135, 8, 8.571428571428573),
			Block.makeCuboidShape(5.214285714285714, 6, 6.571428571428572, 7.2142857142857135, 7, 8.571428571428573),
			Block.makeCuboidShape(7.2142857142857135, 5, 5.571428571428573, 8.214285714285715, 10, 9.571428571428573),
			Block.makeCuboidShape(7.2142857142857135, 3, 6.571428571428572, 8.214285714285715, 4, 8.571428571428573)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
	//S
	private static final VoxelShape SHAPE_S = Stream.of(
			Block.makeCuboidShape(5.7370546122271895, 0, 6.4058025306299555, 9.73705461222719, 5, 8.405802530629956),
			Block.makeCuboidShape(9.73705461222719, 1, 6.4058025306299555, 10.73705461222719, 4, 8.405802530629956),
			Block.makeCuboidShape(4.7370546122271895, 1, 6.4058025306299555, 5.7370546122271895, 4, 8.405802530629956),
			Block.makeCuboidShape(8.145653679144097, 0, 8.021832940055802, 10.145653679144097, 2, 11.021832940055798),
			Block.makeCuboidShape(5.352175068245233, 0, 8.141079034441077, 7.352175068245233, 2, 11.141079034441074),
			Block.makeCuboidShape(8.145653679144097, 0, 11.021832940055798, 10.145653679144097, 3, 12.021832940055798),
			Block.makeCuboidShape(5.352175068245233, 0, 11.141079034441074, 7.352175068245233, 3, 12.141079034441074),
			Block.makeCuboidShape(4.7370546122271895, 5, 5.4058025306299555, 10.73705461222719, 11, 8.405802530629956),
			Block.makeCuboidShape(7.485692558762874, 11, 5.4058025306299555, 11.485692558762874, 13, 9.405802530629956),
			Block.makeCuboidShape(6.4856925587628735, 11, 6.4058025306299555, 7.485692558762874, 12, 7.4058025306299555),
			Block.makeCuboidShape(6.7370546122271895, 7, 9.405802530629956, 8.73705461222719, 8, 12.405802530629956),
			Block.makeCuboidShape(6.7370546122271895, 6, 9.405802530629956, 8.73705461222719, 7, 11.405802530629956),
			Block.makeCuboidShape(5.7370546122271895, 5, 8.405802530629956, 9.73705461222719, 10, 9.405802530629956),
			Block.makeCuboidShape(6.7370546122271895, 3, 8.405802530629956, 8.73705461222719, 4, 9.405802530629956)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
	//E
	private static final VoxelShape SHAPE_E = Stream.of(
			Block.makeCuboidShape(6.509652865213286, 0, 5.821257926473194, 8.509652865213287, 5, 9.821257926473194),
			Block.makeCuboidShape(6.509652865213286, 1, 4.821257926473194, 8.509652865213287, 4, 5.821257926473194),
			Block.makeCuboidShape(6.509652865213286, 1, 9.821257926473194, 8.509652865213287, 4, 10.821257926473194),
			Block.makeCuboidShape(8.149323813930376, 0, 5.417361255192841, 11.149323813930373, 2, 7.417361255192841),
			Block.makeCuboidShape(8.221288829733165, 0, 8.210839866091703, 11.221288829733162, 2, 10.210839866091703),
			Block.makeCuboidShape(11.149323813930373, 0, 5.417361255192841, 12.149323813930373, 3, 7.417361255192841),
			Block.makeCuboidShape(11.221288829733162, 0, 8.210839866091703, 12.221288829733162, 3, 10.210839866091703),
			Block.makeCuboidShape(5.509652865213286, 5, 4.821257926473194, 8.509652865213287, 11, 10.821257926473194),
			Block.makeCuboidShape(5.509652865213286, 11, 3.55605204371631, 9.509652865213287, 13, 7.55605204371631),
			Block.makeCuboidShape(6.509652865213286, 11, 7.55605204371631, 7.509652865213286, 12, 8.55605204371631),
			Block.makeCuboidShape(9.509652865213287, 7, 6.821257926473194, 12.509652865213287, 8, 8.821257926473194),
			Block.makeCuboidShape(9.509652865213287, 6, 6.821257926473194, 11.509652865213287, 7, 8.821257926473194),
			Block.makeCuboidShape(8.509652865213287, 5, 5.821257926473194, 9.509652865213287, 10, 9.821257926473194),
			Block.makeCuboidShape(8.509652865213287, 3, 6.821257926473194, 9.509652865213287, 4, 8.821257926473194)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
	
	public DonaldDuckPlushBlock(Properties properties) {
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
