package millie.domain;

import javax.persistence.Embeddable;
import lombok.*;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserId {
    private Long id;
}
