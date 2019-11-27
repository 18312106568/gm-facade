package gm.facade.fee.entity.fee;

import gm.common.base.annotation.FieldName;
import gm.facade.fee.constant.ReceiptStatus;
import gm.facade.fee.constant.ReceiptType;
import gm.facade.fee.entity.base.FreightDoc;
import gm.facade.fee.entity.base.FreightDtl;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

/**
 * 快递计费细单
 */
@Data
@Entity
@Table(name = "jf_fee_express_dtl",catalog = "快递计费细单")
public class ExpressDtlFee extends FreightDtl {


    /**
     * 出车时段
     */
    @FieldName(name = "出车时段")
    @Column( name = "departure_time")
    private String departureTime;

    /**
     * 省份
     */
    @FieldName(name = "省份")
    @Column( name = "province")
    private String province;

    /**
     * 城市
     */
    @FieldName(name = "城市")
    @Column( name = "city")
    private String city;

    /**
     * 装车单ID
     */
    @FieldName(name = "装车单ID")
    @Column( name = "loading_list_id")
    private Long loadingListId;

    /**
     * 签收单ID
     */
    @FieldName(name = "签收单ID")
    @Column( name = "sign_receipt_id")
    private Long signReceiptId;

    /**
     * 运输方式
     */
    @FieldName(name = "运输方式")
    @Column( name = "shipping_type")
    private String shippingType;

    /**
     * 客户名称
     */
    @FieldName(name = "客户名称")
    @Column( name = "customer_name")
    private String customerName;

    /**
     * 客户编码
     */
    @FieldName(name = "客户编码")
    @Column( name = "customer_code")
    private String customerCode;

    /**
     * 送货地址ID
     */
    @FieldName(name = "送货地址ID")
    @Column( name = "delivery_addr_id")
    private Long deliveryAddrId;

    /**
     * 送货地址
     */
    @FieldName(name = "送货地址")
    @Column( name = "delivery_address")
    private String deliveryAddress;

    /**
     * 源运输地址
     */
    @FieldName(name = "源运输地址")
    @Column( name = "src_transport_address")
    private String srcTransportAddress;

    /**
     * 源运输地址ID
     */
    @FieldName(name = "源运输地址ID")
    @Column( name = "src_transport_address_id")
    private Long srcTransportAddressId;

    /**
     * 签收单运费
     */
    @FieldName(name = "签收单运费")
    @Column( name = "receipt_fee")
    private Double receiptFee;

    /**
     * 送货件数
     */
    @FieldName(name = "送货件数")
    @Column( name = "delivery_num")
    private Integer deliveryNum;

    /**
     * 计费件数
     */
    @FieldName(name = "计费件数")
    @Column( name = "billing_piece_num")
    private Integer billingPieceNum;

    /**
     * 件数运费
     */
    @FieldName(name = "件数运费")
    @Column( name = "billing_piece_fee")
    private Double billingPieceFee;

    /**
     * 代收货款金额
     */
    @FieldName(name = "代收货款金额")
    @Column( name = "collection_amount")
    private Double collectionAmount;

    /**
     * 代收货款服务费
     */
    @FieldName(name = "代收货款服务费")
    @Column( name = "collection_fee")
    private Double collectionFee;

    /**
     * 货到收款服务计费标志
     */
    @FieldName(name = "收款确认标志")
    @Column( name = "recconfirmflag")
    private Boolean recconfirmFlag;

    /**
     * 签收单总运费
     */
    @FieldName(name = "签收单总运费")
    @Column( name = "total_receipt_fee")
    private Double totalReceiptFee;

    /**
     * 货主
     */
    @FieldName(name = "货主")
    @Column(name = "consignor")
    private Long consignor;

    /**
     * 备注
     */
    @FieldName(name = "备注")
    @Column( name = "remarks")
    private String remarks;

    /**
     * 失败信息
     */
    @FieldName(name = "失败信息")
    @Column( name = "failure_information")
    private String failureInformation;

    /**
     * 送货失败原因详情
     */
    @FieldName(name = "送货失败原因详情")
    @Column( name = "failure_details")
    private String failureDetails;

    /**
     * 线路名称
     */
    @FieldName(name = "线路名称")
    @Column( name = "line_name")
    private String lineName;

    /**
     * 承运商
     */
    @FieldName(name = "承运商")
    @Column( name = "carrier")
    private String carrier;

    /**
     * 手机送货人
     */
    @FieldName(name = "手机送货人")
    @Column( name = "deliverer_mobile")
    private String delivererMobile;

    /**
     * 签收单状态
     */
    @FieldName(name = "签收单状态")
    @Column( name = "receipt_status")
    private ReceiptStatus receiptStatus;

    /**
     * 签收单类型
     */
    @FieldName(name = "签收单类型")
    @Column( name = "receipt_type")
    private ReceiptType receiptType;

    /**
     * 起运仓库
     */
    @FieldName(name = "起运仓库")
    @Column( name = "warehouse")
    private String warehouse;

    /**
     * 应补差额运费
     */
    @Transient
    @FieldName(name = "应补差额运费")
    private Double compensableMarginFee;
}
