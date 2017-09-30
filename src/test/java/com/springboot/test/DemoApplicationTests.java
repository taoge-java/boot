package com.springboot.test;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	
//	@Autowired
//	private SystemAdminPage systemAdminPage;
//	
//	@Test
//	public void contextLoads() {
//		Order order = new Order(Direction.DESC, "id");
//		Sort sort = new Sort(order);
//		//0代表第一页
//		Page<SystemAdmin> page = systemAdminPage.findAll(new PageRequest(0, 30,sort));
//		System.out.println(page.getTotalPages()+1);
//		System.out.println(page.getContent());
//	}
//
//	@Test
//	public void test(){
//		private static final String url = "jdbc:mysql://127.0.0.1/furniture?characterEncoding=utf8&zeroDateTimeBehavior=convertToNull";
//		
//		private static final String url1 = "jdbc:mysql://127.0.0.1/alone?characterEncoding=utf8&zeroDateTimeBehavior=convertToNull";
//		@SuppressWarnings("unused")
//		@Test
//		public  void jdbcTest() {
//			JfinalPlugin.initLogFactory();
//		    Plugins plugins = new Plugins();
//		    DruidPlugin druid = new DruidPlugin(url, "root","123456");
//		    plugins.add(druid);
//			ActiveRecordPlugin activeRecordPlugin = new ActiveRecordPlugin("furniture",druid);
//			activeRecordPlugin.addMapping("goods_info", GoodsInfo.class);
//			plugins.add(activeRecordPlugin);
//			
//			DruidPlugin druid1 = new DruidPlugin(url1, "root","123456");
//		    plugins.add(druid1);
//			ActiveRecordPlugin activeRecordPlugin1 = new ActiveRecordPlugin("alone",druid1);
//			activeRecordPlugin.addMapping("goods_info", GoodsInfo.class);
//			plugins.add(activeRecordPlugin);
//			JfinalPlugin.startPlugins(plugins);
//			Record goodsInfo =Db.use("alone").findFirst("select * from goods_info where id=1");;
//			System.out.println(goodsInfo);
//		}
//	}
}
