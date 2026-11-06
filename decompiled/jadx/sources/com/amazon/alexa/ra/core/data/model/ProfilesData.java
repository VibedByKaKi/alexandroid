package com.amazon.alexa.ra.core.data.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J%\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/ProfilesData;", "", "currentProfile", "Lcom/amazon/alexa/ra/core/data/model/Profile;", "allProfiles", "", "<init>", "(Lcom/amazon/alexa/ra/core/data/model/Profile;Ljava/util/List;)V", "getCurrentProfile", "()Lcom/amazon/alexa/ra/core/data/model/Profile;", "setCurrentProfile", "(Lcom/amazon/alexa/ra/core/data/model/Profile;)V", "getAllProfiles", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class ProfilesData {
    public static final int $stable = 8;

    @NotNull
    private final List<Profile> allProfiles;

    @Nullable
    private Profile currentProfile;

    public /* synthetic */ ProfilesData(Profile profile, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : profile, (i & 2) != 0 ? new ArrayList() : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProfilesData copy$default(ProfilesData profilesData, Profile profile, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            profile = profilesData.currentProfile;
        }
        if ((i & 2) != 0) {
            list = profilesData.allProfiles;
        }
        return profilesData.copy(profile, list);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Profile getCurrentProfile() {
        return this.currentProfile;
    }

    @NotNull
    public final List<Profile> component2() {
        return this.allProfiles;
    }

    @NotNull
    public final ProfilesData copy(@Nullable Profile currentProfile, @NotNull List<Profile> allProfiles) {
        allProfiles.getClass();
        return new ProfilesData(currentProfile, allProfiles);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfilesData)) {
            return false;
        }
        ProfilesData profilesData = (ProfilesData) other;
        return Intrinsics.areEqual(this.currentProfile, profilesData.currentProfile) && Intrinsics.areEqual(this.allProfiles, profilesData.allProfiles);
    }

    @NotNull
    public final List<Profile> getAllProfiles() {
        return this.allProfiles;
    }

    @Nullable
    public final Profile getCurrentProfile() {
        return this.currentProfile;
    }

    public int hashCode() {
        Profile profile = this.currentProfile;
        return this.allProfiles.hashCode() + ((profile == null ? 0 : profile.hashCode()) * 31);
    }

    public final void setCurrentProfile(@Nullable Profile profile) {
        this.currentProfile = profile;
    }

    @NotNull
    public String toString() {
        return "ProfilesData(currentProfile=" + this.currentProfile + ", allProfiles=" + this.allProfiles + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public ProfilesData(@Nullable Profile profile, @NotNull List<Profile> list) {
        list.getClass();
        this.currentProfile = profile;
        this.allProfiles = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProfilesData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
