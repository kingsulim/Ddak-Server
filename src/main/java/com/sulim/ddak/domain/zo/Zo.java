package com.sulim.ddak.domain.zo;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "tbl_zo")
@Entity
public class Zo {

    @Column(name = "zo_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column(name = "user1_id", nullable = false)
    private Long user1Id;

    @Column(name = "user2_id", nullable = false)
    private Long user2Id;

    @Column(name = "user3_id")
    private Long user3Id;

    @Builder
    public Zo(Long user1Id, Long user2Id, Long user3Id) {
        this.user1Id = user1Id;
        this.user2Id = user2Id;
        this.user3Id = user3Id;
    }

}
