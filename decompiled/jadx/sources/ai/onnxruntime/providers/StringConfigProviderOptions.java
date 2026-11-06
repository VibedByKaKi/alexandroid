package ai.onnxruntime.providers;

import ai.onnxruntime.OrtException;
import ai.onnxruntime.OrtProviderOptions;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import rx.Single$$ExternalSyntheticBUOutline0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public abstract class StringConfigProviderOptions extends OrtProviderOptions {
    protected final Map<String, String> options;

    public StringConfigProviderOptions(long j) {
        super(j);
        this.options = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getOptionsString$0(Map.Entry entry) {
        return ((String) entry.getKey()) + "=" + ((String) entry.getValue());
    }

    public void add(String str, String str2) throws OrtException {
        checkClosed();
        Objects.requireNonNull(str, "Key must not be null");
        Objects.requireNonNull(str2, "Value must not be null");
        this.options.put(str, str2);
    }

    @Override // ai.onnxruntime.OrtProviderOptions
    public void applyToNative() throws OrtException {
        if (this.options.isEmpty()) {
            return;
        }
        String[] strArr = new String[this.options.size()];
        String[] strArr2 = new String[this.options.size()];
        int i = 0;
        for (Map.Entry<String, String> entry : this.options.entrySet()) {
            strArr[i] = entry.getKey();
            strArr2[i] = entry.getValue();
            i++;
        }
        applyToNative(OrtProviderOptions.getApiHandle(), this.nativeHandle, strArr, strArr2);
    }

    public abstract void applyToNative(long j, long j2, String[] strArr, String[] strArr2) throws OrtException;

    public String getOptionsString() {
        return (String) this.options.entrySet().stream().map(new StringConfigProviderOptions$$ExternalSyntheticLambda0()).collect(Collectors.joining(";", "", ";"));
    }

    public void parseOptionsString(String str) throws OrtException {
        for (String str2 : str.split(";")) {
            if (str2.contains("=")) {
                String[] split = str2.split("=");
                if (split.length != 2 || split[0].isEmpty() || split[1].isEmpty()) {
                    Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Failed to parse option from string '", str2, "'"));
                    return;
                }
                add(split[0], split[1]);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(MarkdownConstants.LEFT_PARENTHESIS);
        return a$$ExternalSyntheticOutline0.m(sb, getOptionsString(), MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
