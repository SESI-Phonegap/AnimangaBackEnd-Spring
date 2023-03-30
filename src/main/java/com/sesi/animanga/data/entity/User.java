package com.sesi.animanga.data.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_user")
@Getter
@Setter
public class User{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "U_ID_USER")
	private long id;
	
	@Column(name = "U_USER_NAME")
	private String userName;
	
	@Column(name = "U_NOMBRE")
	private String name;
	
	@Column(name = "U_SEXO")
	private String genreS;
	
	@Column(name = "U_EDAD")
	private int age;
	
	@Column(name = "U_PASSWORD")
	private String pass;
	
	@Column(name = "U_EMAIL")
	private String email;
	
	@Column(name = "U_TOKEN_FIREBASE")
	private String firebaseToken;
	
	@Column(name = "U_COINS")
	private int coins;
	
	@Column(name = "U_TOTAL_SCORE")
	private int totalScore;
	
	@Column(name = "U_IMG_USER")
	private String userImage;
	
	@Column(name = "U_ESFERAS")
	private int dragonBalls;
	
	@Column(name = "U_FACEBOOK_ID")
	private String facebookId;

}
