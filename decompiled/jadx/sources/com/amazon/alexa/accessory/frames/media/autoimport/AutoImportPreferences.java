package com.amazon.alexa.accessory.frames.media.autoimport;

import android.content.Context;
import android.content.SharedPreferences;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/accessory/frames/media/autoimport/AutoImportPreferences;", "", "<init>", "()V", "getSharedPreferences", "Landroid/content/SharedPreferences;", "context", "Landroid/content/Context;", "getPreferences", "Lcom/amazon/alexa/accessory/frames/media/autoimport/AutoImportPreferences$Preferences;", "isEnabled", "", "setEnabled", "", "enabled", "reset", "Preferences", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAutoImportPreferences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoImportPreferences.kt\ncom/amazon/alexa/accessory/frames/media/autoimport/AutoImportPreferences\n+ 2 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,91:1\n41#2,12:92\n41#2,12:104\n*S KotlinDebug\n*F\n+ 1 AutoImportPreferences.kt\ncom/amazon/alexa/accessory/frames/media/autoimport/AutoImportPreferences\n*L\n74#1:92,12\n86#1:104,12\n*E\n"})
/* loaded from: classes15.dex */
public final class AutoImportPreferences {

    @NotNull
    public static final AutoImportPreferences INSTANCE = new AutoImportPreferences();

    private AutoImportPreferences() {
    }

    private final SharedPreferences getSharedPreferences(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(AutoImportConstants.PREF_NAME, 0);
        sharedPreferences.getClass();
        return sharedPreferences;
    }

    @NotNull
    public final Preferences getPreferences(@NotNull Context context) {
        context.getClass();
        return new Preferences(getSharedPreferences(context).getBoolean(AutoImportConstants.PREF_AUTO_IMPORT_ENABLED, false));
    }

    public final boolean isEnabled(@NotNull Context context) {
        context.getClass();
        return getSharedPreferences(context).getBoolean(AutoImportConstants.PREF_AUTO_IMPORT_ENABLED, false);
    }

    public final void reset(@NotNull Context context) {
        context.getClass();
        SharedPreferences.Editor edit = getSharedPreferences(context).edit();
        edit.clear();
        edit.apply();
    }

    public final void setEnabled(@NotNull Context context, boolean enabled) {
        context.getClass();
        SharedPreferences.Editor edit = getSharedPreferences(context).edit();
        edit.putBoolean(AutoImportConstants.PREF_AUTO_IMPORT_ENABLED, enabled);
        edit.apply();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/accessory/frames/media/autoimport/AutoImportPreferences$Preferences;", "", "enabled", "", "<init>", "(Z)V", "getEnabled", "()Z", "component1", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Preferences {
        private final boolean enabled;

        public /* synthetic */ Preferences(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public static /* synthetic */ Preferences copy$default(Preferences preferences, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = preferences.enabled;
            }
            return preferences.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        @NotNull
        public final Preferences copy(boolean enabled) {
            return new Preferences(enabled);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Preferences) && this.enabled == ((Preferences) other).enabled;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.enabled);
        }

        @NotNull
        public String toString() {
            return Automotive$$ExternalSyntheticOutline0.m("Preferences(enabled=", MarkdownConstants.RIGHT_PARENTHESIS, this.enabled);
        }

        public Preferences(boolean z) {
            this.enabled = z;
        }

        public Preferences() {
            this(false, 1, null);
        }
    }
}
