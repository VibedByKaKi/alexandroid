package com.amazon.alexa.ra.core.data.utils;

import androidx.annotation.StringRes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.res.StringResources_androidKt;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/ra/core/data/utils/UiText;", "", "<init>", "()V", "asString", "", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "StringResource", "StringLiteral", "Lcom/amazon/alexa/ra/core/data/utils/UiText$StringLiteral;", "Lcom/amazon/alexa/ra/core/data/utils/UiText$StringResource;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public abstract class UiText {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/data/utils/UiText$StringLiteral;", "Lcom/amazon/alexa/ra/core/data/utils/UiText;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class StringLiteral extends UiText {
        public static final int $stable = 0;

        @NotNull
        private final String value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StringLiteral(@NotNull String str) {
            super(null);
            str.getClass();
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    public /* synthetic */ UiText(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Composable
    @NotNull
    public final String asString(@Nullable Composer composer, int i) {
        String value;
        composer.startReplaceGroup(1122076669);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1122076669, i, -1, "com.amazon.alexa.ra.core.data.utils.UiText.asString (UiText.kt:18)");
        }
        if (this instanceof StringResource) {
            StringResource stringResource = (StringResource) this;
            if (stringResource.getFormatArgs().length == 0) {
                composer.startReplaceGroup(1761537145);
                value = StringResources_androidKt.stringResource(stringResource.getResId(), composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1761608972);
                int resId = stringResource.getResId();
                Object[] formatArgs = stringResource.getFormatArgs();
                value = StringResources_androidKt.stringResource(resId, Arrays.copyOf(formatArgs, formatArgs.length), composer, 0);
                composer.endReplaceGroup();
            }
        } else {
            if (!(this instanceof StringLiteral)) {
                PathKt$$ExternalSyntheticBUOutline0.m();
                return null;
            }
            value = ((StringLiteral) this).getValue();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return value;
    }

    private UiText() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/ra/core/data/utils/UiText$StringResource;", "Lcom/amazon/alexa/ra/core/data/utils/UiText;", "resId", "", "formatArgs", "", "", "<init>", "(I[Ljava/lang/Object;)V", "getResId", "()I", "getFormatArgs", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class StringResource extends UiText {
        public static final int $stable = 8;

        @NotNull
        private final Object[] formatArgs;
        private final int resId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StringResource(@StringRes int i, @NotNull Object[] objArr) {
            super(null);
            objArr.getClass();
            this.resId = i;
            this.formatArgs = objArr;
        }

        @NotNull
        public final Object[] getFormatArgs() {
            return this.formatArgs;
        }

        public final int getResId() {
            return this.resId;
        }

        public /* synthetic */ StringResource(int i, Object[] objArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? new Object[0] : objArr);
        }
    }
}
