package com.upokecenter.cbor;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.http.CodecsKt$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
class CharacterInputWithCount implements ICharacterInput {
    private final ICharacterInput ci;
    private int offset;

    public CharacterInputWithCount(ICharacterInput iCharacterInput) {
        this.ci = iCharacterInput;
    }

    private String NewErrorString(String str) {
        return a$$ExternalSyntheticOutline0.m(a$$ExternalSyntheticOutline0.m1m(str, " (offset "), GetOffset(), MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public int GetOffset() {
        return this.offset;
    }

    public void RaiseError(Exception exc) {
        if (exc.getCause() != null) {
            throw new CBORException(NewErrorString(exc.getMessage()), exc.getCause());
        }
        throw new CBORException(NewErrorString(exc.getMessage()), exc);
    }

    @Override // com.upokecenter.cbor.ICharacterInput
    public int Read(int[] iArr, int i, int i2) {
        if (iArr == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("chars");
            return 0;
        }
        if (i < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "index(", ") is less than 0"));
            return 0;
        }
        if (i > iArr.length) {
            Single$$ExternalSyntheticBUOutline0.m(iArr.length, a$$ExternalSyntheticOutline0.m0m(i, "index(", ") is more than "));
            return 0;
        }
        if (i2 < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i2, "length(", ") is less than 0"));
            return 0;
        }
        if (i2 > iArr.length) {
            Single$$ExternalSyntheticBUOutline0.m(iArr.length, a$$ExternalSyntheticOutline0.m0m(i2, "length(", ") is more than "));
            return 0;
        }
        if (iArr.length - i < i2) {
            CodecsKt$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m0m(i, "chars's length minus ", MarkdownConstants.LEFT_PARENTHESIS), iArr.length - i, ") is less than ", i2);
            return 0;
        }
        int Read = this.ci.Read(iArr, i, i2);
        if (Read > 0) {
            this.offset += Read;
        }
        return Read;
    }

    @Override // com.upokecenter.cbor.ICharacterInput
    public int ReadChar() {
        int i;
        try {
            i = this.ci.ReadChar();
        } catch (IllegalStateException e) {
            RaiseError(e);
            i = -1;
        }
        if (i >= 0) {
            this.offset++;
        }
        return i;
    }

    public void RaiseError(String str) {
        throw new CBORException(NewErrorString(str));
    }
}
