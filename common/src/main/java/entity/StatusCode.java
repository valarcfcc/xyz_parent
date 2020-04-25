package entity;

import lombok.Data;

/**
 * @Auther: valarcfcc
 * @Date: 2020/4/15 23:28
 * @Description:
 */
public enum StatusCode {
    /*
    *请求成功
     */
    SUCCESS(200,""),


    ERROR(500,"业务失败"),

    ;

    private int code;
    private String msg;

    StatusCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
