package com.andy.core.entity.primary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author: Mr.ruolin
 * @createBy: 2018-03-31 17:12
 **/
@Data
@Entity
@Table(name = "t_mc_user")
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String username;

    private String password;

    private String address;

    private String age;

    private String sex;

    private Date birthday;

    private String nickname;

    private String openid;

    private String source;

    private String storeId;

    private String phone;

    private String idCard;

    private String imgUrl;

    private Date createTime;

    private Date updateTime;


}
