# NLHE-Tree-Generator
multi street post-flop decision tree generator.

The purpose of this repository is to serve as a basic library for generating data-structures
that comprehensively represent No Limit Holdem decision trees.

By specififying the stack sizes and the pot sizes, and bet-sizes, a decision tree can be generated
that covers all possible bets, checks, raises, and folds.

The library itself is good for understanding how stack to pot ratio effects decision tree size.

Limitations:
- Extra nodes are not added for individual turn and river cards. This would add meaningless complexity
