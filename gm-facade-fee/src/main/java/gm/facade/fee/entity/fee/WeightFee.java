package gm.facade.fee.entity.fee;

import gm.facade.fee.entity.base.Freight;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * 重量配送总细单
 */
@Data
@Entity
@Table(name = "jf_fee_weight_vehicle")
public class WeightFee  extends Freight {
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
     * 装车单ID
     */
    @Column( name = "loading_list_id")
    private Long loadingListId;

    /**
     * 签收单ID
     */
    @Column( name = "sign_receipt_id")
    private Long signReceiptId;

    /**
     * 运输方式
     */
    @Column( name = "shipping_type")
    private String shippingType;

    /**
     * 客户名称
     */
    @Column( name = "customer_name")
    private String customerName;

    /**
     * 客户编码
     */
    @Column( name = "customer_code")
    private String customerCode;

    /**
     * 送货地址ID
     */
    @Column( name = "delivery_addr_id")
    private Long deliveryAddrId;

    /**
     * 送货地址
     */
    @Column( name = "delivery_address")
    private String deliveryAddress;

    /**
     * 源运输地址
     */
    @Column( name = "src_transport_address")
    private String srcTransportAddress;

    /**
     * 源运输地址ID
     */
    @Column( name = "src_transport_address_id")
    private Long srcTransportAddressId;

    /**
     * 送货件数
     */
    @Column( name = "number_of_deliveries")
    private Integer numberOfDeliveries;

    /**
     * 实收件数
     */
    @Column( name = "receipt_number")
    private Integer receiptNumber;

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
     * 系统商品重量
     */
    @Column( name = "system_commodity_weight")
    private String systemCommodityWeight;

    /**
     * 实际商品重量
     */
    @Column( name = "real_weight")
    private Double realWeight;

    /**
     * 空运重量运费
     */
    @Column( name = "air_weight_freight")
    private Double airWeightFreight;

    /**
     * 配送费
     */
    @Column( name = "distribution_fee")
    private Double distributionFee;

    /**
     * 温度计发运标志
     */
    @Column( name = "thermometer_delivery_mark")
    private Boolean thermometerDeliveryMark;

    /**
     * 温度计回收计费标志
     */
    @Column( name = "thermometer_recovery_flag")
    private Boolean thermometerRecoveryFlag;

    /**
     * 温度计回收服务费
     */
    @Column( name = "thermometer_recovery_fee")
    private Double thermometerRecoveryFee;

    /**
     * 手机签收服务费
     */
    @Column( name = "mobile_receipt_fee")
    private Double mobileReceiptFee;

    /**
     * 调整费用
     */
    @Column( name = "adjustment_costs")
    private Double adjustmentCosts;

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
    @Column( name = "date_of_freight_payment")
    private Date dateOfFreightPayment;

    /**
     * 货主
     */
    @Column( name = "shipper")
    private String shipper;

    /**
     * 备注
     */
    @Column( name = "remarks")
    private String remarks;

    /**
     * 制单日期
     */
    @Column( name = "create_time")
    private Date createTime;

    /**
     * 送货失败信息
     */
    @Column( name = "delivery_failure_information")
    private String deliveryFailureInformation;

    /**
     * 送货失败原因详情
     */
    @Column( name = "failure_details")
    private String failureDetails;

    /**
     * 线路名称
     */
    @Column( name = "line_name")
    private String lineName;

    /**
     * 承运商
     */
    @Column( name = "carrier")
    private String carrier;

    /**
     * 手机送货人
     */
    @Column( name = "deliverer_mobile")
    private String delivererMobile;

    /**
     * 签收单状态
     */
    @Column( name = "receipt_status")
    private String receiptStatus;

    /**
     * 签收单类型
     */
    @Column( name = "receipt_type")
    private String receiptType;

    /**
     * 起运仓库
     */
    @Column( name = "warehouse")
    private String warehouse;
}
