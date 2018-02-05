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
@Table(name = "node")
public class Node {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nextNode;

    private String url;

    private String content;

    private String keywords;

    private Integer status;

    private Date dateCreate;

    private Date dateUpdate;

    private Date dateDelete;


}
