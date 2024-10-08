package com.example.sod.domain.comment.controller.dto.request;

import lombok.Getter;

import javax.validation.constraints.NotNull;

@Getter
public class CreateCommentRequest {

    @NotNull(message = "content는 Null을 허용하지 않습니다.")
    private String content;

}