package com.amazon.alexa.voice.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.work.impl.WorkDatabase;
import com.amazon.alexa.utils.Provider;
import com.amazon.alexa.voice.sdk.DefaultAlexaConnectionManager;
import com.amazon.alexa.wakeword.speakerverification.model.SpeakerVerificationModelAuthority;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class SdkModule$$ExternalSyntheticLambda0 implements SupportSQLiteOpenHelper.Factory, DefaultAlexaConnectionManager.InvalidSigningReporter, Provider {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Context f$0;

    public /* synthetic */ SdkModule$$ExternalSyntheticLambda0(Context context, int i) {
        this.$r8$classId = i;
        this.f$0 = context;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    public SupportSQLiteOpenHelper create(SupportSQLiteOpenHelper.Configuration configuration) {
        SupportSQLiteOpenHelper create$lambda$0;
        create$lambda$0 = WorkDatabase.Companion.create$lambda$0(this.f$0, configuration);
        return create$lambda$0;
    }

    @Override // com.amazon.alexa.utils.Provider
    public Object get() {
        SharedPreferences lambda$new$0;
        SharedPreferences lambda$new$1;
        int i = this.$r8$classId;
        Context context = this.f$0;
        switch (i) {
            case 2:
                lambda$new$0 = SpeakerVerificationModelAuthority.lambda$new$0(context);
                return lambda$new$0;
            default:
                lambda$new$1 = SpeakerVerificationModelAuthority.lambda$new$1(context);
                return lambda$new$1;
        }
    }

    @Override // com.amazon.alexa.voice.sdk.DefaultAlexaConnectionManager.InvalidSigningReporter
    public void showToast(String str) {
        SdkModule.lambda$provideDefaultAlexaConnectionManager$0(this.f$0, str);
    }
}
