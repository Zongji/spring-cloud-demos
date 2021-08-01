# spring-cloud-demos

spring cloud 练习项目，
全面包含spring cloud 的各个重要组件

## 说明
这个分支为使用nacos作为注册中心和配置中心

## usage
1. 启动nacos
```shell
 # windows下
./startup.cmd -m standalone
```
2. 启动zipkin
```
java -jar zipkin.jar
```

nacos文档
https://nacos.io/zh-cn/docs/quick-start.html

## 配置中心使用
Data ID:        nacos-config.yaml
Group  :        DEFAULT_GROUP
配置格式:        YAML
配置内容:        user.name: nacos-config-yaml
user.age: 68

## git 操作提示
…or create a new repository on the command line
```
echo "# spring-cloud-demos" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/Zongji/spring-cloud-demos.git
git push -u origin main
```

…or push an existing repository from the command line
```
git remote add origin https://github.com/Zongji/spring-cloud-demos.git
git branch -M main
git push -u origin main
```



