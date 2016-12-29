#	EXAM

##	1.说明

一个基于spring+mybatis的控制台系统

##	2.功能

* Spring 的配置文件名称为 ApplicationContext.xml
* 需要同时有 xml 配置的 bean 注入和使用注解配置的 bean 注入.
* 在启动 ApplicationContext 时输出 Context Start 信息,在ApplicationContext 停止时输出 Context stop 信息.
* 从命令行中接收用户输入的 film 信息,使用 Mybatis 将用户输入的数据插入表中.
* 使用 AOP 实现,在将 film 数据插入数据库表中之前 publishSpring 的事件 BeforeInsertFilmEvent,在将 film 插入数据库之后publish Spring 的事件 AfterInsertFilmEvent.
* 接收到 BeforeInsertFilmEvent 事件,输出 Before Insert Film Data.
* 接收到 AfterInsertFilmEvent 事件,输出 After Insert Film Data.

##	3.开发环境

* spring
* mybatis
* druid
* MySql
* aspectj
* more


##  4.进度

* 基本完成所需功能

## 5.数据库配置文件

存放于Exam-12950-20161219-1\src\main\resources\exam\dbconfig.properties

*user=root
*password=root
