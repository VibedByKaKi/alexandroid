package com.amazon.alexa.apl.payload;

import android.util.Log;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.dee.app.contacts.common.constants.Constants;
import com.dee.app.metrics.MetricsConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/apl/payload/PresentationSession;", "", "mId", "", "mSkillId", "(Ljava/lang/String;Ljava/lang/String;)V", "getMId", "()Ljava/lang/String;", "getMSkillId", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toJson", "Lorg/json/JSONObject;", "toString", "withExtensionSettings", "extensionSettings", "Lcom/amazon/alexa/apl/payload/ExtensionSettings;", "Companion", "AVSMobileFramework-android-apl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class PresentationSession {

    @NotNull
    private static final String COLON_DELIMITER = ":";

    @NotNull
    private static final String DOT_DELIMITER = ".";

    @NotNull
    private static final String FIELD_ID = "id";

    @NotNull
    private static final String FIELD_SKILL_ID = "skillId";

    @NotNull
    private static final String HASH_DELIMITER = "#";

    @NotNull
    private static final String TID_DELIMITER = "#TID#";

    @NotNull
    private final String mId;

    @NotNull
    private final String mSkillId;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "PresentationSession";

    public PresentationSession(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.mId = str;
        this.mSkillId = str2;
    }

    public static /* synthetic */ PresentationSession copy$default(PresentationSession presentationSession, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = presentationSession.mId;
        }
        if ((i & 2) != 0) {
            str2 = presentationSession.mSkillId;
        }
        return presentationSession.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getMId() {
        return this.mId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getMSkillId() {
        return this.mSkillId;
    }

    @NotNull
    public final PresentationSession copy(@NotNull String mId, @NotNull String mSkillId) {
        mId.getClass();
        mSkillId.getClass();
        return new PresentationSession(mId, mSkillId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PresentationSession)) {
            return false;
        }
        PresentationSession presentationSession = (PresentationSession) other;
        return Intrinsics.areEqual(this.mId, presentationSession.mId) && Intrinsics.areEqual(this.mSkillId, presentationSession.mSkillId);
    }

    @NotNull
    public final String getMId() {
        return this.mId;
    }

    @NotNull
    public final String getMSkillId() {
        return this.mSkillId;
    }

    public int hashCode() {
        return this.mSkillId.hashCode() + (this.mId.hashCode() * 31);
    }

    @NotNull
    public final JSONObject toJson() throws JSONException {
        JSONObject put = new JSONObject().put("id", this.mId).put(FIELD_SKILL_ID, this.mSkillId);
        put.getClass();
        return put;
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("PresentationSession(mId=", this.mId, ", mSkillId=", this.mSkillId, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    @NotNull
    public final JSONObject withExtensionSettings(@NotNull ExtensionSettings extensionSettings) throws JSONException {
        extensionSettings.getClass();
        return extensionSettings.addToJson(toJson());
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \n*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/apl/payload/PresentationSession$Companion;", "", "()V", "COLON_DELIMITER", "", "DOT_DELIMITER", "FIELD_ID", "FIELD_SKILL_ID", "HASH_DELIMITER", Constants.LOG_TAG, "kotlin.jvm.PlatformType", "TID_DELIMITER", "fromPresentationToken", "Lcom/amazon/alexa/apl/payload/PresentationSession;", "presentationToken", "fromSessionJson", "sessionJson", "Lorg/json/JSONObject;", MetricsConstants.Method.CACHE_GET, "getClientId", "getSkillId", "AVSMobileFramework-android-apl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nPresentationSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PresentationSession.kt\ncom/amazon/alexa/apl/payload/PresentationSession$Companion\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,154:1\n37#2,2:155\n37#2,2:157\n*S KotlinDebug\n*F\n+ 1 PresentationSession.kt\ncom/amazon/alexa/apl/payload/PresentationSession$Companion\n*L\n118#1:155,2\n140#1:157,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final PresentationSession fromPresentationToken(String presentationToken) {
            return new PresentationSession(getClientId(presentationToken), getSkillId(presentationToken));
        }

        private final PresentationSession fromSessionJson(JSONObject sessionJson) {
            if (sessionJson == null) {
                Log.e(PresentationSession.TAG, "Session JSON is null. Returning null as PresentationSession.");
                return null;
            }
            try {
                String string = sessionJson.getString("id");
                String string2 = sessionJson.getString(PresentationSession.FIELD_SKILL_ID);
                string.getClass();
                string2.getClass();
                return new PresentationSession(string, string2);
            } catch (JSONException e) {
                Log.e(PresentationSession.TAG, "Got Exception while getting details from Session Json. Returning null as PresentationSession.", e);
                return null;
            }
        }

        private final String getClientId(String presentationToken) {
            List split$default;
            int indexOf$default;
            if (presentationToken.length() == 0) {
                return "";
            }
            split$default = StringsKt__StringsKt.split$default(presentationToken, new String[]{"."}, false, 0, 6, (Object) null);
            String[] strArr = (String[]) split$default.toArray(new String[0]);
            if (strArr.length < 4) {
                return "";
            }
            indexOf$default = StringsKt__StringsKt.indexOf$default(strArr[3], "#", 0, false, 6, (Object) null);
            return strArr[3].substring(0, indexOf$default);
        }

        private final String getSkillId(String presentationToken) {
            List split$default;
            int indexOf$default;
            if (presentationToken.length() == 0) {
                return "";
            }
            split$default = StringsKt__StringsKt.split$default(presentationToken, new String[]{PresentationSession.TID_DELIMITER}, false, 0, 6, (Object) null);
            String[] strArr = (String[]) split$default.toArray(new String[0]);
            if (strArr.length < 2) {
                return "";
            }
            String str = strArr[1];
            indexOf$default = StringsKt__StringsKt.indexOf$default(str, ":", 0, false, 6, (Object) null);
            if (indexOf$default == -1) {
                indexOf$default = str.length();
            }
            return str.substring(0, indexOf$default);
        }

        @NotNull
        public final PresentationSession get(@NotNull String presentationToken, @Nullable JSONObject sessionJson) {
            presentationToken.getClass();
            PresentationSession fromSessionJson = fromSessionJson(sessionJson);
            if (fromSessionJson != null) {
                return fromSessionJson;
            }
            Log.e(PresentationSession.TAG, "Error extracting presentation session from payload. Falling back to parsing presentation token.");
            return fromPresentationToken(presentationToken);
        }

        private Companion() {
        }
    }
}
