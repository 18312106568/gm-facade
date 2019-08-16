package gm.facade.fee.entity;

import gm.facade.fee.entity.base.BaseEntity;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "jf_freight_config")
public class FreightConfig implements Serializable {

    //主键ID 计费模式 承运商  省份 城市 创建时间 更新时间 修改人 备注
    @OneToOne(optional=false)
    @JoinColumn(name = "mode_id")
    private FreightMode freightMode;

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column(name = "configid")
    private Long id;


    @Column(name = "remarks")
    private String remarks;

    @OneToMany(mappedBy = "freightConfig",fetch=FetchType.EAGER)
    private List<FreightConfigItem> freightConfigItems;

    /**
     * 开始有效期
     */
    @Column(name = "start_valid_date")
    private Date startValidDate;

    /**
     * 截止有效期
     */
    @Column(name = "end_valid_date")
    private Date endValidDate;

    /**
     * 创建时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更改时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 创建人
     */
    @Column(name = "create_by")
    private String createBy;

    /**
     * 更改人
     */
    @Column(name = "update_by")
    private String updateBy;

}
