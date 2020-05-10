package com.moon;

import org.junit.jupiter.api.Test;
/*
 *  MapperInterface 테스트를 위한 클래스  
 */

import org.springframework.beans.factory.annotation.Autowired;

import com.moon.domain.MemberVO;
import com.moon.mapper.MemberMapper;

public class MemberMapperTest extends ApplicationTests{
	@Autowired
	private MemberMapper mapper;
	
	// 삽입 테스트
	/*
	 * @Test public void testInsert() throws Exception{ MemberVO vo = new
	 * MemberVO();
	 * 
	 * vo.setUserid("user666"); vo.setUserpw("user666");
	 * 
	 * vo.setUsername("MOONGOO HAN"); vo.setEmail("hanmoongoo@gmail.com");
	 * 
	 * mapper.create(vo); }
	 */
	
	// 인터페이스가 아닌 XML Mapper 테스트  
	@Test
	public void testLogin() throws Exception{
		MemberVO vo = mapper.login("user666", "user666");
		
		System.out.println(vo);
	}
}
