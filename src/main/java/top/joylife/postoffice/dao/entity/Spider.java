package top.joylife.postoffice.dao.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * created by wuhaiming on 2018/2/5
 */
@Data
@Table(name = "spider")
public class Spider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String remark;

    private Integer status;

    private Date dateCreate;

    private Date dateUpdate;

    private Date dateDelete;
}
