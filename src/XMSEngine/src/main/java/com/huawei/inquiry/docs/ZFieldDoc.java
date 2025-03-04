/*
 * Copyright 2020. Huawei Technologies Co., Ltd. All rights reserved.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.huawei.inquiry.docs;

import com.google.gson.annotations.SerializedName;

public class ZFieldDoc implements ZDocs {
    @SerializedName("des")
    private String des;

    @SerializedName("value")
    private String value;

    @SerializedName("url")
    private String url;

    private String signature;

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getSignature() {
        return signature;
    }

    public String getDes() {
        return des;
    }

    public String getUrl() {
        return url;
    }

    public String getValue() {
        return value;
    }

    @Override
    public Class getTypeClass() {
        return ZFieldDoc.class;
    }

    @Override
    public String toString() {
        return signature;
    }
}
