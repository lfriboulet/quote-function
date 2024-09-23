package com.polarbookshop.quotefuncion.domain;

public record Quote (
        String content,
        String author,
        Genre genre
){}
