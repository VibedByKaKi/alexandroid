package com.amazon.alexa.ra.core.ui.custom;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.platform.PlatformTextInputInterceptor;
import androidx.compose.ui.platform.PlatformTextInputMethodRequest;
import kotlin.Metadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class CustomTextFieldKt$CustomTextField$3$1 implements PlatformTextInputInterceptor {
    final /* synthetic */ boolean $keyboardMicEnabled;

    public CustomTextFieldKt$CustomTextField$3$1(boolean z) {
        this.$keyboardMicEnabled = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputConnection interceptStartInputMethod$lambda$1(PlatformTextInputMethodRequest platformTextInputMethodRequest, boolean z, EditorInfo editorInfo) {
        editorInfo.getClass();
        InputConnection createInputConnection = platformTextInputMethodRequest.createInputConnection(editorInfo);
        editorInfo.imeOptions = KeyboardMicSuppression.INSTANCE.imeOptions(editorInfo.imeOptions, z);
        return createInputConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.compose.ui.platform.PlatformTextInputInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object interceptStartInputMethod(final androidx.compose.ui.platform.PlatformTextInputMethodRequest r5, androidx.compose.ui.platform.PlatformTextInputSession r6, kotlin.coroutines.Continuation<?> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.amazon.alexa.ra.core.ui.custom.CustomTextFieldKt$CustomTextField$3$1$interceptStartInputMethod$1
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.alexa.ra.core.ui.custom.CustomTextFieldKt$CustomTextField$3$1$interceptStartInputMethod$1 r0 = (com.amazon.alexa.ra.core.ui.custom.CustomTextFieldKt$CustomTextField$3$1$interceptStartInputMethod$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amazon.alexa.ra.core.ui.custom.CustomTextFieldKt$CustomTextField$3$1$interceptStartInputMethod$1 r0 = new com.amazon.alexa.ra.core.ui.custom.CustomTextFieldKt$CustomTextField$3$1$interceptStartInputMethod$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 == r3) goto L2c
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r4)
        L2a:
            r4 = 0
            return r4
        L2c:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L43
        L30:
            kotlin.ResultKt.throwOnFailure(r7)
            boolean r4 = r4.$keyboardMicEnabled
            com.amazon.alexa.ra.core.ui.custom.CustomTextFieldKt$CustomTextField$3$1$$ExternalSyntheticLambda0 r7 = new com.amazon.alexa.ra.core.ui.custom.CustomTextFieldKt$CustomTextField$3$1$$ExternalSyntheticLambda0
            r7.<init>()
            r0.label = r3
            java.lang.Object r4 = r6.startInputMethod(r7, r0)
            if (r4 != r1) goto L43
            return r1
        L43:
            io.ktor.util.PathKt$$ExternalSyntheticBUOutline0.m$1()
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.ra.core.ui.custom.CustomTextFieldKt$CustomTextField$3$1.interceptStartInputMethod(androidx.compose.ui.platform.PlatformTextInputMethodRequest, androidx.compose.ui.platform.PlatformTextInputSession, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
