package com.borakgul.controller;


import com.borakgul.dto.DtoUser;
import com.borakgul.jwt.AuthRequest;
import com.borakgul.jwt.AuthResponse;
import com.borakgul.jwt.RefreshTokenRequest;

public interface IRestAuthenticationController {

	
	public RootEntity<DtoUser> register(AuthRequest request);
	
	public RootEntity<AuthResponse> authenticate(AuthRequest request);
	
	public RootEntity<AuthResponse> refreshToken(RefreshTokenRequest request);
}