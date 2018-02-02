package top.joylife.postoffice.common.util;

import top.joylife.postoffice.common.dto.Result;
import top.joylife.postoffice.common.enums.SystemCode;

/**
 * created by wuhaiming on 2018/2/2
 */
public class ResultUtil {

    public static Result success(Object data){
        Result result = new Result();
        result.setCode(SystemCode.SUCCESS.getCode());
        result.setData(data);
        result.setMsg(SystemCode.SUCCESS.getMsg());
        return  result;
    }

    public static Result fail(Object data){
        Result result = new Result();
        result.setMsg(SystemCode.FAIL.getMsg());
        result.setCode(SystemCode.FAIL.getCode());
        result.setData(data);
        return result;
    }

    public static Result fail(SystemCode systemCode){
        Result result = new Result();
        result.setCode(systemCode.getCode());
        result.setMsg(systemCode.getMsg());
        return result;
    }

}
