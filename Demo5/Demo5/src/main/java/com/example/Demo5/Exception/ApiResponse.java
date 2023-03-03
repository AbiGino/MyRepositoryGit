package com.example.Demo5.Exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Getter


@Component

public class ApiResponse {

    private Integer status;
    private Object data;
    private String message;

    public ApiResponse() {

        this.status = status;
        this.data = data;
        this.message = message;
    }
}


