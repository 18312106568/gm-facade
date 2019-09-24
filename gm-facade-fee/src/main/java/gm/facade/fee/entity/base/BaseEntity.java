package gm.facade.fee.entity.base;

import gm.common.base.annotation.FieldName;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity extends IdEntity {
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
