package gm.facade.fee.service;

import gm.facade.fee.constant.CalculateType;
import gm.facade.fee.entity.FreightMode;

public interface ShareService {

    /**
     * 分摊费用
     * @param freightMode
     * @param docId
     * @param calculateType
     */
    void shareFee(FreightMode freightMode, Long docId, CalculateType calculateType);

    /**
     * 分摊费用
     * @param modeId
     * @param docId
     * @param calculateType
     */
    void shareFee(Long modeId,Long docId,CalculateType calculateType);
}
