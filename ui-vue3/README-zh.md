# JManus UI

<p align="center">
  <img src="./public/logo.png" alt="JManus UI Logo" width="200"/>
</p>

<p align="center">
  <a href="https://vuejs.org/"><img src="https://img.shields.io/badge/vue-3.x-brightgreen.svg" alt="Vue 3"></a>
  <a href="https://www.typescriptlang.org/"><img src="https://img.shields.io/badge/typescript-5.x-blue.svg" alt="TypeScript"></a>
  <a href="https://ant.design/"><img src="https://img.shields.io/badge/UI-Ant%20Design%20Vue-blue" alt="Ant Design Vue"></a>
  <a href="./LICENSE"><img src="https://img.shields.io/badge/license-Apache%202.0-blue.svg" alt="License"></a>
</p>

[English](./README.md) | 中文

[Spring AI Alibaba JManus](../README.md) 的现代化 Web 管理界面。

## 🚀 快速开始

### 环境要求

- Node.js >= 16 (自带 npm)
- pnpm

**对于 Java 开发者：**

#### 1. 安装 Node.js 和 npm

Node.js 是一个 JavaScript 运行环境，它包含了 npm (Node Package Manager)，一个 JavaScript 包管理器。

- **Windows/macOS**:
  请访问 [Node.js 官方网站](https://nodejs.org/) 下载并安装适合您操作系统的 LTS (长期支持) 版本。安装程序会自动安装 Node.js 和 npm。
- **Linux**:
  您可以使用包管理器进行安装。例如，在 Ubuntu/Debian 上：

  ```bash
  sudo apt update
  sudo apt install nodejs npm
  ```

  对于其他发行版，请参考 Node.js 官方文档的[安装指南](https://nodejs.org/en/download/package-manager)。

安装完成后，您可以通过以下命令验证安装：

```bash
node -v
npm -v
```

#### 2. 安装 pnpm (推荐)

pnpm 是一个快速、节省磁盘空间的包管理器。我们推荐使用 pnpm 来管理本项目的依赖。

使用 npm全局安装 pnpm：

```bash
npm install -g pnpm
```

验证 pnpm 安装：

```bash
pnpm -v
```

为什么使用 pnpm？

- **速度快**：pnpm 在安装依赖时比 npm 和 yarn 更快。
- **磁盘空间效率高**：pnpm 使用内容可寻址存储来存储所有模块，这意味着项目之间共享相同的依赖版本，而不是在每个项目中都复制一份。
- **严格的依赖管理**：pnpm 创建一个非扁平化的 `node_modules` 目录，这有助于避免一些潜在的依赖问题。

### 安装

```bash
# 克隆仓库 (如果尚未克隆)
# git clone https://github.com/spring-ai-alibaba/spring-ai-alibaba.git

# 进入 UI 目录
# cd spring-ai-jmanus-ollama/ui-vue3

# 使用 pnpm 安装依赖
pnpm install

# 启动开发服务器
pnpm run dev
```

### 构建

```bash
# 使用 pnpm 构建生产版本
pnpm run build

然后复制build后的文件到 resources目录（有可能需要先删除老的所有文件）
例如 mac下，在spring-ai-jmanus-ollama 下运行：

cp -r ui-vue3/ui src/main/resources/static/

然后java spring boot 启动就行了 , java会自动开启对应的页面。

```


## 📖 文档

详细文档请参考：

- [JManus 文档](../README-zh.md)
- [API 文档](./docs/api.md)
- [配置指南](./docs/configuration.md)

## 🤝 贡献指南

我们欢迎各种形式的贡献！提交 Pull Request 前请阅读我们的[贡献指南](../../CONTRIBUTING.md)。

### 开发设置

1. Fork 本仓库
2. 创建特性分支 (`git checkout -b feature/amazing-feature`)
3. 提交更改 (`git commit -m '添加一些很棒的特性'`)
4. 推送到分支 (`git push origin feature/amazing-feature`)
5. 提交 Pull Request
