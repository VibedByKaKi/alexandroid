package com.amazon.comms.calling.data.extensions;

import android.annotation.SuppressLint;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"getMediaStreams", "", "", "isVideo", "", "AlexaCommsCallingUI-Android_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class MediaStreamsExtKt {
    @SuppressLint({"DefaultLocale"})
    @NotNull
    public static final List<String> getMediaStreams(boolean z) {
        if (z) {
            Locale locale = Locale.ROOT;
            String upperCase = "Audio".toUpperCase(locale);
            upperCase.getClass();
            String upperCase2 = "Video".toUpperCase(locale);
            upperCase2.getClass();
            return CollectionsKt.listOf((Object[]) new String[]{upperCase, upperCase2});
        }
        if (z) {
            PathKt$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        String upperCase3 = "Audio".toUpperCase(Locale.ROOT);
        upperCase3.getClass();
        return CollectionsKt.listOf(upperCase3);
    }
}
