package gm.facade.fee.entity.fee;

import gm.facade.fee.entity.base.Freight;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * 快递计费细单
 */
@Data
@Entity
@Table(name = "jf_fee_express_doc")
public class ExpressDocFee extends Freight {
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
     * 签收单运费
     */
    @Column( name = "bill_of_lading_freight")
    private Double billOfLadingFreight;

    /**
     * 送货件数
     */
    @Column( name = "number_of_deliveries")
    private Integer numberOfDeliveries;

    /**
     * 计费件数
     */
    @Column( name = "number_of_billing_parts")
    private Integer numberOfBillingParts;

    /**
     * 件数运费
     */
    @Column( name = "number_of_parts_freight")
    private Double numberOfPartsFreight;

    /**
     * 代收货款金额
     */
    @Column( name = "amount_of_collection")
    private String amountOfCollection;

    /**
     * 代收货款服务费
     */
    @Column( name = "collection_service_fee")
    private Double collectionServiceFee;

    /**
     * 货到收款服务计费标志
     */
    @Column( name = "charging_flag")
    private Boolean chargingFlag;

    /**
     * 签收单总运费
     */
    @Column( name = "total_freight_charges_on_receipt")
    private Double totalFreightChargesOnReceipt;

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
     * 失败信息
     */
    @Column( name = "failure_information")
    private String failureInformation;

    /**
     * 失败原因详情
     */
    @Column( name = "details_of_the_causes_of_failure")
    private String detailsOfTheCausesOfFailure;

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
