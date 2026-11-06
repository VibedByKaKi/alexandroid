package com.amazon.alexa.configservice.cache;

import androidx.annotation.VisibleForTesting;
import com.google.common.collect.ImmutableMap;
import com.google.gson.JsonElement;
import java.util.Map;
import javax.annotation.concurrent.ThreadSafe;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ThreadSafe
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\f\u001a\u00020\r2\u001e\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0005J \u0010\u000f\u001a\u0004\u0018\u00010\u00072\f\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006J \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0011R&\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R2\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/configservice/cache/ConfigCache;", "", "<init>", "()V", "_overrides", "", "", "Lcom/google/gson/JsonElement;", "overrides", "getOverrides$annotations", "getOverrides", "()Ljava/util/Map;", "setOverrides", "", "newOverrides", "getConfigOverride", "domain", "", "key", "getConfigOverridesForDomain", "Companion", "AlexaMobileAndroidConfigService_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConfigCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigCache.kt\ncom/amazon/alexa/configservice/cache/ConfigCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n1#2:71\n*E\n"})
/* loaded from: classes17.dex */
public final class ConfigCache {

    @NotNull
    private static final Map<String, JsonElement> emptyMap;

    @NotNull
    private volatile Map<String, ? extends Map<String, ? extends JsonElement>> _overrides = MapsKt.emptyMap();

    static {
        ImmutableMap of = ImmutableMap.of();
        of.getClass();
        emptyMap = of;
    }

    @Nullable
    public final JsonElement getConfigOverride(@Nullable Enum<?> domain, @Nullable String key) {
        Map<String, JsonElement> map;
        if (domain == null || key == null || (map = getOverrides().get(domain.name())) == null) {
            return null;
        }
        return map.get(key);
    }

    @NotNull
    public final Map<String, JsonElement> getConfigOverridesForDomain(@Nullable Enum<?> domain) {
        ImmutableMap copyOf;
        if (domain == null) {
            return emptyMap;
        }
        Map<String, JsonElement> map = getOverrides().get(domain.name());
        return (map == null || (copyOf = ImmutableMap.copyOf((Map) map)) == null) ? emptyMap : copyOf;
    }

    @NotNull
    public final Map<String, Map<String, JsonElement>> getOverrides() {
        return this._overrides;
    }

    public final void setOverrides(@NotNull Map<String, ? extends Map<String, ? extends JsonElement>> newOverrides) {
        newOverrides.getClass();
        this._overrides = ImmutableMap.copyOf((Map) newOverrides);
    }

    @VisibleForTesting
    public static /* synthetic */ void getOverrides$annotations() {
    }
}
