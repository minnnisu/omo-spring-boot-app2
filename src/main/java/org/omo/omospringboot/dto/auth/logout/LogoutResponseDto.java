package org.omo.omospringboot.dto.auth.logout;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LogoutResponseDto {
    private String message;
    public LogoutResponseDto() {
        this.message = "로그아웃 되었습니다.";
    }
}
