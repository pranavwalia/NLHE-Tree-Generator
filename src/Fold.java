import java.util.ArrayList;

public class Fold implements IAction {
  /**
   * Returns the name of the action {Bet, Raise, Check, Call, Fold}
   */
  @Override
  public String getname() {
    return null;
  }

  /**
   * Returns the player whom the action belongs to.
   */
  @Override
  public IPlayer getPlayer() {
    return null;
  }

  /**
   * Updates the stack sizes and pot sizes based on the nature of the action
   */
  @Override
  public void updatePot() {

  }

  /**
   * Is this IAction a bet?
   */
  @Override
  public boolean isBet() {
    return false;
  }

  /**
   * Is this IAction a check?
   */
  @Override
  public boolean isCheck() {
    return false;
  }

  /**
   * Is this Iaction a call?
   */
  @Override
  public boolean isCall() {
    return false;
  }

  /**
   * Is this IAction a raise?
   */
  @Override
  public boolean isRaise() {
    return false;
  }

  /**
   * is this Fold?
   */
  @Override
  public boolean isFold() {
    return false;
  }

  /**
   * Does this action close the street
   */
  @Override
  public boolean closes() {
    return false;
  }

  /**
   * Counts all nodes in decision tree
   *
   * @return int counting all nodes in Decision tree
   */
  @Override
  public int countNodes() {
    return 0;
  }

  /**
   * Returns all child-nodes
   */
  @Override
  public ArrayList<Tree> getChildren() {
    return null;
  }

  /**
   * Generates children for the Tree
   */
  @Override
  public void generateChildren() {

  }

  /**
   * Returns the size of the pot
   */
  @Override
  public Double getPotSize() {
    return null;
  }

  /**
   * Returns a list of players involved in the game Tree
   */
  @Override
  public ArrayList<IPlayer> getPlayers() {
    return null;
  }

  /**
   * Returns the current street of the node: {1,2,3} for Flop, Turn, River respectively
   */
  @Override
  public int getStreet() {
    return 0;
  }
}
