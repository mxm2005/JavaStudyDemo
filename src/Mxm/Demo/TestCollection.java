package Mxm.Demo;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestCollection {
	public static void Demo() {
		System.out.print("hello collection");
	}

	public void TestArray() {
		int[] a = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < 5; i++) {
			System.out.println(a[i]);
		}
	}

	public void TestList() {
		List lst = new ArrayList();
		lst.add(10);
		lst.add("hello");
		lst.add("onawofawf");
		lst.add(1000);
		for (int i = 0; i < lst.size(); i++) {
			System.out.println(lst.get(i));
		}
	}

	public void TestMap() {
		Map map = new HashMap();
		map.put("key1", "lisi1");
		map.put("key2", "lisi2");
		map.put("key3", "lisi3");
		map.put("key4", "lisi4");
		// ��map�����е�ӳ���ϵȡ�������뵽set����
		Iterator it = map.entrySet().iterator();
		while (it.hasNext()) {
			Entry e = (Entry) it.next();
			System.out.println("��" + e.getKey() + "��ֵΪ" + e.getValue());
		}
	}

	public void TestMap1() {
		Map map = new HashMap();
		map.put("key1", "lisi1");
		map.put("key2", "lisi2");
		map.put("key3", "lisi3");
		map.put("key4", "lisi4");
		// �Ȼ�ȡmap���ϵ����м���set���ϣ�keyset����
		Iterator it = map.keySet().iterator();
		// ��ȡ������
		while (it.hasNext()) {
			Object key = it.next();
			System.out.println(map.get(key));
		}
	}

	public void TestSet() {
		Set s =new HashSet();
		s.add("abc");
		s.add("wafawofawf");
		s.add("2323424124");
		for(int i=0;i<s.size();i++){			
			System.out.println(s);
		}
	}
}