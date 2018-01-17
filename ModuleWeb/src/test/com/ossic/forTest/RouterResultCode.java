package com.ossic.forTest;

import java.util.HashMap;
import java.util.Map;

/**
 * created by songyuefeng on 17/11/30
 */
public enum RouterResultCode {
    RS_RESULT_SUCCEED(0, "成功"),
    RS_RESULT_RELOGIN_SUCCESS(1, "重登成功"),
    RS_RESULT_BACKGROUND_USER(2, "后台在线状态"),
    RS_RESULT_USER_OFFLINE(3, "用户不在线"),
    RS_RESULT_FAIL_NEED_PUSH(4, "在线投递不成功，需要发送push"),
    RS_RESULT_FAIL(-1, "失败"),
    RS_RESULT_OUTOFRANGE(-2, "uid超出范围"),
    RS_RESULT_NOT_LOGIN(-3, "用户未登录"),
    RS_RESULT_LOGIN_TIME_ERROR(-4,"登录时间错误"),
    RS_RESULT_TIMESTMAP_OLD(-5, "时间戳失效"),
    RS_RESULT_INVALID_PARAM(-6, "非法参数");

    private Integer code;
    private String description;

    RouterResultCode(Integer code , String description) {
        this.code = code;
        this.description = description;
    }

    private static Map<Integer, RouterResultCode> map = new HashMap<Integer, RouterResultCode>();

    static {
        for (RouterResultCode routerResultCode : values()) {
            map.put(routerResultCode.getCode(), routerResultCode);
        }
    }

    public static RouterResultCode valueOf(Integer code) {
        return map.get(code);
    }

    public Integer getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
