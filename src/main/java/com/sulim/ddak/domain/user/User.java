package com.sulim.ddak.domain.user;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "tbl_user")
@Entity
public class User {

    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column(name = "og_id", nullable = false)
    private Long ogId;

    @Column(name = "zo_id", nullable = false)
    private Long zoId;

    @Column(name = "user_name", length = 20, nullable = false)
    private String name;

    @Builder
    public User(Long ogId, Long zoId, String name) {
        this.ogId = ogId;
        this.zoId = zoId;
        this.name = name;
    }

}
