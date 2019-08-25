package me.andrew.springmydefaultsetting.common.domain;

import lombok.*;
import me.andrew.springmydefaultsetting.core.domain.BaseDomain;

@Getter
@Setter
public class UserDomain extends BaseDomain {

    private String id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;



}
