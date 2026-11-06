package com.amazon.alexa.accessory.frames.translation.util;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/accessory/frames/translation/util/TranslationLanguagePair;", "", "user", "", "bystander", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getUser", "()Ljava/lang/String;", "getBystander", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Companion", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class TranslationLanguagePair {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final TranslationLanguagePair DEFAULTS = new TranslationLanguagePair("en-US", TranslationLanguageManager.DEFAULT_BYSTANDER_LANGUAGE);

    @NotNull
    private final String bystander;

    @NotNull
    private final String user;

    public TranslationLanguagePair(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.user = str;
        this.bystander = str2;
    }

    public static /* synthetic */ TranslationLanguagePair copy$default(TranslationLanguagePair translationLanguagePair, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = translationLanguagePair.user;
        }
        if ((i & 2) != 0) {
            str2 = translationLanguagePair.bystander;
        }
        return translationLanguagePair.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getUser() {
        return this.user;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getBystander() {
        return this.bystander;
    }

    @NotNull
    public final TranslationLanguagePair copy(@NotNull String user, @NotNull String bystander) {
        user.getClass();
        bystander.getClass();
        return new TranslationLanguagePair(user, bystander);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TranslationLanguagePair)) {
            return false;
        }
        TranslationLanguagePair translationLanguagePair = (TranslationLanguagePair) other;
        return Intrinsics.areEqual(this.user, translationLanguagePair.user) && Intrinsics.areEqual(this.bystander, translationLanguagePair.bystander);
    }

    @NotNull
    public final String getBystander() {
        return this.bystander;
    }

    @NotNull
    public final String getUser() {
        return this.user;
    }

    public int hashCode() {
        return this.bystander.hashCode() + (this.user.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("TranslationLanguagePair(user=", this.user, ", bystander=", this.bystander, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/accessory/frames/translation/util/TranslationLanguagePair$Companion;", "", "<init>", "()V", "DEFAULTS", "Lcom/amazon/alexa/accessory/frames/translation/util/TranslationLanguagePair;", "getDEFAULTS", "()Lcom/amazon/alexa/accessory/frames/translation/util/TranslationLanguagePair;", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TranslationLanguagePair getDEFAULTS() {
            return TranslationLanguagePair.DEFAULTS;
        }

        private Companion() {
        }
    }
}
