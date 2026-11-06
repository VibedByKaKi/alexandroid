package com.bugsnag.android;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bugsnag.android.JsonStream;
import com.bugsnag.android.internal.DateUtils;
import java.io.IOException;
import java.util.Date;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class Breadcrumb implements JsonStream.Streamable {
    final BreadcrumbInternal impl;
    private final Logger logger;

    public Breadcrumb(@NonNull String str, @NonNull Logger logger) {
        this.impl = new BreadcrumbInternal(str);
        this.logger = logger;
    }

    private void logNull(String str) {
        this.logger.e("Invalid null value supplied to breadcrumb." + str + ", ignoring");
    }

    @NonNull
    public String getMessage() {
        return this.impl.message;
    }

    @Nullable
    public Map<String, Object> getMetadata() {
        return this.impl.metadata;
    }

    @NonNull
    public String getStringTimestamp() {
        return DateUtils.toIso8601(this.impl.timestamp);
    }

    @NonNull
    public Date getTimestamp() {
        return this.impl.timestamp;
    }

    @NonNull
    public BreadcrumbType getType() {
        return this.impl.type;
    }

    public void setMessage(@NonNull String str) {
        if (str != null) {
            this.impl.message = str;
        } else {
            logNull("message");
        }
    }

    public void setMetadata(@Nullable Map<String, Object> map) {
        this.impl.metadata = map;
    }

    public void setType(@NonNull BreadcrumbType breadcrumbType) {
        if (breadcrumbType != null) {
            this.impl.type = breadcrumbType;
        } else {
            logNull("type");
        }
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public void toStream(@NonNull JsonStream jsonStream) throws IOException {
        this.impl.toStream(jsonStream);
    }

    public Breadcrumb(@NonNull BreadcrumbInternal breadcrumbInternal, @NonNull Logger logger) {
        this.impl = breadcrumbInternal;
        this.logger = logger;
    }

    public Breadcrumb(@NonNull String str, @NonNull BreadcrumbType breadcrumbType, @Nullable Map<String, Object> map, @NonNull Date date, @NonNull Logger logger) {
        this.impl = new BreadcrumbInternal(str, breadcrumbType, map, date);
        this.logger = logger;
    }
}
