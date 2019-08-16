package gm.facade.fee.entity.base;

import gm.facade.fee.constant.FreightCalculateType;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@Data
@MappedSuperclass
public class Freight extends IdEntity {

    /**
     * 计费单批号
     */
    @Column(name = "batch_no")
    private Long batchNo;

    /**
     * 计费类型
     */
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "calculate_type")
    private FreightCalculateType calculateType;

    /**
     * 是否有效
     */
    @Column(name = "isefect")
    private Boolean isefect;
}
