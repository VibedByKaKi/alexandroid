package com.amazon.alexa.ra.cards.utils;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"applyColor", "Landroid/text/Spanned;", "color", "Landroidx/compose/ui/graphics/Color;", "applyColor-4WTKRHQ", "(Landroid/text/Spanned;J)Landroid/text/Spanned;", "AVSMobileFramework-ra-cards-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class FragmentMarkdownProcessorKt {
    @NotNull
    /* renamed from: applyColor-4WTKRHQ, reason: not valid java name */
    public static final Spanned m17685applyColor4WTKRHQ(@NotNull Spanned spanned, long j) {
        spanned.getClass();
        SpannableString spannableString = new SpannableString(spanned);
        spannableString.setSpan(new ForegroundColorSpan(ColorKt.m4698toArgb8_81llA(j)), 0, spannableString.length(), 33);
        return spannableString;
    }
}
