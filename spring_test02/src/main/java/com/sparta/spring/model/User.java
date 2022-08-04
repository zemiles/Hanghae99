package com.sparta.spring.model;


import com.sparta.spring.dto.UserRequestDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity(name ="users")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table
public class User extends Timestamped{
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false,length = 12,unique = true)
    private String username;

    @Column(nullable = false,length = 32)
    private String password;

    @Column(nullable = false)
    private boolean activated;

    public User(String nickname, String password){
        this.username = nickname;
        this.password = password;
    }

    public User(UserRequestDto requestDto){
        this.username = requestDto.getUsername();
        this.password = requestDto.getPassword();
    }

    @ManyToMany
    @JoinTable(
            name = "user_authority",
            joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "authority_name", referencedColumnName = "authority_name")})
    private Set<Authority> authorities;
}
