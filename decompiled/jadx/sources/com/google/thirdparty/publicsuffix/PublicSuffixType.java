package com.google.thirdparty.publicsuffix;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.deecomms.common.Constants;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Beta
@GwtCompatible
/* loaded from: classes8.dex */
public enum PublicSuffixType {
    PRIVATE(AbstractJsonLexerKt.COLON, AbstractJsonLexerKt.COMMA),
    REGISTRY('!', Constants.DEFAULT_IMAGE_CHAR);

    private final char innerNodeCode;
    private final char leafNodeCode;

    PublicSuffixType(char c, char c2) {
        this.innerNodeCode = c;
        this.leafNodeCode = c2;
    }

    public static PublicSuffixType fromCode(char c) {
        for (PublicSuffixType publicSuffixType : values()) {
            if (publicSuffixType.getInnerNodeCode() == c || publicSuffixType.getLeafNodeCode() == c) {
                return publicSuffixType;
            }
        }
        Single$$ExternalSyntheticBUOutline0.m$3(BitVector$$ExternalSyntheticOutline0.m("No enum corresponding to given code: ", c));
        return null;
    }

    public char getInnerNodeCode() {
        return this.innerNodeCode;
    }

    public char getLeafNodeCode() {
        return this.leafNodeCode;
    }
}
