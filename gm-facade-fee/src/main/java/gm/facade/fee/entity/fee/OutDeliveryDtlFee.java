package gm.facade.fee.entity.fee;

import com.google.gson.annotations.SerializedName;
import gm.common.base.annotation.FieldName;
import gm.facade.fee.entity.base.FreightDtl;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * 委外配送细单
 */
@Data
@Entity
@Table(name = "jf_fee_out_delivery_dtl",catalog = "委外配送细单")
public class OutDeliveryDtlFee extends FreightDtl {
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
     * 送货分点编码
     */
    @FieldName(name = "送货分点编码")
    @Column( name = "child_delivery_point")
    private String childDeliveryPoint;

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
     * 温度计发运票数
     */
    @FieldName(name = "温度计发运票数")
    @Column( name = "thermometer_invoice_num")
    private Integer thermometerInvoiceNum;

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
     * 二次分货标识
     */
    @FieldName(name = "二次分货标识")
    @Column( name = "secondary_distribution_marking")
    private Boolean secondaryDistributionMarking;

    /**
     * 二次分货服务费
     */
    @FieldName(name = "二次分货服务费")
    @Column( name = "second_distribution_fee")
    private Double secondDistributionFee;

    /**
     * 货到收款服务计费标志
     */
    @FieldName(name = "货到收款服务计费标志")
    @Column( name = "charging_flag")
    private Boolean chargingFlag;

    /**
     * 收款服务费
     */
    @FieldName(name = "收款服务费")
    @Column( name = "collection_service_fee")
    private Double collectionServiceFee;

    /**
     * 泡沫箱发出数量
     */
    @FieldName(name = "泡沫箱发出数量")
    @Column( name = "foam_box_send_num")
    private Double foamBoxSendNum;

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
    @SerializedName("OUTSOURCING_SUBSIDY")
    private String outsourcingSubsidy;

    /**
     * 非正常工作时段标识
     */
    @FieldName(name = "非正常工作时段标识")
    @Column( name = "abnormal_working_flag")
    private Boolean abnormalWorkingFlag;
}