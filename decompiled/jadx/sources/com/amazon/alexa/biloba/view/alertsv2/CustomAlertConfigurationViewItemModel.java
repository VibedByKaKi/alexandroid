package com.amazon.alexa.biloba.view.alertsv2;

import androidx.annotation.NonNull;
import com.amazon.alexa.biloba.model.AlertConfiguration;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class CustomAlertConfigurationViewItemModel {
    private static final String TAG = "CustomAlertConfigurationViewItemModel";
    private final AlertConfiguration alertConfiguration;

    public CustomAlertConfigurationViewItemModel(@NonNull AlertConfiguration alertConfiguration) {
        this.alertConfiguration = alertConfiguration;
    }

    public AlertConfiguration getAlertConfiguration() {
        return this.alertConfiguration;
    }

    public String getSubtitle() {
        return this.alertConfiguration.getSubtitle();
    }

    public String getTitle() {
        return this.alertConfiguration.getTitle();
    }
}
