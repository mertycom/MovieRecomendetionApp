package com.bilgeadam.controller;

import com.bilgeadam.dto.request.NewMovieRequestDto;
import com.bilgeadam.dto.response.NewMovieResponseDto;
import com.bilgeadam.exception.ErrorType;
import com.bilgeadam.exception.ManagerException;
import com.bilgeadam.repository.model.Movie;
import com.bilgeadam.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/movie")
public class MovieController {


    private final MovieService movieService;

    @GetMapping("/findall")
    public ResponseEntity<List<Movie>> findAll() {
        return ResponseEntity.ok(movieService.findAll());
    }

    @PostMapping("/save")
    public ResponseEntity<NewMovieResponseDto> createMovie(@RequestBody NewMovieRequestDto dto) {
        try {
            return ResponseEntity.ok(movieService.createMovie(dto));
        } catch (Exception e) {
            e.printStackTrace();
            throw new ManagerException(ErrorType.INTERNAL_ERROR);
        }
    }

    @PostMapping("/save2")
    public ResponseEntity<Movie> createMovie2(@RequestBody Movie movie){
        try {
            return ResponseEntity.ok(movieService.save(movie));
        }catch (Exception e){
            e.printStackTrace();
            throw  new ManagerException(ErrorType.INTERNAL_ERROR);
        }
    }
}
