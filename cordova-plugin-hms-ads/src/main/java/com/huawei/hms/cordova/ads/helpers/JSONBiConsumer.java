/*
Copyright 2020. Huawei Technologies Co., Ltd. All rights reserved.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
*/

package com.huawei.hms.cordova.ads.helpers;

import org.json.JSONException;


public interface JSONBiConsumer<T, U> {
    /**
     * A biconsumer that may throw JSONException.
     * @param in First parameter
     * @param in2 Second parameter
     * @throws JSONException if needed
     */
    void run(T in, U in2) throws JSONException;
}
