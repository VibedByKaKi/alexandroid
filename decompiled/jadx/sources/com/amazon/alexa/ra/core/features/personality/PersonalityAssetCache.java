package com.amazon.alexa.ra.core.features.personality;

import com.dee.app.metrics.MetricsConstants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004H¦@¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\nH&¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/core/features/personality/PersonalityAssetCache;", "", MetricsConstants.Method.CACHE_GET, "Lkotlin/Result;", "", "uri", "expectedChecksum", "get-0E7RQCE", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", MetricsConstants.Method.CACHE_CLEAR, "", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface PersonalityAssetCache {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    /* renamed from: get-0E7RQCE$default, reason: not valid java name */
    static /* synthetic */ Object m17800get0E7RQCE$default(PersonalityAssetCache personalityAssetCache, String str, String str2, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: get-0E7RQCE");
            return null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return personalityAssetCache.mo17801get0E7RQCE(str, str2, continuation);
    }

    void clear();

    @Nullable
    /* renamed from: get-0E7RQCE, reason: not valid java name */
    Object mo17801get0E7RQCE(@NotNull String str, @Nullable String str2, @NotNull Continuation<? super Result<String>> continuation);
}
