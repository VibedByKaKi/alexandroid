package com.google.android.libraries.identity.googleid;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.credentials.CustomCredential;
import com.amazon.alexa.smarthomecameras.routing.CamerasRouteParameter;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/google/android/libraries/identity/googleid/GoogleIdTokenCredential;", "Landroidx/credentials/CustomCredential;", "id", "", "idToken", CamerasRouteParameter.DISPLAY_NAME, "familyName", "givenName", "profilePictureUri", "Landroid/net/Uri;", "phoneNumber", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "getFamilyName", "getGivenName", "getId", "getIdToken", "getPhoneNumber", "getProfilePictureUri", "()Landroid/net/Uri;", "Builder", "Companion", "java.com.google.android.libraries.identity.googleid.granule_granule"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GoogleIdTokenCredential extends CustomCredential {

    @NotNull
    public static final String BUNDLE_KEY_GOOGLE_ID_TOKEN_SUBTYPE = "com.google.android.libraries.identity.googleid.BUNDLE_KEY_GOOGLE_ID_TOKEN_SUBTYPE";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TYPE_GOOGLE_ID_TOKEN_CREDENTIAL = "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL";

    @NotNull
    public static final String TYPE_GOOGLE_ID_TOKEN_SIWG_CREDENTIAL = "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_SIWG_CREDENTIAL";

    @NotNull
    private final String zza;

    @NotNull
    private final String zzb;

    @Nullable
    private final String zzc;

    @Nullable
    private final String zzd;

    @Nullable
    private final String zze;

    @Nullable
    private final Uri zzf;

    @Nullable
    private final String zzg;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/google/android/libraries/identity/googleid/GoogleIdTokenCredential$Builder;", "", "()V", CamerasRouteParameter.DISPLAY_NAME, "", "familyName", "givenName", "id", "idToken", "phoneNumber", "profilePictureUri", "Landroid/net/Uri;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/google/android/libraries/identity/googleid/GoogleIdTokenCredential;", "setDisplayName", "setFamilyName", "setGivenName", "setId", "setIdToken", "setPhoneNumber", "setProfilePictureUri", "java.com.google.android.libraries.identity.googleid.granule_granule"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {

        @NotNull
        private String zza = "";

        @NotNull
        private String zzb = "";

        @Nullable
        private String zzc;

        @Nullable
        private String zzd;

        @Nullable
        private String zze;

        @Nullable
        private Uri zzf;

        @Nullable
        private String zzg;

        @NotNull
        public final GoogleIdTokenCredential build() {
            return new GoogleIdTokenCredential(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg);
        }

        @NotNull
        public final Builder setDisplayName(@Nullable String displayName) {
            this.zzc = displayName;
            return this;
        }

        @NotNull
        public final Builder setFamilyName(@Nullable String familyName) {
            this.zzd = familyName;
            return this;
        }

        @NotNull
        public final Builder setGivenName(@Nullable String givenName) {
            this.zze = givenName;
            return this;
        }

        @NotNull
        public final Builder setId(@NonNull String id) {
            id.getClass();
            this.zza = id;
            return this;
        }

        @NotNull
        public final Builder setIdToken(@NonNull String idToken) {
            idToken.getClass();
            this.zzb = idToken;
            return this;
        }

        @NotNull
        public final Builder setPhoneNumber(@Nullable String phoneNumber) {
            this.zzg = phoneNumber;
            return this;
        }

        @NotNull
        public final Builder setProfilePictureUri(@Nullable Uri profilePictureUri) {
            this.zzf = profilePictureUri;
            return this;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GoogleIdTokenCredential(@androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull java.lang.String r4, @org.jetbrains.annotations.Nullable java.lang.String r5, @org.jetbrains.annotations.Nullable java.lang.String r6, @org.jetbrains.annotations.Nullable java.lang.String r7, @org.jetbrains.annotations.Nullable android.net.Uri r8, @org.jetbrains.annotations.Nullable java.lang.String r9) {
        /*
            r2 = this;
            r3.getClass()
            r4.getClass()
            r3.getClass()
            r4.getClass()
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID"
            r0.putString(r1, r3)
            java.lang.String r1 = "com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN"
            r0.putString(r1, r4)
            java.lang.String r1 = "com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME"
            r0.putString(r1, r5)
            java.lang.String r1 = "com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME"
            r0.putString(r1, r6)
            java.lang.String r1 = "com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME"
            r0.putString(r1, r7)
            java.lang.String r1 = "com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER"
            r0.putString(r1, r9)
            java.lang.String r1 = "com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI"
            r0.putParcelable(r1, r8)
            java.lang.String r1 = "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL"
            r2.<init>(r1, r0)
            r2.zza = r3
            r2.zzb = r4
            r2.zzc = r5
            r2.zzd = r6
            r2.zze = r7
            r2.zzf = r8
            r2.zzg = r9
            int r2 = r3.length()
            if (r2 <= 0) goto L5b
            int r2 = r4.length()
            if (r2 <= 0) goto L54
            return
        L54:
            java.lang.String r2 = "idToken should not be empty"
            rx.Single$$ExternalSyntheticBUOutline0.m$3(r2)
            r2 = 0
            throw r2
        L5b:
            java.lang.String r2 = "id should not be empty"
            rx.Single$$ExternalSyntheticBUOutline0.m$3(r2)
            r2 = 0
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.identity.googleid.GoogleIdTokenCredential.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, android.net.Uri, java.lang.String):void");
    }

    @JvmStatic
    @NotNull
    public static final GoogleIdTokenCredential createFrom(@NonNull Bundle bundle) {
        return INSTANCE.createFrom(bundle);
    }

    @androidx.annotation.Nullable
    /* renamed from: getDisplayName, reason: from getter */
    public final String getZzc() {
        return this.zzc;
    }

    @androidx.annotation.Nullable
    /* renamed from: getFamilyName, reason: from getter */
    public final String getZzd() {
        return this.zzd;
    }

    @androidx.annotation.Nullable
    /* renamed from: getGivenName, reason: from getter */
    public final String getZze() {
        return this.zze;
    }

    @NotNull
    /* renamed from: getId, reason: from getter */
    public final String getZza() {
        return this.zza;
    }

    @NotNull
    /* renamed from: getIdToken, reason: from getter */
    public final String getZzb() {
        return this.zzb;
    }

    @androidx.annotation.Nullable
    /* renamed from: getPhoneNumber, reason: from getter */
    public final String getZzg() {
        return this.zzg;
    }

    @androidx.annotation.Nullable
    /* renamed from: getProfilePictureUri, reason: from getter */
    public final Uri getZzf() {
        return this.zzf;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007JO\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0002\b\"R\u0016\u0010\u0003\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0016\u0010\u0006\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002R\u0016\u0010\b\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0002R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\u0002R\u0016\u0010\r\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u0002R\u0016\u0010\u000f\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u0002R\u0016\u0010\u0011\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0012\u0010\u0002R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/google/android/libraries/identity/googleid/GoogleIdTokenCredential$Companion;", "", "()V", "BUNDLE_KEY_DISPLAY_NAME", "", "getBUNDLE_KEY_DISPLAY_NAME$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_FAMILY_NAME", "getBUNDLE_KEY_FAMILY_NAME$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_GIVEN_NAME", "getBUNDLE_KEY_GIVEN_NAME$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_GOOGLE_ID_TOKEN_SUBTYPE", "BUNDLE_KEY_ID", "getBUNDLE_KEY_ID$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_ID_TOKEN", "getBUNDLE_KEY_ID_TOKEN$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_PHONE_NUMBER", "getBUNDLE_KEY_PHONE_NUMBER$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_PROFILE_PICTURE_URI", "getBUNDLE_KEY_PROFILE_PICTURE_URI$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", "TYPE_GOOGLE_ID_TOKEN_SIWG_CREDENTIAL", "createFrom", "Lcom/google/android/libraries/identity/googleid/GoogleIdTokenCredential;", "data", "Landroid/os/Bundle;", "toBundle", "id", "idToken", CamerasRouteParameter.DISPLAY_NAME, "familyName", "givenName", "profilePictureUri", "Landroid/net/Uri;", "phoneNumber", "toBundle$java_com_google_android_libraries_identity_googleid_granule_granule", "java.com.google.android.libraries.identity.googleid.granule_granule"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final GoogleIdTokenCredential createFrom(@NonNull Bundle data) {
            data.getClass();
            try {
                String string = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID");
                String string2 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN");
                String string3 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME");
                String string4 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME");
                String string5 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME");
                Uri uri = Build.VERSION.SDK_INT >= 33 ? (Uri) data.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", Uri.class) : (Uri) data.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI");
                String string6 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER");
                string.getClass();
                string2.getClass();
                return new GoogleIdTokenCredential(string, string2, string3, string4, string5, uri, string6);
            } catch (Exception e) {
                throw new GoogleIdTokenParsingException(e);
            }
        }

        public /* synthetic */ Companion(@NonNull DefaultConstructorMarker defaultConstructorMarker) {
        }
    }
}
