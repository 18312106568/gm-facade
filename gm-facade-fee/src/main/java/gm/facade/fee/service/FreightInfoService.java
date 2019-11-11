package gm.facade.fee.service;

import gm.facade.fee.constant.CalculateType;
import gm.facade.fee.constant.FeeStatus;
import gm.facade.fee.constant.FreightExpType;
import gm.facade.fee.entity.FreightMode;
import gm.facade.fee.entity.base.Freight;

import java.util.List;

public interface FreightInfoService {

    /**
     * 保存计费单
     * @param freightMode
     * @param expType
     * @param freight
     * @return
     */
    Freight saveFreight(FreightMode freightMode, FreightExpType expType
            ,Long operatorId, Freight freight);

    /**
     * 批量保存计费单
     * @param freightMode
     * @param expType
     * @param operatorId
     * @param freightList
     * @return
     */
    List<Freight> saveAllFreight(FreightMode freightMode
            ,FreightExpType expType,Long operatorId,List<Freight> freightList);

    /**
     * 根据计费单批次号作废计费单
     * @param freightMode
     * @param freightExpType
     * @param calculateType
     * @param operatorId
     * @param batchNo
     * @return
     */
    Integer disableFreight(FreightMode freightMode, FreightExpType freightExpType
            , CalculateType calculateType, Long operatorId, Long batchNo);

    /**
     * 根据总单Id 作废签收单
     * @param docIds
     * @param freightMode
     * @param operatorId
     * @return
     */
    Integer disableFreight(List<Long> docIds,FreightMode freightMode,Long operatorId);

    /**
     * 批量作废
     * @param freightMode
     * @param expType
     * @param calculateType
     * @param operatorId
     * @param batchNoList
     * @return
     */
    Integer batchDisableFreight(FreightMode freightMode,FreightExpType expType
            ,CalculateType calculateType,Long operatorId,List<Long> batchNoList);


    /**
     * 获取细单信息
     * @param freightMode
     * @param docId
     * @return
     */
    List<Freight> getFreightDtlInfo(FreightMode freightMode,Long docId);

    /**
     * 细单手工录入更新
     * @param freight
     * @param freightMode
     * @return
     */
    Freight dtlManualUpdate(Freight freight,FreightMode freightMode);


    /**
     * 是否存在计费单
     * @param freightMode
     * @param expType
     * @param batchNo
     * @param feeStatus
     * @return
     */
    Boolean existsFreight(FreightMode freightMode
            , FreightExpType expType,Long batchNo, FeeStatus feeStatus);
}
