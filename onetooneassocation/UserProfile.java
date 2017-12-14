package org.manytoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_profile")
public class UserProfile {

		@ManyToOne
		private UserCrediential credential;

		public UserCrediential getCredential() {
			return credential;
		}

		public void setCredential(UserCrediential credential) {
			this.credential = credential;
		}
		
		@Id
		@GeneratedValue
		@Column(name="profile_id")
		private int profileId;
		private String firstName;
		private String lastName;
		private String emailId;
		private String phoneNo;
		
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		public String getPhoneNo() {
			return phoneNo;
		}
		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}


	}

