package com.amazon.alexa.voice.tta.statemachine;

import com.amazon.alexa.api.TextResponse;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/voice/tta/statemachine/Inputs;", "", "<init>", "()V", "TextRequestInput", "TextResponseInput", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public abstract class Inputs {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/voice/tta/statemachine/Inputs$TextRequestInput;", "", "requestText", "", "<init>", "(Ljava/lang/String;)V", "getRequestText", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextRequestInput {

        @NotNull
        private final String requestText;

        public TextRequestInput(@NotNull String str) {
            str.getClass();
            this.requestText = str;
        }

        public static /* synthetic */ TextRequestInput copy$default(TextRequestInput textRequestInput, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = textRequestInput.requestText;
            }
            return textRequestInput.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getRequestText() {
            return this.requestText;
        }

        @NotNull
        public final TextRequestInput copy(@NotNull String requestText) {
            requestText.getClass();
            return new TextRequestInput(requestText);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TextRequestInput) && Intrinsics.areEqual(this.requestText, ((TextRequestInput) other).requestText);
        }

        @NotNull
        public final String getRequestText() {
            return this.requestText;
        }

        public int hashCode() {
            return this.requestText.hashCode();
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("TextRequestInput(requestText=", this.requestText, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/voice/tta/statemachine/Inputs$TextResponseInput;", "", "response", "Lcom/amazon/alexa/api/TextResponse;", "<init>", "(Lcom/amazon/alexa/api/TextResponse;)V", "getResponse", "()Lcom/amazon/alexa/api/TextResponse;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextResponseInput {

        @NotNull
        private final TextResponse response;

        public TextResponseInput(@NotNull TextResponse textResponse) {
            textResponse.getClass();
            this.response = textResponse;
        }

        public static /* synthetic */ TextResponseInput copy$default(TextResponseInput textResponseInput, TextResponse textResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                textResponse = textResponseInput.response;
            }
            return textResponseInput.copy(textResponse);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextResponse getResponse() {
            return this.response;
        }

        @NotNull
        public final TextResponseInput copy(@NotNull TextResponse response) {
            response.getClass();
            return new TextResponseInput(response);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TextResponseInput) && Intrinsics.areEqual(this.response, ((TextResponseInput) other).response);
        }

        @NotNull
        public final TextResponse getResponse() {
            return this.response;
        }

        public int hashCode() {
            return this.response.hashCode();
        }

        @NotNull
        public String toString() {
            return "TextResponseInput(response=" + this.response + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    public /* synthetic */ Inputs(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Inputs() {
    }
}
