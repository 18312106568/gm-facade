package gm.facade.fee.entity.wms;

import com.google.gson.annotations.SerializedName;
import gm.common.base.annotation.FieldName;
import gm.facade.fee.constant.*;
import gm.facade.fee.entity.base.*;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "jf_transport_base_v2",catalog = "签收单视图")
@Data
public class TransportBaseV extends Freight {

    @Id
    @Column(name = "id")
    private Long seqId;

    /**
     * 装车单ID(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    @FieldName(name = "装车单ID")
    @Column(name = "loading_list_id")
    @SerializedName("LOADING_LIST_ID")
    private Long loadingListId;

    /**
     * 签收单ID(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    @FieldName(name = "签收单ID")
    @Column(name = "receipt_id")
    @SerializedName("RECEIPT_ID")
    private Long receiptId;


    /**
     * 出车时段(通过WMS《签收单查询》的出车时段映射关联出来)
     */
    @FieldName(name = "出车时段")
    @Column(name = "departure_time")
    @SerializedName("DEPARTURE_TIME")
    private String departureTime;



    /**
     * 运输方式(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    @FieldName(name = "运输方式")
    @Column(name = "shipping_type")
    @SerializedName("SHIPPING_TYPE")
    private String shippingType;

    /**
     * 物流模式(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    @FieldName(name = "物流模式")
    @Column(name = "logistics_mode")
    @SerializedName("LOGISTICS_MODE")
    private Long logisticsMode;

    /**
     * 客户名称(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    @FieldName(name = "客户名称")
    @Column(name = "customer_name")
    @SerializedName("CUSTOMER_NAME")
    private String customerName;

    /**
     * 客户编码(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    @FieldName(name = "客户编码")
    @Column(name = "customer_code")
    @SerializedName("CUSTOMER_CODE")
    private String customerCode;

    /**
     * 客户ID(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    @FieldName(name = "客户ID")
    @Column(name = "customer_id")
    @SerializedName("CUSTOMER_ID")
    private Long customerId;

    /**
     * 送货地址ID(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    @FieldName(name = "送货地址ID")
    @Column(name = "delivery_addr_id")
    @SerializedName("DELIVERY_ADDR_ID")
    private Long deliveryAddrId;

    /**
     * 送货地址(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    @FieldName(name = "送货地址")
    @Column(name = "delivery_address")
    @SerializedName("DELIVERY_ADDRESS")
    private String deliveryAddress;

    /**
     * 源运输地址(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    @FieldName(name = "源运输地址")
    @Column(name = "src_transport_address")
    @SerializedName("SRC_TRANSPORT_ADDRESS")
    private String srcTransportAddress;

    /**
     * 源运输地址ID(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    @FieldName(name = "源运输地址ID")
    @Column(name = "src_transport_address_id")
    @SerializedName("SRC_TRANSPORT_ADDRESS_ID")
    private Long srcTransportAddressId;


    /**
     * 计费用地址ID
     */
    @FieldName(name = "计费用地址ID")
    @Column(name = "cost_transport_address_id")
    @SerializedName("COST_TRANSPORT_ADDRESS_ID")
    private Long costTransportAddressId;



    /**
     * 总箱数(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    @FieldName(name = "总箱数")
    @Column(name = "total_box_num")
    @SerializedName("TOTAL_BOX_NUM")
    private Integer totalBoxNum;

    /**
     * 计费用总箱数(通过逻辑计算得出)
     */
    @FieldName(name = "计费用总箱数")
    @Column(name = "total_charge_box_num")
    @SerializedName("TOTAL_CHARGE_BOX_NUM")
    private Integer totalChargeBoxNum;

    /**
     * 实收件数(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    @FieldName(name = "实收件数")
    @Column(name = "receipt_number")
    @SerializedName("RECEIPT_NUMBER")
    private Integer receiptNumber;

    /**
     * 商品重量(通过逻辑计算得出)
     */
    @FieldName(name = "商品重量")
    @Column(name = "commodity_weight")
    @SerializedName("COMMODITY_WEIGHT")
    private Double commodityWeight;

    /**
     * 冷藏箱数(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    @FieldName(name = "冷藏箱数")
    @Column(name = "refrigerated_box_num")
    @SerializedName("REFRIGERATED_CONTAINERS_NUM")
    private Integer refrigeratedBoxNum;

    /**
     * 温控品种件数(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    @FieldName(name = "温控品种件数")
    @Column(name = "temperature_control_num")
    @SerializedName("TEMPERATURE_CONTROL_NUM")
    private Integer temperatureControlNum;


    /**
     * 货到收款金额(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    @FieldName(name = "货到收款金额")
    @Column(name = "amount")
    @SerializedName("AMOUNT")
    private Double amount;

    /**
     * 货到收款标志(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    @FieldName(name = "货到收款标志")
    @Column(name = "receipt_flag")
    @SerializedName("RECEIPT_FLAG")
    private Boolean receiptFlag;

    /**
     * 专车编号(须在WMS中增加功能进行手工维护)
     */
    @FieldName(name = "专车编号")
    @Column(name = "special_vehicle_num")
    @SerializedName("SPECIAL_VEHICLE_NUM")
    private String specialVehicleNum;

    /**
     * 专车车型1(须在WMS中增加功能进行手工维护)
     */
    @FieldName(name = "专车车型1")
    @Column(name = "special_vehicle_type1")
    @SerializedName("SPECIAL_VEHICLE_MODEL1")
    @Enumerated(EnumType.ORDINAL)
    private SpecialVehicleType specialVehicleType1;

    /**
     * 专车车次1(须在WMS中增加功能进行手工维护)
     */
    @FieldName(name = "专车车次1")
    @Column(name = "special_train_num1")
    @SerializedName("SPECIAL_TRAIN_NUM1")
    private String specialTrainNum1;

    /**
     * 单程/往返1(须在WMS中增加功能进行手工维护)
     */
    @FieldName(name = "单程/往返1")
    @Column(name = "trip_type1")
    @SerializedName("TRIP_TYPE1")
    private String tripType1;

    /**
     * 是否为回程车1(须在WMS中增加功能进行手工维护)
     */
    @FieldName(name = "是否为回程车1")
    @Column(name = "is_return_train1")
    @SerializedName("IS_RETURN_TRAIN1")
    private Boolean isReturnTrain1;

    /**
     * 专车车型2(须在WMS中增加功能进行手工维护)
     */
    @FieldName(name = "专车车型2")
    @Column(name = "special_vehicle_type2")
    @SerializedName("SPECIAL_VEHICLE_TYPE2")
    @Enumerated(EnumType.ORDINAL)
    private SpecialVehicleType specialVehicleType2;

    /**
     * 专车车次2(须在WMS中增加功能进行手工维护)
     */
    @FieldName(name = "专车车次2")
    @Column(name = "special_train_num2")
    @SerializedName("SPECIAL_TRAIN_NUM2")
    private Boolean specialTrainNum2;

    /**
     * 单程/往返2(须在WMS中增加功能进行手工维护)
     */
    @FieldName(name = "单程/往返2")
    @Column(name = "trip_type2")
    @SerializedName("TRIP_TYPE2")
    private String tripType2;

    /**
     * 是否为回程车2(须在WMS中增加功能进行手工维护)
     */
    @FieldName(name = "是否为回程车2")
    @Column(name = "return_train2")
    @SerializedName("RETURN_TRAIN2")
    private String returnTrain2;

    /**
     * 专车车型3(须在WMS中增加功能进行手工维护)
     */
    @FieldName(name = "专车车型3")
    @Column(name = "special_vehicle_type3")
    @SerializedName("SPECIAL_VEHICLE_TYPE3")
    @Enumerated(EnumType.ORDINAL)
    private SpecialVehicleType specialVehicleType3;

    /**
     * 专车车次3(须在WMS中增加功能进行手工维护)
     */
    @FieldName(name = "专车车次3")
    @Column(name = "special_train_num3")
    @SerializedName("SPECIAL_TRAIN_NUM3")
    private String specialTrainNum3;

    /**
     * 单程/往返3(须在WMS中增加功能进行手工维护)
     */
    @FieldName(name = "单程/往返3")
    @Column(name = "trip_type3")
    @SerializedName("TRIP_TYPE3")
    private String tripType3;

    /**
     * 是否为回程车3(须在WMS中增加功能进行手工维护)
     */
    @FieldName(name = "是否为回程车3")
    @Column(name = "is_return_train3")
    @SerializedName("IS_RETURN_TRAIN3")
    private Boolean isReturnTrain3;

    /**
     * 专车业务类型(须在WMS中增加功能进行手工维护)
     */
    @FieldName(name = "专车业务类型")
    @Column(name = "special_vehicl_bize_type")
    @SerializedName("SPECIAL_VEHICL_BIZE_TYPE")
    private String specialVehiclBizeType;

    /**
     * 货主(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    @FieldName(name = "货主")
    @Column(name = "consignor")
    @SerializedName("CONSIGNOR")
    private Long consignor;

    /**
     * 备注(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    @FieldName(name = "备注")
    @Column(name = "remarks")
    @SerializedName("REMARKS")
    private String remarks;

    /**
     * 制单日期(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    @FieldName(name = "制单日期")
    @Column(name = "create_time")
    @SerializedName("CREATE_TIME")
    private Date createTime;

    /**
     * 送货失败原因分类(取自WMS《送货失败数据录入》)
     */
    @FieldName(name = "送货失败原因分类")
    @Column(name = "failure_reson")
    @SerializedName("FAILURE_RESON")
    private String failureReson;

    /**
     * 送货失败原因详情(取自WMS《送货失败数据录入》)
     */
    @FieldName(name = "送货失败原因详情")
    @Column(name = "failure_details")
    @SerializedName("FAILURE_DETAILS")
    private String failureDetails;

    /**
     * 线路名称(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    @FieldName(name = "线路名称")
    @Column(name = "line_name")
    @SerializedName("LINE_NAME")
    private String lineName;

    /**
     * 承运商(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    @FieldName(name = "承运商")
    @Column(name = "carrier")
    @SerializedName("CARRIER")
    private String carrier;

    /**
     * 手机送货人(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    @FieldName(name = "手机送货人")
    @Column(name = "deliverer_mobile")
    @SerializedName("DELIVERER_MOBILE")
    private String delivererMobile;

    /**
     * 签收单状态(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    @FieldName(name = "签收单状态")
    @Column(name = "receipt_status")
    @SerializedName("RECEIPT_STATUS")
    @Enumerated(EnumType.ORDINAL)
    private ReceiptStatus receiptStatus;

    /**
     * 签收单类型(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    @FieldName(name = "签收单类型")
    @Column(name = "receipt_type")
    @SerializedName("RECEIPT_TYPE")
    @Enumerated(EnumType.ORDINAL)
    private ReceiptType receiptType;

    /**
     * 笼车交接总单ID(取自WMS《笼车交接单管理》)
     */
    @FieldName(name = "笼车交接总单ID")
    @Column(name = "cage_car_ids")
    @SerializedName("CAGE_CAR_IDS")
    private String cageCarIds;

    /**
     * 干线线路(WMS《路线管理》中的“干线线路”字段)
     */
    @FieldName(name = "干线线路")
    @Column(name = "trunkline")
    @SerializedName("TRUNKLINE")
    private String trunkline;

    /**
     * 干线车牌号码(干线业务取自WMS《笼车交接单管理》；非干线业务取自取自WMS《装车单查询》)
     */
    @FieldName(name = "干线车牌号码")
    @Column(name = "trunnk_line_plate")
    @SerializedName("TRUNNK_LINE_PLATE")
    private String trunnkLinePlate;

    /**
     * 干线车型(可显示8种车型。但默认“7.6米普通车”)
     */
    @FieldName(name = "干线车型")
    @Column(name = "trunk_model")
    @SerializedName("TRUNK_MODEL")
    private String trunkModel;

    /**
     * 支线车牌号码(取自WMS《装车单查询》/《签收单领用》)
     */
    @FieldName(name = "支线车牌号码")
    @Column(name = "branch_plate")
    @SerializedName("BRANCH_PLATE")
    private String branchPlate;

    /**
     * 支线租车模式(设置功能维护各支线车辆对应租车模式的关系)
     */
    @FieldName(name = "支线租车模式")
    @Column(name = "rental_model")
    @SerializedName("RENTAL_MODEL")
    private String rentalModel;

    /**
     * 配送员(取自WMS《装车单查询》/《签收单领用》)
     */
    @FieldName(name = "配送员")
    @Column(name = "delivery")
    @SerializedName("DELIVERY")
    private String delivery;

    /**
     * 起运仓库(取自WMS《签收单查询》，现系统中只有仓库编号，需要把实际的仓库名称显示出来)
     */
    @FieldName(name = "起运仓库")
    @Column(name = "warehouse")
    @SerializedName("WAREHOUSE")
    private String warehouse;

    /**
     * 落地配仓库(干线业务显示落地配仓库，非干线业务显示起运仓库)
     */
    @FieldName(name = "落地配仓库")
    @Column(name = "ground_depot")
    @SerializedName("GROUND_DEPOT")
    private String groundDepot;

    /**
     * 笼车交接单回单确认标识(取自WMS《笼车交接单管理》)
     */
    @FieldName(name = "笼车交接单回单确认标识")
    @Column(name = "cage_car_confirmation_flag")
    @SerializedName("CAGE_CAR_CONFIRMATION_FLAG")
    private String cageCarConfirmationFlag;

    /**
     * 温度计回收计费标志(对于含有冷藏商品的签收单，默认“是”，其余为“否”。)
     */
    @FieldName(name = "温度计回收计费标志")
    @Column(name = "thermometer_recovery_flag")
    @SerializedName("THERMOMETER_RECOVERY_FLAG")
    private Boolean thermometerRecoveryFlag;

    /**
     * 温度计发运标志
     */
    @FieldName(name = "温度计发运标志")
    @Column(name = "thermometer_delivery_flag")
    @SerializedName("THERMOMETER_DELIVERY_FLAG")
    private Boolean thermometerDeliveryFlag;

    /**
     * 泡沫箱回收数量(对于含有冷藏商品的签收单，统计显示该签收单发出的泡沫箱数量)
     */
    @FieldName(name = "泡沫箱回收数量")
    @Column(name = "foam_box_num")
    @SerializedName("FOAM_BOX_NUM")
    private Integer foamBoxNum;

    /**
     * 货到收款服务计费标志(对于需要货到收款的签收单，该字段默认“是”，其余为“否”)
     */
    @FieldName(name = "货到收款服务计费标志")
    @Column(name = "charging_flag")
    @SerializedName("CHARGING_FLAG")
    private Boolean chargingFlag;

    /**
     * 非常规工作时段标志(该字段默认值为“无”，可选择“工作日/休息日/节假日”)
     */
    @FieldName(name = "非常规工作时段标志")
    @Column(name = "unconventional_working_flag")
    @SerializedName("UNCONVENTIONAL_WORKING_FLAG")
    private String unconventionalWorkingFlag;

    /**
     * 取消订单标志(负数签收单的该字段默认值为“是”。其它签收单默认为“否”)
     */
    @FieldName(name = "取消订单标志")
    @Column(name = "cancel_order_flag")
    @SerializedName("CANCEL_ORDER_FLAG")
    private Boolean cancelOrderFlag;

    /**
     * 运费结算支付标志(不付/应付/应付不付/应付待付/已付)
     */
    @FieldName(name = "运费结算支付标志")
    @Column(name = "freight_pay_flag")
    @SerializedName("FREIGHT_PAY_FLAG")
    @Enumerated(EnumType.ORDINAL)
    private FreightPayStatus payStatus;

    /**
     * 预估运费(除租车配送模式和委外配送模式以外模式的分摊预估费用)
     */
    @FieldName(name = "预估运费")
    @Column(name = "estimated_freight")
    @SerializedName("ESTIMATED_FREIGHT")
    private Double estimatedFreight;

    /**
     * 预估租车服务费(租车配送模式的分摊预估费用)
     */
    @FieldName(name = "预估租车服务费")
    @Column(name = "est_rental_service_fee")
    @SerializedName("EST_RENTAL_SERVICE_FEE")
    private Double estimatedCarRentalServiceFee;

    /**
     * 预估配送服务费(委外配送模式的分摊预估费用)
     */
    @FieldName(name = "预估配送服务费")
    @Column(name = "est_distribution_service_fee")
    @SerializedName("EST_DISTRIBUTION_SERVICE_FEE")
    private Double estimatingDistributionServiceFee;

    /**
     * 预估合计运费(前三者合计)
     */
    @FieldName(name = "预估合计运费")
    @Column(name = "estimated_total_freight")
    @SerializedName("ESTIMATED_TOTAL_FREIGHT")
    private Double estimatedTotalFreight;

    /**
     * 应付运费(除租车配送模式和委外配送模式以外模式的分摊应付费用)
     */
    @FieldName(name = "应付运费")
    @Column(name = "freight_payable")
    @SerializedName("FREIGHT_PAYABLE")
    private Double freightPayable;

    /**
     * 应付租车服务费(租车配送模式的分摊应付费用)
     */
    @FieldName(name = "应付租车服务费")
    @Column(name = "pay_taxi_service_fee")
    @SerializedName("PAY_TAXI_SERVICE_FEE")
    private Double payableTaxiServiceFee;

    /**
     * 应付配送服务费(委外配送模式的分摊应付费用)
     */
    @FieldName(name = "应付配送服务费")
    @Column(name = "pay_distribution_service_fee")
    @SerializedName("PAY_DISTRIBUTION_SERVICE_FEE")
    private Double payableDistributionServiceFee;

    /**
     * 应付合计运费(前三者合计)
     */
    @FieldName(name = "应付合计运费")
    @Column(name = "total_freight_payable")
    @SerializedName("TOTAL_FREIGHT_PAYABLE")
    private Double totalFreightPayable;

    /**
     * 运费付款单ID(回填除租车配送模式和委外配送模式以外模式的支付总单ID)
     */
    @FieldName(name = "运费付款单ID")
    @Column(name = "freight_bill_id")
    @SerializedName("FREIGHT_BILL_ID")
    private Long freightBillId;

    /**
     * 运费支付日期(回填除租车配送模式和委外配送模式以外模式的支付日期)
     */
    @FieldName(name = "运费支付日期")
    @Column(name = "freight_payment_date")
    @SerializedName("FREIGHT_PAYMENT_DATE")
    private Date freightPaymentDate;

    /**
     * 租车服务费付款单ID(回填租车配送模式的支付总单ID)
     */
    @FieldName(name = "租车服务费付款单ID")
    @Column(name = "rental_service_fee_payid")
    @SerializedName("RENTAL_SERVICE_FEE_PAYID")
    private Long rentalServiceFeePaymentId;

    /**
     * 租车服务费支付日期(回填租车配送模式的支付日期)
     */
    @FieldName(name = "租车服务费支付日期")
    @Column(name = "pay_date_rental_service_fee")
    @SerializedName("PAY_DATE_RENTAL_SERVICE_FEE")
    private Date paymentDateOfCarRentalServiceFee;

    /**
     * 配送服务费付款单ID(回填委外配送模式的支付总单ID)
     */
    @FieldName(name = "配送服务费付款单ID")
    @Column(name = "distri_service_fee_payid")
    @SerializedName("DISTRI_SERVICE_FEE_PAYID")
    private Long distributionServiceFeePaymentId;

    /**
     * 配送服务费支付日期(回填委外配送模式的支付日期)
     */
    @FieldName(name = "配送服务费支付日期")
    @Column(name = "pay_date_distri_service_fee")
    @SerializedName("PAY_DATE_DISTRI_SERVICE_FEE")
    private Date paymentDateOfDistributionServiceFee;

    /**
     * 信息修改标志(任意信息被管理人员手动修改，则该字段显示“有”，否则显示“无”)
     */
    @FieldName(name = "信息修改标志")
    @Column(name = "information_modification_mark")
    @SerializedName("INFORMATION_MODIFICATION_MARK")
    private Boolean informationModificationMark;

    @FieldName(name = "签收单挂起状态")
    @Column(name = "is_hang_up")
    @SerializedName("IS_HANG_UP")
    private Boolean isHangUp;


//    @FieldName(name = "目的地客户服务类型")
//    @Column(name = "destination_custom_type")
//    @SerializedName("DESTINATION_CUSTOM_TYPE")
//    private String destinationCustomType;
//
//    @FieldName(name = "起运地客户服务类型")
//    @Column(name = "src_custom_type")
//    @SerializedName("SRC_CUSTOM_TYPE")
//    private String srcCustomType;

    @FieldName(name = "计费用客户服务类型")
    @Column(name = "cost_custom_type")
    @SerializedName("COST_CUSTOM_TYPE")
    private String costCustomType;

    @FieldName(name = "实际商品重量")
    @Column(name = "real_weight")
    @SerializedName("REAL_WEIGHT")
    private Double realWeight;


    @FieldName(name = "系统商品体积")
    @Column(name = "system_volume")
    @SerializedName("SYSTEM_VOLUME")
    private Double systemVolume;


    @FieldName(name = "实际商品体积")
    @Column(name = "real_volume")
    @SerializedName("REAL_VOLUME")
    private Double realVolume;


    @FieldName(name = "收款确认标志")
    @Column(name = "recconfirmflag")
    @SerializedName("RECCONFIRMFLAG")
    private Boolean recconfirmFlag;

    @FieldName(name = "租车服务商")
    @Column(name = "rental_servicer")
    @SerializedName("RENTAL_SERVICER")
    private String rentalServicer;

    @FieldName(name = "配送服务商")
    @Column(name = "delivery_servicer")
    @SerializedName("DELIVERY_SERVICER")
    private String deliveryServicer;

    @FieldName(name = "泡沫箱发出数量")
    @Column(name = "foam_box_send_num")
    @SerializedName("FOAM_BOX_SEND_NUM")
    private Double foamBoxSendNum;


    /**
     * 送货地址详情
     */
    @FieldName(name = "送货地址详情")
    @Column(name = "address")
    @SerializedName(value = "ADDRESS")
    private String address;

    /**
     * 货主名
     */
    @FieldName(name = "货主名")
    @Column(name = "consignor_name")
    @SerializedName(value = "CONSIGNOR_NAME")
    private String consignorName;


    /**
     * 客户类型 0-医疗 1-商业 2-商业
     */
    @FieldName(name = "客户类型")
    @Column(name = "customer_type")
    @SerializedName(value = "CUSTOMTYPE")
    @Enumerated(EnumType.ORDINAL)
    private CustomType customerType;


    /**
     * 省份
     */
    @FieldName(name = "省份")
    @Column(name = "PROVINCE")
    private String province;


    /**
     * 城市
     */
    @FieldName(name = "城市")
    @Column(name = "CITY")
    private String city;


    /**
     * 送货点编码
     */
    @FieldName(name = "送货点编码")
    @Column(name = "delivery_point")
    private String deliveryPoint;


    /**
     * 送货分点编码
     */
    @FieldName(name = "送货分点编码")
    @Column(name = "child_delivery_point")
    @SerializedName(value = "CHILDDELIVERYPOINT")
    private String childDeliveryPoint;


    /**
     * 二次分货标志
     */
    @FieldName(name = "二次分货标志")
    @Column(name = "distributionflag")
    private Boolean distributionFlag;


    /**
     * 透析液标志
     */
    @FieldName(name = "透析液标志")
    @Column(name = "dialysateflag")
    private Boolean dialySateFlag;


    /**
     * 透析液自提标志
     */
    @FieldName(name = "透析液自提标志")
    @Column(name = "dialysateselfpickflag")
    private Boolean dialySateSelfPickFlag;


    /**
     * 上楼楼层
     */
    @FieldName(name = "上楼楼层")
    @Column(name = "upstairs")
    private Integer upstairs;


    /**
     * 委外配送服务线路补贴
     */
    @Column(name = "outsourcing_subsidy")
    private Double outsourcingSubsidy;

    /**
     * 特殊计费模式ID
     */
    @Transient
    private Long specialId;


}
