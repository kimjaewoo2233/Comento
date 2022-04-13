package com.devfun.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.devfun.dao.MovieDAO;
import com.devfun.vo.MovieVO;

@Service
public class MovieServiceImple implements MovieService{
		
	@Inject
	private MovieDAO dao;
	
	@Override
    public List<MovieVO> selectMovie() throws Exception {
 
        return dao.selectMovie();
    }
}

//Repository,Service 는 해당클래슬르 루트 컨테이너에 빈 객체로 생성해주는 애노테이션
//로직처리:@Service
//외부 I/O처리 @Repository
//루트 컨테이너 또는 서블릿용 컨테이널르 생성할 때 애놑에ㅣ션을 검색하기 때문에 컨테이너 생성시 참조하는 xml파일 에 component-scan이 이썽야한다.