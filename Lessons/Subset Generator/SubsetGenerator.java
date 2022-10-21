import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class SubsetGenerator {
  private String str;

  public SubsetGenerator(String str) {
    this.str = str;
  }

  public List<String> getSubsets() {
    List<String> subs = new ArrayList<String>();

    if (str.length() == 0) {
      subs.add(this.str);
      return subs;
    }

    String firstLetter = this.str.substring(0, 1);
    String restOfString = this.str.substring(1);

    SubsetGenerator restSubsGenerator = new SubsetGenerator(restOfString);
    List<String> restSubs = restSubsGenerator.getSubsets();

    for (String sub : restSubs) {
      subs.add(sub);
      subs.add(firstLetter + sub);
    }

    return subs;

  }
}