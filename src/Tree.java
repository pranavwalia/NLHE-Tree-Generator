import java.util.ArrayList;

/**
 * A Tree represents an entire post flop game tree.
 */
public interface Tree {
  /**
   * Counts all nodes in decision tree
   * @return int counting all nodes in Decision tree
   */
  int countNodes();

  /**
   * Returns all child-nodes
   */
  ArrayList<Tree> getChildren();

  /**
   * Generates children for the Tree
   */
  void generateChildren();

  /**
   * Returns the size of the pot
   */
  Double getPotSize();

  /**
   * Returns a list of players involved in the game Tree
   */
  ArrayList<IPlayer> getPlayers();

  /**
   * Returns the current street of the node:
   * {1,2,3} for Flop, Turn, River respectively
   */
  int getStreet();

}
