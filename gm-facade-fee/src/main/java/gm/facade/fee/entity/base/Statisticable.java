package gm.facade.fee.entity.base;

import java.io.Serializable;
import java.util.Map;

/**
 * 统计接口
 */
public interface Statisticable {
    Map<String,Object> getExpResultMap();
}
