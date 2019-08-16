package gm.facade.fee.entity;

import gm.facade.fee.constant.FreightExpType;
import gm.facade.fee.entity.base.BaseEntity;
import lombok.Data;

import javax.persistence.*;

/**
 * 计费公式属性来源
 */
@Data
@Entity
@Table(name = "jf_freight_exp")
public class FreightExp extends BaseEntity {

    @ManyToOne(optional=false)
    @JoinColumn(name = "mode_id")
    private FreightMode freightMode;

    /**
     * 公式类型(0-细单1-总单)
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
     * 属性方法名
     */
    @Column( name = "cal_exp")
    private String calExp;
}
