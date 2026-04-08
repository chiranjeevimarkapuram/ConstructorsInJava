package com.DAOInterface;

import com.Model.Register;
import com.Model.UserLogin;

public interface UserDAOInterface {
	public String insertuser(Register r); // insert	
	public String selectloginUser(UserLogin l); // Validating login credintails 
	
}
