package com.amazonaws.cognito.clientcontext.datacollection;

import android.content.Context;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class BuildDataCollector extends DataCollector {
    @Override // com.amazonaws.cognito.clientcontext.datacollection.DataCollector
    public Map<String, String> collect(Context context) {
        HashMap hashMap = new HashMap();
        hashMap.put(DataRecordKey.BRAND, Build.BRAND);
        hashMap.put(DataRecordKey.FINGERPRINT, Build.FINGERPRINT);
        hashMap.put(DataRecordKey.HARDWARE, Build.HARDWARE);
        hashMap.put(DataRecordKey.MODEL, Build.MODEL);
        hashMap.put(DataRecordKey.PRODUCT, Build.PRODUCT);
        hashMap.put(DataRecordKey.BUILD_TYPE, Build.TYPE);
        hashMap.put(DataRecordKey.VERSION_RELEASE, Build.VERSION.RELEASE);
        hashMap.put(DataRecordKey.VERSION_SDK, Build.VERSION.SDK);
        return hashMap;
    }
}
