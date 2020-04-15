package entity;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @Auther: valarcfcc
 * @Date: 2020/4/15 23:20
 * @Description:
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Builder
public class Result {
    private boolean flag;
    private Integer code;
    private String message;
    private Object data;
}
