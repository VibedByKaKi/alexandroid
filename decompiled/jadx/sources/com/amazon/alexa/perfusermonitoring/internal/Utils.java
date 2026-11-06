package com.amazon.alexa.perfusermonitoring.internal;

import com.amazon.alexa.metis.api.ChatData$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0007J\u0019\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\u000b\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/perfusermonitoring/internal/Utils;", "", "()V", "DEFAULT_ATTRIBUTE_CATEGORY", "", "buildKeyWithDefaultCategory", "key", "buildKeyWithDefaultCategory$AlexaMobileAndroidPerformanceUserMonitoring_release", "convertToNanosOrGetCurrent", "", "time", "convertToNanosOrGetCurrent$AlexaMobileAndroidPerformanceUserMonitoring_release", "(Ljava/lang/Long;)J", "AlexaMobileAndroidPerformanceUserMonitoring_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class Utils {

    @NotNull
    public static final String DEFAULT_ATTRIBUTE_CATEGORY = "Alexa";

    @NotNull
    public static final Utils INSTANCE = new Utils();

    private Utils() {
    }

    @NotNull
    public final String buildKeyWithDefaultCategory$AlexaMobileAndroidPerformanceUserMonitoring_release(@NotNull String key) {
        return ChatData$$ExternalSyntheticOutline0.m(key, "Alexa.", key);
    }

    public final long convertToNanosOrGetCurrent$AlexaMobileAndroidPerformanceUserMonitoring_release(@Nullable Long time) {
        return (time != null ? time.longValue() : System.currentTimeMillis()) * 1000000;
    }
}
