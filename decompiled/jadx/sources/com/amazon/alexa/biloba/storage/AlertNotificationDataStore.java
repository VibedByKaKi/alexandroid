package com.amazon.alexa.biloba.storage;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.biloba.model.AlertNotificationData;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface AlertNotificationDataStore {
    void clearAlertNotificationDataStore();

    void deleteAlertData(@NonNull AlertNotificationData alertNotificationData);

    @Nullable
    Set<AlertNotificationData> getAlertData();

    void putAlertData(@NonNull AlertNotificationData alertNotificationData);
}
