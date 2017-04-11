package com.test.entity;

public class User {
    private String id;

    private String name;

    private String password;

    private String token;

    private String nick;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick == null ? null : nick.trim();
    }

	public User(String id, String name, String password, String token,
			String nick) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.token = token;
		this.nick = nick;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}