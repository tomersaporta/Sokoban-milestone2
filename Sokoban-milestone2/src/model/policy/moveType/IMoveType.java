package moveType;

import elements.Position;

/**
 * <h1>command interface</h1>
 * defines the behavior that all the moveType needs to implement
 *
 */

public interface IMoveType {

	public Position getNextPosition(Position p); 
}
