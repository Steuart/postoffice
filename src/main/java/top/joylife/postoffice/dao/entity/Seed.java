package top.joylife.postoffice.dao.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * created by wuhaiming on 2018/2/6
 */
@Data
@Table(name = "seed")
public class Seed {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String ip;

    private String content;

    private Integer status;

    private Date dateCreate;

    private Date dateUpdate;

    private Date dateDelete;
}
