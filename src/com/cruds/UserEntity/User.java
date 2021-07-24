package com.cruds.UserEntity;
import java.io.Serializable;

public class User implements Serializable {
	
	    private static final long serialVersionUID = 1L;
	    
	    private String username;
	    
	    private String password;

		public String getUserame() {
			return username;
		}

		public void setUserame(String userame) {
			this.username = userame;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}

		public User(String userame, String password) {
			super();
			this.username = userame;
			this.password = password;
		}

		@Override
		public String toString() {
			return "User [userame=" + username + ", password=" + password + "]";
		}
	    
		
	    
	    
	    


}
