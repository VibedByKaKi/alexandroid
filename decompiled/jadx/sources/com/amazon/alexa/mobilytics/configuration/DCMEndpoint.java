package com.amazon.alexa.mobilytics.configuration;

import androidx.annotation.NonNull;
import com.google.common.base.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class DCMEndpoint implements Endpoint {
    private final String priority;
    private final String tag;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Priority {
        public static final String HIGH = "High";
        public static final String NORMAL = "Normal";
    }

    public DCMEndpoint(@NonNull String str, @NonNull String str2) {
        this.priority = (String) Preconditions.checkNotNull(str);
        this.tag = (String) Preconditions.checkNotNull(str2);
    }

    @NonNull
    public String priority() {
        return this.priority;
    }

    @Override // com.amazon.alexa.mobilytics.configuration.Endpoint
    @NonNull
    public String tag() {
        return this.tag;
    }

    @Override // com.amazon.alexa.mobilytics.configuration.Endpoint
    public int type() {
        return 1;
    }
}
