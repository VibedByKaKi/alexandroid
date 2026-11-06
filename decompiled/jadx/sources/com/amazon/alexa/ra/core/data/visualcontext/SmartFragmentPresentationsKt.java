package com.amazon.alexa.ra.core.data.visualcontext;

import com.amazon.alexa.ra.core.data.fragments.Display;
import com.amazon.alexa.ra.core.data.model.DisplayType;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"EXPANDED_ID_PREFIX", "", "displayTypeOf", "Lcom/amazon/alexa/ra/core/data/model/DisplayType;", "display", "Lcom/amazon/alexa/ra/core/data/fragments/Display;", "ui-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class SmartFragmentPresentationsKt {

    @NotNull
    private static final String EXPANDED_ID_PREFIX = "sf-expanded";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Display.values().length];
            try {
                iArr[Display.BLOCK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Display.CONTAINER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Display.ITEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Display.UNSUPPORTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisplayType displayTypeOf(Display display) {
        int i = WhenMappings.$EnumSwitchMapping$0[display.ordinal()];
        if (i == 1) {
            return DisplayType.BLOCK;
        }
        if (i == 2) {
            return DisplayType.CONTAINER;
        }
        if (i == 3) {
            return DisplayType.ITEM;
        }
        if (i == 4) {
            return null;
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }
}
