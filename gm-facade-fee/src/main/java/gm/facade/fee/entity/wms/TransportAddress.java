package gm.facade.fee.entity.wms;

import com.google.gson.annotations.SerializedName;
import gm.common.base.annotation.FieldName;
import gm.facade.fee.constant.CustomType;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "JF_ADDRESS")
public class TransportAddress implements Serializable {
    /**
     * 送货地址ID
     */
    @Id
    @Column(name = "ADDRESSID")
    @SerializedName(value = "ADDRESSID")
    private Long addressid;

    /**
     * 送货地址详情
     */
    @Column(name = "address")
    @SerializedName(value = "ADDRESS")
    private String address;


    /**
     * 客户编码
     */
    @Column(name = "customer_code")
    @SerializedName(value = "CUSTOMER_CODE")
    private String customCode;

    /**
     * 货主ID
     */
    @Column(name = "consignor")
    @SerializedName(value = "CONSIGNOR")
    private Long consignor;

    /**
     * 货主名
     */
    @Column(name = "consignor_name")
    @SerializedName(value = "CONSIGNOR_NAME")
    private String consignorName;


    /**
     * 客户类型 0-医疗 1-商业 2-商业
     */
    @Column(name = "customer_type")
    @SerializedName(value = "CUSTOMTYPE")
    @Enumerated(EnumType.ORDINAL)
    private CustomType customType;


    /**
     * 省份
     */
    @Column(name = "PROVINCE")
    private String province;


    /**
     * 城市
     */
    @Column(name = "CITY")
    private String city;


    /**
     * 送货点编码
     */
    @Column(name = "delivery_point")
    private String deliveryPoint;


    /**
     * 送货分点编码
     */
    @Column(name = "child_delivery_point")
    @SerializedName(value = "CHILDDELIVERYPOINT")
    private String childDeliveryPoint;


    /**
     * 二次分货标志
     */
    @Column(name = "distributionflag")
    private Boolean distributionFlag;


    /**
     * 透析液标志
     */
    @Column(name = "dialysateflag")
    private Boolean dialySateFlag;


    /**
     * 透析液自提标志
     */
    @Column(name = "dialysateselfpickflag")
    private Boolean dialySateSelfPickFlag;


    /**
     * 上楼楼层
     */
    @Column(name = "upstairs")
    private Integer upstairs;


    /**
     * 委外配送服务线路补贴
     */
    @Column(name = "outsourcing_subsidy")
    private Double outsourcingSubsidy;

}
