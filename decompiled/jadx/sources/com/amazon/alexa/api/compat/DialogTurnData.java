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
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0002\b\tB\u0013\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/api/compat/DialogTurnData;", "", "dialogTurnId", "", "<init>", "(Ljava/lang/String;)V", "getDialogTurnId", "()Ljava/lang/String;", "Builder", "Companion", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class DialogTurnData {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String dialogTurnId;

    private DialogTurnData(String str) {
        this.dialogTurnId = str;
    }

    @Nullable
    public final String getDialogTurnId() {
        return this.dialogTurnId;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/api/compat/DialogTurnData$Companion;", "", "<init>", "()V", "convertToCompat", "Lcom/amazon/alexa/api/compat/DialogTurnData;", "noncompatDialogTurnData", "Lcom/amazon/alexa/api/DialogTurnData;", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final DialogTurnData convertToCompat(@NotNull com.amazon.alexa.api.DialogTurnData noncompatDialogTurnData) {
            noncompatDialogTurnData.getClass();
            return new Builder(null, 1, 0 == true ? 1 : 0).dialogTurnId(noncompatDialogTurnData.getDialogTurnId()).build();
        }

        private Companion() {
        }
    }

    public /* synthetic */ DialogTurnData(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0002\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003J\u0006\u0010\t\u001a\u00020\nJ\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/api/compat/DialogTurnData$Builder;", "", "dialogTurnId", "", "<init>", "(Ljava/lang/String;)V", "getDialogTurnId", "()Ljava/lang/String;", "setDialogTurnId", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/amazon/alexa/api/compat/DialogTurnData;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nDialogTurnData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogTurnData.kt\ncom/amazon/alexa/api/compat/DialogTurnData$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n1#2:23\n*E\n"})
    public static final /* data */ class Builder {

        @Nullable
        private String dialogTurnId;

        public /* synthetic */ Builder(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public static /* synthetic */ Builder copy$default(Builder builder, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = builder.dialogTurnId;
            }
            return builder.copy(str);
        }

        @NotNull
        public final DialogTurnData build() {
            return new DialogTurnData(this.dialogTurnId, null);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getDialogTurnId() {
            return this.dialogTurnId;
        }

        @NotNull
        public final Builder copy(@Nullable String dialogTurnId) {
            return new Builder(dialogTurnId);
        }

        @NotNull
        public final Builder dialogTurnId(@Nullable String dialogTurnId) {
            this.dialogTurnId = dialogTurnId;
            return this;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Builder) && Intrinsics.areEqual(this.dialogTurnId, ((Builder) other).dialogTurnId);
        }

        @Nullable
        public final String getDialogTurnId() {
            return this.dialogTurnId;
        }

        public int hashCode() {
            String str = this.dialogTurnId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final void setDialogTurnId(@Nullable String str) {
            this.dialogTurnId = str;
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("Builder(dialogTurnId=", this.dialogTurnId, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        public Builder(@Nullable String str) {
            this.dialogTurnId = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }
}
