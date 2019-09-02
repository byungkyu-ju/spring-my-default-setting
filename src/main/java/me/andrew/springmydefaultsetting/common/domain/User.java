package me.andrew.springmydefaultsetting.common.domain;

import lombok.*;
import me.andrew.springmydefaultsetting.core.security.BaseUserDetails;

@Setter
@Getter
public class User extends BaseUserDetails {

    private String id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

}
