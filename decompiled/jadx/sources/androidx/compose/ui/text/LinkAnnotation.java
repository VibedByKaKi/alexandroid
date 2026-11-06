package androidx.compose.ui.text;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import com.amazon.alexa.assetManagementService.model.constants.AssetUrlMappingTableConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/text/LinkAnnotation;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "<init>", "()V", "linkInteractionListener", "Landroidx/compose/ui/text/LinkInteractionListener;", "getLinkInteractionListener", "()Landroidx/compose/ui/text/LinkInteractionListener;", "styles", "Landroidx/compose/ui/text/TextLinkStyles;", "getStyles", "()Landroidx/compose/ui/text/TextLinkStyles;", AssetUrlMappingTableConstants.URL_COLUMN_NAME, "Clickable", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class LinkAnnotation implements AnnotatedString.Annotation {
    public static final int $stable = 0;

    public /* synthetic */ LinkAnnotation(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    public abstract LinkInteractionListener getLinkInteractionListener();

    @Nullable
    public abstract TextLinkStyles getStyles();

    private LinkAnnotation() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/LinkAnnotation$Clickable;", "Landroidx/compose/ui/text/LinkAnnotation;", "tag", "", "styles", "Landroidx/compose/ui/text/TextLinkStyles;", "linkInteractionListener", "Landroidx/compose/ui/text/LinkInteractionListener;", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/TextLinkStyles;Landroidx/compose/ui/text/LinkInteractionListener;)V", "getTag", "()Ljava/lang/String;", "getStyles", "()Landroidx/compose/ui/text/TextLinkStyles;", "getLinkInteractionListener", "()Landroidx/compose/ui/text/LinkInteractionListener;", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Clickable extends LinkAnnotation {
        public static final int $stable = 8;

        @Nullable
        private final LinkInteractionListener linkInteractionListener;

        @Nullable
        private final TextLinkStyles styles;

        @NotNull
        private final String tag;

        public Clickable(@NotNull String str, @Nullable TextLinkStyles textLinkStyles, @Nullable LinkInteractionListener linkInteractionListener) {
            super(null);
            this.tag = str;
            this.styles = textLinkStyles;
            this.linkInteractionListener = linkInteractionListener;
        }

        public static /* synthetic */ Clickable copy$default(Clickable clickable, String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener, int i, Object obj) {
            if ((i & 1) != 0) {
                str = clickable.tag;
            }
            if ((i & 2) != 0) {
                textLinkStyles = clickable.getStyles();
            }
            if ((i & 4) != 0) {
                linkInteractionListener = clickable.getLinkInteractionListener();
            }
            return clickable.copy(str, textLinkStyles, linkInteractionListener);
        }

        @NotNull
        public final Clickable copy(@NotNull String tag, @Nullable TextLinkStyles styles, @Nullable LinkInteractionListener linkInteractionListener) {
            return new Clickable(tag, styles, linkInteractionListener);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Clickable)) {
                return false;
            }
            Clickable clickable = (Clickable) other;
            return Intrinsics.areEqual(this.tag, clickable.tag) && Intrinsics.areEqual(getStyles(), clickable.getStyles()) && Intrinsics.areEqual(getLinkInteractionListener(), clickable.getLinkInteractionListener());
        }

        @Override // androidx.compose.ui.text.LinkAnnotation
        @Nullable
        public LinkInteractionListener getLinkInteractionListener() {
            return this.linkInteractionListener;
        }

        @Override // androidx.compose.ui.text.LinkAnnotation
        @Nullable
        public TextLinkStyles getStyles() {
            return this.styles;
        }

        @NotNull
        public final String getTag() {
            return this.tag;
        }

        public int hashCode() {
            int hashCode = this.tag.hashCode() * 31;
            TextLinkStyles styles = getStyles();
            int hashCode2 = (hashCode + (styles != null ? styles.hashCode() : 0)) * 31;
            LinkInteractionListener linkInteractionListener = getLinkInteractionListener();
            return hashCode2 + (linkInteractionListener != null ? linkInteractionListener.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return ArcMode$$ExternalSyntheticOutline0.m(')', this.tag, new StringBuilder("LinkAnnotation.Clickable(tag="));
        }

        public /* synthetic */ Clickable(String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : textLinkStyles, linkInteractionListener);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/LinkAnnotation$Url;", "Landroidx/compose/ui/text/LinkAnnotation;", "url", "", "styles", "Landroidx/compose/ui/text/TextLinkStyles;", "linkInteractionListener", "Landroidx/compose/ui/text/LinkInteractionListener;", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/TextLinkStyles;Landroidx/compose/ui/text/LinkInteractionListener;)V", "getUrl", "()Ljava/lang/String;", "getStyles", "()Landroidx/compose/ui/text/TextLinkStyles;", "getLinkInteractionListener", "()Landroidx/compose/ui/text/LinkInteractionListener;", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Url extends LinkAnnotation {
        public static final int $stable = 8;

        @Nullable
        private final LinkInteractionListener linkInteractionListener;

        @Nullable
        private final TextLinkStyles styles;

        @NotNull
        private final String url;

        public /* synthetic */ Url(String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : textLinkStyles, (i & 4) != 0 ? null : linkInteractionListener);
        }

        public static /* synthetic */ Url copy$default(Url url, String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener, int i, Object obj) {
            if ((i & 1) != 0) {
                str = url.url;
            }
            if ((i & 2) != 0) {
                textLinkStyles = url.getStyles();
            }
            if ((i & 4) != 0) {
                linkInteractionListener = url.getLinkInteractionListener();
            }
            return url.copy(str, textLinkStyles, linkInteractionListener);
        }

        @NotNull
        public final Url copy(@NotNull String url, @Nullable TextLinkStyles styles, @Nullable LinkInteractionListener linkInteractionListener) {
            return new Url(url, styles, linkInteractionListener);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Url)) {
                return false;
            }
            Url url = (Url) other;
            return Intrinsics.areEqual(this.url, url.url) && Intrinsics.areEqual(getStyles(), url.getStyles()) && Intrinsics.areEqual(getLinkInteractionListener(), url.getLinkInteractionListener());
        }

        @Override // androidx.compose.ui.text.LinkAnnotation
        @Nullable
        public LinkInteractionListener getLinkInteractionListener() {
            return this.linkInteractionListener;
        }

        @Override // androidx.compose.ui.text.LinkAnnotation
        @Nullable
        public TextLinkStyles getStyles() {
            return this.styles;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int hashCode = this.url.hashCode() * 31;
            TextLinkStyles styles = getStyles();
            int hashCode2 = (hashCode + (styles != null ? styles.hashCode() : 0)) * 31;
            LinkInteractionListener linkInteractionListener = getLinkInteractionListener();
            return hashCode2 + (linkInteractionListener != null ? linkInteractionListener.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return ArcMode$$ExternalSyntheticOutline0.m(')', this.url, new StringBuilder("LinkAnnotation.Url(url="));
        }

        public Url(@NotNull String str, @Nullable TextLinkStyles textLinkStyles, @Nullable LinkInteractionListener linkInteractionListener) {
            super(null);
            this.url = str;
            this.styles = textLinkStyles;
            this.linkInteractionListener = linkInteractionListener;
        }
    }
}
