/**
 * @Author huige@iflytek.com
 * @Date 2017/12/15.
 */
package com.huige.spring.transaction;

/*JDBC 事务控制
*try{
*  conn = dataSource.getConnection();
*  conn = setAutoCommit(false);
*  //...
*   conn.commit();
*}catch(SQLException e){
*  e.printStackTrace();
*  if(conn!=null){
*       try{
*           conn.rollback();
*       }catch(SQLException e1){
*          el.printStackTrace();
*       }
*  }
*  throw new RuntimeException(e);
* }finally{
*    if(conn!=null){
*           conn.close();
*      try{
*      }catch(SQLException e){
*         e.printStackTrace();
*      }
*    }
* }
*
*    Q:事务底层实现原理?
*
*    //1.配置事务管理器
*    <bean id="transactionManager"
*           class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
*         <property name="dataSource" ref="dataSource"/>
*    </bean>
*    //2/启用事务注解
*     <tx:annotation-driven transaction-manager="transactionManager"/>
*     3.在方法上添加@Transactional 注解
*
*
*
*     1.事务的传播行为
*        事物方法被另一事务方法调用时，必须指定事务应该如何传播，例如"方法可能继续在现有事务中运行，
*        也可能开启一个新事务，并在自己事务中运行。
*        在饭店遇到熟人，是自己开一桌还是加入他们一起吃。
*        默认 REQUIRED
*        当前的事务方法被另外一个事务方法调用时如何使用事务
*     @Transactional(propagation=Propagation.REQUIRED)
*
*     事务隔离   --并发导致的
*     2.isolation:指定事务的隔离级别 最常用的取值为READ_COMMITTED
*     3.noRollbackFor：对于指定异常类不回滚
*     4.readOnly=false:使用readOnly 指定事务是否为只读 这样可以帮助数据库引擎优化事务
*     5.timeout=1：使用timeout 指定强制回滚之前可以占用的时间,单位:秒(s) 事务到达时间强制回滚
*
*
* 基于xml 配置事务transaction
*
*       1.配置事务管理器
*       2.配置事务的属性
*       <tx:advice id="txAdvice" transaction-manager="transactionManager">
*           <tx:attributes>
*                  <tx:method name="purchase" propagation="REQUIRES_NEW"/>
*                  <tx:method name="*"/>
*           <tx:attributes>
*       </tx:advice>
*       3.配置事务切入点，以及把事务切入点和事务属性关联起来
*       <aop:config>
*            <aop:pointcut expression="execution(* com...xml.Service.*)" id="txPointCut"/>
*            <aop:advisor advice-ref="txAdvice" pointcut-ref="txPointCut"/>
*       </aop:config>
*
*
*
*    spring hibernate
*       Spring 整合Hibernate
*       1.有IOC 容器来管理Hibernate 的SessionFactory
*       2.让Hibernate 使用上Spring的声明式事务
*        此处略去。。。后期学习
*
*
*
*     Spring 如何整合Struct2
*       1.jar包
*         spring-web-4.0.0.RELEASE.jar
*         spring-webmvc-4.0.0.RELEASE.jar
*
*       2.spring 配置文件
*       3.如何创建IOC容器
*         ①.非WEB应用在main 方法中直接创建
*         ②.WEB应用 被服务器加载时就创建IOC容器
*         #ServletContextListener#contextInitialized(ServletContextEvent sce)方法中场景IOC容器 可以放在ServletContext（application 域）的一个属性中
*
*        在WEB环境下使用Spring
*          ①.额外jar包
*          spring-web-4.0.0.RELEASE.jar
*          spring-webmvc-4.0.0.RELEASE.jar
*          ②.Spring的配置文件
*          ③.需要在Web.xml文件中加入如下配置
*          <context-param>
*              <param-name>contextConfigLocation</param-name>
*              <param-value>classpath:applicationContext.xml</para,-value>
*          </context-param>
*          启动IOC容器ServletContextListener
*          <listener>
*            <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
*          </listener>
*
*
* */