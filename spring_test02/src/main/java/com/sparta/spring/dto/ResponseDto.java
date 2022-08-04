package com.sparta.spring.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ResponseDto<T> {
    private boolean succes;
    private T data;
    private Error error;

    public static <T> ResponseDto<T> success(T data){
        return new ResponseDto<>(true,data,null);
    }

    public static <T> ResponseDto<T> fail(String code,String message){
        return new ResponseDto<>(false,null,new Error(code, message));
    }
}
