package com.amazon.alexa.assistant.capability.text;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.assistant.foundation.model.EventAttachment;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.alexa.sharing.api.models.Payload;
import com.amazon.devicesetup.common.v1.RegistrationState;
import java.util.List;
import kotlin.Metadata;
import kotlin.UInt;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001:\u0001.BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u001f\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010!\u001a\u00020\"H\u0016J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\b&J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\t\u0010)\u001a\u00020\fHÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J^\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0001¢\u0006\u0002\b,J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006/"}, d2 = {"Lcom/amazon/alexa/assistant/capability/text/InputText;", "", "value", "", "muteResponse", "", "timeout", "Lkotlin/UInt;", "dialogRequestId", "extras", "Lcom/amazon/alexa/assistant/capability/text/TextDialogExtras;", "inputType", "Lcom/amazon/alexa/assistant/capability/text/InputText$InputType;", Payload.SERIALIZED_NAME_ATTACHMENTS, "", "Lcom/amazon/alexa/assistant/foundation/model/EventAttachment;", "<init>", "(Ljava/lang/String;ZLkotlin/UInt;Ljava/lang/String;Lcom/amazon/alexa/assistant/capability/text/TextDialogExtras;Lcom/amazon/alexa/assistant/capability/text/InputText$InputType;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getValue", "()Ljava/lang/String;", "getMuteResponse", "()Z", "getTimeout-0hXNFcg", "()Lkotlin/UInt;", "getDialogRequestId", "getExtras", "()Lcom/amazon/alexa/assistant/capability/text/TextDialogExtras;", "getInputType", "()Lcom/amazon/alexa/assistant/capability/text/InputText$InputType;", "getAttachments", "()Ljava/util/List;", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "component1", "component2", "component3", "component3-0hXNFcg", "component4", "component5", "component6", "component7", "copy", "copy-t95Z3-0", "toString", "InputType", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class InputText {

    @NotNull
    private final List<EventAttachment> attachments;

    @Nullable
    private final String dialogRequestId;

    @NotNull
    private final TextDialogExtras extras;

    @NotNull
    private final InputType inputType;
    private final boolean muteResponse;

    @Nullable
    private final UInt timeout;

    @NotNull
    private final String value;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/assistant/capability/text/InputText$InputType;", "", "<init>", "(Ljava/lang/String;I)V", "PARTIAL", RegistrationState.COMPLETE, "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InputType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ InputType[] $VALUES;
        public static final InputType PARTIAL = new InputType("PARTIAL", 0);
        public static final InputType COMPLETE = new InputType(RegistrationState.COMPLETE, 1);

        private static final /* synthetic */ InputType[] $values() {
            return new InputType[]{PARTIAL, COMPLETE};
        }

        static {
            InputType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private InputType(String str, int i) {
        }

        @NotNull
        public static EnumEntries<InputType> getEntries() {
            return $ENTRIES;
        }

        public static InputType valueOf(String str) {
            return (InputType) Enum.valueOf(InputType.class, str);
        }

        public static InputType[] values() {
            return (InputType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ InputText(String str, boolean z, UInt uInt, String str2, TextDialogExtras textDialogExtras, InputType inputType, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : uInt, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? new TextDialogExtras(null, 0L, null, null, 15, null) : textDialogExtras, (i & 32) != 0 ? InputType.COMPLETE : inputType, (i & 64) != 0 ? CollectionsKt.emptyList() : list, null);
    }

    /* renamed from: copy-t95Z3-0$default, reason: not valid java name */
    public static /* synthetic */ InputText m15000copyt95Z30$default(InputText inputText, String str, boolean z, UInt uInt, String str2, TextDialogExtras textDialogExtras, InputType inputType, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inputText.value;
        }
        if ((i & 2) != 0) {
            z = inputText.muteResponse;
        }
        if ((i & 4) != 0) {
            uInt = inputText.timeout;
        }
        if ((i & 8) != 0) {
            str2 = inputText.dialogRequestId;
        }
        if ((i & 16) != 0) {
            textDialogExtras = inputText.extras;
        }
        if ((i & 32) != 0) {
            inputType = inputText.inputType;
        }
        if ((i & 64) != 0) {
            list = inputText.attachments;
        }
        InputType inputType2 = inputType;
        List list2 = list;
        TextDialogExtras textDialogExtras2 = textDialogExtras;
        UInt uInt2 = uInt;
        return inputText.m15002copyt95Z30(str, z, uInt2, str2, textDialogExtras2, inputType2, list2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getMuteResponse() {
        return this.muteResponse;
    }

    @Nullable
    /* renamed from: component3-0hXNFcg, reason: not valid java name and from getter */
    public final UInt getTimeout() {
        return this.timeout;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getDialogRequestId() {
        return this.dialogRequestId;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final TextDialogExtras getExtras() {
        return this.extras;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final InputType getInputType() {
        return this.inputType;
    }

    @NotNull
    public final List<EventAttachment> component7() {
        return this.attachments;
    }

    @NotNull
    /* renamed from: copy-t95Z3-0, reason: not valid java name */
    public final InputText m15002copyt95Z30(@NotNull String value, boolean muteResponse, @Nullable UInt timeout, @Nullable String dialogRequestId, @NotNull TextDialogExtras extras, @NotNull InputType inputType, @NotNull List<EventAttachment> attachments) {
        value.getClass();
        extras.getClass();
        inputType.getClass();
        attachments.getClass();
        return new InputText(value, muteResponse, timeout, dialogRequestId, extras, inputType, attachments, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputText)) {
            return false;
        }
        InputText inputText = (InputText) other;
        return Intrinsics.areEqual(this.value, inputText.value) && this.muteResponse == inputText.muteResponse && Intrinsics.areEqual(this.timeout, inputText.timeout) && Intrinsics.areEqual(this.dialogRequestId, inputText.dialogRequestId) && Intrinsics.areEqual(this.extras, inputText.extras) && this.inputType == inputText.inputType;
    }

    @NotNull
    public final List<EventAttachment> getAttachments() {
        return this.attachments;
    }

    @Nullable
    public final String getDialogRequestId() {
        return this.dialogRequestId;
    }

    @NotNull
    public final TextDialogExtras getExtras() {
        return this.extras;
    }

    @NotNull
    public final InputType getInputType() {
        return this.inputType;
    }

    public final boolean getMuteResponse() {
        return this.muteResponse;
    }

    @Nullable
    /* renamed from: getTimeout-0hXNFcg, reason: not valid java name */
    public final UInt m15003getTimeout0hXNFcg() {
        return this.timeout;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int m = DoubleList$$ExternalSyntheticOutline0.m(this.muteResponse, this.value.hashCode() * 31, 31);
        UInt uInt = this.timeout;
        int m25401hashCodeimpl = (m + (uInt != null ? UInt.m25401hashCodeimpl(uInt.getData()) : 0)) * 31;
        String str = this.dialogRequestId;
        int hashCode = str != null ? str.hashCode() : 0;
        return this.inputType.hashCode() + ((this.extras.hashCode() + ((m25401hashCodeimpl + hashCode) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.value;
        boolean z = this.muteResponse;
        UInt uInt = this.timeout;
        String str2 = this.dialogRequestId;
        TextDialogExtras textDialogExtras = this.extras;
        InputType inputType = this.inputType;
        List<EventAttachment> list = this.attachments;
        StringBuilder m = Automotive$$ExternalSyntheticOutline0.m("InputText(value=", str, ", muteResponse=", z, ", timeout=");
        m.append(uInt);
        m.append(", dialogRequestId=");
        m.append(str2);
        m.append(", extras=");
        m.append(textDialogExtras);
        m.append(", inputType=");
        m.append(inputType);
        m.append(", attachments=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, list, m);
    }

    private InputText(String str, boolean z, UInt uInt, String str2, TextDialogExtras textDialogExtras, InputType inputType, List<EventAttachment> list) {
        str.getClass();
        textDialogExtras.getClass();
        inputType.getClass();
        list.getClass();
        this.value = str;
        this.muteResponse = z;
        this.timeout = uInt;
        this.dialogRequestId = str2;
        this.extras = textDialogExtras;
        this.inputType = inputType;
        this.attachments = list;
    }

    public /* synthetic */ InputText(String str, boolean z, UInt uInt, String str2, TextDialogExtras textDialogExtras, InputType inputType, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, uInt, str2, textDialogExtras, inputType, list);
    }
}
