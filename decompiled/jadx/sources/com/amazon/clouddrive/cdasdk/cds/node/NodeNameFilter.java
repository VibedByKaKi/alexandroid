package com.amazon.clouddrive.cdasdk.cds.node;

import androidx.annotation.NonNull;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.deecomms.common.Constants;
import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;
import com.fasterxml.jackson.core.JsonPointer;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import lombok.Generated;
import org.objectweb.asm.signature.SignatureVisitor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class NodeNameFilter {

    @NonNull
    private final String filter;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private static final Set<Character> ESCAPED_CHARACTERS = new HashSet(Arrays.asList(Character.valueOf(SignatureVisitor.EXTENDS), '-', Character.valueOf(Typography.amp), '|', '!', '(', ')', Character.valueOf(AbstractJsonLexerKt.BEGIN_OBJ), Character.valueOf(AbstractJsonLexerKt.END_OBJ), Character.valueOf(AbstractJsonLexerKt.BEGIN_LIST), Character.valueOf(AbstractJsonLexerKt.END_LIST), '^', '\'', '\"', Character.valueOf(JsonPointer.ESC), '*', Character.valueOf(Constants.DEFAULT_IMAGE_CHAR), Character.valueOf(AbstractJsonLexerKt.COLON), '\\', ' '));
        private static final String NAME = "name:";

        @NonNull
        private final String nodeName;

        @Generated
        public Builder(@NonNull String str) {
            if (str != null) {
                this.nodeName = str;
            } else {
                Single$$ExternalSyntheticBUOutline0.m$1("nodeName is marked non-null but is null");
                throw null;
            }
        }

        private String getEscapedName() {
            StringBuilder sb = new StringBuilder();
            for (char c : this.nodeName.toCharArray()) {
                sb.append(ESCAPED_CHARACTERS.contains(Character.valueOf(c)) ? BitVector$$ExternalSyntheticOutline0.m("\\", c) : Character.valueOf(c));
            }
            return sb.toString();
        }

        public NodeNameFilter build() {
            return new NodeNameFilter(a$$ExternalSyntheticOutline0.m(new StringBuilder("name:\""), getEscapedName(), DeviceConfigConstants.DOUBLE_QUOTE));
        }
    }

    @Generated
    public NodeNameFilter(@NonNull String str) {
        if (str != null) {
            this.filter = str;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("filter is marked non-null but is null");
            throw null;
        }
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NodeNameFilter)) {
            return false;
        }
        String filter = getFilter();
        String filter2 = ((NodeNameFilter) obj).getFilter();
        return filter != null ? filter.equals(filter2) : filter2 == null;
    }

    @NonNull
    @Generated
    public String getFilter() {
        return this.filter;
    }

    @Generated
    public int hashCode() {
        String filter = getFilter();
        return 59 + (filter == null ? 43 : filter.hashCode());
    }

    @Generated
    public String toString() {
        return "NodeNameFilter(filter=" + getFilter() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
