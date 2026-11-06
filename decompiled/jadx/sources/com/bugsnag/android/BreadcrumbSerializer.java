package com.bugsnag.android;

import com.amazon.alexa.auth.BuildConfig;
import com.bugsnag.android.internal.DateUtils;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lcom/bugsnag/android/BreadcrumbSerializer;", "Lcom/bugsnag/android/MapSerializer;", "Lcom/bugsnag/android/Breadcrumb;", "()V", "serialize", "", BuildConfig.FLAVOR_authType, "", "", "", "crumb", "bugsnag-plugin-react-native_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final class BreadcrumbSerializer implements MapSerializer<Breadcrumb> {
    /* renamed from: serialize, reason: avoid collision after fix types in other method */
    public void serialize2(@NotNull Map<String, Object> map, @NotNull Breadcrumb crumb) {
        map.getClass();
        crumb.getClass();
        Date timestamp = crumb.getTimestamp();
        timestamp.getClass();
        map.put("timestamp", DateUtils.toIso8601(timestamp));
        map.put("message", crumb.getMessage());
        String type = crumb.getType().getType();
        Locale locale = Locale.US;
        locale.getClass();
        if (type == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("null cannot be cast to non-null type java.lang.String");
            return;
        }
        String lowerCase = type.toLowerCase(locale);
        lowerCase.getClass();
        map.put("type", lowerCase);
        map.put("metadata", crumb.getMetadata());
    }

    @Override // com.bugsnag.android.MapSerializer
    public /* bridge */ /* synthetic */ void serialize(Map map, Breadcrumb breadcrumb) {
        serialize2((Map<String, Object>) map, breadcrumb);
    }
}
