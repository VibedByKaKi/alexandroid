package io.ktor.http;

import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;
import io.ktor.util.InternalAPI;
import io.ktor.util.StringValuesBuilder;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\u0004H\u0002\u001a\f\u0010\t\u001a\u00020\u0004*\u00020\u0004H\u0007\u001a\u0019\u0010\n\u001a\u00020\u0001*\u00020\u00042\n\u0010\u000b\u001a\u00060\fj\u0002`\rH\u0082\b\u001a\f\u0010\u000e\u001a\u00020\u0004*\u00020\u0004H\u0007\u001a\u0018\u0010\u000f\u001a\u00020\u0001*\u00020\u00042\n\u0010\u000b\u001a\u00060\fj\u0002`\rH\u0002¨\u0006\u0010"}, d2 = {"append", "", "Lio/ktor/util/StringValuesBuilder;", "name", "", "value", "Lio/ktor/http/HeaderValueWithParameters;", "checkNeedEscape", "", "escapeIfNeeded", "escapeIfNeededTo", "out", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "quote", "quoteTo", "ktor-http"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final class HeaderValueWithParametersKt {
    public static final void append(@NotNull StringValuesBuilder stringValuesBuilder, @NotNull String str, @NotNull HeaderValueWithParameters headerValueWithParameters) {
        stringValuesBuilder.getClass();
        str.getClass();
        headerValueWithParameters.getClass();
        stringValuesBuilder.append(str, headerValueWithParameters.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean checkNeedEscape(@NotNull String str) {
        if (str.length() == 0) {
            return true;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\"' || charAt == ',' || charAt == '/' || charAt == ';' || charAt == '=' || charAt == '\\') {
                return true;
            }
        }
        return false;
    }

    @InternalAPI
    @NotNull
    public static final String escapeIfNeeded(@NotNull String str) {
        str.getClass();
        return checkNeedEscape(str) ? quote(str) : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void escapeIfNeededTo(@NotNull String str, StringBuilder sb) {
        if (checkNeedEscape(str)) {
            sb.append(quote(str));
        } else {
            sb.append(str);
        }
    }

    @InternalAPI
    @NotNull
    public static final String quote(@NotNull String str) {
        str.getClass();
        StringBuilder sb = new StringBuilder();
        quoteTo(str, sb);
        return sb.toString();
    }

    private static final void quoteTo(@NotNull String str, StringBuilder sb) {
        sb.append(DeviceConfigConstants.DOUBLE_QUOTE);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\n') {
                sb.append("\\n");
            } else if (charAt == '\r') {
                sb.append("\\r");
            } else if (charAt == '\"') {
                sb.append("\\\"");
            } else if (charAt != '\\') {
                sb.append(charAt);
            } else {
                sb.append("\\\\");
            }
        }
        sb.append(DeviceConfigConstants.DOUBLE_QUOTE);
    }
}
