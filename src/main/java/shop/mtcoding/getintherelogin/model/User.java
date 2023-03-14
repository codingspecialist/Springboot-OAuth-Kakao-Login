package shop.mtcoding.getintherelogin.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {
    private int id;
    private String username; // kakao_2705547888
    private String password; // UUID
    private String email; // ssar@nate.com
    private String provider; // me, kakao, naver
}
