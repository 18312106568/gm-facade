package gm.facade.fee.entity.base;

import gm.common.base.annotation.FieldName;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@MappedSuperclass
public class IdEntity implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column(name = "id")
    @FieldName(name = "主键ID")
    private Long id;
}
