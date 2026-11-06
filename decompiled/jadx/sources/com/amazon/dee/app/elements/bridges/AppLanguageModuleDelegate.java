package com.amazon.dee.app.elements.bridges;

import com.amazon.alexa.elements.turbomodules.applanguage.AppLanguageModuleAPI;
import com.amazon.dee.app.dependencies.MainScope;
import com.amazon.dee.app.services.language.AppLanguageManager;
import com.amazon.dee.app.services.logging.Log;
import com.amazon.deecomms.util.LogsUtil$$ExternalSyntheticLambda0;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.UiThreadUtil;
import javax.inject.Inject;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@MainScope
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/amazon/dee/app/elements/bridges/AppLanguageModuleDelegate;", "Lcom/amazon/alexa/elements/turbomodules/applanguage/AppLanguageModuleAPI;", "appLanguageManager", "Lcom/amazon/dee/app/services/language/AppLanguageManager;", "<init>", "(Lcom/amazon/dee/app/services/language/AppLanguageManager;)V", "getCurrentGuiLanguage", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "setGuiLanguage", "tag", "", "Companion", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AppLanguageModuleDelegate implements AppLanguageModuleAPI {

    @NotNull
    private static final String TAG = Log.tag((Class<?>) AppLanguageModuleDelegate.class);

    @NotNull
    private final AppLanguageManager appLanguageManager;

    @Inject
    public AppLanguageModuleDelegate(@NotNull AppLanguageManager appLanguageManager) {
        appLanguageManager.getClass();
        this.appLanguageManager = appLanguageManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setGuiLanguage$lambda$0(AppLanguageModuleDelegate appLanguageModuleDelegate, String str, Promise promise) {
        try {
            appLanguageModuleDelegate.appLanguageManager.apply(str);
            promise.resolve(null);
        } catch (Exception e) {
            Log.e(TAG, e, "Failed to set GUI language: %s", str);
            promise.reject("ERR_GUI_LANGUAGE", "Failed to set GUI language", e);
        }
    }

    @Override // com.amazon.alexa.elements.turbomodules.applanguage.AppLanguageModuleAPI
    public void getCurrentGuiLanguage(@NotNull Promise promise) {
        promise.getClass();
        try {
            promise.resolve(this.appLanguageManager.getCurrentTag());
        } catch (Exception e) {
            Log.e(TAG, e, "Failed to get current GUI language", new Object[0]);
            promise.reject("ERR_GUI_LANGUAGE", "Failed to get current GUI language", e);
        }
    }

    @Override // com.amazon.alexa.elements.turbomodules.applanguage.AppLanguageModuleAPI
    public void setGuiLanguage(@NotNull String tag, @NotNull Promise promise) {
        tag.getClass();
        promise.getClass();
        UiThreadUtil.runOnUiThread(new LogsUtil$$ExternalSyntheticLambda0(this, 13, tag, promise));
    }
}
