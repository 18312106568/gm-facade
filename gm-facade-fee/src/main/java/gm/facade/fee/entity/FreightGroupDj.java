package gm.facade.fee.entity;

import com.google.gson.annotations.SerializedName;
import gm.common.base.annotation.FieldName;
import gm.facade.fee.constant.CustomType;
import gm.facade.fee.constant.FreightExpType;
import gm.facade.fee.entity.base.BaseEntity;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "jf_freight_group_sp_dj",catalog = "点件模式特殊表")
public class FreightGroupDj implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column(name = "docid")
    @FieldName(name = "主键ID")
    private Long id;

    /**
     * 创建时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    @Column(name = "create_time")
    @FieldName(name = "创建时间")
    private Date createTime;

    /**
     * 更改时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    @Column(name = "update_time")
    @FieldName(name = "更改时间")
    private Date updateTime;

    /**
     * 创建人
     */
    @Column(name = "create_by")
    @FieldName(name = "创建人ID")
    private Long createBy;

    /**
     * 更改人
     */
    @Column(name = "update_by")
    @FieldName(name = "更改人ID")
    private Long updateBy;


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
