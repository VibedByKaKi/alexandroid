package com.facebook.react.views.text.internal.span;

import android.text.SpannableStringBuilder;
import com.facebook.common.logging.FLog;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/facebook/react/views/text/internal/span/SetSpanOperation;", "", "start", "", "end", "what", "Lcom/facebook/react/views/text/internal/span/ReactSpan;", "<init>", "(IILcom/facebook/react/views/text/internal/span/ReactSpan;)V", "execute", "", "builder", "Landroid/text/SpannableStringBuilder;", "priorityIndex", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SetSpanOperation {
    public static final int SPAN_MAX_PRIORITY = 255;

    @NotNull
    private static final String TAG = "SetSpanOperation";
    private final int end;
    private final int start;

    @JvmField
    @NotNull
    public final ReactSpan what;

    public SetSpanOperation(int i, int i2, @NotNull ReactSpan reactSpan) {
        reactSpan.getClass();
        this.start = i;
        this.end = i2;
        this.what = reactSpan;
    }

    public final void execute(@NotNull SpannableStringBuilder builder, int priorityIndex) {
        builder.getClass();
        if (priorityIndex < 0) {
            Single$$ExternalSyntheticBUOutline0.m$2("Check failed.");
            return;
        }
        int i = this.start == 0 ? 18 : 34;
        int i2 = 255 - priorityIndex;
        if (i2 < 0) {
            FLog.w(TAG, "Text tree size exceeded the limit, styling may become unpredictable");
        }
        builder.setSpan(this.what, this.start, this.end, ((Math.max(i2, 0) << 16) & 16711680) | (i & (-16711681)));
    }
}
