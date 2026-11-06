package com.amazon.alexa.ra.core.features.artifact;

import com.amazon.alexa.ra.core.data.model.LocalMediaInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/core/features/artifact/SilkPageSendListener;", "", "onSilkPageReadyToSend", "", "text", "", "mediaInfo", "Lcom/amazon/alexa/ra/core/data/model/LocalMediaInfo;", "timestamp", "", "privacyCode", "options", "Lcom/amazon/alexa/ra/core/features/artifact/SilkCommitOptions;", "onSilkPageSendPlain", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface SilkPageSendListener {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void onSilkPageReadyToSend(@NotNull SilkPageSendListener silkPageSendListener, @NotNull String str, @NotNull LocalMediaInfo localMediaInfo, long j, @Nullable String str2, @NotNull SilkCommitOptions silkCommitOptions) {
            str.getClass();
            localMediaInfo.getClass();
            silkCommitOptions.getClass();
            SilkPageSendListener.super.onSilkPageReadyToSend(str, localMediaInfo, j, str2, silkCommitOptions);
        }

        @Deprecated
        public static void onSilkPageSendPlain(@NotNull SilkPageSendListener silkPageSendListener, @NotNull String str, long j, @Nullable String str2) {
            str.getClass();
            SilkPageSendListener.super.onSilkPageSendPlain(str, j, str2);
        }
    }

    default void onSilkPageReadyToSend(@NotNull String text, @NotNull LocalMediaInfo mediaInfo, long timestamp, @Nullable String privacyCode, @NotNull SilkCommitOptions options) {
        text.getClass();
        mediaInfo.getClass();
        options.getClass();
    }

    default void onSilkPageSendPlain(@NotNull String text, long timestamp, @Nullable String privacyCode) {
        text.getClass();
    }
}
