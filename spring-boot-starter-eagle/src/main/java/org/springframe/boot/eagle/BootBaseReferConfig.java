/*
 * Copyright 2017 eagle.jfaster.org.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package org.springframe.boot.eagle;

import eagle.jfaster.org.config.BaseReferConfig;
import lombok.Getter;
import lombok.Setter;

/**
 * baseRefer 与配置文件的映射类
 *
 * Created by fangyanpeng on 2017/10/17.
 */
@Setter
@Getter
public class BootBaseReferConfig extends BaseReferConfig {

    private String protocol;

    private String registry;
}