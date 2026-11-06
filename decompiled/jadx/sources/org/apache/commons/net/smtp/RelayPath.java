package org.apache.commons.net.smtp;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import java.util.Enumeration;
import java.util.Vector;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class RelayPath {
    private final String emailAddress;
    private final Vector<String> path = new Vector<>();

    public RelayPath(String str) {
        this.emailAddress = str;
    }

    public void addRelay(String str) {
        this.path.addElement(str);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        Enumeration<String> elements = this.path.elements();
        if (elements.hasMoreElements()) {
            sb.append('@');
            sb.append(elements.nextElement());
            while (elements.hasMoreElements()) {
                sb.append(",@");
                sb.append(elements.nextElement());
            }
            sb.append(AbstractJsonLexerKt.COLON);
        }
        return ArcMode$$ExternalSyntheticOutline0.m(Typography.greater, this.emailAddress, sb);
    }
}
