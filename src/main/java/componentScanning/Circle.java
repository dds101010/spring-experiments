package componentScanning;

import lombok.Data;
import lombok.ToString;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
//@AllArgsConstructor
@ToString
@Scope("prototype")
public class Circle {
  int x;
  int y;
}
