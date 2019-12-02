package gm.facade.fee.entity;

import gm.common.base.annotation.FieldName;
import gm.facade.fee.entity.base.BaseEntity;
import lombok.Data;

import javax.persistence.*;

/**
 * 计费模式表
 */
@Data
@Entity
@Table(name = "jf_freight_mode",catalog = "计费模式")
public class FreightMode extends BaseEntity {


    /**
     * 模式名
     */
    @FieldName(name = "模式名")
    @Column(name = "name")
    private String name;

    /**
     * 是否总细分开
     */
    @FieldName(name = "是否总细分开")
    @Column(name = "is_multiple")
    private Boolean isMultiple;

    /**
     * 计费系统物流模式IDS
     */
    @FieldName(name = "物流模式IDS")
    @Column(name = "logistics_mode_ids")
    private String logisticsModeIds;


}
