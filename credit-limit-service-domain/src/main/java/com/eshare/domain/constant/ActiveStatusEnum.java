package com.eshare.domain.constant;

public enum ActiveStatusEnum {

    /**
     * 可用
     */
    ACTIVE(1),

    /**
     * 不可用
     */
    INACTIVE(0);

    private final Integer value;

    ActiveStatusEnum(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}