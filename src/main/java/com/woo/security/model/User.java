package com.woo.security.model;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Entity // User 클래스가 MySQL에 테이블로 생성
public class User {

    @Id // Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 프로젝트에서 연결된 DB의 넘버링 전략을 따라감(Oracle은 sequence, Mysql은 Auto)
    private int id;

    @Column(nullable = false, length = 30)
    private String username;    //아이디

    @Column(nullable = false, length = 100) // 123456 => 해쉬(비밀번호 암호화)
    private String password;

    @Column(nullable = false, length = 50)
    private String email;

    @ColumnDefault("'user'")
    private String role;    // Enum을 쓰는게 좋음 (admin, user, manager)

    @CreationTimestamp  // 시간이 자동으로 입력됨
    private Timestamp createDate;

}
