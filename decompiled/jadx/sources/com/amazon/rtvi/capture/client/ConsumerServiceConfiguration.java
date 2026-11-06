package com.amazon.rtvi.capture.client;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class ConsumerServiceConfiguration {
    private final String action;
    private final String className;
    private final String packageName;

    public ConsumerServiceConfiguration(@NonNull String str, @NonNull String str2) {
        this.packageName = validateNotEmpty(str, "Package name cannot be null or empty");
        this.className = validateNotEmpty(str2, "Class name cannot be null or empty");
        this.action = null;
    }

    public static ConsumerServiceConfiguration forAction(@NonNull String str, @NonNull String str2) {
        return new ConsumerServiceConfiguration(validateNotEmpty(str, "Package name cannot be null or empty"), null, validateNotEmpty(str2, "Action cannot be null or empty"));
    }

    private static String validateNotEmpty(String str, String str2) {
        if (str != null && !str.trim().isEmpty()) {
            return str;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(str2);
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ConsumerServiceConfiguration.class == obj.getClass()) {
            ConsumerServiceConfiguration consumerServiceConfiguration = (ConsumerServiceConfiguration) obj;
            if (Objects.equals(this.packageName, consumerServiceConfiguration.packageName) && Objects.equals(this.className, consumerServiceConfiguration.className) && Objects.equals(this.action, consumerServiceConfiguration.action)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public String getAction() {
        return this.action;
    }

    @Nullable
    public String getClassName() {
        return this.className;
    }

    @NonNull
    public String getPackageName() {
        return this.packageName;
    }

    public int hashCode() {
        return Objects.hash(this.packageName, this.className, this.action);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConsumerServiceConfiguration{packageName='");
        sb.append(this.packageName);
        sb.append("', className='");
        sb.append(this.className);
        sb.append("', action='");
        return a$$ExternalSyntheticOutline0.m(sb, this.action, "'}");
    }

    private ConsumerServiceConfiguration(String str, String str2, String str3) {
        this.packageName = str;
        this.className = str2;
        this.action = str3;
    }
}
