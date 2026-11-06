package com.bugsnag.android;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class JsonStream extends JsonWriter {
    private final ObjectJsonStreamer objectJsonStreamer;
    private final Writer out;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Streamable {
        void toStream(@NonNull JsonStream jsonStream) throws IOException;
    }

    public JsonStream(@NonNull JsonStream jsonStream, @NonNull ObjectJsonStreamer objectJsonStreamer) {
        super(jsonStream.out);
        setSerializeNulls(jsonStream.getSerializeNulls());
        this.out = jsonStream.out;
        this.objectJsonStreamer = objectJsonStreamer;
    }

    @Override // com.bugsnag.android.JsonWriter
    public /* bridge */ /* synthetic */ JsonWriter beginArray() throws IOException {
        return super.beginArray();
    }

    @Override // com.bugsnag.android.JsonWriter
    public /* bridge */ /* synthetic */ JsonWriter beginObject() throws IOException {
        return super.beginObject();
    }

    @Override // com.bugsnag.android.JsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() throws IOException {
        super.close();
    }

    @Override // com.bugsnag.android.JsonWriter
    public /* bridge */ /* synthetic */ JsonWriter endArray() throws IOException {
        return super.endArray();
    }

    @Override // com.bugsnag.android.JsonWriter
    public /* bridge */ /* synthetic */ JsonWriter endObject() throws IOException {
        return super.endObject();
    }

    @Override // com.bugsnag.android.JsonWriter, java.io.Flushable
    public /* bridge */ /* synthetic */ void flush() throws IOException {
        super.flush();
    }

    @Override // com.bugsnag.android.JsonWriter
    public /* bridge */ /* synthetic */ boolean isLenient() {
        return super.isLenient();
    }

    @Override // com.bugsnag.android.JsonWriter
    public /* bridge */ /* synthetic */ JsonWriter jsonValue(String str) throws IOException {
        return super.jsonValue(str);
    }

    @Override // com.bugsnag.android.JsonWriter
    public /* bridge */ /* synthetic */ JsonWriter nullValue() throws IOException {
        return super.nullValue();
    }

    public void value(@NonNull File file) throws IOException {
        if (file == null || file.length() <= 0) {
            return;
        }
        super.flush();
        beforeValue();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
            try {
                IOUtils.copy(bufferedReader2, this.out);
                IOUtils.closeQuietly(bufferedReader2);
                this.out.flush();
            } catch (Throwable th) {
                th = th;
                bufferedReader = bufferedReader2;
                IOUtils.closeQuietly(bufferedReader);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.bugsnag.android.JsonWriter
    @NonNull
    public JsonStream name(@Nullable String str) throws IOException {
        super.name(str);
        return this;
    }

    public JsonStream(@NonNull Writer writer) {
        super(writer);
        setSerializeNulls(false);
        this.out = writer;
        this.objectJsonStreamer = new ObjectJsonStreamer();
    }

    @Override // com.bugsnag.android.JsonWriter
    public /* bridge */ /* synthetic */ JsonWriter value(long j) throws IOException {
        return super.value(j);
    }

    @Override // com.bugsnag.android.JsonWriter
    public /* bridge */ /* synthetic */ JsonWriter value(Boolean bool) throws IOException {
        return super.value(bool);
    }

    @Override // com.bugsnag.android.JsonWriter
    public /* bridge */ /* synthetic */ JsonWriter value(Number number) throws IOException {
        return super.value(number);
    }

    @Override // com.bugsnag.android.JsonWriter
    public /* bridge */ /* synthetic */ JsonWriter value(String str) throws IOException {
        return super.value(str);
    }

    @Override // com.bugsnag.android.JsonWriter
    public /* bridge */ /* synthetic */ JsonWriter value(boolean z) throws IOException {
        return super.value(z);
    }

    public void value(@Nullable Object obj, boolean z) throws IOException {
        if (obj instanceof Streamable) {
            ((Streamable) obj).toStream(this);
        } else {
            this.objectJsonStreamer.objectToStream(obj, this, z);
        }
    }

    public void value(@Nullable Object obj) throws IOException {
        value(obj, false);
    }

    @Override // com.bugsnag.android.JsonWriter
    public /* bridge */ /* synthetic */ JsonWriter value(double d) throws IOException {
        return super.value(d);
    }
}
