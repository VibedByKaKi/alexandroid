package com.amazon.clouddrive.extended.model.filters;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.deecomms.common.Constants;
import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;
import com.fasterxml.jackson.core.JsonPointer;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.objectweb.asm.signature.SignatureVisitor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class NodeNameFilter implements NodeFilterBuilder {
    private static final Set<Character> ESCAPED_CHARACTERS = new HashSet(Arrays.asList(Character.valueOf(SignatureVisitor.EXTENDS), '-', Character.valueOf(Typography.amp), '|', '!', '(', ')', Character.valueOf(AbstractJsonLexerKt.BEGIN_OBJ), Character.valueOf(AbstractJsonLexerKt.END_OBJ), Character.valueOf(AbstractJsonLexerKt.BEGIN_LIST), Character.valueOf(AbstractJsonLexerKt.END_LIST), '^', '\'', '\"', Character.valueOf(JsonPointer.ESC), '*', Character.valueOf(Constants.DEFAULT_IMAGE_CHAR), Character.valueOf(AbstractJsonLexerKt.COLON), '\\', ' '));
    private static final String NAME = "name:";
    private String nodeName;

    public static NodeNameFilter byName(String str) {
        NodeNameFilter nodeNameFilter = new NodeNameFilter();
        nodeNameFilter.nodeName = getEscapedName(str);
        return nodeNameFilter;
    }

    private static String getEscapedName(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            sb.append(ESCAPED_CHARACTERS.contains(Character.valueOf(c)) ? BitVector$$ExternalSyntheticOutline0.m("\\", c) : Character.valueOf(c));
        }
        return sb.toString();
    }

    @Override // com.amazon.clouddrive.extended.model.filters.NodeFilterBuilder
    public String buildFilterQuery() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("name:\""), this.nodeName, DeviceConfigConstants.DOUBLE_QUOTE);
    }
}
