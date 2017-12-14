package org.manytoone;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user_crediential")
public class UserCrediential {
		
		@OneToMany
		@JoinTable(name="User_prof_crediential",joinColumns=@JoinColumn(name="username"),inverseJoinColumns=@JoinColumn(name="prof_id"))
		private Set<UserProfile> profiles=new HashSet<UserProfile>();
		
		public Set<UserProfile> getProfiles() {
			return profiles;
		}
		public void setProfiles(Set<UserProfile> profiles) {
			this.profiles = profiles;
		}
		@Id
		@Column(name="user_name")
		private String userName;
		
		private String password;
		
		private int status;
		
		
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public int getStatus() {
			return status;
		}
		public void setStatus(int status) {
			this.status = status;
		}
		

	}


