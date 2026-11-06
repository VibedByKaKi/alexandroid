package com.amazon.alexa.assistant.capability.audioplayer;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/assistant/capability/audioplayer/AudioPlayerItemGeneratorError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "MissingAttachment", "InvalidURL", "Lcom/amazon/alexa/assistant/capability/audioplayer/AudioPlayerItemGeneratorError$InvalidURL;", "Lcom/amazon/alexa/assistant/capability/audioplayer/AudioPlayerItemGeneratorError$MissingAttachment;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class AudioPlayerItemGeneratorError extends Exception {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/assistant/capability/audioplayer/AudioPlayerItemGeneratorError$InvalidURL;", "Lcom/amazon/alexa/assistant/capability/audioplayer/AudioPlayerItemGeneratorError;", "<init>", "()V", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InvalidURL extends AudioPlayerItemGeneratorError {

        @NotNull
        public static final InvalidURL INSTANCE = new InvalidURL();

        private InvalidURL() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/assistant/capability/audioplayer/AudioPlayerItemGeneratorError$MissingAttachment;", "Lcom/amazon/alexa/assistant/capability/audioplayer/AudioPlayerItemGeneratorError;", "<init>", "()V", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MissingAttachment extends AudioPlayerItemGeneratorError {

        @NotNull
        public static final MissingAttachment INSTANCE = new MissingAttachment();

        private MissingAttachment() {
            super(null);
        }
    }

    public /* synthetic */ AudioPlayerItemGeneratorError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AudioPlayerItemGeneratorError() {
    }
}
