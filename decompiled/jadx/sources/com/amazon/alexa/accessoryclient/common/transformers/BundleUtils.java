package com.amazon.alexa.accessoryclient.common.transformers;

import android.os.Bundle;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import androidx.room.Room$$ExternalSyntheticBUOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.util.Arrays;
import java.util.Iterator;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class BundleUtils {
    private BundleUtils() {
    }

    public static void assertEqualsBundle(Bundle bundle, Bundle bundle2) {
        if (equalsBundle(bundle, bundle2)) {
            return;
        }
        Room$$ExternalSyntheticBUOutline0.m$1("Bundle a: ", bundleToString(bundle), " is not equal to bundle b: ", bundleToString(bundle2));
    }

    public static String bundleToString(Bundle bundle) {
        return bundle == null ? "null!" : bundleToStringIndent(bundle, "");
    }

    private static String bundleToStringIndent(Bundle bundle, String str) {
        StringBuilder sb = new StringBuilder("{");
        if (!bundle.keySet().isEmpty()) {
            AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, "\n", str, str, "keys: ");
            sb.append(Arrays.toString(bundle.keySet().toArray()));
            sb.append("\n");
            sb.append(str);
            sb.append(str);
            sb.append("values: ");
            Iterator<String> it2 = bundle.keySet().iterator();
            while (it2.hasNext()) {
                Object obj = bundle.get(it2.next());
                if (obj instanceof Bundle) {
                    AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, "\n", str, str, MarkdownConstants.LEFT_BRACKET);
                    sb.append(bundleToStringIndent((Bundle) obj, BitVector$$ExternalSyntheticOutline0.m(str, "  ")));
                    sb.append("] ");
                } else {
                    AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, "\n", str, str, MarkdownConstants.LEFT_BRACKET);
                    sb.append(obj);
                    sb.append("] ");
                }
            }
            sb.append("\n");
            sb.append(str);
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public static boolean equalsBundle(Bundle bundle, Bundle bundle2) {
        if (!bundle.keySet().equals(bundle2.keySet())) {
            return false;
        }
        loop0: while (true) {
            boolean z = true;
            for (String str : bundle.keySet()) {
                Object obj = bundle2.get(str);
                Object obj2 = bundle.get(str);
                if (obj2 != null || obj != null) {
                    if (obj2 == null || obj == null || obj2.getClass() != obj.getClass()) {
                        return false;
                    }
                    if (obj2 instanceof Bundle) {
                        if (z && equalsBundle((Bundle) obj2, (Bundle) obj)) {
                            break;
                        }
                        z = false;
                    } else {
                        if (z && obj2.equals(obj)) {
                            break;
                        }
                        z = false;
                    }
                }
            }
            return z;
        }
        return false;
    }
}
