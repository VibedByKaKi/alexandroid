package com.amazon.alexa.voice.ui.onedesign.empty;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import com.amazon.alexa.vox.ui.onedesign.R;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class EmptyResourceBundleFactory implements Factory<EmptyResourceBundle, EmptiableCardType> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.voice.ui.onedesign.empty.EmptyResourceBundleFactory$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$voice$ui$onedesign$empty$EmptiableCardType;

        static {
            int[] iArr = new int[EmptiableCardType.values().length];
            $SwitchMap$com$amazon$alexa$voice$ui$onedesign$empty$EmptiableCardType = iArr;
            try {
                iArr[EmptiableCardType.CALENDAR_NOT_LINKED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$voice$ui$onedesign$empty$EmptiableCardType[EmptiableCardType.NO_CALENDAR_EVENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$voice$ui$onedesign$empty$EmptiableCardType[EmptiableCardType.SHOPPING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$alexa$voice$ui$onedesign$empty$EmptiableCardType[EmptiableCardType.TODOS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.empty.Factory
    public EmptyResourceBundle create(EmptiableCardType emptiableCardType) {
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$voice$ui$onedesign$empty$EmptiableCardType[emptiableCardType.ordinal()];
        if (i == 1) {
            return new EmptyResourceBundle(R.string.voice_ui_od_calendar_title, R.drawable.ic_voice_ui_od_calendar_light, R.string.voice_ui_od_calendar_no_linked_calendar, R.string.voice_ui_od_empty);
        }
        if (i == 2) {
            return new EmptyResourceBundle(R.string.voice_ui_od_calendar_title, R.drawable.ic_voice_ui_od_calendar_light, R.string.voice_ui_od_calendar_empty_no_events, R.string.voice_ui_od_calendar_empty_user_hint);
        }
        if (i == 3) {
            return new EmptyResourceBundle(R.string.voice_ui_od_list_shopping_title, R.drawable.ic_od_lists_72dp, R.string.voice_ui_od_list_empty_no_items, R.string.voice_ui_od_list_shopping_empty_user_hint);
        }
        if (i == 4) {
            return new EmptyResourceBundle(R.string.voice_ui_od_list_todo_title, R.drawable.ic_od_lists_72dp, R.string.voice_ui_od_list_empty_no_items, R.string.voice_ui_od_list_todo_empty_user_hint);
        }
        OnnxMap$$ExternalSyntheticBUOutline0.m(emptiableCardType, "Tried to create EmptyResourceBundle for unsupported card type: ");
        return null;
    }
}
