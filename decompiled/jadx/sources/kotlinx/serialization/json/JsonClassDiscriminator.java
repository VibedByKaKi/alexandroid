package kotlinx.serialization.json;

import chip.platform.ConfigurationManager;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationTarget;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.InheritableSerialInfo;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Target({ElementType.TYPE})
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\b\u0012\u0006\u0010\u0002\u001a\u00020\u0003R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/serialization/json/JsonClassDiscriminator;", "", ConfigurationManager.kConfigKey_SetupDiscriminator, "", "()Ljava/lang/String;", "kotlinx-serialization-json"}, k = 1, mv = {2, 2, 0}, xi = 48)
@ExperimentalSerializationApi
@InheritableSerialInfo
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes10.dex */
public @interface JsonClassDiscriminator {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class Impl implements JsonClassDiscriminator {
        private final /* synthetic */ String discriminator;

        public Impl(@NotNull String str) {
            str.getClass();
            this.discriminator = str;
        }

        @Override // kotlinx.serialization.json.JsonClassDiscriminator
        public final /* synthetic */ String discriminator() {
            return this.discriminator;
        }
    }

    String discriminator();
}
