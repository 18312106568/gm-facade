package gm.facade.fee.entity.fee;

import gm.common.base.annotation.FieldName;
import gm.facade.fee.entity.base.FreightDoc;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * 委外配送总单
 */
@Data
@Entity
@Table(name = "jf_fee_out_delivery_doc",catalog = "委外配送总单")
public class OutDeliveryDocFee extends FreightDoc {

    /**
     * 落地配仓库
     */
    @FieldName(name = "落地配仓库")
    @Column( name = "ground_depot")
    private String groundDepot;

    /**
     * 配送服务商
     */
    @FieldName(name = "配送服务商")
    @Column( name = "delivery_servicer")
    private String deliveryServicer;

    /**
     * 运输日期
     */
    @FieldName(name = "运输日期")
    @Column( name = "transport_date")
    private Date transportDate;

    /**
     * 出车时段
     */
    @FieldName(name = "出车时段")
    @Column( name = "departure_time")
    private String departureTime;

    /**
     * 车牌号码
     */
    @FieldName(name = "车牌号码")
    @Column( name = "license_plate")
    private String licensePlate;

    /**
     * 配送员
     */
    @FieldName(name = "配送员")
    @Column( name = "delivery")
    private String delivery;

    /**
     * 送货点数
     */
    @FieldName(name = "送货点数")
    @Column( name = "delivery_point_num")
    private Integer deliveryPointNum;

    /**
     * 送货/退货点费
     */
    @FieldName(name = "送货/退货点费")
    @Column( name = "delivery_return_point_fee")
    private Double deliveryReturnPointFee;

    /**
     * 单据交接服务费
     */
    @FieldName(name = "单据交接服务费")
    @Column( name = "document_handover_fee")
    private Double documentHandoverFee;

    /**
     * 签收单数
     */
    @FieldName(name = "签收单数")
    @Column( name = "receipt_num")
    private Integer receiptNum;

    /**
     * 签收服务费
     */
    @FieldName(name = "签收服务费")
    @Column( name = "receipt_fee")
    private Double receiptFee;

    /**
     * 送货件数
     */
    @FieldName(name = "送货件数")
    @Column( name = "delivery_num")
    private Integer deliveryNum;

    /**
     * 普货件数
     */
    @FieldName(name = "普货件数")
    @Column( name = "common_goods_num")
    private Integer commonGoodsNum;

    /**
     * 普货装卸费
     */
    @FieldName(name = "普货装卸费")
    @Column( name = "common_goods_charges")
    private Double commonGoodsCharges;

    /**
     * 冷藏箱数
     */
    @FieldName(name = "冷藏箱数")
    @Column( name = "refrigerated_box_num")
    private Integer refrigeratedBoxNum;

    /**
     * 冷藏装卸费
     */
    @FieldName(name = "冷藏装卸费")
    @Column( name = "refrigeration_handling_charges")
    private Double refrigerationHandlingCharges;

    /**
     * 上楼件数
     */
    @FieldName(name = "上楼件数")
    @Column( name = "number_of_upstairs_parts")
    private Integer numberOfUpstairsParts;

    /**
     * 上楼服务费
     */
    @FieldName(name = "上楼服务费")
    @Column( name = "upstairs_service_charge")
    private Double upstairsServiceCharge;

    /**
     * 医疗上架件数
     */
    @FieldName(name = "医疗上架件数")
    @Column( name = "medical_shelves_num")
    private Integer medicalShelvesNum;

    /**
     * 上架服务费
     */
    @FieldName(name = "上架服务费")
    @Column( name = "on_shelf_service_fee")
    private Double onShelfServiceFee;

    /**
     * 温度计回收票数
     */
    @FieldName(name = "温度计回收票数")
    @Column( name = "thermometer_recovery_num")
    private Integer thermometerRecoveryNum;

    /**
     * 温度计回收费
     */
    @FieldName(name = "温度计回收费")
    @Column( name = "thermometer_recovery_fee")
    private Double thermometerRecoveryFee;

    /**
     * 二次分货点数
     */
    @FieldName(name = "二次分货点数")
    @Column( name = "second_distribution_point_num")
    private Integer secondDistributionPointNum;

    /**
     * 二次分货服务费
     */
    @FieldName(name = "二次分货服务费")
    @Column( name = "second_distribution_fee")
    private Double secondDistributionFee;

    /**
     * 货到收款服务点数
     */
    @FieldName(name = "货到收款服务点数")
    @Column( name = "delivery_service_point_num")
    private Integer deliveryServicePointNum;

    /**
     * 收款服务费
     */
    @FieldName(name = "收款服务费")
    @Column( name = "collection_service_fee")
    private Double collectionServiceFee;

    /**
     * 泡沫箱回收数量
     */
    @FieldName(name = "泡沫箱回收数量")
    @Column( name = "foam_box_num")
    private Integer foamBoxNum;

    /**
     * 泡沫箱回收费
     */
    @FieldName(name = "泡沫箱回收费")
    @Column( name = "foam_box_charging")
    private Double foamBoxCharging;

    @FieldName(name = "委外配送服务线路补贴")
    @Column(name = "outsourcing_subsidy")
    private String outsourcingSubsidy;

    /**
     * 非正常工作时段标识
     */
    @FieldName(name = "非正常工作时段标识")
    @Column( name = "abnormal_working_flag")
    private Boolean abnormalWorkingFlag;

    /**
     * 非正常工作时段补贴系数
     */
    @FieldName(name = "非正常工作时段补贴系数")
    @Column( name = "abnormal_working_coefficient")
    private Integer abnormalWorkingCoefficient;

    /**
     * 各项服务费汇总
     */
    @FieldName(name = "各项服务费汇总")
    @Column( name = "summary_service_charges")
    private String summaryServiceCharges;

    /**
     * 保底收费
     */
    @FieldName(name = "保底收费")
    @Column( name = "low_guaranteed_fee")
    private Double lowGuaranteedFee;

    /**
     * 车次服务费
     */
    @FieldName(name = "车次服务费")
    @Column( name = "train_num_fee")
    private Double trainNumFee;

    /**
     * 加班时长
     */
    @FieldName(name = "加班时长")
    @Column( name = "overtime_hours")
    private Double overtimeHours;

    /**
     * 加班费
     */
    @FieldName(name = "加班费")
    @Column( name = "overtime_pay")
    private Double overtimePay;

    /**
     * 干线收货服务时长
     */
    @FieldName(name = "干线收货服务时长")
    @Column( name = "trunk_line_receive_duration")
    private Double trunkLineReceiveDuration;

    /**
     * 干线收货服务费
     */
    @FieldName(name = "干线收货服务费")
    @Column( name = "trunk_line_receive_fee")
    private Double trunkLineReceiveFee;

    /**
     * 管理费率
     */
    @FieldName(name = "管理费率")
    @Column( name = "management_rate")
    private Double managementRate;

    /**
     * 管理费
     */
    @FieldName(name = "管理费")
    @Column( name = "management_expense")
    private Double managementExpense;


}
