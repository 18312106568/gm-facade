package gm.facade.fee.entity;

import gm.facade.fee.entity.base.IdEntity;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "jf_freight_config_item")
@ToString(exclude = {"freightConfig"})
public class FreightConfigItem implements Serializable {
    //主键ID 总表ID 组ID 配置名 配置值

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column(name = "configdtlid")
    private Long id;

    @ManyToOne(optional=false)
    @JoinColumn(name = "configid")
    private FreightConfig freightConfig;

    /**
     * 属性
     */
    @ManyToOne(optional=false)
    @JoinColumn(name = "field_id")
    private FreightField field;

    @Column(name = "config_value")
    private String configValue;
}
