package com.bigkoo.pickerview.adapter;


import android.util.Log;

import com.contrarywind.adapter.WheelAdapter;

/**
 * Numeric Wheel adapter.
 */
public class NumericWheelAdapter implements WheelAdapter {
	
	private int minValue;
	private int maxValue;
	private int yearValue;
	private int monthValue;

	/**
	 * Constructor
	 * @param minValue the wheel min value
	 * @param maxValue the wheel max value
	 */
	public NumericWheelAdapter(int minValue, int maxValue) {
		this.minValue = minValue;
		this.maxValue = maxValue;
	}

	public NumericWheelAdapter(int minValue, int maxValue, int yearValue, int monthValue) {
		this.minValue = minValue;
		this.maxValue = maxValue;
		this.yearValue = yearValue;
		this.monthValue = monthValue;
//		Log.d("日期选择器", "设置年月日信息 minValue: "+minValue + "  maxValue："+maxValue + " yearValue："+yearValue + " monthValue："+monthValue);
	}

	@Override
	public Object getItem(int index) {
//		Log.d("日期选择器", "getItem内容下标: "+index + " 总数量:"+getItemsCount());
		if (index >= 0 && index < getItemsCount()) {
			int value = minValue + index;
			return value;
		}
		return 0;
	}

	@Override
	public int getYearValue(int index) {
//		Log.d("日期选择器", "获取NumberWheel年数据  当前年: "+yearValue + " , index:"+index);
		return yearValue;
	}

	@Override
	public int getMonthValue(int index) {
//		Log.d("日期选择器", "获取NumberWheel月数据  当前月: "+monthValue + " , index:"+index + " , 对应的天:"+getItem(index));
		return monthValue;
	}

	@Override
	public int getItemsCount() {
		return maxValue - minValue + 1;
	}

	@Override
	public int indexOf(Object o){
		try {
			return (int)o - minValue;
		} catch (Exception e) {
			return -1;
		}

	}
}
