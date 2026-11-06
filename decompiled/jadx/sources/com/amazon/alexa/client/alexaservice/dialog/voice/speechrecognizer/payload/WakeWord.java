package com.amazon.alexa.client.alexaservice.dialog.voice.speechrecognizer.payload;

import com.amazon.alexa.client.core.networking.adapters.StronglyTypedString;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/client/alexaservice/dialog/voice/speechrecognizer/payload/WakeWord;", "Lcom/amazon/alexa/client/core/networking/adapters/StronglyTypedString;", "wakeWord", "", "(Ljava/lang/String;)V", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "getValue", "hashCode", "", "toString", "Companion", "AVSAndroidClient-alexaservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class WakeWord implements StronglyTypedString {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String wakeWord;

    public WakeWord(@NotNull String str) {
        str.getClass();
        this.wakeWord = str;
    }

    /* renamed from: component1, reason: from getter */
    private final String getWakeWord() {
        return this.wakeWord;
    }

    public static /* synthetic */ WakeWord copy$default(WakeWord wakeWord, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wakeWord.wakeWord;
        }
        return wakeWord.copy(str);
    }

    @NotNull
    public final WakeWord copy(@NotNull String wakeWord) {
        wakeWord.getClass();
        return new WakeWord(wakeWord);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof WakeWord) && Intrinsics.areEqual(this.wakeWord, ((WakeWord) other).wakeWord);
    }

    @Override // com.amazon.alexa.client.core.networking.adapters.StronglyTypedString
    @NotNull
    public String getValue() {
        return this.wakeWord;
    }

    public int hashCode() {
        return this.wakeWord.hashCode();
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("WakeWord(wakeWord=", this.wakeWord, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/client/alexaservice/dialog/voice/speechrecognizer/payload/WakeWord$Companion;", "", "()V", "getTypeAdapter", "Lcom/amazon/alexa/client/core/networking/adapters/StronglyTypedString$StronglyTypedStringAdapter;", "Lcom/amazon/alexa/client/alexaservice/dialog/voice/speechrecognizer/payload/WakeWord;", "AVSAndroidClient-alexaservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final StronglyTypedString.StronglyTypedStringAdapter<WakeWord> getTypeAdapter() {
            return new StronglyTypedString.StronglyTypedStringAdapter<WakeWord>() { // from class: com.amazon.alexa.client.alexaservice.dialog.voice.speechrecognizer.payload.WakeWord$Companion$getTypeAdapter$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.amazon.alexa.client.core.networking.adapters.StronglyTypedString.StronglyTypedStringAdapter
                @NotNull
                public WakeWord instantiate(@NotNull String value) {
                    value.getClass();
                    return new WakeWord(value);
                }
            };
        }

        private Companion() {
        }
    }
}
