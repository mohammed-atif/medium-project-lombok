package com.mohammedatif.medium.lombok.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserInfoTest {

    @Test
    void testUserInfoBuilder(){
        UserInfo userInfoDefault = UserInfo.builder()
                .age(10)
                .gender(Gender.MALE)
                .build();

        UserInfo userInfoOverridden = UserInfo.builder()
                .age(20)
                .gender(Gender.FEMALE)
                .isActive(false)
                .build();

        assertTrue(userInfoDefault.isActive());
        assertFalse(userInfoOverridden.isActive());

    }

}
