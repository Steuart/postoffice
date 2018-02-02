package top.joylife.postoffice.aop;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import top.joylife.postoffice.common.dto.Result;
import top.joylife.postoffice.common.exception.Warning;

/**
 * created by wuhaiming on 2018/2/2
 */
@RestControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(Warning.class)
    public Result handlerWarning(Warning warning){
        Result result = new Result();
        result.setCode(warning.getCode());
        result.setMsg(warning.getMsg());
        return result;
    }
}
