/*
    Copyright 2020. Huawei Technologies Co., Ltd. All rights reserved.

    Licensed under the Apache License, Version 2.0 (the "License")
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        https://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
*/

package com.huawei.hms.cordova.push.remote;

import android.app.Application;
import android.util.Log;
import android.webkit.JavascriptInterface;

import com.huawei.hms.cordova.push.local.HmsLocalNotification;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class BackgroundJavaScriptInterface {
    private Application application;

    public BackgroundJavaScriptInterface(Application application) {
        this.application = application;
    }

    @JavascriptInterface
    public void backgroundLocalNotification(String rawDataMessage) throws JSONException {
        JSONObject json = new JSONObject(rawDataMessage);
        HmsLocalNotification hmsLocalNotification = new HmsLocalNotification(application);
        hmsLocalNotification.execute("localNotification", new JSONArray().put(json), null);
    }
}