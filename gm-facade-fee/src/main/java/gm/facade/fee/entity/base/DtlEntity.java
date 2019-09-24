package gm.facade.fee.entity.base;

import gm.common.base.annotation.FieldName;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@MappedSuperclass
public class DtlEntity implements Serializable {

}
