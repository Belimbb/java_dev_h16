package com.example.java_dev_h17.service.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NoteDTO {
    private UUID id;
    private String title;
    private String content;
}
