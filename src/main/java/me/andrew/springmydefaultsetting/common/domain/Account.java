package me.andrew.springmydefaultsetting.common.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@Builder @NoArgsConstructor @AllArgsConstructor
public class Account {

    @Id
    private String id;

    private String email;
    private String password;
    private String firstName;
    private String lastName;

}
