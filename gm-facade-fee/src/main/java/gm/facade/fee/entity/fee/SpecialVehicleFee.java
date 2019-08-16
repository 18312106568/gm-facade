package gm.facade.fee.entity.fee;

import gm.facade.fee.entity.base.Freight;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * 专车配送总细单
 */
@Data
@Entity
@Table(name = "jf_fee_special_vehicle")
public class SpecialVehicleFee extends Freight {
    /**
     * 承运商
     */
    @Column( name = "carrier")
    private String carrier;

    /**
     * 运输日期
     */
    @Column( name = "transport_date")
    private Date transportDate;

    /**
     * 专车编号
     */
    @Column( name = "special_vehicle_num")
    private String specialVehicleNum;

    /**
     * 专车业务类型
     */
    @Column( name = "special_vehicle_biz_type")
    private String specialVehiclBizType;

    /**
     * 省份
     */
    @Column( name = "province")
    private String province;

    /**
     * 城市
     */
    @Column( name = "city")
    private String city;

    /**
     * 签收单数
     */
    @Column( name = "receipt_num")
    private Integer receiptNum;

    /**
     * 送货件数
     */
    @Column( name = "number_of_deliveries")
    private Integer numberOfDeliveries;

    /**
     * 冷藏箱数
     */
    @Column( name = "refrigerated_containers_num")
    private Integer refrigeratedContainersNum;

    /**
     * 温控品种件数
     */
    @Column( name = "temperature_control_num")
    private Integer temperatureControlNum;

    /**
     * 专车车型1
     */
    @Column( name = "special_vehicle_type1")
    private String specialVehicleType1;

    /**
     * 专车车型1车次数
     */
    @Column( name = "special_vehicle_num1")
    private Integer specialVehicleNum1;

    /**
     * 专车车型1车次运费
     */
    @Column( name = "special_vehicle_type_fee1")
    private Double specialVehicleTypeFee1;

    /**
     * 专车车型2
     */
    @Column( name = "special_vehicle_type2")
    private String specialVehicleType2;

    /**
     * 专车车型2车次数
     */
    @Column( name = "special_vehicle_num2")
    private Integer specialVehicleNum2;

    /**
     * 专车车型2车次运费
     */
    @Column( name = "special_vehicle_type_fee2")
    private Double specialVehicleTypeFee2;

    /**
     * 专车车型3
     */
    @Column( name = "special_vehicle_type3")
    private String specialVehicleType3;

    /**
     * 专车车型3车次数
     */
    @Column( name = "special_vehicle_num3")
    private Integer specialVehicleNum3;

    /**
     * 专车车型3车次运费
     */
    @Column( name = "special_vehicle_type_fee3")
    private Double specialVehicleTypeFee3;

    /**
     * 经停城市数
     */
    @Column( name = "stopped_city_num")
    private Integer stoppedCityNum;

    /**
     * 经停城市配送费
     */
    @Column( name = "stopped_city_distribution_fee")
    private Double stoppedCityDistributionFee;

    /**
     * 超额送货点数
     */
    @Column( name = "over_delivery_point_num")
    private Integer overdeliveryPointNum;

    /**
     * 超额送货点配送费
     */
    @Column( name = "over_delivery_point_fee")
    private Double overDeliveryPointFee;

    /**
     * 手机签收服务费
     */
    @Column( name = "mobile_Receipt_fee")
    private Double mobileReceiptFee;

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
    @Column( name = "total_freight_payable2")
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
