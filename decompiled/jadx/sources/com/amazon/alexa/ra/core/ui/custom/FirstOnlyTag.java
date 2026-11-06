package com.amazon.alexa.ra.core.ui.custom;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u0004\u0018\u00010\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/custom/FirstOnlyTag;", "", "tag", "", "<init>", "(Ljava/lang/String;)V", "handedOut", "", "next", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConversationScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationScreen.kt\ncom/amazon/alexa/ra/core/ui/custom/FirstOnlyTag\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3421:1\n1#2:3422\n*E\n"})
/* loaded from: classes18.dex */
public final class FirstOnlyTag {
    public static final int $stable = 8;
    private boolean handedOut;

    @NotNull
    private final String tag;

    public FirstOnlyTag(@NotNull String str) {
        str.getClass();
        this.tag = str;
    }

    @Nullable
    public final String next() {
        if (this.handedOut) {
            return null;
        }
        String str = this.tag;
        this.handedOut = true;
        return str;
    }
}
