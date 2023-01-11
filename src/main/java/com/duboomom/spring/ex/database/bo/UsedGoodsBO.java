package com.duboomom.spring.ex.database.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duboomom.spring.ex.database.dao.UsedGoodsDAO;
import com.duboomom.spring.ex.database.model.UsedGoods;

// controller와 db사이에 다리역할
// if문 for문 등 다양한 로직다루는 단계
@Service
public class UsedGoodsBO {

	@Autowired
	private UsedGoodsDAO usedGoodsDAO;
	
	
	// used_goods 테이블 전체 데이터 조회기능
	public List<UsedGoods> getUsedGoodsList() {
		List<UsedGoods> usedGoodsList = usedGoodsDAO.selectUsedGoodsList();
		return usedGoodsList;
	}
	
}
