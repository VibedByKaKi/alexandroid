package com.amazon.alexa.assistant.foundation.audio;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/audio/StreamedAudioItem;", "", "source", "Lcom/amazon/alexa/assistant/foundation/audio/StreamedAudioSource;", "token", "", "contentId", "contentType", "captionCharacterCount", "", "<init>", "(Lcom/amazon/alexa/assistant/foundation/audio/StreamedAudioSource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getSource", "()Lcom/amazon/alexa/assistant/foundation/audio/StreamedAudioSource;", "getToken", "()Ljava/lang/String;", "getContentId", "getContentType", "getCaptionCharacterCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class StreamedAudioItem {

    @Nullable
    private final Integer captionCharacterCount;

    @NotNull
    private final String contentId;

    @NotNull
    private final String contentType;

    @NotNull
    private final StreamedAudioSource source;

    @NotNull
    private final String token;

    public StreamedAudioItem(@NotNull StreamedAudioSource streamedAudioSource, @NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable Integer num) {
        streamedAudioSource.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.source = streamedAudioSource;
        this.token = str;
        this.contentId = str2;
        this.contentType = str3;
        this.captionCharacterCount = num;
    }

    @Nullable
    public final Integer getCaptionCharacterCount() {
        return this.captionCharacterCount;
    }

    @NotNull
    public final String getContentId() {
        return this.contentId;
    }

    @NotNull
    public final String getContentType() {
        return this.contentType;
    }

    @NotNull
    public final StreamedAudioSource getSource() {
        return this.source;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    public /* synthetic */ StreamedAudioItem(StreamedAudioSource streamedAudioSource, String str, String str2, String str3, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(streamedAudioSource, str, str2, (i & 8) != 0 ? "audio/mpeg" : str3, (i & 16) != 0 ? null : num);
    }
}
