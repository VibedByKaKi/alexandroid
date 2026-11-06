package com.amazon.alexa.ra.core.ui.custom;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/custom/TextFileState;", "", "Loading", "Error", "Loaded", "Lcom/amazon/alexa/ra/core/ui/custom/TextFileState$Error;", "Lcom/amazon/alexa/ra/core/ui/custom/TextFileState$Loaded;", "Lcom/amazon/alexa/ra/core/ui/custom/TextFileState$Loading;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface TextFileState {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/custom/TextFileState$Error;", "Lcom/amazon/alexa/ra/core/ui/custom/TextFileState;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Error implements TextFileState {
        public static final int $stable = 0;

        @NotNull
        public static final Error INSTANCE = new Error();

        private Error() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/custom/TextFileState$Loaded;", "Lcom/amazon/alexa/ra/core/ui/custom/TextFileState;", "text", "", "isTruncated", "", "<init>", "(Ljava/lang/String;Z)V", "getText", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Loaded implements TextFileState {
        public static final int $stable = 0;
        private final boolean isTruncated;

        @NotNull
        private final String text;

        public Loaded(@NotNull String str, boolean z) {
            str.getClass();
            this.text = str;
            this.isTruncated = z;
        }

        public static /* synthetic */ Loaded copy$default(Loaded loaded, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loaded.text;
            }
            if ((i & 2) != 0) {
                z = loaded.isTruncated;
            }
            return loaded.copy(str, z);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsTruncated() {
            return this.isTruncated;
        }

        @NotNull
        public final Loaded copy(@NotNull String text, boolean isTruncated) {
            text.getClass();
            return new Loaded(text, isTruncated);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.text, loaded.text) && this.isTruncated == loaded.isTruncated;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isTruncated) + (this.text.hashCode() * 31);
        }

        public final boolean isTruncated() {
            return this.isTruncated;
        }

        @NotNull
        public String toString() {
            return AppLaunchChecker$$ExternalSyntheticOutline0.m("Loaded(text=", this.text, ", isTruncated=", this.isTruncated, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/custom/TextFileState$Loading;", "Lcom/amazon/alexa/ra/core/ui/custom/TextFileState;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Loading implements TextFileState {
        public static final int $stable = 0;

        @NotNull
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }
    }
}
