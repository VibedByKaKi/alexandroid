package dagger.internal.codegen.bindinggraphvalidation;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.codegen.compileroption.CompilerOptions;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
/* loaded from: classes9.dex */
public final class NullableBindingValidator_Factory implements Factory<NullableBindingValidator> {
    private final Provider<CompilerOptions> compilerOptionsProvider;

    public NullableBindingValidator_Factory(Provider<CompilerOptions> provider) {
        this.compilerOptionsProvider = provider;
    }

    public static NullableBindingValidator_Factory create(Provider<CompilerOptions> provider) {
        return new NullableBindingValidator_Factory(provider);
    }

    public static NullableBindingValidator newInstance(CompilerOptions compilerOptions) {
        return new NullableBindingValidator(compilerOptions);
    }

    @Override // javax.inject.Provider
    public NullableBindingValidator get() {
        return newInstance(this.compilerOptionsProvider.get());
    }
}
