public interface IAction extends Tree {
  /**
   * Returns the name of the action
   * {Bet, Raise, Check, Call, Fold}
    */
  String getname();

  /**
   *Returns the player whom the action belongs to.
   */
  IPlayer getPlayer();

  /**
   * Updates the stack sizes and pot sizes based on the nature of the action
   */
  void updatePot();


}
