package gm.facade.fee.entity.wms;

import gm.common.base.annotation.FieldName;
import gm.facade.fee.entity.base.BaseEntity;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "jf_transport_logistic",catalog = "物流模式表")
public class TransportLogistic implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column(name = "docid")
    @FieldName(name = "主键ID")
    private Long id;

    @FieldName(name = "物流模式名")
    @Column(name = "transportname")
    private String name;

    /**
     * 计费模式ids
     */
    @FieldName(name = "计费模式ids")
    @Column(name = "mode_ids")
    private String modeIds;

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
}
