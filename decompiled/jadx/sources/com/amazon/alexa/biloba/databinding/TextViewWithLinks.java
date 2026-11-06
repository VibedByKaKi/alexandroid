package com.amazon.alexa.biloba.databinding;

import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.databinding.BindingAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class TextViewWithLinks {
    private TextViewWithLinks() {
    }

    @BindingAdapter({"textViewHasLinks"})
    public static void setTextViewHasLinks(TextView textView, Boolean bool) {
        if (bool.booleanValue()) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }
}
