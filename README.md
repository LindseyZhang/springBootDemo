SpringBootDemo
==============

### Goal
  本工程主要用于学习如何搭建基于spring boot的实际项目开发环境。

### Enviroment
  * 请保证开发环境含有jdk 1.8, Mysql 5.7+。
  * 首次使用时在mysql中运行
  ```
  create database spring_boot_demo;
  ```
  创建数据库。
  
### Open In IntellJ
  *  使用
    ```
    ./gradlew clean idea
    ```
    生成Intellj工程。
  * 使用Intellij打开生成的bulgari_backend.ipr文件

### Run
  _Way 1_: 在控制台根目录下运行
```
./gradlew bootRun
```  
  _Way 2_: 在Intellj中找到springBootDemo.java类，运行启动服务器。

