package com.spring.app.entities;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class User {

		@NotBlank(message = "Username cannot be empty")
		private String userName;
		@NotBlank(message = "Password cannot be empty")
		@Size(min=6, max=16, message = "Password must be between 6 to 16 characters long")
		@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,16}$",
		message = "Password must contain at least one lowercase letter, one uppercase letter, one digit, and one special character")
		private String password;
		@NotBlank(message = "Email cannot be blank")
		@Email(message = "Please enter a valid email")
		private String email;
		
		private String gender;
		
		
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
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
		@Override
		public String toString() {
			return "User [userName=" + userName + ", password=" + password + ", email=" + email + ", gender=" + gender
					+ "]";
		}
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
}
