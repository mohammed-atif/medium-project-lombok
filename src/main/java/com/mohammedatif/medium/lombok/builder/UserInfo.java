package com.mohammedatif.medium.lombok.builder;

import com.mohammedatif.medium.lombok.data.HumanName;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserInfo {

    private HumanName humanName;
    private int age;
    private Gender gender;

    @Builder.Default
    private boolean isActive = true;

}
