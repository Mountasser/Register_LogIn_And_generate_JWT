package ma.khal.shop.api;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestApi {
    @GetMapping(value="/Mod")
    @PreAuthorize("hasRole('MODERATOR')")
    public void tesModerator(){
    }
    @GetMapping(value="/User")
    @PreAuthorize("hasRole('USER')")
    public void testUser(){
    }
    @GetMapping(value="/Admin")
    @PreAuthorize("hasRole('ADMIN')")
    public void test(){
    }
}
