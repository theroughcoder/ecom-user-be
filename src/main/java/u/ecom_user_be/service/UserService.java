package u.ecom_user_be.service;

import u.ecom_user_be.dto.request.SignInRequest;
import u.ecom_user_be.dto.request.SignUpRequest;
import u.ecom_user_be.dto.response.UserResponse;

public interface UserService {
    UserResponse signIn(SignInRequest request);
    UserResponse signUp(SignUpRequest request);
}
