/**
 * 
 */
package com.airbnb.web.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.airbnb.web.domains.Command;
import com.airbnb.web.domains.MemberDTO;
import com.airbnb.web.domains.Retval;


/**
 * @date  : 2016. 6. 17.
 * @author: 배근홍
 * @file  : StudentService.java
 * @story :
 */
@Component
public interface MemberService{
	public String regist(MemberDTO mem);
	/*public MemberDTO findOne(Command command);*/
	public String update(MemberDTO mem);
	public void delete(MemberDTO mem);
	public MemberDTO findById(String id);
	/*public String login(MemberDTO member);*/
	public MemberDTO getSession();
	public MemberDTO login(MemberDTO member);
	public void logoutSession(MemberDTO member);
	public int existId(String id);
	public List<?> list(Command command);
	public List<?> find(Command command);
	public Retval count();
	
}