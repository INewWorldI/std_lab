package nworld.dev.std_lab_week1.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
@NoArgsConstructor
public class Freeboard {
    @Id
    @GeneratedValue
    private Long id; // 게시물 아이디
    private String title; // 게시물 제목
    private String content; // 게시물 내용
    private String writer; // 게시물 작성자
}
