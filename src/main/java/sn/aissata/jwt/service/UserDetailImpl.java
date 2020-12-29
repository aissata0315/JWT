package sn.aissata.jwt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import sn.aissata.jwt.entities.AppUser;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class UserDetailImpl implements UserDetailsService {
    @Autowired
    private  AccountService accountService;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AppUser user = accountService.findUserByUsername(username);
        if(user == null) throw new UsernameNotFoundException(username);

        Collection<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        user.getRoles().forEach(r->{
            grantedAuthorities.add(new SimpleGrantedAuthority(r.getRoleName()));
        });
        return new User(user.getUsername(),user.getPassword(), grantedAuthorities);
    }
}
