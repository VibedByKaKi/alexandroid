package com.amazon.alexa.ra.core.data.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \b2\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/LayoutStyle;", "", "<init>", "()V", "Chrome", "Minimal", "Peek", "Full", "Companion", "Lcom/amazon/alexa/ra/core/data/model/LayoutStyle$Chrome;", "Lcom/amazon/alexa/ra/core/data/model/LayoutStyle$Full;", "Lcom/amazon/alexa/ra/core/data/model/LayoutStyle$Minimal;", "Lcom/amazon/alexa/ra/core/data/model/LayoutStyle$Peek;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public abstract class LayoutStyle {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/LayoutStyle$Chrome;", "Lcom/amazon/alexa/ra/core/data/model/LayoutStyle;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Chrome extends LayoutStyle {
        public static final int $stable = 0;

        @NotNull
        public static final Chrome INSTANCE = new Chrome();

        private Chrome() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/LayoutStyle$Full;", "Lcom/amazon/alexa/ra/core/data/model/LayoutStyle;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Full extends LayoutStyle {
        public static final int $stable = 0;

        @NotNull
        public static final Full INSTANCE = new Full();

        private Full() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/LayoutStyle$Peek;", "Lcom/amazon/alexa/ra/core/data/model/LayoutStyle;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Peek extends LayoutStyle {
        public static final int $stable = 0;

        @NotNull
        public static final Peek INSTANCE = new Peek();

        private Peek() {
            super(null);
        }
    }

    public /* synthetic */ LayoutStyle(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/LayoutStyle$Companion;", "", "<init>", "()V", "fromString", "Lcom/amazon/alexa/ra/core/data/model/LayoutStyle;", "value", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @NotNull
        public final LayoutStyle fromString(@NotNull String value) {
            value.getClass();
            String upperCase = value.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            int i = 1;
            switch (upperCase.hashCode()) {
                case 2169487:
                    if (upperCase.equals("FULL")) {
                        return Full.INSTANCE;
                    }
                    break;
                case 2451803:
                    if (upperCase.equals("PEEK")) {
                        return Peek.INSTANCE;
                    }
                    break;
                case 1237942484:
                    if (upperCase.equals("MINIMAL_VOICE")) {
                        return new Minimal(true);
                    }
                    break;
                case 1782520193:
                    if (upperCase.equals("MINIMAL")) {
                        return new Minimal(false, i, null);
                    }
                    break;
                case 1987167866:
                    if (upperCase.equals("CHROME")) {
                        return Chrome.INSTANCE;
                    }
                    break;
            }
            return Full.INSTANCE;
        }

        private Companion() {
        }
    }

    private LayoutStyle() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/LayoutStyle$Minimal;", "Lcom/amazon/alexa/ra/core/data/model/LayoutStyle;", "isVoiceOnly", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Minimal extends LayoutStyle {
        public static final int $stable = 0;
        private final boolean isVoiceOnly;

        public /* synthetic */ Minimal(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public static /* synthetic */ Minimal copy$default(Minimal minimal, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = minimal.isVoiceOnly;
            }
            return minimal.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsVoiceOnly() {
            return this.isVoiceOnly;
        }

        @NotNull
        public final Minimal copy(boolean isVoiceOnly) {
            return new Minimal(isVoiceOnly);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Minimal) && this.isVoiceOnly == ((Minimal) other).isVoiceOnly;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isVoiceOnly);
        }

        public final boolean isVoiceOnly() {
            return this.isVoiceOnly;
        }

        @NotNull
        public String toString() {
            return Automotive$$ExternalSyntheticOutline0.m("Minimal(isVoiceOnly=", MarkdownConstants.RIGHT_PARENTHESIS, this.isVoiceOnly);
        }

        public Minimal(boolean z) {
            super(null);
            this.isVoiceOnly = z;
        }

        public Minimal() {
            this(false, 1, null);
        }
    }
}
