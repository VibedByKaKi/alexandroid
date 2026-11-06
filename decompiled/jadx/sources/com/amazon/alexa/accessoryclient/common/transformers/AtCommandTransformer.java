package com.amazon.alexa.accessoryclient.common.transformers;

import android.os.Bundle;
import com.amazon.alexa.accessory.repositories.calling.ATCommand;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/transformers/AtCommandTransformer;", "Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "Lcom/amazon/alexa/accessory/repositories/calling/ATCommand;", "()V", "COMMAND_KEY", "", "PARAMETERS_KEY", "fromBundle", "bundle", "Landroid/os/Bundle;", "toBundle", "t", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAtCommandTransformer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AtCommandTransformer.kt\ncom/amazon/alexa/accessoryclient/common/transformers/AtCommandTransformer\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,34:1\n37#2,2:35\n13579#3,2:37\n*S KotlinDebug\n*F\n+ 1 AtCommandTransformer.kt\ncom/amazon/alexa/accessoryclient/common/transformers/AtCommandTransformer\n*L\n24#1:35,2\n31#1:37,2\n*E\n"})
/* loaded from: classes16.dex */
public final class AtCommandTransformer implements BundleTransformer<ATCommand> {

    @NotNull
    private static final String COMMAND_KEY = "command";

    @NotNull
    public static final AtCommandTransformer INSTANCE = new AtCommandTransformer();

    @NotNull
    private static final String PARAMETERS_KEY = "parameters";

    private AtCommandTransformer() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
    @NotNull
    public ATCommand fromBundle(@NotNull Bundle bundle) {
        bundle.getClass();
        ATCommand.Builder command = new ATCommand.Builder().command(bundle.getString("command"));
        String[] stringArray = bundle.getStringArray(PARAMETERS_KEY);
        stringArray.getClass();
        for (String str : stringArray) {
            command.parameter(str);
        }
        ATCommand build = command.build();
        build.getClass();
        return build;
    }

    @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
    @NotNull
    public Bundle toBundle(@NotNull ATCommand t) {
        t.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("command", t.getCommand());
        List<String> parameters = t.getParameters();
        parameters.getClass();
        bundle.putStringArray(PARAMETERS_KEY, (String[]) parameters.toArray(new String[0]));
        return bundle;
    }
}
