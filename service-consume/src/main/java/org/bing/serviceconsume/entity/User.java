package org.bing.serviceconsume.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 用户信息
 * @author sunyibing
 * @date 2024/4/2
 */
@Table(name = "USER")
@Entity
@Data
public class User {
    @Id
    private String id;
    @Column(name = "NAME", nullable = false)
    private String name;
    @Column(name = "AGE", nullable = false)
    private Integer age;
    @Column(name = "PASSWORD", nullable = false)
    private String password;

}
