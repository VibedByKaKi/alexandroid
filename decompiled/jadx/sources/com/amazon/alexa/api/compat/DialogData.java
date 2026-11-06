package com.amazon.alexa.api.compat;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0002\u0006\u0007B\u0013\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/api/compat/DialogData;", "", "dialogId", "", "<init>", "(Ljava/lang/String;)V", "Builder", "Companion", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class DialogData {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ DialogData(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/api/compat/DialogData$Companion;", "", "<init>", "()V", "convertToCompat", "Lcom/amazon/alexa/api/compat/DialogData;", "noncompatDialogData", "Lcom/amazon/alexa/api/DialogData;", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final DialogData convertToCompat(@NotNull com.amazon.alexa.api.DialogData noncompatDialogData) {
            noncompatDialogData.getClass();
            return new Builder(null, 1, 0 == true ? 1 : 0).dialogId(noncompatDialogData.getDialogId()).build();
        }

        private Companion() {
        }
    }

    private DialogData(String str) {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0002\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003J\u0006\u0010\t\u001a\u00020\nJ\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/api/compat/DialogData$Builder;", "", "dialogId", "", "<init>", "(Ljava/lang/String;)V", "getDialogId", "()Ljava/lang/String;", "setDialogId", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/amazon/alexa/api/compat/DialogData;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nDialogData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogData.kt\ncom/amazon/alexa/api/compat/DialogData$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,24:1\n1#2:25\n*E\n"})
    public static final /* data */ class Builder {

        @Nullable
        private String dialogId;

        public /* synthetic */ Builder(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public static /* synthetic */ Builder copy$default(Builder builder, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = builder.dialogId;
            }
            return builder.copy(str);
        }

        @NotNull
        public final DialogData build() {
            return new DialogData(this.dialogId, null);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getDialogId() {
            return this.dialogId;
        }

        @NotNull
        public final Builder copy(@Nullable String dialogId) {
            return new Builder(dialogId);
        }

        @NotNull
        public final Builder dialogId(@Nullable String dialogId) {
            this.dialogId = dialogId;
            return this;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Builder) && Intrinsics.areEqual(this.dialogId, ((Builder) other).dialogId);
        }

        @Nullable
        public final String getDialogId() {
            return this.dialogId;
        }

        public int hashCode() {
            String str = this.dialogId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final void setDialogId(@Nullable String str) {
            this.dialogId = str;
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("Builder(dialogId=", this.dialogId, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        public Builder(@Nullable String str) {
            this.dialogId = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }
}
