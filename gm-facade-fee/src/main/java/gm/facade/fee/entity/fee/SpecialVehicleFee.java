package gm.facade.fee.entity.fee;

import gm.common.base.annotation.FieldName;
import gm.facade.fee.entity.base.FreightDoc;
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
@Table(name = "jf_fee_special_vehicle",catalog = "专车配送总细单")
public class SpecialVehicleFee extends FreightDoc {
    /**
     * 承运商
     */
    @FieldName(name = "承运商")
    @Column( name = "carrier")
    private String carrier;


    /**
     * 专车编号
     */
    @FieldName(name = "专车编号")
    @Column( name = "special_vehicle_num")
    private String specialVehicleNum;

    /**
     * 专车业务类型
     */
    @FieldName(name = "专车业务类型")
    @Column( name = "special_vehicle_biz_type")
    private String specialVehiclBizType;

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
     * 签收单数
     */
    @FieldName(name = "签收单数")
    @Column( name = "receipt_num")
    private Integer receiptNum;

    /**
     * 送货件数
     */
    @FieldName(name = "送货件数")
    @Column( name = "delivery_num")
    private Integer deliveryNum;

    /**
     * 冷藏箱数
     */
    @FieldName(name = "冷藏箱数")
    @Column( name = "refrigerated_box_num")
    private Integer refrigeratedBoxNum;

    /**
     * 温控品种件数
     */
    @FieldName(name = "温控品种件数")
    @Column( name = "temperature_control_num")
    private Integer temperatureControlNum;

    /**
     * 专车车型1
     */
    @FieldName(name = "专车车型1")
    @Column( name = "special_vehicle_type1")
    private String specialVehicleType1;

    /**
     * 专车车型1车次数
     */
    @FieldName(name = "专车车型1车次数")
    @Column( name = "special_vehicle_num1")
    private Integer specialVehicleNum1;

    /**
     * 专车车型1车次运费
     */
    @FieldName(name = "专车车型1车次运费")
    @Column( name = "special_vehicle_type_fee1")
    private Double specialVehicleTypeFee1;

    /**
     * 专车车型2
     */
    @FieldName(name = "专车车型2")
    @Column( name = "special_vehicle_type2")
    private String specialVehicleType2;

    /**
     * 专车车型2车次数
     */
    @FieldName(name = "专车车型2车次数")
    @Column( name = "special_vehicle_num2")
    private Integer specialVehicleNum2;

    /**
     * 专车车型2车次运费
     */
    @FieldName(name = "专车车型2车次运费")
    @Column( name = "special_vehicle_type_fee2")
    private Double specialVehicleTypeFee2;

    /**
     * 专车车型3
     */
    @FieldName(name = "专车车型3")
    @Column( name = "special_vehicle_type3")
    private String specialVehicleType3;

    /**
     * 专车车型3车次数
     */
    @FieldName(name = "专车车型3车次数")
    @Column( name = "special_vehicle_num3")
    private Integer specialVehicleNum3;

    /**
     * 专车车型3车次运费
     */
    @FieldName(name = "专车车型3车次运费")
    @Column( name = "special_vehicle_type_fee3")
    private Double specialVehicleTypeFee3;

    /**
     * 经停城市数
     */
    @FieldName(name = "经停城市数")
    @Column( name = "stopped_city_num")
    private Integer stoppedCityNum;

    /**
     * 经停城市配送费
     */
    @FieldName(name = "经停城市配送费")
    @Column( name = "stopped_city_fee")
    private Double stoppedCityFee;

    /**
     * 超额送货点数
     */
    @FieldName(name = "超额送货点数")
    @Column( name = "over_delivery_point_num")
    private Integer overdeliveryPointNum;

    /**
     * 超额送货点配送费
     */
    @FieldName(name = "超额送货点配送费")
    @Column( name = "over_delivery_point_fee")
    private Double overDeliveryPointFee;

    /**
     * 手机签收服务费
     */
    @FieldName(name = "手机签收服务费")
    @Column( name = "mobile_receipt_fee")
    private Double mobileReceiptFee;


}
