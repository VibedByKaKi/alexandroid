package com.amazon.alexa.ra.core.data.fragments;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import chip.platform.ConfigurationManager;
import com.amazon.alexa.accessory.notificationpublisher.utils.NotificationConstants;
import com.amazon.alexa.ra.core.data.utils.DateProcessor;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.Collections;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 82\u00020\u0001:\u00018Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010(\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010*\u001a\u00020+H\u0016J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00000\u000eHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u00104\u001a\u00020\u000bHÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J{\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u0003HÆ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0011\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0016¨\u00069"}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/FragmentData;", "", "uri", "", FragmentData.FRAGMENT_VERSION, NotificationConstants.SUB_TYPE_KEY, "Lcom/amazon/alexa/ra/core/data/fragments/SubType;", "metadata", "Lcom/amazon/alexa/ra/core/data/fragments/FragmentMetaData;", "shouldShowMessageMetadata", "Lkotlin/Function0;", "", "timestamp", "fragments", "", "content", "Lcom/amazon/alexa/ra/core/data/fragments/Content;", "hasLoadingPhase", ConfigurationManager.kConfigKey_UniqueId, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/amazon/alexa/ra/core/data/fragments/SubType;Lcom/amazon/alexa/ra/core/data/fragments/FragmentMetaData;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/util/List;Lcom/amazon/alexa/ra/core/data/fragments/Content;ZLjava/lang/String;)V", "getUri", "()Ljava/lang/String;", "getFragmentVersion", "getSubType$annotations", "()V", "getSubType", "()Lcom/amazon/alexa/ra/core/data/fragments/SubType;", "getMetadata", "()Lcom/amazon/alexa/ra/core/data/fragments/FragmentMetaData;", "getShouldShowMessageMetadata", "()Lkotlin/jvm/functions/Function0;", "getTimestamp", "getFragments", "()Ljava/util/List;", "getContent", "()Lcom/amazon/alexa/ra/core/data/fragments/Content;", "getHasLoadingPhase", "()Z", "getUniqueId", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "toString", "SpecificationKeys", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class FragmentData {

    @NotNull
    public static final String FRAGMENT_CONTENT = "content";

    @NotNull
    public static final String FRAGMENT_METADATA = "metadata";

    @NotNull
    public static final String FRAGMENT_TIMESTAMP = "timestamp";

    @NotNull
    public static final String FRAGMENT_URI = "fragmentURI";

    @NotNull
    public static final String FRAGMENT_VARIANTS = "variants";

    @NotNull
    public static final String FRAGMENT_VERSION = "fragmentVersion";

    @Nullable
    private final Content content;

    @NotNull
    private final String fragmentVersion;

    @NotNull
    private final List<FragmentData> fragments;
    private final boolean hasLoadingPhase;

    @NotNull
    private final FragmentMetaData metadata;

    @NotNull
    private final Function0<Boolean> shouldShowMessageMetadata;

    @NotNull
    private final SubType subType;

    @NotNull
    private final String timestamp;

    @NotNull
    private final String uniqueId;

    @NotNull
    private final String uri;
    public static final int $stable = 8;

    public /* synthetic */ FragmentData(String str, String str2, SubType subType, FragmentMetaData fragmentMetaData, Function0 function0, String str3, List list, Content content, boolean z, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "2024.3" : str2, (i & 4) != 0 ? SubType.UNKNOWN : subType, fragmentMetaData, (i & 16) != 0 ? new FragmentData$$ExternalSyntheticLambda0(fragmentMetaData, 0) : function0, (i & 32) != 0 ? DateProcessor.Companion.getCurrentTime$default(DateProcessor.INSTANCE, null, null, 3, null) : str3, (i & 64) != 0 ? Collections.EMPTY_LIST : list, (i & 128) != 0 ? null : content, (i & 256) != 0 ? false : z, (i & 512) != 0 ? TableInfo$$ExternalSyntheticOutline0.m(fragmentMetaData.getRevision(), str, ":") : str4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(FragmentMetaData fragmentMetaData) {
        return fragmentMetaData.getPurpose() == Purpose.USER || fragmentMetaData.getPurpose() == Purpose.AGENT;
    }

    public static /* synthetic */ FragmentData copy$default(FragmentData fragmentData, String str, String str2, SubType subType, FragmentMetaData fragmentMetaData, Function0 function0, String str3, List list, Content content, boolean z, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fragmentData.uri;
        }
        if ((i & 2) != 0) {
            str2 = fragmentData.fragmentVersion;
        }
        if ((i & 4) != 0) {
            subType = fragmentData.subType;
        }
        if ((i & 8) != 0) {
            fragmentMetaData = fragmentData.metadata;
        }
        if ((i & 16) != 0) {
            function0 = fragmentData.shouldShowMessageMetadata;
        }
        if ((i & 32) != 0) {
            str3 = fragmentData.timestamp;
        }
        if ((i & 64) != 0) {
            list = fragmentData.fragments;
        }
        if ((i & 128) != 0) {
            content = fragmentData.content;
        }
        if ((i & 256) != 0) {
            z = fragmentData.hasLoadingPhase;
        }
        if ((i & 512) != 0) {
            str4 = fragmentData.uniqueId;
        }
        boolean z2 = z;
        String str5 = str4;
        List list2 = list;
        Content content2 = content;
        Function0 function02 = function0;
        String str6 = str3;
        return fragmentData.copy(str, str2, subType, fragmentMetaData, function02, str6, list2, content2, z2, str5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getUniqueId() {
        return this.uniqueId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getFragmentVersion() {
        return this.fragmentVersion;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final SubType getSubType() {
        return this.subType;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final FragmentMetaData getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final Function0<Boolean> component5() {
        return this.shouldShowMessageMetadata;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final List<FragmentData> component7() {
        return this.fragments;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Content getContent() {
        return this.content;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getHasLoadingPhase() {
        return this.hasLoadingPhase;
    }

    @NotNull
    public final FragmentData copy(@NotNull String uri, @NotNull String fragmentVersion, @NotNull SubType subType, @NotNull FragmentMetaData metadata, @NotNull Function0<Boolean> shouldShowMessageMetadata, @NotNull String timestamp, @NotNull List<FragmentData> fragments, @Nullable Content content, boolean hasLoadingPhase, @NotNull String uniqueId) {
        uri.getClass();
        fragmentVersion.getClass();
        subType.getClass();
        metadata.getClass();
        shouldShowMessageMetadata.getClass();
        timestamp.getClass();
        fragments.getClass();
        uniqueId.getClass();
        return new FragmentData(uri, fragmentVersion, subType, metadata, shouldShowMessageMetadata, timestamp, fragments, content, hasLoadingPhase, uniqueId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(FragmentData.class, other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        return Intrinsics.areEqual(this.uniqueId, ((FragmentData) other).uniqueId);
    }

    @Nullable
    public final Content getContent() {
        return this.content;
    }

    @NotNull
    public final String getFragmentVersion() {
        return this.fragmentVersion;
    }

    @NotNull
    public final List<FragmentData> getFragments() {
        return this.fragments;
    }

    public final boolean getHasLoadingPhase() {
        return this.hasLoadingPhase;
    }

    @NotNull
    public final FragmentMetaData getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final Function0<Boolean> getShouldShowMessageMetadata() {
        return this.shouldShowMessageMetadata;
    }

    @NotNull
    public final SubType getSubType() {
        return this.subType;
    }

    @NotNull
    public final String getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final String getUniqueId() {
        return this.uniqueId;
    }

    @NotNull
    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return this.uniqueId.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.uri;
        String str2 = this.fragmentVersion;
        SubType subType = this.subType;
        FragmentMetaData fragmentMetaData = this.metadata;
        Function0<Boolean> function0 = this.shouldShowMessageMetadata;
        String str3 = this.timestamp;
        List<FragmentData> list = this.fragments;
        Content content = this.content;
        boolean z = this.hasLoadingPhase;
        String str4 = this.uniqueId;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("FragmentData(uri=", str, ", fragmentVersion=", str2, ", subType=");
        m.append(subType);
        m.append(", metadata=");
        m.append(fragmentMetaData);
        m.append(", shouldShowMessageMetadata=");
        m.append(function0);
        m.append(", timestamp=");
        m.append(str3);
        m.append(", fragments=");
        m.append(list);
        m.append(", content=");
        m.append(content);
        m.append(", hasLoadingPhase=");
        m.append(z);
        m.append(", uniqueId=");
        m.append(str4);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    @Deprecated(message = "Exists for APL through card renderer")
    public static /* synthetic */ void getSubType$annotations() {
    }

    public FragmentData(@NotNull String str, @NotNull String str2, @NotNull SubType subType, @NotNull FragmentMetaData fragmentMetaData, @NotNull Function0<Boolean> function0, @NotNull String str3, @NotNull List<FragmentData> list, @Nullable Content content, boolean z, @NotNull String str4) {
        str.getClass();
        str2.getClass();
        subType.getClass();
        fragmentMetaData.getClass();
        function0.getClass();
        str3.getClass();
        list.getClass();
        str4.getClass();
        this.uri = str;
        this.fragmentVersion = str2;
        this.subType = subType;
        this.metadata = fragmentMetaData;
        this.shouldShowMessageMetadata = function0;
        this.timestamp = str3;
        this.fragments = list;
        this.content = content;
        this.hasLoadingPhase = z;
        this.uniqueId = str4;
    }
}
