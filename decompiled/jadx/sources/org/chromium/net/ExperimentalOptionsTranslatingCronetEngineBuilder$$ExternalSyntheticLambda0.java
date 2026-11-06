package org.chromium.net;

import org.chromium.net.ExperimentalOptionsTranslatingCronetEngineBuilder;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class ExperimentalOptionsTranslatingCronetEngineBuilder$$ExternalSyntheticLambda0 implements ExperimentalOptionsTranslatingCronetEngineBuilder.ExperimentalOptionsPatch {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ExperimentalOptionsTranslatingCronetEngineBuilder$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // org.chromium.net.ExperimentalOptionsTranslatingCronetEngineBuilder.ExperimentalOptionsPatch
    public final void applyTo(JSONObject jSONObject) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ExperimentalOptionsTranslatingCronetEngineBuilder.lambda$setDnsOptions$1((DnsOptions) obj, jSONObject);
                break;
            case 1:
                ExperimentalOptionsTranslatingCronetEngineBuilder.lambda$setConnectionMigrationOptions$2((ConnectionMigrationOptions) obj, jSONObject);
                break;
            default:
                ExperimentalOptionsTranslatingCronetEngineBuilder.lambda$setQuicOptions$0((QuicOptions) obj, jSONObject);
                break;
        }
    }
}
