package gm.facade.fee.entity.fee;

import gm.facade.fee.entity.base.Freight;
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
@Table(name = "jf_fee_out_delivery_dtl")
public class OutDeliveryDtlFee extends Freight {

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
     * 送货点数
     */
    @Column( name = "delivery_points")
    private Integer deliveryPoints;

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
     * 二次分货点数
     */
    @Column( name = "quadratic_distribution_points")
    private Integer quadraticDistributionPoints;

    /**
     * 二次分货服务费
     */
    @Column( name = "second_distribution_service_fee")
    private Double secondDistributionServiceFee;

    /**
     * 货到收款服务点数
     */
    @Column( name = "cash_on_delivery_service_points")
    private Integer cashOnDeliveryServicePoints;

    /**
     * 收款服务费
     */
    @Column( name = "collection_service_fee")
    private Double collectionServiceFee;

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

    /**
     * 非正常工作时段补贴系数
     */
    @Column( name = "subsidy_coefficient_for_abnormal_working_hours")
    private Integer subsidyCoefficientForAbnormalWorkingHours;

    /**
     * 各项服务费汇总
     */
    @Column( name = "summary_of_service_charges")
    private String summaryOfServiceCharges;

    /**
     * 保底收费
     */
    @Column( name = "bottom_guaranteed_fees")
    private Double bottomGuaranteedFees;

    /**
     * 车次服务费
     */
    @Column( name = "freight_service_fee")
    private Double freightServiceFee;

    /**
     * 加班时长
     */
    @Column( name = "overtime_hours")
    private String overtimeHours;

    /**
     * 加班费
     */
    @Column( name = "overtime_pay")
    private Double overtimePay;

    /**
     * 干线收货服务时长
     */
    @Column( name = "duration_of_trunk_line_receiving_service")
    private String durationOfTrunkLineReceivingService;

    /**
     * 干线收货服务费
     */
    @Column( name = "trunk_line_receiving_service_fee")
    private Double trunkLineReceivingServiceFee;

    /**
     * 管理费率
     */
    @Column( name = "management_rate")
    private String managementRate;

    /**
     * 管理费
     */
    @Column( name = "management_expense")
    private Double managementExpense;

    /**
     * 调整费用
     */
    @Column( name = "adjustment_costs")
    private String adjustmentCosts;

    /**
     * 合计应付运费1
     */
    @Column( name = "total_freight_payable1")
    private Double totalFreightPayable1;

    /**
     * 合计应付运费2
     */
    @Column( name = "total_freight_payable2")
    private Double totalFreightPayable2;

    /**
     * 合计应付不付运费
     */
    @Column( name = "total_unpaid_freight_payable")
    private Double totalUnpaidFreightPayable;

    /**
     * 合计实付运费
     */
    @Column( name = "total_payment_of_freight")
    private Double totalPaymentOfFreight;

    /**
     * 合计待付运费
     */
    @Column( name = "total_freight_to_be_paid")
    private Double totalFreightToBePaid;

    /**
     * 运费结算支付标志
     */
    @Column( name = "freight_pay_flag")
    private Boolean freightPayMark;

    /**
     * 运费付款单ID
     */
    @Column( name = "freight_bill_id")
    private Long freightBillId;

    /**
     * 运费支付日期
     */
    @Column( name = "freight_payment_date")
    private Date freightPaymentDate;
}
