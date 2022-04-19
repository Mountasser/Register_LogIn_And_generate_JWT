package ma.khal.shop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@AllArgsConstructor
public class JwtResponse {
    @NotNull
    private String token;
    final private String type = "Bearer";
    @NotNull
    private Long id;
    @NotNull
    private String username;
    @NotNull
    private String email;
    @NotNull
    private List<String> roles;

}
