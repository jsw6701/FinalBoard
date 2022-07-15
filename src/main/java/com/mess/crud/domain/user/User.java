package com.mess.crud.domain.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Builder // 어느 필드에 어떤 값을 채워야하는지 명확하게 알 수 있음
@NoArgsConstructor //Lombok 어노테이션으로 빈 생성자를 만들어줌
@Entity //해당 클래스가 엔티티를 위한 클래스이며, 해당 클래스의 인스턴스들이 JPA로 관리되는 엔티티 객체라는 뜻(즉, 테이블임)
@AllArgsConstructor

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //PK 자동 생성 즉, auto_increment 말함 JPA 원래 넘버링 전략은 이게 아님(application.yml에서 use-new-id-generate-mappings:false한것)
    private Long id;

    @Column(nullable = false, length = 30)
    private String username;

    @Column(nullable = false, length = 100)
    private String password;

    @Column(nullable = false, length = 50)
    private String email;

    @Column(nullable = false, length = 50)
    private String nickname;

    @Enumerated(EnumType.STRING) //JPA로 DB에 저장할 때 Enum 값을 어떤 형태로 저장할지 결정
    @Column(nullable = false)
    private Role role;

}
