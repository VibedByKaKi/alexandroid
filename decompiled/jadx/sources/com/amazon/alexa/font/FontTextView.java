package com.amazon.alexa.font;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.VisibleForTesting;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u001f\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0001¢\u0006\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/font/FontTextView;", "Landroid/widget/TextView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "applyFontFromAttributes", "", "applyFontFromAttributes$AlexaMobileAndroidFont_release", "AlexaMobileAndroidFont_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFontTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontTextView.kt\ncom/amazon/alexa/font/FontTextView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"})
/* loaded from: classes17.dex */
public class FontTextView extends TextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        applyFontFromAttributes$AlexaMobileAndroidFont_release(context, attributeSet);
    }

    @VisibleForTesting
    public final void applyFontFromAttributes$AlexaMobileAndroidFont_release(@NotNull Context context, @Nullable AttributeSet attrs) {
        context.getClass();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.FontTextView);
        obtainStyledAttributes.getClass();
        int i = obtainStyledAttributes.getInt(R.styleable.FontTextView_fontName, R.font.ember_regular);
        obtainStyledAttributes.recycle();
        Font fromInt = Font.INSTANCE.fromInt(i);
        super.setTypeface(fromInt != null ? FontResolver.getFont(context, fromInt) : null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontTextView(@NotNull Context context) {
        super(context);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        applyFontFromAttributes$AlexaMobileAndroidFont_release(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        applyFontFromAttributes$AlexaMobileAndroidFont_release(context, attributeSet);
    }
}
