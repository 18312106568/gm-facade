package gm.facade.fee.service;

import gm.facade.fee.constant.FreightExpType;
import gm.facade.fee.entity.FreightExp;
import gm.facade.fee.entity.FreightExpSource;
import gm.facade.fee.entity.FreightMode;

import java.util.List;

/**
 * 运费公式服务
 */
public interface FreightExpService {
    /**
     * 获取计费公式配置
     * @param freightMode
     * @param expType
     * @return
     */
    List<FreightExp> getFreightExps(
            FreightMode freightMode, FreightExpType expType);

    /**
     * 获取计费公式来源配置
     * @param freightMode
     * @param expType
     * @return
     */
    List<FreightExpSource> getFreightExpSources(
            FreightMode freightMode,FreightExpType expType);

    /**
     * 更新计费公式
     */
    void initFreightExp();
}
