package com.yng.wallet.merchants.constant;

public enum ErrorCode {
    SUCCESS(0, ""),
    DUPLICATE_NAME(1, "merchants name duplicate"),
    EMPTY_LOGO(2, "merchants logo null"),
    EMPTY_BUSINESS_LICENSE(3, "merchants license null"),
    ERROR_PHONE(4, "merchants phone number error"),
    EMPTY_ADDRESS(5, "merchants address null"),
    MERCHANTS_NOT_EXIST(6, "merchants not exist");

    private Integer code;

    private String desc;

    ErrorCode(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getDesc() {
        return this.desc;
    }
}
