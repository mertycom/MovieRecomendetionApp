package com.bilgeadam.repository.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document
public class Movie{
    @Id
    private String id;
    private String title;
    private List<EGenre> genre;
    private int year;
    private double ranked;
    @Builder.Default
    private Map<String,Double> usersRanked=new HashMap<>();
    @Builder.Default
    private List<String> directors=new ArrayList<>();
    private String country;
    private int time;
    private long createdDate;
    private long updatedDate;

}
