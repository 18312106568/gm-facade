package gm.facade.fee.entity.wms;

import gm.common.base.annotation.FieldName;
import gm.facade.fee.entity.base.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "jf_transport_logistic",catalog = "物流模式表")
public class TransportLogistic extends BaseEntity {

    @FieldName(name = "物流模式名")
    @Column(name = "name")
    private String name;

    /**
     * 计费模式ids
     */
    @FieldName(name = "计费模式ids")
    @Column(name = "mode_ids")
    private String modeIds;
}
