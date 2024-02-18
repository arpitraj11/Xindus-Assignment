package com.example.Wishlist.Management.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class JwtResponse {
    private String jwtToken;
    private String username;
}
