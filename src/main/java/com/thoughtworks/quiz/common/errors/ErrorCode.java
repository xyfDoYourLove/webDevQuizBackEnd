package com.thoughtworks.quiz.common.errors;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ErrorCode {

    BASIC_ERROR(4001, "出错了"),
    ORDER_NO_Data_Error(4002, "获取订单数据出错"),
    DELETE_ORDER_PARAM_ERROR(4003, "删除订单传参出错");



    private final int code;

    private final String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}