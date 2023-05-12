package com.kb.jjan.global.result;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResultCode {

    // 도메인 별로 나눠서 관리(ex: User 도메인, UserMission 도메인 ..)
    // user
    USER_REGISTRATION_SUCCESS("U001", "201", "사용자가 정상적으로 등록되었습니다."),

    // mission (admin)
    QUIZ_REGISTRATION_SUCCESS("A001", "201", "퀴즈가 정상적으로 등록되었습니다."),
    VOD_REGISTRATION_SUCCESS("A002", "201", "VOD가 정상적으로 등록되었습니다."),

    // debit
    DEBIT_REGISTRATION_SUCCESS("D002", "201", "이체가 정상적으로 수행되었습니다.");


    private final String code;
    private final String status;
    private final String message;
}