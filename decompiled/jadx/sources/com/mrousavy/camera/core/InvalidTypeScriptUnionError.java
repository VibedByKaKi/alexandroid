package com.mrousavy.camera.core;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/mrousavy/camera/core/InvalidTypeScriptUnionError;", "Lcom/mrousavy/camera/core/CameraError;", "unionName", "", "unionValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "react-native-vision-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InvalidTypeScriptUnionError extends CameraError {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidTypeScriptUnionError(@NotNull String str, @Nullable String str2) {
        super("parameter", "invalid-parameter", "The given value for " + str + " could not be parsed! (Received: " + str2 + MarkdownConstants.RIGHT_PARENTHESIS, null, 8, null);
        str.getClass();
    }
}
