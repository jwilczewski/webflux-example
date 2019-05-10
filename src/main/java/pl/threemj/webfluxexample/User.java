package pl.threemj.webfluxexample;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User {
    private String id;
    private String name;
    private String familyname;
}
