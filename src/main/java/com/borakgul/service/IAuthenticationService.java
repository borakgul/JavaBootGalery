package com.borakgul.service;


import com.borakgul.dto.DtoUser;
import com.borakgul.jwt.AuthRequest;
import com.borakgul.jwt.AuthResponse;
import com.borakgul.jwt.RefreshTokenRequest;

public interface IAuthenticationService {

	 DtoUser register(AuthRequest request);
	 
	 AuthResponse authenticate(AuthRequest authRequest);
	 
	 AuthResponse refreshToken(RefreshTokenRequest request);
}