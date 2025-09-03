package org.example;

import java.util.HashMap;

public class Hofstadter {
  // Your implementations of the sequence goes here.
  // Recall that you can calculate the nth term, G(n), using:
  // G(n) = n - G(G(n-1))
  // G(0) = 0
  HashMap<Integer, Integer> mem = new HashMap<>();
  public Integer gSequence(Integer index) {
    if (index==0){
      return 0;
    }
    return index - gSequence(gSequence(index-1));
  }
  public Integer gSequenceMem(Integer index) {
    if (index==0){
      return 0;
    }

    if (mem.containsKey(index)) {
      return mem.get(index);
    }
    Integer result = index - gSequenceMem(gSequenceMem(index-1));
    mem.put(index, result);
    return result;
  }
}
