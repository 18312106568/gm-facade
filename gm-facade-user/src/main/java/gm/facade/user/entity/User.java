package gm.facade.user.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "tb_user")
public class User implements Serializable {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name="name")
    private String name;
}
