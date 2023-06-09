package com.lucas.redditclone.dto;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthenticationResponse {
    
    private String authenticationToken;
    private String refreshToken;
    private Instant expiresAt;
    private String username;
    
}
