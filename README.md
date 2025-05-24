## wxf-backend-client 项目介绍

这是一个基于 Spring Boot 的后端项目，旨在为校园社交平台提供全面的后端服务支持。项目集成了多种主流技术，采用模块化设计，实现了用户认证、内容管理、社交互动、媒体处理和消息通知等核心功能。

### 主要功能

*   **用户认证**: 支持微信、手机号、QQ 和学号等多种登录方式，确保用户身份安全。
*   **内容管理**: 提供帖子的发布、获取、搜索和评论功能，支持富文本和媒体附件。
*   **社交互动**: 实现点赞、评论等社交功能，促进用户之间的互动。
*   **媒体处理**: 支持图片、视频等媒体文件的上传、存储和展示。
*   **消息通知**: 提供实时通知和提醒功能，包括系统通知、互动通知和订阅通知。

### 技术特点

*   **模块化设计**: 采用模块化架构，各模块之间职责明确，耦合度低，便于维护和扩展。
*   **高性能**: 使用 Redis 缓存、Elasticsearch 全文搜索和 RabbitMQ 消息队列等技术，提高系统性能和响应速度。
*   **安全性**: 集成 Spring Security，实现用户认证和授权，保障系统安全。
*   **可扩展性**: 采用 Spring Boot 和 Spring Data JPA，简化开发流程，提高代码可读性和可维护性。

### 技术栈

项目主要使用了以下技术：

*   **Spring Boot**: 简化 Spring 应用的创建和部署。
*   **Spring Security**: 提供强大的安全认证和授权功能。
*   **Spring Data JPA**: 简化数据库访问，提供面向对象的持久化支持。
*   **Redis**: 用作缓存或消息队列，提高系统性能和响应速度。
*   **Elasticsearch**: 用于全文搜索和分析。
*   **RabbitMQ**: 消息队列，用于异步处理和解耦服务。
*   **微信小程序 SDK**: 集成微信小程序相关的服务和功能。

### 项目模块

项目包含以下核心模块：

*   **认证模块 (`auth`)**: 处理用户登录和认证，支持微信、手机号、QQ 和学号等多种登录方式。
*   **帖子模块 (`post`)**: 处理帖子的发布、获取和搜索，支持 Elasticsearch 全文搜索。
*   **用户模块 (`user`)**: 处理用户信息的管理，包括个人信息、专业、院系和头像等。
*   **评论模块 (`comment`)**: 处理帖子的评论功能，支持多级评论。
*   **点赞模块 (`like`)**: 处理帖子的点赞功能。
*   **媒体附件模块 (`mediaAttachment`)**: 处理媒体文件的上传和存储，使用对象存储服务。
*   **通知模块 (`notification`)**: 处理用户通知和提醒，支持订阅和取消订阅。

## 后端文件结构介绍
```
├─.idea                          # IntelliJ IDEA 配置文件（自动生成）
└─wxf-backend-client             # 项目主目录
├─.mvn                       # Maven 配置
│  └─wrapper                 # Maven Wrapper 文件（确保版本一致性）
└─src
├─main
│  ├─java
│  │  └─top
│  │      └─xcyyds
│  │          └─wxf
│  │              ├─common        # 全局通用类（常量/工具/基类）
│  │              ├─config        # 配置类（安全/数据源/Swagger）
│  │              ├─exception     # 全局异常处理（如 @ControllerAdvice）
│  │              ├─module        # 业务模块化设计（核心功能）
│  │              │  ├─auth       # 认证模块
│  │              │  │  ├─controller    # 认证相关 API 接口
│  │              │  │  ├─pojo
│  │              │  │  │  ├─dto        # 认证数据传输对象（如 LoginDTO）
│  │              │  │  │  └─entity    # 认证实体类（如 User）
│  │              │  │  ├─repository    # 认证数据访问层（JPA 接口）
│  │              │  │  └─service      # 认证业务逻辑层
│  │              │  │      └─impl      # 认证服务实现类
│  │              │  ├─post       # 帖子模块（结构同 auth）
│  │              │  │  ├─controller    # 认证相关 API 接口
│  │              │  │  ├─pojo
│  │              │  │  │  ├─dto        # 认证数据传输对象
│  │              │  │  │  └─entity    # 认证实体类
│  │              │  │  ├─repository    # 认证数据访问层
│  │              │  │  └─service      # 认证业务逻辑层
│  │              │  │      └─impl      # 认证服务实现类
│  │              │  └─user      # 用户模块（结构同 auth）
│  │              │     ├─controller    # 认证相关 API 接口
│  │              │     ├─pojo
│  │              │     │  ├─dto        # 认证数据传输对象
│  │              │     │  └─entity    # 认证实体类
│  │              │     ├─repository    # 认证数据访问层
│  │              │     └─service      # 认证业务逻辑层
│  │              │         └─impl      # 认证服务实现类
│  │              └─util         # 通用工具类（日期/加密/JSON等）
│  └─resources
│      ├─application.yml         # 主配置文件
│      ├─static/                 # 静态资源（CSS/JS/图片）
│      └─mapper/                 # MyBatis XML（若使用）
└─test
└─java
└─top
└─xcyyds
└─wxf            # 单元测试类（与 main 结构镜像）
```

### 构建和运行

项目使用 Maven 进行构建。请确保您的系统已安装 Java 17 及以上版本和 Maven。

1.  **克隆仓库**：

    ```bash
    git clone <仓库地址>
    cd wxf-backend-client
    ```

2.  **构建项目**：

    使用 Maven Wrapper 或本地 Maven 安装构建项目：

    ```bash
    ./mvnw clean package
    # 或者使用本地 Maven
    # mvn clean package
    ```

    构建成功后，可在 `target` 目录下找到可执行的 JAR 文件。

3.  **运行项目**：

    ```bash
    java -jar target/wxf-backend-client-0.0.1-SNAPSHOT.jar
    ```

    项目将默认运行在 8080 端口（可在 `application.yml` 中修改）。