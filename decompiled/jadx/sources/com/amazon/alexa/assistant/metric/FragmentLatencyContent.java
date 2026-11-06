package com.amazon.alexa.assistant.metric;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.data.fragments.Content;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/assistant/metric/FragmentLatencyContent;", "", "contentType", "", Content.SCHEMA, "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContentType", "()Ljava/lang/String;", "getSchema", "getVersion", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class FragmentLatencyContent {

    @Nullable
    private final String contentType;

    @Nullable
    private final String schema;

    @Nullable
    private final String version;

    public FragmentLatencyContent(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.contentType = str;
        this.schema = str2;
        this.version = str3;
    }

    public static /* synthetic */ FragmentLatencyContent copy$default(FragmentLatencyContent fragmentLatencyContent, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fragmentLatencyContent.contentType;
        }
        if ((i & 2) != 0) {
            str2 = fragmentLatencyContent.schema;
        }
        if ((i & 4) != 0) {
            str3 = fragmentLatencyContent.version;
        }
        return fragmentLatencyContent.copy(str, str2, str3);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getContentType() {
        return this.contentType;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getSchema() {
        return this.schema;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    public final FragmentLatencyContent copy(@Nullable String contentType, @Nullable String schema, @Nullable String version) {
        return new FragmentLatencyContent(contentType, schema, version);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FragmentLatencyContent)) {
            return false;
        }
        FragmentLatencyContent fragmentLatencyContent = (FragmentLatencyContent) other;
        return Intrinsics.areEqual(this.contentType, fragmentLatencyContent.contentType) && Intrinsics.areEqual(this.schema, fragmentLatencyContent.schema) && Intrinsics.areEqual(this.version, fragmentLatencyContent.version);
    }

    @Nullable
    public final String getContentType() {
        return this.contentType;
    }

    @Nullable
    public final String getSchema() {
        return this.schema;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.contentType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.schema;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.version;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.contentType;
        String str2 = this.schema;
        return a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("FragmentLatencyContent(contentType=", str, ", schema=", str2, ", version="), this.version, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
