package com.kb.jjan.domain.user.dto;

import com.kb.jjan.domain.user.User;
import lombok.*;

@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class UserFamilyResponse {

    private String name;
    private Long userId;
    private String birthday;
    private String gender;
    private String account;
    private String famCode;
    private String isParent;

    public UserFamilyResponse(User referenceById, User user) {
        {
            this.name = user.getName();
            this.userId = user.getUserId();
            this.birthday = user.getBirthday();
            this.gender = user.getGender();
            this.account=user.getAccount();
            this.famCode = user.getFamCode();
            this.isParent = user.getIsParent();

        }
    }
}
