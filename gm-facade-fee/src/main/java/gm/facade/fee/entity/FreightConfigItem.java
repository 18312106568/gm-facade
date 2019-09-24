package gm.facade.fee.entity;

import gm.common.base.annotation.FieldName;
import gm.facade.fee.entity.base.IdEntity;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "jf_freight_config_item",catalog = "运价表细单")
@ToString(exclude = {"freightConfig"})
public class FreightConfigItem implements Serializable {

    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column(name = "configdtlid")
    @FieldName(name = "主键")
    private Long id;

    /**
     * 运价总表
     */
    @ManyToOne(optional=false)
    @JoinColumn(name = "configid")
    @FieldName(name = "运价总表ID")
    private FreightConfig freightConfig;

    /**
     * 属性
     */
    @FieldName(name = "属性ID")
    @ManyToOne(optional=false)
    @JoinColumn(name = "field_id")
    private FreightField field;

    /**
     * 属性值
     */
    @FieldName(name = "属性值")
    @Column(name = "config_value")
    private String configValue;
}
