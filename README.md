# CampusService - 校园服务平台

## 项目简介

CampusService 是一款面向高校学生的移动端校园服务平台应用程序，旨在为学生提供便捷的校园生活服务，包括课程管理、图书馆座位预约等功能。

## 功能特性

### 📚 课程管理
- 查看和管理个人课程信息
- 课程列表展示与详情查看

### 📖 图书馆座位预约
- 图书馆座位查询
- 座位预约管理
- 实时座位状态查看

### 👤 用户中心
- 用户信息管理
- 个人资料设置

### 🗺️ 校园导航
- 校园地点导航
- 位置服务集成

### 🔔 通知服务
- 课程提醒通知
- 预约状态通知
- 网络状态监控
- 开机自启动服务

## 技术架构

### 开发环境
- **平台**: Android
- **语言**: Java
- **最低版本**: Android SDK 21+

### 项目结构

```
app/
├── src/main/
│   ├── java/cn/edu/nchu/a23207323_code2/
│   │   ├── dao/              # 数据访问层
│   │   │   ├── CourseDao.java
│   │   │   ├── LibrarySeatDao.java
│   │   │   └── UserDao.java
│   │   ├── database/         # 数据库配置
│   │   │   └── CampusDatabase.java
│   │   ├── entity/           # 实体类
│   │   │   ├── LibrarySeat.java
│   │   │   └── User.java
│   │   ├── repository/       # 数据仓库
│   │   │   ├── CourseRepository.java
│   │   │   └── LibraryRepository.java
│   │   ├── activity/         # 活动页面
│   │   │   ├── MainActivity.java
│   │   │   ├── CourseActivity.java
│   │   │   ├── LibraryActivity.java
│   │   │   ├── NavigationActivity.java
│   │   │   └── ProfileActivity.java
│   │   ├── service/          # 服务组件
│   │   │   ├── LocationService.java
│   │   │   └── NotificationService.java
│   │   └── receiver/         # 广播接收器
│   │       ├── BootReceiver.java
│   │       └── NetworkReceiver.java
│   └── res/
│       ├── layout/           # 布局文件
│       └── values/           # 资源文件
```

### 核心技术

- **Room 数据库**: 本地数据持久化存储
- **Repository 模式**: 数据访问层抽象
- **广播接收器**: 系统事件监听
- **服务组件**: 后台任务处理
- **位置服务**: GPS 定位集成

## 开发环境配置

### Android Studio
- Android Studio 3.0+
- Android SDK 21+
- Gradle 4.1+

### 构建项目

1. 克隆项目到本地
2. 使用 Android Studio 打开项目
3. 等待 Gradle 同步完成
4. 点击运行按钮，选择模拟器或真机设备

## 项目作者

- **学号**: 23207323
- **学校**: NCHU (南昌大学)
- **课程**: 移动终端编程

## License

本项目仅供学习交流使用。
