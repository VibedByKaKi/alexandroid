package com.amazon.alexa.ra.core.data.model;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.biloba.metrics.MetricsConstants;
import com.amazon.alexa.client.alexaservice.voicechat.VoiceChatContract;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÂ\u0003J#\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/Profile;", "", "personId", "", "_isActive", "Landroidx/compose/runtime/MutableState;", "", "<init>", "(Ljava/lang/String;Landroidx/compose/runtime/MutableState;)V", MetricsConstants.OperationalMetrics.GET_PERSON_ID, "()Ljava/lang/String;", VoiceChatContract.COLUMN_IS_ACTIVE, "()Landroidx/compose/runtime/MutableState;", "setIsActive", "", "value", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class Profile {
    public static final int $stable = 8;

    @NotNull
    private MutableState<Boolean> _isActive;

    @NotNull
    private final String personId;

    public /* synthetic */ Profile(String str, MutableState mutableState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null) : mutableState);
    }

    private final MutableState<Boolean> component2() {
        return this._isActive;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Profile copy$default(Profile profile, String str, MutableState mutableState, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profile.personId;
        }
        if ((i & 2) != 0) {
            mutableState = profile._isActive;
        }
        return profile.copy(str, mutableState);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPersonId() {
        return this.personId;
    }

    @NotNull
    public final Profile copy(@NotNull String personId, @NotNull MutableState<Boolean> _isActive) {
        personId.getClass();
        _isActive.getClass();
        return new Profile(personId, _isActive);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Profile)) {
            return false;
        }
        Profile profile = (Profile) other;
        return Intrinsics.areEqual(this.personId, profile.personId) && Intrinsics.areEqual(this._isActive, profile._isActive);
    }

    @NotNull
    public final String getPersonId() {
        return this.personId;
    }

    public int hashCode() {
        return this._isActive.hashCode() + (this.personId.hashCode() * 31);
    }

    @NotNull
    public final MutableState<Boolean> isActive() {
        return this._isActive;
    }

    public final void setIsActive(boolean value) {
        this._isActive.setValue(Boolean.valueOf(value));
    }

    @NotNull
    public String toString() {
        return "Profile(personId=" + this.personId + ", _isActive=" + this._isActive + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public Profile(@NotNull String str, @NotNull MutableState<Boolean> mutableState) {
        str.getClass();
        mutableState.getClass();
        this.personId = str;
        this._isActive = mutableState;
    }
}
