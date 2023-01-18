package com.bilgeadam.service;

import com.bilgeadam.dto.request.NewMovieRequestDto;
import com.bilgeadam.dto.response.NewMovieResponseDto;
import com.bilgeadam.exception.ErrorType;
import com.bilgeadam.exception.ManagerException;
import com.bilgeadam.mapper.MovieMapper;
import com.bilgeadam.repository.MovieRepository;
import com.bilgeadam.repository.model.Movie;
import com.bilgeadam.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class MovieService extends ServiceManager<Movie,String> {

    private final MovieRepository movieRepository;


    public MovieService(MovieRepository movieRepository) {
        super(movieRepository);
        this.movieRepository = movieRepository;
    }

    public NewMovieResponseDto createMovie(NewMovieRequestDto dto) {
        Movie movie= MovieMapper.INSTANCE.toMovie(dto);
        System.out.println(movie);
        try {
            movie=save(movie);
        }catch (Exception e){

            throw  new ManagerException(ErrorType.MOVIE_NOT_CREATED);
        }
        try {
            return MovieMapper.INSTANCE.toNewMovieResponseDto(movie);
        }catch (Exception e){

            throw new ManagerException(ErrorType.INTERNAL_ERROR,"Garip bir hata");
        }
    }
}
