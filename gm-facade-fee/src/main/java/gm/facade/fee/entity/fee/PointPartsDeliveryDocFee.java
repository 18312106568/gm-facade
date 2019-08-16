package gm.facade.fee.entity.fee;

import gm.facade.fee.entity.base.Freight;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * 点件配送细单
 */
@Data
@Entity
@Table(name = "jf_fee_pointparts_doc")
public class PointPartsDeliveryDocFee extends Freight {

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
     * 客户类型
     */
    @Column( name = "customer_type")
    private String customerType;

    /**
     * 客户名称
     */
    @Column( name = "customer_name")
    private String customerName;

    /**
     * 送货点编码
     */
    @Column( name = "delivery_point_code")
    private String deliveryPointCode;

    /**
     * 送货分点数
     */
    @Column( name = "delivery_points_num")
    private Integer deliveryPointsNum;

    /**
     * 送货件数
     */
    @Column( name = "number_of_deliveries")
    private Integer numberOfDeliveries;

    /**
     * 计算送货分点数
     */
    @Column( name = "child_delivery_points_num")
    private Integer childDeliveryPointsNum;

    /**
     * 送货点运费
     */
    @Column( name = "delivery_point_freight")
    private Double deliveryPointFreight;

    /**
     * 送货分点运费
     */
    @Column( name = "child_delivery_point_freight")
    private Double childDeliveryPointFreight;

    /**
     * 送货件运费
     */
    @Column( name = "delivery_freight")
    private Double deliveryFreight;

    /**
     * 点件总运费
     */
    @Column( name = "total_point_freight")
    private Double totalPointFreight;
}
