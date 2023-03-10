package main.dao;

import main.service.join.Member;

public interface DatabaseService {
	public boolean insert(Member m, boolean clickId, boolean clickAuth, boolean authFin);
	public boolean chkId(String id);
	public boolean chkLogin(String id, String pw);
	public String searchId(String name, String tel);
	public String searchPw(String id, String name, String tel);
	public boolean chkTel(String tel);
}
