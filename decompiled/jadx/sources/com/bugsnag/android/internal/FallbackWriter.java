package com.bugsnag.android.internal;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaEventBundleKeys;
import com.bugsnag.android.repackaged.dslplatform.json.DslJson;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.library.KotlinLibraryLayoutKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0005J.\u0010\b\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J6\u0010\b\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u0014H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/bugsnag/android/internal/FallbackWriter;", "Lcom/bugsnag/android/repackaged/dslplatform/json/DslJson$Fallback;", "", "", "", "()V", ReactTextInputShadowNode.PROP_PLACEHOLDER, "", "deserialize", "context", KotlinLibraryLayoutKt.KLIB_MANIFEST_FILE_NAME, "Ljava/lang/reflect/Type;", "stream", "Ljava/io/InputStream;", "body", "size", "", "serialize", "", AlexaEventBundleKeys.INSTANCE, "Ljava/io/OutputStream;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final class FallbackWriter implements DslJson.Fallback<Map<String, Object>> {
    private final byte[] placeholder;

    public FallbackWriter() {
        byte[] bytes = "\"[OBJECT]\"".getBytes(Charsets.UTF_8);
        bytes.getClass();
        this.placeholder = bytes;
    }

    @Override // com.bugsnag.android.repackaged.dslplatform.json.DslJson.Fallback
    @NotNull
    public Object deserialize(@Nullable Map<String, Object> context, @NotNull Type manifest, @NotNull byte[] body, int size) {
        manifest.getClass();
        body.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // com.bugsnag.android.repackaged.dslplatform.json.DslJson.Fallback
    public void serialize(@Nullable Object instance, @NotNull OutputStream stream) {
        stream.getClass();
        stream.write(this.placeholder);
    }

    @Override // com.bugsnag.android.repackaged.dslplatform.json.DslJson.Fallback
    @NotNull
    public Object deserialize(@Nullable Map<String, Object> context, @NotNull Type manifest, @NotNull InputStream stream) {
        manifest.getClass();
        stream.getClass();
        throw new UnsupportedOperationException();
    }
}
