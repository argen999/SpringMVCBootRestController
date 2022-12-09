package com.peaksoft.entity.enums;

public enum Specialization {
    BACK_END_DEVELOPER("back"),
    FRONT_END_DEVELOPER("front"),
    PM_MANAGER("pm"),
    UX_UI_DESIGNER("uu"),
    IOS_DEVELOPER("ios"),
    ANDROID_DEVELOPER("android");

    private String code;

    Specialization(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
