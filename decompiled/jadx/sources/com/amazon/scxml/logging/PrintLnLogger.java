package com.amazon.scxml.logging;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessorykit.ModelTransformer;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002J\u001a\u0010\n\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J\u001a\u0010\u000b\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J\u001a\u0010\f\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J\u001a\u0010\r\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J\u001a\u0010\u000e\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¨\u0006\u000f"}, d2 = {"Lcom/amazon/scxml/logging/PrintLnLogger;", "Lcom/amazon/scxml/logging/Logger;", "<init>", "()V", "printMessage", "", ModelTransformer.KEY_BATTERY_LEVEL, "", "tag", "message", "e", "w", "v", "d", "i", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PrintLnLogger implements Logger {
    private final void printMessage(String level, String tag, String message) {
        if (tag == null) {
            tag = "";
        }
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m(MarkdownConstants.LEFT_BRACKET, level, "]:[", tag, "] ");
        m.append(message);
        System.out.println((Object) m.toString());
    }

    @Override // com.amazon.scxml.logging.Logger
    public void d(@Nullable String tag, @NotNull String message) {
        message.getClass();
        printMessage("DEBUG", tag, message);
    }

    @Override // com.amazon.scxml.logging.Logger
    public void e(@Nullable String tag, @NotNull String message) {
        message.getClass();
        printMessage("ERROR", tag, message);
    }

    @Override // com.amazon.scxml.logging.Logger
    public void i(@Nullable String tag, @NotNull String message) {
        message.getClass();
        printMessage("INFO", tag, message);
    }

    @Override // com.amazon.scxml.logging.Logger
    public void v(@Nullable String tag, @NotNull String message) {
        message.getClass();
        printMessage("VERBOSE", tag, message);
    }

    @Override // com.amazon.scxml.logging.Logger
    public void w(@Nullable String tag, @NotNull String message) {
        message.getClass();
        printMessage("WARN", tag, message);
    }
}
