package gm.facade.fee.entity.base;

import com.google.gson.annotations.SerializedName;
import gm.common.base.annotation.FieldName;
import gm.facade.fee.constant.CalculateType;
import gm.facade.fee.constant.FeeStatus;
import gm.facade.fee.entity.wms.TransportBaseFeeMapping;
import gm.facade.fee.entity.wms.TransportBaseV;
import lombok.Data;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@MappedSuperclass
@ComponentScans(@ComponentScan( value = {"gm.common.base.aop"}))
@EntityListeners(AuditingEntityListener.class)
public abstract class Freight implements Serializable {

    /**
     * 计费单批号
     */
    @FieldName(name = "计费单批号")
    @Column(name = "batch_no")
    private Long batchNo;

    /**
     * 计费类型
     */
    @FieldName(name = "计费类型（0-预估，1-应付，2-实付）")
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "CALCULATE_TYPE")
    private CalculateType calculateType;

    /**
     * 状态
     */
    @FieldName(name = "状态(0-无效,1-初始化,2-确认)")
    @Column(name = "status")
    private FeeStatus status;

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
     * 运输日期(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    @FieldName(name = "运输日期")
    @Column(name = "transport_date")
    private Date transportDate;

    /**
     * 签收单ids
     */
//    @Column(name = "base_ids")
//    @FieldName(name = "签收单ids")
//    @Transient
//    private String transportBaseIds;
    @Transient
    private List<TransportBaseFeeMapping> baseFeeMappings;

    /**
     * 特殊分组ID
     */
    @Transient
    private Long specialConfigId;

    /**
     * 子列表
     */
    @Transient
    private List<Freight> childFreightList;
}
