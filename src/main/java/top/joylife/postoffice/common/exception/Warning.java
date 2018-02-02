package top.joylife.postoffice.common.exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

/**
 * created by wuhaiming on 2018/2/2
 */
@Getter
@Setter
public class Warning extends RuntimeException{

    private String msg;

    private Integer code;

    public Warning(String msg,Integer code){
        this.msg = msg;
        this.code = code;
    }
}
