import java.util.ArrayList;

public interface TreeBuilder {
  /**
   * Builds the decision tree and returns it.
   * Stacks and pot are passed in the unit of Big Blinds
   */
  Tree buildTree(Double stacks, Double pot, ArrayList<Double> betSize);
}
