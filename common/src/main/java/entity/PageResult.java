package entity;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @Auther: valarcfcc
 * @Date: 2020/4/15 23:26
 * @Description:
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Builder
public class PageResult<T> {
    private long total;
    private List<T> rows;
}
