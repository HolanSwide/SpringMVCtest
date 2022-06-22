SpringMVC
---
> HolanSwide 

[toc]

----
# MVC架构

- **Model**         (Dao)
> 模型层：涉及对象底层建模，数据库原型设计、访问和操作
- **View**          (jsp)
> 视图层：面向用户，提供视图界面
- **Controller**    (Servlet)
> 控制器层：接收视图层的请求，调用模型层处理数据，并向视图层传递回复数据

![](https://kuangstudy.oss-cn-beijing.aliyuncs.com/bbs/2021/04/13/kuangstudy5989b959-a64d-4469-952f-d23699b0bad7.png)

# SpringMVC

基于Java的，实现MVC的轻量级Web框架

## 快速开始

### 1. 环境搭建

1.1 建立WebApp框架的Maven项目

1.2 编辑pom.xml，使用本项目的[pom.xml](./pom.xml)

1.3 创建、编辑[web.xml](./src/main/resources/web.xml)

1.4 创建、编辑Spring配置文件[spring-config.xml](./src/main/resources/spring-config.xml)

1.5 创建、编辑SpringMVC配置文件[springmvc-servlet.xml](./src/main/resources/springmvc-servlet.xml)

1.6 搭建好Tomcat环境

### 2. 代码编写

2.1 新建控制类[Hello.java](./src/main/java/com/holanswide/controller/Hello.java)

2.2 新建视图层模板[hello.jsp](./src/main/webapp/WEB-INF/jsp/hello.jsp)

2.3 开启Tomcat测试

> 注意：
>
>   @Controller是为了让Spring IOC容器初始化时自动扫描到；
>
>   @RequestMapping是为了映射请求路径
>
>   方法中声明Model类型的参数是为了把Action中的数据带到视图中；
>
>   方法返回的结果是视图的名称hello，加上配置文件中的前后缀变成WEB-INF/jsp/hello.jsp。

# Spring注解

## `@Component`
即 组件，可以理解为以下三个注解的“父类”，实现Spring最基本的注册

## `@Service`
服务层标记注解

## `@Controller`
控制器层标记注解

## `@Repository`
Dao层标记注解 (Data Access Object 数据库访问对象)

# 问题日志

## Spring相关

> Error:(21, 23) java: 无法访问org.springframework.core.env.EnvironmentCapable 找不到org.springframework.core.env.EnvironmentCapable的类文件

- 问题：依赖缺失\冲突
- 解决：使用完整依赖（本项目现有[pom.xml](./pom.xml)）
