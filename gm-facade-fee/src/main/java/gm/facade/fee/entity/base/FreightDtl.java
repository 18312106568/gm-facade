package gm.facade.fee.entity.base;

import gm.common.base.annotation.FieldName;
import gm.facade.fee.constant.CalculateType;
import gm.facade.fee.constant.FeeStatus;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

@Data
@MappedSuperclass
public class FreightDtl extends Freight {


    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column(name = "dtlid")
    @FieldName(name = "主键ID")
    private Long id;

    @Column(name = "docid")
    @FieldName(name = "总单ID")
    private Long docId;



}
