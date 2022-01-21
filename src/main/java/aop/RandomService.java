package aop;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RandomService {

  Random random;

  public RandomService() {
    random = new Random();
  }

  public int getRandom(int max) {
    return random.nextInt(max);
  }
}
