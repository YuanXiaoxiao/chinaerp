#chinaerp

## 项目介绍

这个项目是仿照erp项目，所做的练习项目。
从解决问题的方式入手，去练习业内的解决方案，远比课本知识来的快。

## 新增内容

20170223-01
1. 新增messageconverter，使用fastjson
1.1引入jar包依赖
1.2配置xml文件
1.3加@responsebody注解, annotation that indicates a method return value should be bound to the web response body.

20170224-01
1. 通过xml配置bean时，A类注入C对象属性，A的子类B获取不到该C对象，分析了一下原因，解决方案有两种
1.1 将A中的C属性声明static
1.2 在B的bean声明中，加入parent属性

20170224-02
~~1. add spring-security~~
~~1.1 securityconfig~~
~~1.2 securitywebapplicationinitializer~~

20170301-01
1. add ibatis  org.springframework.orm 4.0版本不再支持ibatis

20170226-01
1. add spring security

## Issue
#### 这里暂时记录下，目前存在的代码实现上的问题
#### 1. xml配置bean注入 
jdbcTemplateDao中， datasource通过xml配置注入，注入失败

#### 2. viewresolver 
这里暂时用个最简单的方式，实现controller返回string，根据指定前缀和后缀跳转到指定的jsp页面，日后深入研究一下

#### 3. 容器的部署问题
配置文件修改，需要重新启动tomcat
jsp页面的修改，直接重新刷新页面即可

#### 4. ibatis的使用问题
注入sqlmapclient失败

#### intellij idea shortcut 常用快捷键
1. 去除没有用到的import keymap当中搜索 optimize import， control + alt + o ( MAX OX 10.5)
2. 查找spring requestmapping  keymap当中搜索 symbol ， alt + command + O  ( MAX OX 10.5)
3. 按层级选择代码 alt + 向上箭头 entends select