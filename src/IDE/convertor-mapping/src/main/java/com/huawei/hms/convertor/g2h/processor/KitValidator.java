/*
 * Copyright 2020. Huawei Technologies Co., Ltd. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.huawei.hms.convertor.g2h.processor;

public class KitValidator {
    public static GeneratorResult paramValidator(String outPaths, String logPath, String pluginPath) {
        if (outPaths == null || outPaths.isEmpty()) {
            return GeneratorResult.INVALID_OUTPATH;
        }
        if (logPath == null || logPath.isEmpty()) {
            return GeneratorResult.INVALID_LOGPATH;
        }
        if (pluginPath == null || pluginPath.isEmpty()) {
            return GeneratorResult.MISSING_PLUGIN;
        }
        return GeneratorResult.SUCCESS;
    }
}
