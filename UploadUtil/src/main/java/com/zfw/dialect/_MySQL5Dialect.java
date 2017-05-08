package com.zfw.dialect;

import org.hibernate.dialect.MySQL5Dialect;

public class _MySQL5Dialect extends MySQL5Dialect{
	@Override
	public String getTableTypeString() {
		return "engine=innodb default charset=utf8";
	}
}