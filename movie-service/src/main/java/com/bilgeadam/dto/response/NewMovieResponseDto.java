package com.bilgeadam.dto.response;

import com.bilgeadam.repository.model.EGenre;

import java.util.ArrayList;
import java.util.List;

public class NewMovieResponseDto {

    private String id;
    private String title;
    private List<EGenre> genre;
    private int year;
    private List<String> directors;
    private String country;
    private int time;
    private long createdDate;
    private long updatedDate;
}
