package gm.facade.fee.entity.fee;

import gm.facade.fee.entity.base.Freight;
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
@Table(name = "jf_fee_out_delivery_doc")
public class OutDeliveryDocFee extends Freight {
    /**
     * 落地配仓库
     */
    @Column( name = "ground_depot")
    private String groundDepot;

    /**
     * 配送服务商
     */
    @Column( name = "delivery_servicer")
    private String deliveryServicer;

    /**
     * 运输日期
     */
    @Column( name = "transport_date")
    private Date transportDate;

    /**
     * 出车时段
     */
    @Column( name = "departure_time")
    private String departureTime;

    /**
     * 车牌号码
     */
    @Column( name = "license_plate")
    private String licensePlate;

    /**
     * 配送员
     */
    @Column( name = "delivery")
    private String delivery;

    /**
     * 送货分点编码
     */
    @Column( name = "delivery_point_coding")
    private String deliveryPointCoding;

    /**
     * 送货/退货点费
     */
    @Column( name = "delivery_return_point_fee")
    private Double deliveryReturnPointFee;

    /**
     * 单据交接服务费
     */
    @Column( name = "document_handover_service_fee")
    private Double documentHandoverServiceFee;

    /**
     * 签收单数
     */
    @Column( name = "singular_number_of_signatures_and_receipts")
    private Integer singularNumberOfSignaturesAndReceipts;

    /**
     * 签收服务费
     */
    @Column( name = "sign_and_collect_service_fee")
    private Double signAndCollectServiceFee;

    /**
     * 送货件数
     */
    @Column( name = "number_of_deliveries")
    private Integer numberOfDeliveries;

    /**
     * 普货件数
     */
    @Column( name = "number_of_common_goods")
    private Integer numberOfCommonGoods;

    /**
     * 普货装卸费
     */
    @Column( name = "general_cargo_handling_charges")
    private Double generalCargoHandlingCharges;

    /**
     * 冷藏箱数
     */
    @Column( name = "refrigerated_containers_num")
    private Integer refrigeratedContainersNum;

    /**
     * 冷藏装卸费
     */
    @Column( name = "refrigeration_handling_charges")
    private Double refrigerationHandlingCharges;

    /**
     * 上楼件数
     */
    @Column( name = "number_of_upstairs_parts")
    private Integer numberOfUpstairsParts;

    /**
     * 上楼服务费
     */
    @Column( name = "upstairs_service_charge")
    private Double upstairsServiceCharge;

    /**
     * 医疗上架件数
     */
    @Column( name = "number_of_medical_shelves")
    private Integer numberOfMedicalShelves;

    /**
     * 上架服务费
     */
    @Column( name = "on_shelf_service_fee")
    private Double onShelfServiceFee;

    /**
     * 温度计发运票数
     */
    @Column( name = "number_of_thermometer_invoices")
    private Integer numberOfThermometerInvoices;

    /**
     * 温度计回收票数
     */
    @Column( name = "number_of_reclaimed_thermometer_tickets")
    private Integer numberOfReclaimedThermometerTickets;

    /**
     * 温度计回收费
     */
    @Column( name = "thermometer_recovery_fee")
    private Double thermometerRecoveryFee;

    /**
     * 二次分货标识
     */
    @Column( name = "secondary_distribution_marking")
    private Boolean secondaryDistributionMarking;

    /**
     * 二次分货服务费
     */
    @Column( name = "second_distribution_service_fee")
    private Double secondDistributionServiceFee;

    /**
     * 货到收款服务计费标志
     */
    @Column( name = "charging_flag")
    private Boolean chargingFlag;

    /**
     * 收款服务费
     */
    @Column( name = "collection_service_fee")
    private Double collectionServiceFee;

    /**
     * 泡沫箱发出数量
     */
    @Column( name = "foam_box_send_num")
    private Double foamBoxSendNum;

    /**
     * 泡沫箱回收数量
     */
    @Column( name = "foam_box_num")
    private Integer foamBoxNum;

    /**
     * 泡沫箱回收费
     */
    @Column( name = "foam_box_charging")
    private Double foamBoxCharging;

    /**
     * 委外配送服务线路补贴
     */
    @Column( name = "outsourcing_service_lines")
    private String outsourcingServiceLines;

    /**
     * 非正常工作时段标识
     */
    @Column( name = "identification_of_abnormal_working_hours")
    private Boolean identificationOfAbnormalWorkingHours;
}
