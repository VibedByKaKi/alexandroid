package com.amazon.alexa.ra.apl.fragments.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/ra/apl/fragments/data/Document;", "", "settings", "Lcom/amazon/alexa/ra/apl/fragments/data/Settings;", "<init>", "(Lcom/amazon/alexa/ra/apl/fragments/data/Settings;)V", "getSettings", "()Lcom/amazon/alexa/ra/apl/fragments/data/Settings;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AVSMobileFramework-ra-apl-fragment-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class Document {
    public static final int $stable = 8;

    @SerializedName("settings")
    @Nullable
    private final Settings settings;

    public Document(@Nullable Settings settings) {
        this.settings = settings;
    }

    public static /* synthetic */ Document copy$default(Document document, Settings settings, int i, Object obj) {
        if ((i & 1) != 0) {
            settings = document.settings;
        }
        return document.copy(settings);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Settings getSettings() {
        return this.settings;
    }

    @NotNull
    public final Document copy(@Nullable Settings settings) {
        return new Document(settings);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Document) && Intrinsics.areEqual(this.settings, ((Document) other).settings);
    }

    @Nullable
    public final Settings getSettings() {
        return this.settings;
    }

    public int hashCode() {
        Settings settings = this.settings;
        if (settings == null) {
            return 0;
        }
        return settings.hashCode();
    }

    @NotNull
    public String toString() {
        return "Document(settings=" + this.settings + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
