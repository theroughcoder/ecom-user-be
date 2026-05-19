package u.ecom_user_be.service;

import u.ecom_user_be.dto.request.ProfileUpdateRequest;
import u.ecom_user_be.dto.request.SignInRequest;
import u.ecom_user_be.dto.request.SignUpRequest;
import u.ecom_user_be.dto.request.UserUpdateRequest;
import u.ecom_user_be.dto.response.UserResponse;

import java.util.List;

public interface UserService {
    UserResponse signIn(SignInRequest request);
    UserResponse signUp(SignUpRequest request);
    UserResponse updateProfile(ProfileUpdateRequest request);
    List<UserResponse> getAllUsers();
    UserResponse getUserById(Long userId);
    UserResponse updateUser(Long userId, UserUpdateRequest request);
    void deleteUser(Long userId);
}
