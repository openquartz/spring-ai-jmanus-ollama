/*
 * Copyright 2025 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.openquartz.cloud.ai.example.manus.tool.browser.actions;

import com.openquartz.cloud.ai.example.manus.tool.browser.BrowserUseTool;
import com.openquartz.cloud.ai.example.manus.tool.code.ToolExecuteResult;
import com.microsoft.playwright.Page;

public class RefreshAction extends BrowserAction {

	public RefreshAction(BrowserUseTool browserUseTool) {
		super(browserUseTool);
	}

	@Override
	public ToolExecuteResult execute(BrowserRequestVO request) throws Exception {
		Page page = getCurrentPage(); // 获取 Playwright 的 Page 实例
		page.reload(); // 刷新当前页面

		return new ToolExecuteResult("Refreshed current page");
	}

}
