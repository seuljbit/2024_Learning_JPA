package com.ezen.boot_JPA.dto;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BoardDTO {
    private long bno;
    private String title;
    private String writer;
    private String content;
    private LocalDateTime regAt, modAt;
}
