package com.amazon.alexa.biloba.view.alertsv2.edit;

import androidx.annotation.NonNull;
import com.amazon.alexa.biloba.model.AlertConfiguration;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class EditViewItemModel {
    private static final String TAG = "EditViewItemModel";
    private final String name;
    private final AlertConfiguration.AlertConfigurationStatus status;

    public EditViewItemModel(@NonNull String str, @NonNull AlertConfiguration.AlertConfigurationStatus alertConfigurationStatus) {
        this.name = str;
        this.status = alertConfigurationStatus;
    }

    public String getName() {
        return this.name;
    }

    public AlertConfiguration.AlertConfigurationStatus getStatus() {
        return this.status;
    }
}
