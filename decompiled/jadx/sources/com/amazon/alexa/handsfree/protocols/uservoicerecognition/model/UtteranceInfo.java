package com.amazon.alexa.handsfree.protocols.uservoicerecognition.model;

import androidx.annotation.NonNull;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class UtteranceInfo {
    private final String mText;
    private final String mUtteranceId;

    public UtteranceInfo(@NonNull String str, @NonNull String str2) {
        Objects.requireNonNull(str, "Utterance ID must not be null.");
        this.mUtteranceId = str;
        Objects.requireNonNull(str2, "Text must not be null.");
        this.mText = str2;
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == UtteranceInfo.class) {
            UtteranceInfo utteranceInfo = (UtteranceInfo) obj;
            if (Objects.equals(this.mUtteranceId, utteranceInfo.mUtteranceId) && Objects.equals(this.mText, utteranceInfo.mText)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public String getText() {
        return this.mText;
    }

    @NonNull
    public String getUtteranceId() {
        return this.mUtteranceId;
    }

    public int hashCode() {
        return Objects.hash(this.mUtteranceId, this.mText);
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m("[id = ", this.mUtteranceId, ", text = ", this.mText, MarkdownConstants.RIGHT_BRACKET);
    }
}
