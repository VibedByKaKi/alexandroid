package com.amazon.photos.uploader.internal.utils;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a0\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0005H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0006"}, d2 = {"sumByLong", "", ExifInterface.GPS_DIRECTION_TRUE, "", "selector", "Lkotlin/Function1;", "AndroidPhotosUploader_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class IterableUtilsKt {
    public static final <T> long sumByLong(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, Long> function1) {
        Iterator m = CredentialConfig$$ExternalSyntheticOutline0.m(iterable, function1);
        long j = 0;
        while (m.hasNext()) {
            j += function1.invoke((Object) m.next()).longValue();
        }
        return j;
    }
}
