package com.amazon.alexa.accessoryclient.common.transformers;

import android.os.Bundle;
import com.amazon.alexa.accessory.davs.DavsI18nConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/transformers/I18nConfigTransformer;", "Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "Lcom/amazon/alexa/accessory/davs/DavsI18nConfig;", "()V", "I18N_CONFIG_JSON_KEY", "", "fromBundle", "bundle", "Landroid/os/Bundle;", "toBundle", "t", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class I18nConfigTransformer implements BundleTransformer<DavsI18nConfig> {

    @NotNull
    private static final String I18N_CONFIG_JSON_KEY = "i18nConfig";

    @NotNull
    public static final I18nConfigTransformer INSTANCE = new I18nConfigTransformer();

    private I18nConfigTransformer() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
    @NotNull
    /* renamed from: fromBundle */
    public DavsI18nConfig fromBundle2(@NotNull Bundle bundle) {
        bundle.getClass();
        DavsI18nConfig.Factory factory = DavsI18nConfig.FACTORY;
        String string = bundle.getString(I18N_CONFIG_JSON_KEY);
        string.getClass();
        DavsI18nConfig create = factory.create(new JSONObject(string));
        create.getClass();
        return create;
    }

    @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
    @NotNull
    public Bundle toBundle(@NotNull DavsI18nConfig t) {
        t.getClass();
        Bundle bundle = new Bundle();
        bundle.putString(I18N_CONFIG_JSON_KEY, t.toJsonObject().toString());
        return bundle;
    }
}
