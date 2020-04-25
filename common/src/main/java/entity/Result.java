package entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
/**
 * @Auther: valarcfcc
 * @Date: 2020/4/15 23:20
 * @Description:
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Builder
@AllArgsConstructor
public class Result implements Serializable {
    private static final long serialVersionUID = 3465431034166L;
    private Integer code;
    private String message;
    private String data;
    public Result(){}
    public Result(StatusCode statusCode){
        this.code=statusCode.getCode();
        this.message=statusCode.getMsg();
    }
    public Result(StatusCode statusCode,String data){
        this(statusCode);
        this.data=data;
    }
    public static Result ok(){
        return new Result(StatusCode.SUCCESS);
    }
    public static Result ok(@NotNull @NotBlank String data){
        return new Result(StatusCode.SUCCESS,data);
    }

    public static Result fail(){
        return new Result(StatusCode.ERROR);
    }
}
