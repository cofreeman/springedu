package com.example.springedu.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class TeamMemberVO {
    private String name;
    private String nickName;
    private String food;
}
