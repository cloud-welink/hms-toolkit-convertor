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

package com.huawei.hms.convertor.g2h.map.extension;

import com.huawei.hms.convertor.g2h.map.desc.ClassDesc;

import com.google.gson.annotations.Expose;

public class ExClass {
    @Expose
    String className;

    @Expose
    ClassDesc classDesc;

    public ExClass(String className, ClassDesc classDesc) {
        this.className = className;
        this.classDesc = classDesc;
    }
}
