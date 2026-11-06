package com.amazon.alexa.voice.ui.onedesign.util;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import androidx.core.view.ViewCompat;
import com.amazon.alexa.voice.ui.tta.search.ItemPosition;
import com.amazon.alexa.vox.ui.onedesign.R;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class DrawableUtils {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.voice.ui.onedesign.util.DrawableUtils$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$voice$ui$onedesign$util$BottomSheetPillsState;
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$voice$ui$tta$search$ItemPosition;

        static {
            int[] iArr = new int[BottomSheetPillsState.values().length];
            $SwitchMap$com$amazon$alexa$voice$ui$onedesign$util$BottomSheetPillsState = iArr;
            try {
                iArr[BottomSheetPillsState.FADED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            int[] iArr2 = new int[ItemPosition.values().length];
            $SwitchMap$com$amazon$alexa$voice$ui$tta$search$ItemPosition = iArr2;
            try {
                iArr2[ItemPosition.FIRST.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$voice$ui$tta$search$ItemPosition[ItemPosition.LAST.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$alexa$voice$ui$tta$search$ItemPosition[ItemPosition.MID.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private DrawableUtils() {
        throw new IllegalStateException("No instances!");
    }

    public static Drawable createSeparatorDrawable(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.voiceOdLineSeparatorColor});
        int color = obtainStyledAttributes.getColor(0, ViewCompat.MEASURED_STATE_MASK);
        obtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.setIntrinsicHeight(DisplayUtils.transformDpiToPx(context, 1));
        shapeDrawable.getPaint().setColor(color);
        return shapeDrawable;
    }

    public static Drawable getBackgroundForAlexaMessageViewHolder(Context context, ItemPosition itemPosition, boolean z) {
        if (z) {
            int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$voice$ui$tta$search$ItemPosition[itemPosition.ordinal()];
            return i != 2 ? i != 3 ? context.getDrawable(R.drawable.remarkable_alexa_ui_response_message_top_background) : context.getDrawable(R.drawable.remarkable_alexa_ui_response_message_mid_background) : context.getDrawable(R.drawable.remarkable_alexa_ui_response_message_bottom_background);
        }
        int i2 = AnonymousClass1.$SwitchMap$com$amazon$alexa$voice$ui$tta$search$ItemPosition[itemPosition.ordinal()];
        return i2 != 2 ? i2 != 3 ? context.getDrawable(R.drawable.bottomsheet_ui_alexa_message_top_background) : context.getDrawable(R.drawable.bottomsheet_ui_alexa_message_mid_background) : context.getDrawable(R.drawable.bottomsheet_ui_alexa_message_bottom_background);
    }

    public static Drawable getBackgroundForBottomSheetInChatViewHolder(Context context, ItemPosition itemPosition) {
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$voice$ui$tta$search$ItemPosition[itemPosition.ordinal()];
        return i != 1 ? i != 2 ? context.getDrawable(R.drawable.bottom_sheet_ui_card_view_mid_item_background) : context.getDrawable(R.drawable.bottom_sheet_ui_card_view_bottom_item_background) : context.getDrawable(R.drawable.bottom_sheet_ui_card_view_top_item_background);
    }

    public static Drawable getBackgroundForInChatViewHolder(Context context, ItemPosition itemPosition) {
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$voice$ui$tta$search$ItemPosition[itemPosition.ordinal()];
        return i != 1 ? i != 2 ? context.getDrawable(R.drawable.text_ui_od_alexa_in_chat_mid_background) : context.getDrawable(R.drawable.text_ui_od_alexa_in_chat_bottom_background) : context.getDrawable(R.drawable.text_ui_od_alexa_in_chat_top_background);
    }

    public static Drawable getBackgroundForPills(Context context, BottomSheetPillsState bottomSheetPillsState) {
        return AnonymousClass1.$SwitchMap$com$amazon$alexa$voice$ui$onedesign$util$BottomSheetPillsState[bottomSheetPillsState.ordinal()] != 1 ? context.getDrawable(R.drawable.bottomsheet_ui_pill_result_background) : context.getDrawable(R.drawable.bottomsheet_ui_pill_result_background_disabled);
    }
}
