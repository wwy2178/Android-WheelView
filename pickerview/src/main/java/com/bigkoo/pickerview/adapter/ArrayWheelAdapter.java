package com.bigkoo.pickerview.adapter;

import android.util.Log;

import com.contrarywind.adapter.WheelAdapter;

import java.util.Calendar;
import java.util.List;

/**
 * The simple Array wheel adapter
 * @param <T> the element type
 */
public class ArrayWheelAdapter<T> implements WheelAdapter {

	private Calendar calendar = Calendar.getInstance();

	// items
	private List<T> items;
	private int yearValue;
	private int monthValue;

	/**
	 * Constructor
	 * @param items the items
	 */
	public ArrayWheelAdapter(List<T> items) {
		this.items = items;
	}

	public ArrayWheelAdapter(List<T> items,int yearValue,int monthValue) {
		this.items = items;
		this.yearValue = yearValue;
		this.monthValue = monthValue;
	}
	
	@Override
	public Object getItem(int index) {
//		Log.d("选择器绘制View列表", "getItem内容下标: "+index + " 总数量:"+items.size());
		if (index >= 0 && index < items.size()) {
			return items.get(index);
		}
		return "";
	}

	@Override
	public int getYearValue(int index) {
//		Log.d("选择器绘制View列表", "获取年数据: "+yearValue);
		return yearValue;//calendar.get(Calendar.YEAR);
	}

	@Override
	public int getMonthValue(int index) {
//		Log.d("选择器绘制View列表", "获取月数据: "+monthValue);
		return monthValue;//calendar.get(Calendar.MONTH) + 1;
	}

	@Override
	public int getItemsCount() {
		return items.size();
	}

	@Override
	public int indexOf(Object o){
		return items.indexOf(o);
	}

}
