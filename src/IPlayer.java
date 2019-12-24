public interface IPlayer extends Tree {
  /**
   * Returns the id of the player
   */
  int getPlayerID();

  /**
   * Returns whether the player Node is responding to an action
   */
  boolean isResponse();

  /**
   * Returns the action that the Player is responding to.
   */
  IAction getTrigger();


}
