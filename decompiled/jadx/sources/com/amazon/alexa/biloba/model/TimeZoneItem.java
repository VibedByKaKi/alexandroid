package com.amazon.alexa.biloba.model;

import android.text.TextUtils;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.biloba.utils.LogUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class TimeZoneItem {
    private static final String TAG = "TimeZoneItem";
    private final String text;
    private final String value;

    public TimeZoneItem(String str, String str2) {
        this.text = str;
        this.value = str2;
    }

    public String getPrimaryText() {
        String[] split = this.text.split("\\(");
        if (!TextUtils.isEmpty(split[0])) {
            return AppLaunchChecker$$ExternalSyntheticOutline0.m(1, 0, split[0]);
        }
        LogUtils.i(TAG, this.text + " cannot be split as it was not in the format PrimaryText (SecondaryText)");
        return this.text;
    }

    public String getSecondaryText() {
        String[] split = this.text.split("\\(");
        if (!TextUtils.isEmpty(split[1])) {
            return AppLaunchChecker$$ExternalSyntheticOutline0.m(1, 0, split[1]);
        }
        LogUtils.i(TAG, this.text + " cannot be split as it was not in the format PrimaryText (SecondaryText)");
        return this.text;
    }

    public String getText() {
        return this.text;
    }

    public String getValue() {
        return this.value;
    }
}
