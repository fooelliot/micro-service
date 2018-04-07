package com.andy.user.dto;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author: Mr.ruolin
 * @createBy: 2018-04-01 08:15
 **/
@Data
public class UserDto implements Serializable {

//    @NotBlank(message = "用户名不能为空")
    @NotNull(message = "用户名不能为空")
    private String username;

    @NotNull(message = ",密码不能为空")
    @Length(min=6 ,max=8, message = "密码长度在6-8之间")
    private String password;

    @NotNull(message = "生日不能为空")
    @Past(message = "生日必须小于当前时间")
    private Date birthday;

    @Max(value =  120, message = "年龄必须小于120")
    @Min(value = 0, message = "年龄必须大于0")
    private Integer age;

}
