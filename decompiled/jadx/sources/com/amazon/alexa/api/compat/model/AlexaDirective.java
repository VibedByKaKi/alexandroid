package com.amazon.alexa.api.compat.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Parcelize
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\rHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f¨\u0006\""}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaDirective;", "Landroid/os/Parcelable;", "alexaHeader", "Lcom/amazon/alexa/api/compat/model/AlexaHeader;", "alexaPayload", "Lcom/amazon/alexa/api/compat/model/AlexaPayload;", "<init>", "(Lcom/amazon/alexa/api/compat/model/AlexaHeader;Lcom/amazon/alexa/api/compat/model/AlexaPayload;)V", "getAlexaHeader", "()Lcom/amazon/alexa/api/compat/model/AlexaHeader;", "getAlexaPayload", "()Lcom/amazon/alexa/api/compat/model/AlexaPayload;", "namespace", "", "getNamespace", "()Ljava/lang/String;", "name", "getName", "component1", "component2", "copy", "describeContents", "", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class AlexaDirective implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<AlexaDirective> CREATOR = new Creator();

    @NotNull
    private final AlexaHeader alexaHeader;

    @NotNull
    private final AlexaPayload alexaPayload;

    public AlexaDirective(@NotNull AlexaHeader alexaHeader, @NotNull AlexaPayload alexaPayload) {
        alexaHeader.getClass();
        alexaPayload.getClass();
        this.alexaHeader = alexaHeader;
        this.alexaPayload = alexaPayload;
    }

    public static /* synthetic */ AlexaDirective copy$default(AlexaDirective alexaDirective, AlexaHeader alexaHeader, AlexaPayload alexaPayload, int i, Object obj) {
        if ((i & 1) != 0) {
            alexaHeader = alexaDirective.alexaHeader;
        }
        if ((i & 2) != 0) {
            alexaPayload = alexaDirective.alexaPayload;
        }
        return alexaDirective.copy(alexaHeader, alexaPayload);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final AlexaHeader getAlexaHeader() {
        return this.alexaHeader;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final AlexaPayload getAlexaPayload() {
        return this.alexaPayload;
    }

    @NotNull
    public final AlexaDirective copy(@NotNull AlexaHeader alexaHeader, @NotNull AlexaPayload alexaPayload) {
        alexaHeader.getClass();
        alexaPayload.getClass();
        return new AlexaDirective(alexaHeader, alexaPayload);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlexaDirective)) {
            return false;
        }
        AlexaDirective alexaDirective = (AlexaDirective) other;
        return Intrinsics.areEqual(this.alexaHeader, alexaDirective.alexaHeader) && Intrinsics.areEqual(this.alexaPayload, alexaDirective.alexaPayload);
    }

    @NotNull
    public final AlexaHeader getAlexaHeader() {
        return this.alexaHeader;
    }

    @NotNull
    public final AlexaPayload getAlexaPayload() {
        return this.alexaPayload;
    }

    @NotNull
    public final String getName() {
        return this.alexaHeader.getName();
    }

    @NotNull
    public final String getNamespace() {
        return this.alexaHeader.getNamespace();
    }

    public int hashCode() {
        return this.alexaPayload.hashCode() + (this.alexaHeader.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "AlexaDirective(alexaHeader=" + this.alexaHeader + ", alexaPayload=" + this.alexaPayload + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        this.alexaHeader.writeToParcel(dest, flags);
        this.alexaPayload.writeToParcel(dest, flags);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AlexaDirective> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AlexaDirective createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new AlexaDirective(AlexaHeader.CREATOR.createFromParcel(parcel), AlexaPayload.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AlexaDirective[] newArray(int i) {
            return new AlexaDirective[i];
        }
    }
}
