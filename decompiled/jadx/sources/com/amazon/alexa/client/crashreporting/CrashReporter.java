package com.amazon.alexa.client.crashreporting;

import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J,\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u001a\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H&¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/client/crashreporting/CrashReporter;", "", "clearBreadcrumbs", "", "leaveBreadcrumb", "name", "", "breadcrumbType", "Lcom/amazon/alexa/client/crashreporting/BreadcrumbType;", "metadata", "", "notifyHandledException", "throwable", "", "probability", "", "putMetadata", "key", "value", "AVSAndroidClient-crashreporting_bugsnagRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface CrashReporter {
    void clearBreadcrumbs();

    void leaveBreadcrumb(@NotNull String name);

    void leaveBreadcrumb(@NotNull String name, @NotNull BreadcrumbType breadcrumbType, @NotNull Map<String, String> metadata);

    void notifyHandledException(@NotNull Throwable throwable);

    void notifyHandledException(@NotNull Throwable throwable, double probability);

    void putMetadata(@NotNull String key, @Nullable Object value);
}
