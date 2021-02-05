package com.bpass.backend.fcm.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FcmTokens {
    @Id
    private long id;
    private String userId;
    private String token;

    public FcmTokens(String userId, String token){
        this.userId = userId;
        this.token = token;
    }
}
