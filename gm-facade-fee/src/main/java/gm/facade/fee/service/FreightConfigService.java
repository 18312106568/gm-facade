package gm.facade.fee.service;

import gm.common.base.sql.SimpleCondition;
import gm.facade.fee.constant.FreightConfigType;
import gm.facade.fee.constant.FreightExpType;
import gm.facade.fee.entity.FreightConfig;
import gm.facade.fee.entity.FreightConfigItem;
import gm.facade.fee.entity.FreightField;
import gm.facade.fee.entity.FreightMode;
import gm.facade.fee.entity.base.Freight;

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
             ,Map<FreightField,Object> configItemMap);

     /**
      * 获取运价表细目
      * @param freightMode
      * @param freight
      * @param expType
      * @param specialId
      * @return
      */
     Map<Long, FreightConfigItem> getFreightConfigItem(FreightMode freightMode
             , Freight freight, FreightExpType expType, Long specialId);

     /**
      * 获取运价表明细
      * @param freightMode
      * @param freight
      * @param fieldValueMap
      * @return
      */
     Map<Long, FreightConfigItem> getFreightConfigItem(FreightMode freightMode
             ,Freight freight,Map<FreightField,Object> fieldValueMap);
}
