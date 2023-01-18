package com.bilgeadam.dto.request;

import com.bilgeadam.repository.model.EGenre;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NewMovieRequestDto {
    private String title;
    private List<EGenre> genre;
    private int year;
    private List<String> directors;
    private  String country;
    private int time;
}
