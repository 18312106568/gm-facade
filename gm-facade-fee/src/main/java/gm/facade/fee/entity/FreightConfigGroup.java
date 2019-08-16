package gm.facade.fee.entity;

import gm.facade.fee.constant.FreightConfigType;
import gm.facade.fee.constant.FreightExpType;
import gm.facade.fee.entity.base.BaseEntity;
import lombok.Data;

import javax.persistence.*;

/**
 * 运费分组配置
 */
@Data
@Entity
@Table(name = "jf_freight_config_group")
public class FreightConfigGroup extends BaseEntity {

    /**
     * 运费模式
     */
    @ManyToOne(optional=false)
    @JoinColumn(name = "mode_id")
    private FreightMode freightMode;

    /**
     * 公式类型(0-DOC-细单 1-DTL-总单)
     */
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "type")
    private FreightExpType type;

    /**
     * 属性
     */
    @ManyToOne(optional=false)
    @JoinColumn(name = "field_id")
    private FreightField field;

    /**
     * 配置类型 0-通用 1-CONF-只用于配置，2-GROUP-只用于分组
     */
    @Enumerated(EnumType.ORDINAL)
    @Column( name = "config_type")
    private FreightConfigType configType;

}
