package com.borakgul.controller.impl;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.borakgul.controller.IRestAuthenticationController;
import com.borakgul.controller.RootEntity;
import com.borakgul.dto.DtoUser;
import com.borakgul.jwt.AuthRequest;
import com.borakgul.jwt.AuthResponse;
import com.borakgul.jwt.RefreshTokenRequest;
import com.borakgul.service.IAuthenticationService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class RestAuthenticationControllerImpl extends RestBaseController implements IRestAuthenticationController {

	private final IAuthenticationService authenticationService;
	
	
	@PostMapping("/register")
	@Override
	public RootEntity<DtoUser> register(@Valid @RequestBody AuthRequest request) {
		return ok(authenticationService.register(request));
	}


	@PostMapping("/authenticate")
	@Override
	public RootEntity<AuthResponse> authenticate(@Valid @RequestBody AuthRequest request) {
		return ok(authenticationService.authenticate(request));
	}


	@PostMapping("/refreshToken")
	@Override
	public RootEntity<AuthResponse> refreshToken(@Valid @RequestBody RefreshTokenRequest request) {
		return ok(authenticationService.refreshToken(request));
	}

}