package com.amazonaws.cognito.clientcontext.datacollection;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.Display;
import android.view.WindowManager;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class DeviceDataCollector extends DataCollector {
    protected static final String LOCAL_STORAGE_DEVICE_ID_KEY = "CognitoDeviceId";
    protected static final String LOCAL_STORAGE_PATH = "AWS.Cognito.ContextData";
    private static final String PLATFORM = "ANDROID";

    private Display getDisplay(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    private String getTimezoneOffset() {
        long rawOffset = getTimezone().getRawOffset();
        long j = rawOffset / 3600000;
        return (j < 0 ? "-" : "").concat(String.format(Locale.US, "%02d:%02d", Long.valueOf(Math.abs(j)), Long.valueOf((rawOffset / 60000) - TimeUnit.HOURS.toMinutes(j))));
    }

    @Override // com.amazonaws.cognito.clientcontext.datacollection.DataCollector
    public Map<String, String> collect(Context context) {
        HashMap hashMap = new HashMap();
        hashMap.put(DataRecordKey.TIMEZONE, getTimezoneOffset());
        hashMap.put(DataRecordKey.PLATFORM, "ANDROID");
        hashMap.put(DataRecordKey.THIRD_PARTY_DEVICE_AGENT, getThirdPartyDeviceAgent());
        hashMap.put(DataRecordKey.DEVICE_AGENT, getCognitoDeviceAgent(context));
        hashMap.put(DataRecordKey.DEVICE_LANGUAGE, getLanguage());
        Display display = getDisplay(context);
        hashMap.put(DataRecordKey.DEVICE_HEIGHT, String.valueOf(display.getHeight()));
        hashMap.put(DataRecordKey.DEVICE_WIDTH, String.valueOf(display.getWidth()));
        return hashMap;
    }

    public String getCognitoDeviceAgent(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(LOCAL_STORAGE_PATH, 0);
        if (sharedPreferences == null) {
            return null;
        }
        String string = sharedPreferences.getString(LOCAL_STORAGE_DEVICE_ID_KEY, null);
        if (string != null) {
            return string;
        }
        StringBuilder m1m = a$$ExternalSyntheticOutline0.m1m(UUID.randomUUID().toString(), ":");
        m1m.append(new Date().getTime());
        String sb = m1m.toString();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(LOCAL_STORAGE_DEVICE_ID_KEY, sb);
        edit.apply();
        return sb;
    }

    public String getLanguage() {
        return Locale.getDefault().toString();
    }

    public String getThirdPartyDeviceAgent() {
        return "android_id";
    }

    public TimeZone getTimezone() {
        return TimeZone.getDefault();
    }
}
