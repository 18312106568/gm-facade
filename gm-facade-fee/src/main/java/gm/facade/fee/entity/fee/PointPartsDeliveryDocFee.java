package gm.facade.fee.entity.fee;

import com.google.gson.annotations.SerializedName;
import gm.common.base.annotation.FieldName;
import gm.facade.fee.constant.CustomType;
import gm.facade.fee.entity.base.FreightDoc;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 点件配送总单
 */
@Data
@Entity
@Table(name = "jf_fee_pointparts_doc",catalog = "点件配送总单")

public class PointPartsDeliveryDocFee extends FreightDoc {

    /**
     * 承运商
     */
    @FieldName(name = "承运商")
    @Column( name = "carrier")
    private String carrier;

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
     * 客户类型
     */
    @FieldName(name = "客户类型")
    @Column(name = "customer_type")
    @Enumerated(EnumType.ORDINAL)
    private CustomType customerType;

    /**
     * 送货点数
     */
    @FieldName(name = "送货点数")
    @Column( name = "delivery_point_num")
    private Integer deliveryPointNum;

    /**
     * 送货点运费
     */
    @FieldName(name = "送货点运费")
    @Column( name = "delivery_point_freight")
    private Double deliveryPointFreight;

    /**
     * 送货分点数
     */
    @FieldName(name = "送货分点数")
    @Column( name = "child_delivery_point_num")
    private Integer childDeliveryPointNum;

    /**
     * 送货分点运费
     */
    @FieldName(name = "送货分点运费")
    @Column( name = "child_delivery_point_freight")
    private Double childDeliveryPointFreight;

    /**
     * 送货件数
     */
    @FieldName(name = "送货件数")
    @Column( name = "delivery_num")
    private Integer deliveryNum;

    /**
     * 送货件运费
     */
    @FieldName(name = "送货件运费")
    @Column( name = "delivery_freight")
    private Double deliveryFreight;

    /**
     * 点件总运费
     */
    @FieldName(name = "点件总运费")
    @Column( name = "total_point_freight")
    private Double totalPointFreight;

    /**
     * 出车费
     */
    @FieldName(name = "出车费")
    @Column( name = "exit_fare")
    private Double exitFare;


}
