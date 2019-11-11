package gm.facade.fee.entity;

import com.google.gson.annotations.SerializedName;
import gm.common.base.annotation.FieldName;
import gm.facade.fee.constant.CustomType;
import gm.facade.fee.constant.FreightExpType;
import gm.facade.fee.entity.base.BaseEntity;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "jf_freight_group_sp_dj",catalog = "点件模式特殊表")
public class FreightGroupDj extends BaseEntity {


    /**
     * 承运商
     */
    @FieldName(name = "承运商")
    @Column(name = "carrier")
    @SerializedName("CARRIER")
    private String carrier;

    /**
     * 客户类型 0-医疗 1-商业 2-商业
     */
    @FieldName(name = "客户类型")
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
     * 客户类型 0-医疗 1-商业 2-商业
     */
    @FieldName(name = "计费客户类型")
    @Column(name = "cost_customer_type")
    @SerializedName(value = "COST_CUSTOMER_TYPE")
    @Enumerated(EnumType.ORDINAL)
    private CustomType costCustomerType;
}
