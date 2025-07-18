# Spring AI Alibaba JManus

<div align="center">

[![License](https://img.shields.io/badge/license-Apache%202-blue.svg)](LICENSE)
[![Java](https://img.shields.io/badge/Java-17+-orange.svg)](https://openjdk.java.net/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-green.svg)](https://spring.io/projects/spring-boot)
[![GitHub Stars](https://img.shields.io/github/stars/alibaba/spring-ai-alibaba.svg)](https://github.com/alibaba/spring-ai-alibaba/stargazers)

[English](QuickStart.md) | 🌍 **中文**

📚 开发者文档: [Quick Start (EN)](./README-dev-en.md) | [开发者快速入门 (中文)](./README-dev.md)


[关于](#-关于) • [快速开始](#-快速开始) • [如何贡献](#-如何贡献)

</div>


## ✨ JManus 简介

JManus 是 Manus 的一个Java实现，目前已经在阿里巴巴集团内的很多应用都有使用，主要用于处理需要有一定确定性要求的探索性任务，比如，快速从海量数据中找到数据并转换成数据库内的一行数据，或者分析日志并给出告警等。

JManus也提供了http的服务调用能力，适合被集成到既有的项目中。具体可以见开发者快速入门


## 🎯 JManus的产品特性

### - 🤖 **纯Java的Manus实现**：

纯粹的Java多智能体协作实现，提供了完整的http调用接口，适合Java开发者做二次集成。
![Image](https://github.com/user-attachments/assets/893c7fc1-5e6e-4ec9-8389-182f14d86b18)

### - 🌊 **无限上下文处理**：

支持从巨量内容中精准抓取目标信息，不依赖特定的长上下文模型。
![Image](https://github.com/user-attachments/assets/a0245658-fbb7-41dc-989f-86574592f188)

### - 🛠️ **Plan-Act 模式**：

精确控制每一步执行细节，提供极高的执行确定性
![Image](https://github.com/user-attachments/assets/d9cbf980-9d56-4b58-b165-6840b6c9411b)

### - 🔗 **MCP 集成**：

原生支持模型上下文协议（Model Context Protocol），实现与外部服务和工具的无缝集成。
![Image](https://github.com/user-attachments/assets/31d915a9-04dc-45b2-9635-488cc06ba468)

### - 📜 **网页界面配置 Agent**：

通过直观的网页管理界面轻松配置 agent，无需修改代码。
![Image](https://github.com/user-attachments/assets/5afdfe2e-0e98-4100-bff1-b7aaf413850b)



## 🚀 快速开始

在 5 分钟内启动并运行 JManus：

### 先决条件

- ☕ **Java 17+** (推荐 OpenJDK)
- 🌐 **DashScope API 密钥** (或替代的 AI 模型提供商)

### 1. 克隆并导航

```bash
git clone https://github.com/alibaba/spring-ai-alibaba.git
cd spring-ai-alibaba/spring-ai-alibaba-jmanus
```

### 2. 配置您的 API 密钥

```bash
# 设置您的 DashScope API 密钥
export DASHSCOPE_API_KEY=your_api_key_here
```

> 💡 **获取您的 DashScope API 密钥**: 访问 [阿里云百炼控制台](https://bailian.console.aliyun.com/?tab=model#/api-key) 获取免费 API 密钥。
>
> **使用其他提供商?** 在 `src/main/resources/application.yml` 中更新配置，以使用您偏好的 AI 模型平台。

### 3. 数据库配置（可选）

JManus 支持 H2（默认）、MySQL以及PostgreSQL数据库。

#### 如何使用 MySQL/PostgreSQL

1. **配置数据库连接**：
   在 `src/main/resources/`下的application-mysql.yml/application-postgres.yml中更新数据库配置和jpa方言：

   ```yaml
   spring:
     datasource:
       url: your_url
       username: your_username
       password: your_password
     jpa:
       database-platform: org.hibernate.dialect.MySQLDialect/PostgreSQLDialect
   ```

2. **激活 MySQL/PostgreSQL 配置**：
   在 `src/main/resources/application.yml` 中更新配置：

   ```yaml
   spring:
     ...
     profiles:
       active: mysql/postgres  
   ```

> 💡 **注意**：应用程序将在首次启动时自动创建所需的表，使用 JPA 的 `ddl-auto: update` 配置。

### 4. 启动应用程序

**对于类 Unix 系统 (macOS, Linux):**
```bash
../mvnw spring-boot:run
```

**对于 Windows 系统:**
```bash
../mvnw.cmd spring-boot:run
```

### 5. 访问您的多 Agent 仪表盘

在您的浏览器中访问 `http://localhost:18080`。

🎉 **恭喜!** 您的多 Agent 系统现已上线并准备就绪。


## 稳定版本的Release

如果你想要之前的稳定版本，可以在这里找到：
[稳定release版](https://github.com/rainerWJY/Java-Open-Manus/releases)


## 🤝 如何贡献

我们热烈欢迎来自开发者社区的贡献！以下是您可以产生影响的方式：

### 贡献机会

您可以在我们的 [项目看板](https://github.com/orgs/alibaba/projects/24) 上找到可用的任务。

- 🐛 **报告 Bug**: [提交详细的问题报告](https://github.com/alibaba/spring-ai-alibaba/issues)
- 💡 **功能请求**: [提出创新的增强建议](https://github.com/alibaba/spring-ai-alibaba/issues)
- 📝 **文档**: 帮助我们提高文档的清晰度和完整性
- 🔧 **代码贡献**: [提交包含您改进的拉取请求](https://github.com/alibaba/spring-ai-alibaba/pulls)

### 开发环境设置

```bash
# Fork 并克隆仓库
git clone https://github.com/your-username/spring-ai-alibaba.git
cd spring-ai-alibaba/spring-ai-alibaba-jmanus

# 安装项目依赖
mvn clean install

# 应用代码格式化标准
mvn spotless:apply

# 启动开发服务器
mvn spring-boot:run
```

### 开发指南

- 遵循现有的代码风格和约定
- 为新功能编写全面的测试
- 为任何 API 变更更新文档
- 在提交 PR 前确保所有测试都通过

---

<div align="center">

**由 Spring AI Alibaba 团队用心打造 ❤️**

⭐ 如果 JManus 加速了您的开发之旅，请在 **GitHub 上给我们点亮一颗星**！

</div>
