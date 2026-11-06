package com.amazon.alexa.ra.chrome.model;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.ra.sdk.capability.PersonalityCapability;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/ra/chrome/model/PersonalityInfo;", "", PersonalityCapability.PERSONALITY_ID_KEY, "Lcom/amazon/alexa/ra/chrome/model/PersonalityId;", "uri", "", "checksum", "fallback", "<init>", "(Lcom/amazon/alexa/ra/chrome/model/PersonalityId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPersonalityId", "()Lcom/amazon/alexa/ra/chrome/model/PersonalityId;", "getUri", "()Ljava/lang/String;", "getChecksum", "getFallback", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class PersonalityInfo {
    public static final int $stable = 0;

    @Nullable
    private final String checksum;

    @Nullable
    private final String fallback;

    @Nullable
    private final PersonalityId personalityId;

    @Nullable
    private final String uri;

    public /* synthetic */ PersonalityInfo(PersonalityId personalityId, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(personalityId, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }

    public static /* synthetic */ PersonalityInfo copy$default(PersonalityInfo personalityInfo, PersonalityId personalityId, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            personalityId = personalityInfo.personalityId;
        }
        if ((i & 2) != 0) {
            str = personalityInfo.uri;
        }
        if ((i & 4) != 0) {
            str2 = personalityInfo.checksum;
        }
        if ((i & 8) != 0) {
            str3 = personalityInfo.fallback;
        }
        return personalityInfo.copy(personalityId, str, str2, str3);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final PersonalityId getPersonalityId() {
        return this.personalityId;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getChecksum() {
        return this.checksum;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getFallback() {
        return this.fallback;
    }

    @NotNull
    public final PersonalityInfo copy(@Nullable PersonalityId personalityId, @Nullable String uri, @Nullable String checksum, @Nullable String fallback) {
        return new PersonalityInfo(personalityId, uri, checksum, fallback);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalityInfo)) {
            return false;
        }
        PersonalityInfo personalityInfo = (PersonalityInfo) other;
        return this.personalityId == personalityInfo.personalityId && Intrinsics.areEqual(this.uri, personalityInfo.uri) && Intrinsics.areEqual(this.checksum, personalityInfo.checksum) && Intrinsics.areEqual(this.fallback, personalityInfo.fallback);
    }

    @Nullable
    public final String getChecksum() {
        return this.checksum;
    }

    @Nullable
    public final String getFallback() {
        return this.fallback;
    }

    @Nullable
    public final PersonalityId getPersonalityId() {
        return this.personalityId;
    }

    @Nullable
    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        PersonalityId personalityId = this.personalityId;
        int hashCode = (personalityId == null ? 0 : personalityId.hashCode()) * 31;
        String str = this.uri;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.checksum;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fallback;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        PersonalityId personalityId = this.personalityId;
        String str = this.uri;
        String str2 = this.checksum;
        String str3 = this.fallback;
        StringBuilder sb = new StringBuilder("PersonalityInfo(personalityId=");
        sb.append(personalityId);
        sb.append(", uri=");
        sb.append(str);
        sb.append(", checksum=");
        return DoubleList$$ExternalSyntheticOutline0.m(sb, str2, ", fallback=", str3, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public PersonalityInfo(@Nullable PersonalityId personalityId, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.personalityId = personalityId;
        this.uri = str;
        this.checksum = str2;
        this.fallback = str3;
    }
}
