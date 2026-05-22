package u.ecom_user_be.security;

public record AuthResponse(String token, String email, Long expiresAt) {
}
