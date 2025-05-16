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
package com.openquartz.cloud.ai.example.manus.config;

import com.openquartz.cloud.ai.example.manus.config.entity.ConfigEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/config")
public class ConfigController {

	@Autowired
	private ConfigService configService;

	@GetMapping("/group/{groupName}")
	public ResponseEntity<List<ConfigEntity>> getConfigsByGroup(@PathVariable("groupName") String groupName) {
		return ResponseEntity.ok(configService.getConfigsByGroup(groupName));
	}

	@PostMapping("/batch-update")
	public ResponseEntity<Void> batchUpdateConfigs(@RequestBody List<ConfigEntity> configs) {
		configService.batchUpdateConfigs(configs);
		return ResponseEntity.ok().build();
	}

}
