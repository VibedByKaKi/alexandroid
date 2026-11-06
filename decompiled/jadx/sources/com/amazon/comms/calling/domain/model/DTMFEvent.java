package com.amazon.comms.calling.domain.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/comms/calling/domain/model/DTMFEvent;", "", "<init>", "()V", "NewDialedChar", "Lcom/amazon/comms/calling/domain/model/DTMFEvent$NewDialedChar;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public abstract class DTMFEvent {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/comms/calling/domain/model/DTMFEvent$NewDialedChar;", "Lcom/amazon/comms/calling/domain/model/DTMFEvent;", "newChar", "", "<init>", "(Ljava/lang/String;)V", "getNewChar", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NewDialedChar extends DTMFEvent {

        @NotNull
        private final String newChar;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewDialedChar(@NotNull String str) {
            super(null);
            str.getClass();
            this.newChar = str;
        }

        public static /* synthetic */ NewDialedChar copy$default(NewDialedChar newDialedChar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = newDialedChar.newChar;
            }
            return newDialedChar.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getNewChar() {
            return this.newChar;
        }

        @NotNull
        public final NewDialedChar copy(@NotNull String newChar) {
            newChar.getClass();
            return new NewDialedChar(newChar);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NewDialedChar) && Intrinsics.areEqual(this.newChar, ((NewDialedChar) other).newChar);
        }

        @NotNull
        public final String getNewChar() {
            return this.newChar;
        }

        public int hashCode() {
            return this.newChar.hashCode();
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("NewDialedChar(newChar=", this.newChar, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    public /* synthetic */ DTMFEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DTMFEvent() {
    }
}
