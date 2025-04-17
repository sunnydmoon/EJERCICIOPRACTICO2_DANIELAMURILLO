/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package EJERCICIOPRACTICO2_DANIELAMURILLO.ejercicioPractico2.Domain;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import java.util.Collection;
import java.util.Collections;

public class UsuarioDetailsDomain implements UserDetails {

    private final UsuarioDomain usuarioDomain;

    public UsuarioDetailsDomain(UsuarioDomain usuarioDomain) {
        this.usuarioDomain = usuarioDomain;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singleton(() -> "ROLE_" + usuarioDomain.getRol());
    }

    @Override
    public String getPassword() {
        return usuarioDomain.getContrasena();
    }

    @Override
    public String getUsername() {
        return usuarioDomain.getCorreo();
    }

    @Override
    public boolean isAccountNonExpired() { return true; }

    @Override
    public boolean isAccountNonLocked() { return true; }

    @Override
    public boolean isCredentialsNonExpired() { return true; }

    @Override
    public boolean isEnabled() { return true; }

    public UsuarioDomain getUsuario() {
        return usuarioDomain;
    }
}
