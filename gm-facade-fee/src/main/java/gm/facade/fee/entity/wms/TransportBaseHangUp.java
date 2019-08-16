package gm.facade.fee.entity.wms;

import gm.facade.fee.entity.FreightField;
import gm.facade.fee.entity.FreightMode;
import gm.facade.fee.entity.base.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 签收单挂起条件表
 */
@Data
@Entity
@Table(name = "jf_transport_base_hang_up")
public class TransportBaseHangUp  extends BaseEntity {

    @ManyToOne(optional=false)
    @JoinColumn(name = "mode_id")
    private FreightMode freightMode;

    /**
     * 属性
     */
    @ManyToOne(optional=false)
    @JoinColumn(name = "field_id")
    private FreightField field;
}
