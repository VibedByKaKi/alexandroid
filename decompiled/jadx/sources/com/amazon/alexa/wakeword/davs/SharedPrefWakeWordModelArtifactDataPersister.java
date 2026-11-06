package com.amazon.alexa.wakeword.davs;

import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0011\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\bH\u0002J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0002J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0006H\u0016J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\bH\u0016J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\nH\u0016J\u0010\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\nH\u0016J\u0010\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\nH\u0016J\u0010\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/amazon/alexa/wakeword/davs/SharedPrefWakeWordModelArtifactDataPersister;", "Lcom/amazon/alexa/wakeword/davs/WakeWordModelArtifactDataPersister;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "getArtifactData", "Lcom/amazon/alexa/wakeword/davs/ArtifactData;", "getArtifactDownloadTime", "", "getArtifactEcid", "", "getArtifactId", "getArtifactLocale", "getWakeWords", "putLong", "", "key", "value", "putString", "setArtifactData", "artifactData", "setArtifactDownloadTime", "ts", "setArtifactEcid", "ecid", "setArtifactId", "id", "setArtifactLocale", "locale", "setWakeWords", "serializedWakeWords", "Companion", "AVSAndroidClient-pryonprovider_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class SharedPrefWakeWordModelArtifactDataPersister implements WakeWordModelArtifactDataPersister {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String KEY_ARTIFACT_DOWNLOAD_TIME = "artifact_downloaded_time";

    @NotNull
    private static final String KEY_ARTIFACT_ECID = "engine_compatibility_id";

    @NotNull
    private static final String KEY_ARTIFACT_ID = "artifact_identifier";

    @NotNull
    private static final String KEY_ARTIFACT_LOCALE = "last_used_locale";

    @NotNull
    private static final String KEY_WAKE_WORDS = "wake_words";

    @NotNull
    private final SharedPreferences sharedPreferences;

    public SharedPrefWakeWordModelArtifactDataPersister(@NotNull SharedPreferences sharedPreferences) {
        sharedPreferences.getClass();
        this.sharedPreferences = sharedPreferences;
    }

    private final void putLong(String key, long value) {
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putLong(key, value);
        edit.apply();
    }

    private final void putString(String key, String value) {
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putString(key, value);
        edit.apply();
    }

    @Override // com.amazon.alexa.wakeword.davs.WakeWordModelArtifactDataPersister
    @NotNull
    public ArtifactData getArtifactData() {
        return new ArtifactData(getArtifactId(), getArtifactLocale(), getArtifactEcid(), getWakeWords(), getArtifactDownloadTime());
    }

    @Override // com.amazon.alexa.wakeword.davs.WakeWordModelArtifactDataPersister
    public long getArtifactDownloadTime() {
        return this.sharedPreferences.getLong("artifact_downloaded_time", 0L);
    }

    @Override // com.amazon.alexa.wakeword.davs.WakeWordModelArtifactDataPersister
    @NotNull
    public String getArtifactEcid() {
        String string = this.sharedPreferences.getString("engine_compatibility_id", "");
        string.getClass();
        return string;
    }

    @Override // com.amazon.alexa.wakeword.davs.WakeWordModelArtifactDataPersister
    @NotNull
    public String getArtifactId() {
        String string = this.sharedPreferences.getString("artifact_identifier", "");
        string.getClass();
        return string;
    }

    @Override // com.amazon.alexa.wakeword.davs.WakeWordModelArtifactDataPersister
    @NotNull
    public String getArtifactLocale() {
        String string = this.sharedPreferences.getString("last_used_locale", "");
        string.getClass();
        return string;
    }

    @Override // com.amazon.alexa.wakeword.davs.WakeWordModelArtifactDataPersister
    @NotNull
    public String getWakeWords() {
        String string = this.sharedPreferences.getString("wake_words", "");
        string.getClass();
        return string;
    }

    @Override // com.amazon.alexa.wakeword.davs.WakeWordModelArtifactDataPersister
    public void setArtifactData(@NotNull ArtifactData artifactData) {
        artifactData.getClass();
        this.sharedPreferences.edit().putString("artifact_identifier", artifactData.getId()).putString("last_used_locale", artifactData.getLocale()).putString("engine_compatibility_id", artifactData.getEcid()).putLong("artifact_downloaded_time", artifactData.getTimestamp()).putString("wake_words", artifactData.getSerializedWakeWords()).apply();
    }

    @Override // com.amazon.alexa.wakeword.davs.WakeWordModelArtifactDataPersister
    public void setArtifactDownloadTime(long ts) {
        putLong("artifact_downloaded_time", ts);
    }

    @Override // com.amazon.alexa.wakeword.davs.WakeWordModelArtifactDataPersister
    public void setArtifactEcid(@NotNull String ecid) {
        ecid.getClass();
        putString("engine_compatibility_id", ecid);
    }

    @Override // com.amazon.alexa.wakeword.davs.WakeWordModelArtifactDataPersister
    public void setArtifactId(@NotNull String id) {
        id.getClass();
        putString("artifact_identifier", id);
    }

    @Override // com.amazon.alexa.wakeword.davs.WakeWordModelArtifactDataPersister
    public void setArtifactLocale(@NotNull String locale) {
        locale.getClass();
        putString("last_used_locale", locale);
    }

    @Override // com.amazon.alexa.wakeword.davs.WakeWordModelArtifactDataPersister
    public void setWakeWords(@NotNull String serializedWakeWords) {
        serializedWakeWords.getClass();
        putString("wake_words", serializedWakeWords);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/wakeword/davs/SharedPrefWakeWordModelArtifactDataPersister$Companion;", "", "()V", "KEY_ARTIFACT_DOWNLOAD_TIME", "", "KEY_ARTIFACT_ECID", "KEY_ARTIFACT_ID", "KEY_ARTIFACT_LOCALE", "KEY_WAKE_WORDS", "AVSAndroidClient-pryonprovider_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
