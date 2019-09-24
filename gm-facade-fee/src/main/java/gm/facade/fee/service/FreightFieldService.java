package gm.facade.fee.service;

import gm.facade.fee.entity.FreightField;
import gm.facade.fee.entity.base.Freight;

public interface FreightFieldService {

    /**
     * 执行目标属性的方法
     * @param freight
     * @param freightField
     * @return
     */
    Object invoke(Freight freight,FreightField freightField);
}
