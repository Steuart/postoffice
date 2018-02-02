package top.joylife.postoffice.common.enums;

import lombok.Getter;

/**
 * created by wuhaiming on 2018/2/2
 */
@Getter
public enum SystemCode {

    SUCCESS(1,"success"),
    FAIL(0,"FAIL");

    SystemCode(int code, String msg){
        this.code = code;
        this.msg = msg;
    }
    private int code;

    private String msg;
}
