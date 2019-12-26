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

  /**
   *Is this IAction a bet?
   */
  boolean isBet();

  /**
   *Is this IAction a check?
   */
  boolean isCheck();

  /**
   *Is this Iaction a call?
   */
  boolean isCall();

  /**
   *Is this IAction a raise?
   */
  boolean isRaise();

  /**
   *is this Fold?
   */
  boolean isFold();

  /**
   * Does this action close the street
   */
  boolean closes();


}
