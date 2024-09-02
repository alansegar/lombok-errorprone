package org.example;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Set;

@Slf4j
public class ShortSet {

  public static void main (String[] args) {
    Set<Short> s = new HashSet<>();
    for (short i = 0; i < 100; i++) {
      // log is created by Lombok
      // if Lombok is working, there should not be a compile error about cannot find symbol log
      log.debug("Processing i={}", i);
      s.add(i);
      // From https://github.com/google/error-prone?tab=readme-ov-file
      // This should trigger an error during compilation if Error Prone is working
      s.remove(i - 1);
    }
    System.out.println(s.size());
  }
}