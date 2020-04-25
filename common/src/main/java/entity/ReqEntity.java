package entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Auther: valarcfcc
 * @Date: 2020/4/21 23:20
 * @Description:
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Builder
@AllArgsConstructor
public class ReqEntity implements Serializable {
    private static final long serialVersionUID = 34654310341654L;
    /*
    数据
     */
    private String data;

    /*
    分页下标
     */
    private Integer pageNum;

    /*
    分页大小
     */
    private Integer pageSize;

    /*
    排序
     */
    private String sort;
}
