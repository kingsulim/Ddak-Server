package com.sulim.ddak.domain.request;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "tbl_request")
@Entity
public class Request {

    @Column(name = "request_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column(name = "og_id", nullable = false)
    private Long ogId;

    @Enumerated(EnumType.STRING)
    @Column(name = "request_type", length = 15, nullable = false)
    private String requestType;

    @Column(name = "deadline", nullable = false)
    private LocalDateTime deadline;

    @Builder
    public Request(Long ogId, String requestType, LocalDateTime deadline) {
        this.ogId = ogId;
        this.requestType = requestType;
        this.deadline = deadline;
    }

}
