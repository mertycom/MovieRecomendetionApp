package com.bilgeadam.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ErrorType {


    INTERNAL_ERROR(5200,"Sunucu Hatasý", HttpStatus.INTERNAL_SERVER_ERROR),
    BAD_REQUEST(4200,"Parametre Hatasý",HttpStatus.BAD_REQUEST),
    MOVIE_NOT_CREATED(4210,"Film Olusturlamadý",HttpStatus.BAD_REQUEST),
    MOVIE_NOT_FOUND(4210,"Boyle Bir Film Bulunamadý",HttpStatus.BAD_REQUEST);

    private int code;
    private String message;
    HttpStatus httpStatus;
}
