package aop;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NameService {
  private final List<String> names;

  public NameService () {
    names = List.of(
            "Jim", "Pam", "Michael", "Dwight", "Stanley",
            "Angela", "Kevin", "Oscar", "Ryan", "Erin", "kelly",
            "Creed", "Meredith", "Phyllis",
            "David", "Robert", "Jo", "Gabe", "Holly", "Jan",
            "Carol", "Nate", "Darryl"
    );
  }

  public int length () {
    return names.size();
  }

  @AOPWay2Annotation
  public String getName (int index) {
    return names.get(index);
  }
}
