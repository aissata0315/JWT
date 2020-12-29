package sn.aissata.jwt.service;

import sn.aissata.jwt.entities.AppRole;
import sn.aissata.jwt.entities.AppUser;

public interface AccountService {
    public AppUser saveUser(AppUser user);
    public AppRole saveRole(AppRole role);
    public void addRoleToUser(String username, String roleName);
    public  AppUser findUserByUsername(String username );
}
