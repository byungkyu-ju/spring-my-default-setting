package me.andrew.springmydefaultsetting.common;

import me.andrew.springmydefaultsetting.common.domain.UserDomain;
import org.apache.coyote.Request;
import org.springframework.hateoas.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@RestController
public class LoginController {

    @GetMapping("/hello")
    public Resource<UserDomain> hello() {
        UserDomain userDomain = new UserDomain();
        Resource<UserDomain> userDomainResource = new Resource<>(userDomain);
        userDomainResource.add(linkTo(methodOn(LoginController.class).hello()).withSelfRel());
        return userDomainResource;
    }

    @PostMapping("/login")
    public String login (@RequestBody UserDomain user){
        return null;
    }


}
