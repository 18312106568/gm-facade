package gm.facade.fee.service;

import gm.common.base.sql.SimpleCondition;
import gm.facade.fee.entity.FreightConfig;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 运价表服务
 */
public interface FreightConfigService {
     /**
      * 获取所有符合配置
      * @param mainAndCondition 主表and查询条件
      * @param mainOrCondition 主表or查询条件
      * @param configItemMap 子表and 查询条件
      * @return
      */
     List<FreightConfig> search(Collection<SimpleCondition> mainAndCondition
            ,Collection<SimpleCondition> mainOrCondition
             ,Map<String,Object> configItemMap);
}
