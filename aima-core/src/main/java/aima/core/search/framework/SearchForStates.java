package aima.core.search.framework;

import aima.core.search.framework.problem.Problem;

/**
 * Interface for all search algorithms which forget the exploration history and
 * return just a single state which is hopefully a goal state.
 * 
 * @author Ruediger Lunde
 *
 */
public interface SearchForStates extends SearchInfrastructure {
	/**
	 * Returns a state which is might be but not necessary is a goal state of
	 * the problem.
	 * 
	 * @param p
	 *            the search problem
	 * 
	 * @return a state.
	 */
	Object searchState(Problem p);
}