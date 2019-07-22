package com.zanyutech.live.http;


import com.zanyutech.live.util.L;

public class StringResultParser extends ResultParser<String> {

	@Override
	public String parseObject(String json) {
		L.i("StringResultParser", "json:"+json);
		return json;
	}
}
