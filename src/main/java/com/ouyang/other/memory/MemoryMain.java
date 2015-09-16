package com.ouyang.other.memory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

import com.ouyang.other.memory.entity.SysMenu;

public class MemoryMain {

	public static void main(String[] args) {
		SysMenu sysMenu = new SysMenu();
		sysMenu.setId("00144288-1554-4cde-844f-65ba792fed2c");
		sysMenu.setName("menu-1475");
		sysMenu.setRemark("remark menu761");
		sysMenu.setUrl("http://www.baidu.com");
		List<SysMenu> menus = new ArrayList<SysMenu>();
		menus.add(sysMenu);
		SysMenu sysMenu2 = new SysMenu();
		sysMenu2.setId("00144288-1554-4cde-844f-65ba792fed2c1");
		sysMenu2.setName("menu-14751");
		sysMenu2.setRemark("remark menu76");
		sysMenu2.setUrl("http://www.baidu.co");
		//menus.add(sysMenu2);
		System.out.println(SizeOf.deepSizeOf(menus));
		System.out.println(SizeOf.deepSizeOf(new ConcurrentHashMap<Object, Object>()));
		System.out.println(SizeOf.deepSizeOf(new String("1234567")));
		System.out.println(SizeOf.deepSizeOf(new String("1234")));
		System.out.println(SizeOf.deepSizeOf(new Object()));
		System.out.println(SizeOf.deepSizeOf(new Character('c')));
		System.out.println(SizeOf.deepSizeOf('c'));
		System.out.println(SizeOf.deepSizeOf(new int[] { 1, 2, 3 }));
		System.out.println(SizeOf.deepSizeOf(new CopyOnWriteArrayList<Object>()));
	}
}
