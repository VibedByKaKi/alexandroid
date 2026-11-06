package com.amazon.coral.model;

import com.amazon.coral.model.Model;
import com.amazon.coral.util.Throwables;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
final class RpcV2AutoUpgradeTraitsDefaulter extends AbstractTraitsDefaulter {
    final Map<Model.Id, RpcV2AutoUpgradeTrait> config;

    public RpcV2AutoUpgradeTraitsDefaulter(Path path) {
        Path resolve = path.resolve("RpcV2AllowListedServices");
        this.config = new HashMap();
        try {
            InputStream newInputStream = Files.newInputStream(resolve, new OpenOption[0]);
            Objects.requireNonNull(newInputStream);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(newInputStream));
                try {
                    bufferedReader.lines().forEach(new Consumer() { // from class: com.amazon.coral.model.RpcV2AutoUpgradeTraitsDefaulter$$ExternalSyntheticLambda0
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            RpcV2AutoUpgradeTraitsDefaulter.this.lambda$new$0((String) obj);
                        }
                    });
                    bufferedReader.close();
                    newInputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (Exception e) {
            Throwables.sneakyThrow(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(String str) {
        String[] split = str.split(",");
        if (split.length != 3) {
            Single$$ExternalSyntheticBUOutline0.m$2("Incorrect format found for ".concat(str));
            return;
        }
        this.config.put(Model.Id.makeId(split[0]), new RpcV2AutoUpgradeTrait(Boolean.parseBoolean(split[1]), Boolean.parseBoolean(split[2])));
    }

    @Override // com.amazon.coral.model.AbstractModelVisitor, com.amazon.coral.model.ModelVisitor
    public void onServiceModel(ServiceModel serviceModel) {
        RpcV2AutoUpgradeTrait rpcV2AutoUpgradeTrait = this.config.get(serviceModel.getId());
        if (rpcV2AutoUpgradeTrait != null) {
            defaultTraits(serviceModel, rpcV2AutoUpgradeTrait);
        }
    }
}
