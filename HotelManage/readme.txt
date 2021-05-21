SpringMVC:视图层，界面层，负责接收请求，显示处理结果的
Spring:业务层，管理Service，dao，工具类对象
MyBatis：持久层，访问数据库的

用户发起请求--SpringMVC接收--Spring中的Service对象--MyBatis处理数据

SpringMVC容器，管理控制Controller控制器的对象
Spring容器，管理Service，dao，工具类对象

实现步骤：
0、使用MySQL数据表
1、新建maven web项目
2、加入依赖
   springmvc，spring，mybatis三个框架的依赖，Jackson依赖，mysql驱动，druid连接池
   servlet，jsp依赖
3、写web.xml文件
  1）注册DispatcherServlet，目的：1、创建SpringMVC容器对象，才能创建Controller对象
                                2、创建的是Servlet，才能接收用户请求
  2）注册Spring的监听器：ContextLoaderListener，目的：创建Spring的容器对象，才能创建service，dao等对象
  3）注册字符集过滤器，解决乱码问题
4、创建包，Controller包，service，dao，实体类名包创建好
5、写Spring，SpringMVC，mybatis配置文件
  1）Spring配置文件
  2）SpringMVC配置文件
  3）mybatis主配置文件
  4）数据库属性配置文件
6、代码，dao接口和mapper文件，service和实现类