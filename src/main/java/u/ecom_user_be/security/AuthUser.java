package u.ecom_user_be.security;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import u.ecom_user_be.entity.User;

import java.util.Collection;
import java.util.List;

@RequiredArgsConstructor
public class AuthUser implements UserDetails {

    private final User user;

    @Override
    public String getUsername() { return user.getEmail(); }

    @Override
    public String getPassword() { return user.getPassword(); }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // Return a list of roles or authorities assigned to the user.
        return List.of();
    }

    @Override
    public boolean isAccountNonExpired() { return true; }

    @Override
    public boolean isAccountNonLocked() { return true; }

    @Override
    public boolean isCredentialsNonExpired() { return true; }

    @Override
    public boolean isEnabled() { return true; }
}
