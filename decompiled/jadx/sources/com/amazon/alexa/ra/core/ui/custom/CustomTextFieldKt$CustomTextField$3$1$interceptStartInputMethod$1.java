package com.amazon.alexa.ra.core.ui.custom;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.amazon.alexa.ra.core.ui.custom.CustomTextFieldKt$CustomTextField$3$1", f = "CustomTextField.kt", i = {}, l = {202}, m = "interceptStartInputMethod", n = {}, s = {})
/* loaded from: classes18.dex */
public final class CustomTextFieldKt$CustomTextField$3$1$interceptStartInputMethod$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CustomTextFieldKt$CustomTextField$3$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTextFieldKt$CustomTextField$3$1$interceptStartInputMethod$1(CustomTextFieldKt$CustomTextField$3$1 customTextFieldKt$CustomTextField$3$1, Continuation<? super CustomTextFieldKt$CustomTextField$3$1$interceptStartInputMethod$1> continuation) {
        super(continuation);
        this.this$0 = customTextFieldKt$CustomTextField$3$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.interceptStartInputMethod(null, null, this);
    }
}
