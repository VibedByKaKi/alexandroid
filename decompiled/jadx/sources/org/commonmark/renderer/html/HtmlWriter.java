package org.commonmark.renderer.html;

import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.commonmark.internal.util.Escaping;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class HtmlWriter {
    private static final Map<String, String> NO_ATTRIBUTES = Collections.EMPTY_MAP;
    private final Appendable buffer;
    private char lastChar = 0;

    public HtmlWriter(Appendable appendable) {
        if (appendable != null) {
            this.buffer = appendable;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("out must not be null");
            throw null;
        }
    }

    public void append(String str) {
        try {
            this.buffer.append(str);
            int length = str.length();
            if (length != 0) {
                this.lastChar = str.charAt(length - 1);
            }
        } catch (IOException e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
        }
    }

    public void line() {
        char c = this.lastChar;
        if (c == 0 || c == '\n') {
            return;
        }
        append("\n");
    }

    public void raw(String str) {
        append(str);
    }

    public void tag(String str, Map<String, String> map, boolean z) {
        append("<");
        append(str);
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                append(" ");
                append(Escaping.escapeHtml(entry.getKey()));
                append("=\"");
                append(Escaping.escapeHtml(entry.getValue()));
                append(DeviceConfigConstants.DOUBLE_QUOTE);
            }
        }
        if (z) {
            append(" /");
        }
        append(">");
    }

    public void text(String str) {
        append(Escaping.escapeHtml(str));
    }

    public void tag(String str, Map<String, String> map) {
        tag(str, map, false);
    }

    public void tag(String str) {
        tag(str, NO_ATTRIBUTES);
    }
}
