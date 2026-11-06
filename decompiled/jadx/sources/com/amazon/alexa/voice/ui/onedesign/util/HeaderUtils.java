package com.amazon.alexa.voice.ui.onedesign.util;

import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.font.Font;
import com.amazon.alexa.voice.ui.onedesign.widget.ContentLayout;
import com.amazon.alexa.vox.ui.onedesign.R;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class HeaderUtils {
    private HeaderUtils() {
    }

    public static void applyFontStyles(@NonNull TextView textView, @Nullable TextView textView2) {
        FontUtils.apply(Font.APP_TEXT_BOLD, textView);
        LetterSpacing.apply(R.dimen.voice_ui_od_font_letter_spacing, textView);
        if (textView2 != null) {
            FontUtils.apply(Font.APP_TEXT_REGULAR, textView);
        }
    }

    public static void setupDragClosure(ContentLayout contentLayout, final Callable<Void> callable, final String str) {
        contentLayout.setOnContentListener(new ContentLayout.OnContentListener() { // from class: com.amazon.alexa.voice.ui.onedesign.util.HeaderUtils.1
            @Override // com.amazon.alexa.voice.ui.onedesign.widget.ContentLayout.OnContentListener
            public void onDismiss() {
                try {
                    callable.call();
                } catch (Exception unused) {
                }
            }

            @Override // com.amazon.alexa.voice.ui.onedesign.widget.ContentLayout.OnContentListener
            public void onCollapsed() {
            }

            @Override // com.amazon.alexa.voice.ui.onedesign.widget.ContentLayout.OnContentListener
            public void onExpanded() {
            }

            @Override // com.amazon.alexa.voice.ui.onedesign.widget.ContentLayout.OnContentListener
            public void onDragged(int i, int i2, int i3, boolean z, boolean z2) {
            }
        });
    }

    public static void applyFontStyles(@NonNull TextView textView) {
        applyFontStyles(textView, null);
    }
}
