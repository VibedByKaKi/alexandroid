package com.amazon.identity.auth.device;

import android.os.Bundle;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.util.HashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class i7 {
    public static void a(Bundle bundle) {
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof Enum) {
                bundle.putString(str, obj.toString());
            }
        }
    }

    public static String b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(MarkdownConstants.LEFT_BRACKET);
        for (String str : bundle.keySet()) {
            sb.append(str);
            sb.append("=");
            sb.append(bundle.get(str));
            sb.append(", ");
        }
        sb.append(MarkdownConstants.RIGHT_BRACKET);
        return sb.toString();
    }

    public static HashMap c(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof String) {
                hashMap.put(str, (String) obj);
            }
        }
        return hashMap;
    }
}
