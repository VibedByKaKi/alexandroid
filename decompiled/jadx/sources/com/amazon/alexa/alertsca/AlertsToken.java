package com.amazon.alexa.alertsca;

import androidx.annotation.NonNull;
import com.amazon.alexa.alertsca.utils.StronglyTypedString;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes16.dex */
public abstract class AlertsToken implements StronglyTypedString {
    public static AlertsToken create(String str) {
        return new AutoValue_AlertsToken(str);
    }

    public static StronglyTypedString.StronglyTypedStringAdapter<AlertsToken> getTypeAdapter() {
        return new StronglyTypedString.StronglyTypedStringAdapter<AlertsToken>() { // from class: com.amazon.alexa.alertsca.AlertsToken.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.amazon.alexa.alertsca.utils.StronglyTypedString.StronglyTypedStringAdapter
            public AlertsToken instantiate(@NonNull String str) {
                return AlertsToken.create(str);
            }
        };
    }
}
