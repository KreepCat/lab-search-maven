package edu.grinnell.csc207.experiments;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import edu.grinnell.csc207.util.SearchUtils;
import java.util.function.Predicate;

/**
 * Assorted experiments for searching structures.
 *
 * @author SJ Kim
 * @author Alex Pollock
 * @author Samuel A. Rebelsky (starter code)
 */
public class SearchExperiments {
  /**
   * Run our experimens.
   *
   * @param args Command-line arguments. Ignored.
   */
  public static void main(String[] args) throws Exception {
    PrintWriter pen = new PrintWriter(System.out, true);

    String[] tmp = new String[] {"alpha", "bravo", "charlie", "delta", "echo", "foxtrot", "golf",
        "hotel", "india", "juliett", "kilo", "lima", "mike", "november", "oscar", "papa", "quebec",
        "romeo", "sierra", "tango", "uniform", "victor", "whiskey", "xray", "yankee", "zulu"};
    ArrayList<String> strings = new ArrayList<String>(Arrays.asList(tmp));



    try {
      Predicate<String> lessThanFiveChars = new Predicate<String>() {
        public boolean test(String str) {
          return (str.length() < 5);
        } // test(String)
      };
      String ex1c = SearchUtils.search(strings, lessThanFiveChars);
      pen.println("The first string of fewer than five letters is " + ex1c);
    } catch (Exception e) {
      pen.println("There are no strings of fewer than five letters.");
    } // try/catch


    try {
      String ex1g = SearchUtils.search(strings, (s) -> s.length() == 6);
      pen.println("The first string of exactly six letters is " + ex1g);
    } catch (Exception e) {
      pen.println("There are no strings of exactly six letters.");
    } // try/catch

    try {
      String ex1g = SearchUtils.search(strings, (s) -> s.contains("u"));
      pen.println("first thing with u" + ex1g);
    } catch (Exception e) {
      pen.println("its an element with no u");
    } // try/catch

    pen.close();
  } // main(String[])
} // class SearchUtils
