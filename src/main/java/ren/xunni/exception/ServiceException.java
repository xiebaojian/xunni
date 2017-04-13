package ren.xunni.exception;

import ren.xunni.enums.ResultEnum;

/**
 * 服务层异常
 */
public class ServiceException extends RuntimeException{

    private Integer code;

    public ServiceException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
