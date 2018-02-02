package top.joylife.postoffice.common.dto;

import lombok.Data;
import lombok.Getter;

/**
 * created by wuhaiming on 2018/2/2
 */
@Data
public class Result {
    private int code;

    private String msg;

    private Object Data;
}
