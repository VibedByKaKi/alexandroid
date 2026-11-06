package com.amazon.comms.calling.presentation.ui.extensions;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import com.amazon.alexa.smarthomecameras.view.PortraitCameraView$$ExternalSyntheticLambda4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a,\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004H\u0007¨\u0006\u0006"}, d2 = {"setDrawableTouchListener", "", "Landroid/widget/EditText;", "onRightDrawableTouched", "Lkotlin/Function0;", "onLeftDrawableTouched", "AlexaCommsCallingUI-Android_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class EditTextExtKt {
    @SuppressLint({"ClickableViewAccessibility"})
    public static final void setDrawableTouchListener(@NotNull EditText editText, @NotNull Function0<Unit> function0, @Nullable Function0<Unit> function02) {
        editText.getClass();
        function0.getClass();
        editText.setOnTouchListener(new PortraitCameraView$$ExternalSyntheticLambda4(editText, function0, function02, 2));
    }

    public static /* synthetic */ void setDrawableTouchListener$default(EditText editText, Function0 function0, Function0 function02, int i, Object obj) {
        if ((i & 2) != 0) {
            function02 = null;
        }
        setDrawableTouchListener(editText, function0, function02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setDrawableTouchListener$lambda$0(EditText editText, Function0 function0, Function0 function02, View view, MotionEvent motionEvent) {
        view.getClass();
        motionEvent.getClass();
        if (motionEvent.getAction() == 1) {
            Drawable drawable = editText.getCompoundDrawables()[2];
            Drawable drawable2 = editText.getCompoundDrawables()[0];
            if (drawable != null) {
                if (motionEvent.getRawX() >= editText.getRight() - drawable.getBounds().width()) {
                    function0.invoke();
                    return true;
                }
            } else if (drawable2 != null) {
                if (motionEvent.getRawX() <= drawable2.getBounds().width()) {
                    if (function02 == null) {
                        function0.invoke();
                    } else {
                        function02.invoke();
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
