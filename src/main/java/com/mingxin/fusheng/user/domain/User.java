package com.mingxin.fusheng.user.domain;

public class User {

	/* 用户表信息 */
	private String user_id;// mediumint(8) NOT NULL用户ID
	private String group_id;// mediumint(8) NOT NULL用户组ID
	private String user_name;// varchar(32) NOT NULL用户名
	private String user_pwd;// varchar(32) NOT NULL用户密码
	private int user_phone;// int(12) NOT NULL用户手机号码
	private String user_sex;// varchar(6) NOT NULL用户性别
	private String user_qq;// mediumint(9) NOT NULL用户QQ号码
	private String user_email;// varchar(64) NOT NULL用户EMAIL地址
	private String user_address;// varchar(255) NOT NULL用户地址
	private int user_markmedium;// int(9) NOT NULL用户积分
	private int user_rank_idtiny;// int(3) NOT NULL用户等级
	private String user_last_login_ip;// varchar(15) NOT NULL用户上一次登录IP地址
	private int user_birthday;// int(13) NOT NULL用户生日
	private String user_description;// varchar(255) NOT NULL自我描述
	private String user_image_url;// varchar(255) NOT NULL用户头像存储路径
	private String user_school;// varchar(255) NOT NULL毕业学校
	private int user_register_time;// int(13) NOT NULL用户注册时间
	private String user_register_ip;// varchar(15) NOT NULL用户注册时IP地址
	private int user_last_update_time;// int(13) NOT NULL用户上次更新博客时间
	private String user_weibovar;// char(255) NOT NULL用户微博
	private String user_blood_type;// char(3) NOT NULL用户血型
	private String user_says;// varchar(255) NOT NULL用户语录
	private int user_locktiny;// int(3) NOT NULL是否锁定，0为不锁定，1为锁定
	private int user_freezetiny;// int(3) NOT NULL是否冻结，0为不冻结，1为冻结
	private String user_power;// varchar(255) NOT NULL拥有权限

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getGroup_id() {
		return group_id;
	}

	public void setGroup_id(String group_id) {
		this.group_id = group_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_pwd() {
		return user_pwd;
	}

	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}

	public int getUser_phone() {
		return user_phone;
	}

	public void setUser_phone(int user_phone) {
		this.user_phone = user_phone;
	}

	public String getUser_sex() {
		return user_sex;
	}

	public void setUser_sex(String user_sex) {
		this.user_sex = user_sex;
	}

	public String getUser_qq() {
		return user_qq;
	}

	public void setUser_qq(String user_qq) {
		this.user_qq = user_qq;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_address() {
		return user_address;
	}

	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}

	public int getUser_markmedium() {
		return user_markmedium;
	}

	public void setUser_markmedium(int user_markmedium) {
		this.user_markmedium = user_markmedium;
	}

	public int getUser_rank_idtiny() {
		return user_rank_idtiny;
	}

	public void setUser_rank_idtiny(int user_rank_idtiny) {
		this.user_rank_idtiny = user_rank_idtiny;
	}

	public String getUser_last_login_ip() {
		return user_last_login_ip;
	}

	public void setUser_last_login_ip(String user_last_login_ip) {
		this.user_last_login_ip = user_last_login_ip;
	}

	public int getUser_birthday() {
		return user_birthday;
	}

	public void setUser_birthday(int user_birthday) {
		this.user_birthday = user_birthday;
	}

	public String getUser_description() {
		return user_description;
	}

	public void setUser_description(String user_description) {
		this.user_description = user_description;
	}

	public String getUser_image_url() {
		return user_image_url;
	}

	public void setUser_image_url(String user_image_url) {
		this.user_image_url = user_image_url;
	}

	public String getUser_school() {
		return user_school;
	}

	public void setUser_school(String user_school) {
		this.user_school = user_school;
	}

	public int getUser_register_time() {
		return user_register_time;
	}

	public void setUser_register_time(int user_register_time) {
		this.user_register_time = user_register_time;
	}

	public String getUser_register_ip() {
		return user_register_ip;
	}

	public void setUser_register_ip(String user_register_ip) {
		this.user_register_ip = user_register_ip;
	}

	public int getUser_last_update_time() {
		return user_last_update_time;
	}

	public void setUser_last_update_time(int user_last_update_time) {
		this.user_last_update_time = user_last_update_time;
	}

	public String getUser_weibovar() {
		return user_weibovar;
	}

	public void setUser_weibovar(String user_weibovar) {
		this.user_weibovar = user_weibovar;
	}

	public String getUser_blood_type() {
		return user_blood_type;
	}

	public void setUser_blood_type(String user_blood_type) {
		this.user_blood_type = user_blood_type;
	}

	public String getUser_says() {
		return user_says;
	}

	public void setUser_says(String user_says) {
		this.user_says = user_says;
	}

	public int getUser_locktiny() {
		return user_locktiny;
	}

	public void setUser_locktiny(int user_locktiny) {
		this.user_locktiny = user_locktiny;
	}

	public int getUser_freezetiny() {
		return user_freezetiny;
	}

	public void setUser_freezetiny(int user_freezetiny) {
		this.user_freezetiny = user_freezetiny;
	}

	public String getUser_power() {
		return user_power;
	}

	public void setUser_power(String user_power) {
		this.user_power = user_power;
	}
}
