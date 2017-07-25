package com.situ.ssm.service;

import java.util.List;

import com.situ.ssm.pojo.TmArea;
import com.situ.ssm.pojo.TmCity;
import com.situ.ssm.pojo.TmProvince;

public interface IProvinceService {
	public List<TmProvince> selectProvinces();
	public List<TmCity> selectCitys(int provinceId);
	public List<TmArea> selectAreas(int cityId);
}
