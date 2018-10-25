/**
 * JUnit tests for BFS implementation.
 */

import org.junit.*;
import java.util.*;

public class BFSTest
{
  private static final LinkedList<Integer> ADJLIST_0 = 
                new LinkedList<Integer>()
                            {{add(1);}};
                              /*
                              {0, 4, 5},
                              {3, 4, 5},
                              {2, 6},
                              {1, 2},
                              {1, 2, 6},
                              {3, 5},
                              {}));
                              */
  
  @Test
  public void testBFSAlgorithm(LinkedList adjlist, int source, int dest)
  {
    System.out.println("List: " + ADJLIST_0.toString());
  }
  // test for run-time: under 3 seconds

  // 
}
