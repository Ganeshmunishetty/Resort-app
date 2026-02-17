package com.example.auth.entity;

import com.example.auth.enums.Status;
import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User extends BaseEntity {

	    @Column(unique = true, nullable = false)
	    private String email;

	    @Column(nullable = false)
	    private String password;

	    @Column(nullable = false)
	    private String name;

	    @Column(nullable = false)
	    private Integer age;

	    @Column(nullable = false)
	    private String phone;

	    @Enumerated(EnumType.STRING)
	    private Status status;

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getAge() {
			return age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public Status getStatus() {
			return status;
		}

		public void setStatus(Status status) {
			this.status = status;
		}

	    // getters & setters
	}

