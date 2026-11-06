package com.amazon.alexa.redesign.utils;

import android.view.View;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tJ\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0002¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/redesign/utils/TestIdUtil;", "", "<init>", "()V", "setTestId", "", "itemView", "Landroid/view/View;", "contentProvider", "", "contentType", "prefix", "formatAutomationString", "old", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class TestIdUtil {
    public static final int $stable = 0;

    @NotNull
    public static final TestIdUtil INSTANCE = new TestIdUtil();

    private TestIdUtil() {
    }

    private final String formatAutomationString(String old) {
        String replace$default;
        replace$default = StringsKt__StringsJVMKt.replace$default(old, " ", "_", false, 4, (Object) null);
        String lowerCase = replace$default.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }

    public final void setTestId(@NotNull View itemView, @NotNull String contentProvider, @NotNull String contentType, @NotNull String prefix) {
        itemView.getClass();
        contentProvider.getClass();
        contentType.getClass();
        prefix.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(contentProvider);
        itemView.setContentDescription(formatAutomationString(ErrorUtils$$ExternalSyntheticOutline0.m(sb, "_", contentType, prefix)));
    }
}
