package com.sulim.ddak.domain.og;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "tbl_og")
@Entity
public class Og {

    @Column(name = "og_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column(name = "og_name", length = 50, nullable = false)
    private String name;

    @Builder
    public Og(String name) {
        this.name = name;
    }

}
