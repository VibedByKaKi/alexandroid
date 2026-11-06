package com.amazon.alexa.biloba.view.alertsv2.schedule;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ScheduleViewItemModel {
    private static final String TAG = "ScheduleViewItemModel";
    private final String storageFormatEndTime;
    private final String storageFormatStartTime;

    public ScheduleViewItemModel(@NonNull String str, @NonNull String str2) {
        this.storageFormatEndTime = str2;
        this.storageFormatStartTime = str;
    }

    public String getStorageFormatEndTime() {
        return this.storageFormatEndTime;
    }

    public String getStorageFormatStartTime() {
        return this.storageFormatStartTime;
    }
}
