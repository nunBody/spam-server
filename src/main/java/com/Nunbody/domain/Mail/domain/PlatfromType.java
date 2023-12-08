package com.Nunbody.domain.Mail.domain;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@RequiredArgsConstructor
@Getter
public enum PlatfromType {
    NAVER("NAVER"),
    GOOGLE("GOOGLE");

    private final String stringPlatfromType;
    public static PlatfromType getEnumPlatfromTypeFromStringPlatfromType(String stringPlatfromType) {
        return Arrays.stream(values())
                .filter(platfromType -> platfromType.stringPlatfromType.equals(stringPlatfromType))
                .findFirst()
                .orElseThrow(null);
    }
}
