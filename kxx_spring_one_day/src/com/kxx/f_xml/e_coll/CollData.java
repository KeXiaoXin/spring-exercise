package com.kxx.f_xml.e_coll;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollData {
	
	private String[] arrayData;
	
	private List<String> listData;
	
	private Set<String> setData;
	
	private Map<String, Object> mapData;
	
	private Properties propsData;

	public String[] getArrayData() {
		return arrayData;
	}

	public void setArrayData(String[] arrayData) {
		this.arrayData = arrayData;
	}

	public List<String> getListData() {
		return listData;
	}

	public void setListData(List<String> listData) {
		this.listData = listData;
	}

	public Set<String> getSetData() {
		return setData;
	}

	public void setSetData(Set<String> setData) {
		this.setData = setData;
	}

	public Map<String, Object> getMapData() {
		return mapData;
	}

	public void setMapData(Map<String, Object> mapData) {
		this.mapData = mapData;
	}

	public Properties getPropsData() {
		return propsData;
	}

	public void setPropsData(Properties propsData) {
		this.propsData = propsData;
	}

	@Override
	public String toString() {
		return "CollData [arrayData=" + Arrays.toString(arrayData) + ", \n listData=" + listData + ", \n setData=" + setData
				+ ", \n mapData=" + mapData + ", \n propsData=" + propsData + "]";
	}
	
}
