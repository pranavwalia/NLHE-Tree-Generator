import java.util.ArrayList;

public class PlayerImpl implements IPlayer {
  private int id;
  private ArrayList<Tree> children;
  private double pot;
  private double stack;
  private ArrayList<IPlayer> players;
  private int street;
  private IAction prev;


  public PlayerImpl(int id, double pot, double stack, int street, IAction prev) {
    this.id = id;
    this.pot = pot;
    this.stack = stack;
    this.street = street;
    this.prev = prev;
  }

  /**
   * Counts all nodes in decision tree
   *
   * @return int counting all nodes in Decision tree
   */
  @Override
  public int countNodes() {
    int nodes = 1;
    for (Tree t : this.getChildren()) {
      nodes+=t.countNodes();
    }
    return nodes;
  }

  /**
   * Returns all child-nodes
   */
  @Override
  public ArrayList<Tree> getChildren() {
    return this.children;
  }

  /**
   * Generates children for the Tree
   */
  @Override
  public void generateChildren() {
    if (!isResponse()) {
      //Build bet
      //Build check
    } else {
    }
  }

  /**
   * Returns the size of the pot
   */
  @Override
  public Double getPotSize() {
    return this.pot;
  }

  /**
   * Returns a list of players involved in the game Tree
   */
  @Override
  public ArrayList<IPlayer> getPlayers() {
    return this.players;
  }

  /**
   * Returns the current street of the node: {1,2,3} for Flop, Turn, River respectively
   */
  @Override
  public int getStreet() {
    return this.street;
  }

  /**
   * Returns the id of the player
   */
  @Override
  public int getPlayerID() {
    return this.id;
  }

  /**
   * Returns whether the player Node is responding to an action
   */
  @Override
  public boolean isResponse() {
    return this.prev != null;
  }

  /**
   * Returns the action that the Player is responding to.
   */
  @Override
  public IAction getTrigger() throws IllegalAccessException {
    if (this.isResponse()) {
      return this.prev;
    } else {
      throw new IllegalAccessException("No Previous Action Stored");
    }
  }
}
