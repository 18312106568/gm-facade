package gm.facade.fee.service;

import gm.facade.fee.constant.FreightExpType;
import gm.facade.fee.entity.FreightMode;
import gm.facade.fee.entity.base.Freight;
import gm.facade.fee.entity.wms.TransportBaseV;

import java.util.List;

public interface FreightModeService {
    /**
     * 通过物流模式ID获取有效计费模式
     * @param logisticId
     * @return
     */
    List<FreightMode> getModeByLogistic(Long logisticId);

    /**
     * 特殊签收单过滤
     * @param transportBaseVList
     */
    void specialModeFilter(List<TransportBaseV> transportBaseVList);

    /**
     *
     * @param freightMode
     * @param freightExpType
     * @return
     */
    Class<Freight> getModeClass(FreightMode freightMode
            , FreightExpType freightExpType);

    /**
     * 获取计费模式
     * @param modeId
     * @return
     */
    FreightMode getFreightMode(Long modeId);
}
